package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.example.User.Address;
import org.junit.jupiter.api.Test;

class UserTest {

    User userA = new User(1L, "", List.of(new Address("Baku"), new Address("Moscow")));
    User userB = new User(1L, "", List.of(new Address("Moscow"), new Address("Baku")));

    @Test
    void compareUsers() {

        assertEquals(userA, userB);
    }

    @Test
    void compareUsersUsingAssertJ() {

        assertThat(userA)
            .usingRecursiveComparison()
//            .ignoringFields("addresses")
            .ignoringCollectionOrder()
            .isEqualTo(userB);
    }

}