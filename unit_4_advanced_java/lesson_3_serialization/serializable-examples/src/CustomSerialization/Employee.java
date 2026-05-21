package CustomSerialization;

import java.io.*;

public class Employee implements Serializable {
    private String name;
    private String email;
    private String title;
    private Address address;

    public Employee() {
    }

    public Employee(String name, String email, String title, Address address) {
        this.name = name;
        this.email = email;
        this.title = title;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Serial
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(address.getCountry());
    }

    @Serial
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        String country = (String) objectInputStream.readObject();

        Address address = new Address();
        address.setCountry(country);

        this.setAddress(address);
    }

    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Title: " + title + ", Address: " + address;
    }
}
