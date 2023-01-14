package org.example.mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import org.example.User;
import org.example.User.Address;
import org.example.mock.UserService.NotificationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    UserRepository userRepository;

    @Mock
    NotificationService notificationService;

    @InjectMocks
    UserService userService;

    @Test
    void getUserById() {
        // given
        User mockedUser = new User(1L, "", List.of(new Address("Moscow")));

//        User mockedUser = Mockito.mock(User.class);
//
//        when(mockedUser.getId()).thenReturn(1L);
//        when(mockedUser.getEmail()).thenReturn("");
//        when(mockedUser.getAddresses()).thenReturn(List.of(new Address("Moscow")));

        when(userRepository.getById(1L)).thenReturn(mockedUser);

        // when
        User user = userService.getUserById(1L);

        // then
        assertThat(user)
            .isEqualTo(mockedUser);
    }

    @Test
    void getUserEmailById() {
        // given
        String testEmail = "test@gmail.com";

//        User mockedUser1 = Mockito.mock(User.class);

        User mockedUser = new User(1L, testEmail, List.of());

        when(userRepository.getById(1L)).thenReturn(mockedUser);

        // when
        String actualUserEmail = userService.getUserEmailById(1L);

        // then
        assertThat(actualUserEmail)
            .isEqualTo(testEmail);
    }

    @Test
    void saveUser() {

        User user = new User(1L, "", List.of());

        userService.saveUser(1L, "", List.of());

        verify(userRepository).saveUser(user);
        verify(notificationService).sendNotification(user);
    }
}