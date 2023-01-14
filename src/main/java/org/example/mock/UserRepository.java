package org.example.mock;

import java.util.List;
import org.example.User;

public class UserRepository {

    public User getById(Long id) {
        // call DB
        return new User(-1L, "", List.of());
    }

    public void saveUser(User user) {
        // save to DB
    }
}
