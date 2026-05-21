| [Previous Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_1_getting_started/lesson_6_arrays) <img width=1000/> | [Home](https://github.com/Kevin-Lago/Java-Course-Guide) <img width=1000/> | [Next Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_2_beginner_java/lesson_2_classes_and_objects) <img width=1000> |
|:---|:---:|---:|

# Unit 2 Lesson 1 - Object Oriented Programming

[Lesson Slides](https://docs.google.com/presentation/d/1bFzq8dHRoxIaaEAmO9jElLRiI-05CQAVl7GIJBOOWF8/edit?usp=sharing)

---
## Coding Paradigms

---
## Object Oriented Languages

- Other than primitive data types, in Object Oriented Languages everything is an object.
- A program is a collection of objects telling each other what to do by sending messages to each other.
- Objects can be made up of other objects.
- Every object has a type.
- All instances of an object can receive the same messages.

---
## Classes and Objects

- An object first begins as a class!
- We can imagine classes as blueprints for what an object should look like.
- One analogy would be like floorplans versus the actual house! You may have multiple houses of the same floorplan the way you may have multiple objects of the same class.

```java
public class Message {
    
	private String message;

	public Message(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
}
```

- Here's an example class named Message! This is a typical POJO (Plain Old Java Object).
- Inside this class we have a property named message, a constructor and two methods, one named getMessage and the other setMessage.

```java
public class App {

    public static void main(String[] args) {

		Message helloWorldMessage = new Message("Hello, World!");
		Message learnJava = new Message("Learn Java!");

		System.out.println(helloWorldMessage.getMessage());
		System.out.println(learnJava.getMessage());

    }

}
```

- In the above code we're telling Java to make two objects from the class Message. Both instances will have the same methods getMessage and setMessage.

```
Hello, World!
Learn Java!
```

---
## Abstraction

---
## Encapsulation

---
## Inheritance

---
## Polymorphism

---
## Composition

---
## Data Hiding

---
## Activities

---

| <img width=1000/> [Previous Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_1_getting_started/lesson_6_arrays) | <img width=1000/> [Home](https://github.com/Kevin-Lago/Java-Course-Guide) | <img width=1000> [Next Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_2_beginner_java/lesson_2_classes_and_objects) |
|:---|:---:|---:|
