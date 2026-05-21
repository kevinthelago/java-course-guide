package CustomSerialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address address = new Address("00000 NewWay Rd", "Dreams", "United States", "00000");
        Employee employee1 = new Employee("Kevin", "anemail@domain.com", "Software Developer", address);
        System.out.println("Employee Object PreSerialized\n" + employee1);

        FileOutputStream fileOutputStream = new FileOutputStream("employee.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(employee1);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("employee.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Employee employee2 = (Employee) objectInputStream.readObject();
        objectOutputStream.close();
        System.out.println("Employee Object PostSerialized\n" + employee2);
    }
}
