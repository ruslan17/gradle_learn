package org.example.mock;

import java.util.List;
import org.example.User;
import org.example.User.Address;

public class UserService {

    UserRepository userRepository;

    NotificationService notificationService;

    IdCalculator idCalculator;

    public User getUserById(Long id) {

        // some business logic

        User user = userRepository.getById(id);

        user.getAddresses().get(0);

        return user;
    }

    public String getUserEmailById(Long id) {

        User user = userRepository.getById(id);

        return user.getEmail();
    }

    public void saveUser(Long id, String email, List<Address> addresses) {
        // some business logic
//        validateEmail(email);
        User user = new User(id, email, addresses);

        userRepository.saveUser(user);
        notificationService.sendNotification(user);
    }

    public void saveUser(String email, List<Address> addresses) {
        // some business logic
        Long id = idCalculator.calculate();
        User user = new User(id, email, addresses);

        userRepository.saveUser(user);
        notificationService.sendNotification(user);
    }

    class NotificationService {
        public void sendNotification(User user) {
            // send
        }
    }

    class IdCalculator {

        public Long calculate() {

            return 1L; // generate incremented value
        }
    }

}
