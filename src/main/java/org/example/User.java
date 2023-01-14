package org.example;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class User {

    private Long id;

    private String email;

    private List<Address> addresses;

    public User(String email, List<Address> addresses) {
        // validateEmail
        this.email = email;
        this.addresses = addresses;
    }

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    @EqualsAndHashCode
    public static class Address {

        private String name;
    }

}
