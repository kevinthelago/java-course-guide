package SimpleSerialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person1 = new Person(25, "Kevin", 70);
        System.out.println("Person Object PreSerialized\n" + person1);

        FileOutputStream fileOutputStream = new FileOutputStream("person.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(person1);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("person.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Person person2 = (Person) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("Person Object PostSerialized\n" + person2);
    }
}
