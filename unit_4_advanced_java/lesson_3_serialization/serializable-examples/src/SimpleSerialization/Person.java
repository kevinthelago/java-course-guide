package SimpleSerialization;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    static String country = "United States";
    final transient String email = "anemail@domain.com";
    transient int height;
    private int age;
    private String name;

    public Person(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Person.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return "Country: " + country + ", Age: " + age + ", Name: " + name + ", Height: " + height;
    }
}
