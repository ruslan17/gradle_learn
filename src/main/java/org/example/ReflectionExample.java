package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectionExample {

    public static void main(String[] args) {

        User user = new User(1, "Chingiz");

        System.out.println(getFieldValue(user, "id"));
        setFieldValue(user, "id", 2);
        System.out.println(getFieldValue(user, "id"));

//        -------------
        System.out.println(User.class.getName());
        System.out.println(User.class.getSimpleName());

//        --------
        createNewInstance();
        getConstructors();
        createNewInstanceWithArguments();
    }

    private static void createNewInstance() {

        try {
            Class clazz = Class.forName(User.class.getName());
            User user = (User) clazz.newInstance();

            System.out.println(user);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void getConstructors() {

        try {
            Class clazz = Class.forName(User.class.getName());
            Constructor[] constructors = clazz.getConstructors();

            System.out.println(Arrays.toString(constructors));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void createNewInstanceWithArguments() {

        try {
            Class clazz = Class.forName(User.class.getName());
//            Class<User> clazz = User.class;
            Constructor constructor = clazz.getConstructor(Integer.class, String.class);
            Object newInstance = constructor.newInstance(1, "Chingiz");

            System.out.println(newInstance);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Object getFieldValue(User user, String fieldName) {

        try {
            Field field = user.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(user);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void setFieldValue(User user, String fieldName, Object newFieldValue) {

        try {
            Field field = user.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(user, newFieldValue);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
