| [Previous Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_1_getting_started/lesson_4_debugging) <img width=1000/> | [Home](https://github.com/Kevin-Lago/Java-Course-Guide) <img width=1000/> | [Next Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_1_getting_started/lesson_6_arrays) <img width=1000> |
|:---|:---:|---:|

# Unit 1 Lesson 5 - Methods

[Lesson Slides](https://docs.google.com/presentation/d/1IUt6Od3-mm4HAWt6zHqt570D84MwOOG9pW7pmRkCPZs/edit?usp=sharing)

---
## Don't Repeat Yourself!

- Don't Repeat Yourself! As you progress in the world of coding you'll notice duplicates of code!
- Methods allow us to write code once and use it multiple times!

---
## Methods

- Methods reside within Objects/Classes
- Methods allow us to reuse code
- Methods help us organize our code

```xml
<access modifier> <return type> <method name> (<parameter list>) <exception list> {
	<method body>
}
```

```java
/*
* This Method prints "Hello, World!" to the console
* The return type is void meaning nothing will be returned.
*/
public static void printHelloWorldToConsole() {
	System.out.println("Hello, World!");
}
```

```java
/*
* This Method takes in two int values and returns the sum
*/
public static int add(int a, int b) {
	return a + b;
}
```

---
## Access Modifiers

- We can use the following modifiers to define a Method's scope
	- public
	- protected
	- private
	- Default

---
## Return Types

- Methods can return data to where they are called.
- If a Method does not have a return type we use void.

---
## Method Names

- Methods should be camel cased
- The first word in a method should be lowercased
- Methods should begin with verbs
	- add
	- countSeconds
	- calculateTotal

---
## Method Parameters

- Parameters are placeholders for variables that will be passed into a method.
- A Method can take from 0 to 255 Parameters

---
## Method Exceptions

- Method Exceptions are how we catch and throw expected errors.
- Exceptions give us more freedom on how to handle those expected errors.

---
## Method Signature

- A Method's signature is how Java uniquely identifies methods
- Java Identifies Methods via:
	- A Method's name
	- The list of Parameters

- Here are some examples:
	- printMessage()
	- printMessage(String message)
	- addNumbers(int a, int b)
	- addNumbers(int a, int b, int c)
	- addNumbers(int a, int b, int c, int d)

---
## Method Types

- No return value or Parameters

```java
public static void method() {
	System.out.println("This is a basic method");
}
```

- Return value with no Parameters

```java
public static String returnMethod() {
	return "This String will be returned to where the method was called";
}
```

- No return value with one or more Parameters

```java
public static void parameterMethod(String string) {
	System.out.println(string);
}
```

- Return value with one or more Parameters

```java
public static String returnFullName(String firstName, String lastName) {
	return firstName + " " + lastName;
}
```

---
## Activities

- Create Methods with different parameters and access Modifiers
- Call those Methods
- Understand scope and return types

---

[Lesson Quiz]()

| <img width=1000/> [Previous Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_1_getting_started/lesson_4_debugging) | <img width=1000/> [Home](https://github.com/Kevin-Lago/Java-Course-Guide) | <img width=1000> [Next Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_1_getting_started/lesson_6_arrays) |
|:---|:---:|---:|
