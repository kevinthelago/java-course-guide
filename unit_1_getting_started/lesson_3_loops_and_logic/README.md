| [Previous Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_1_getting_started/lesson_2_statements_expressions_datatypes_and_variables) <img width=1000/> | [Home](https://github.com/Kevin-Lago/Java-Course-Guide) <img width=1000/> | [Next Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_1_getting_started/lesson_4_debugging) <img width=1000> |
|:---|:---:|---:|

# Unit 1 Lesson 3 - Loops and Logic

[Lesson Slides](https://docs.google.com/presentation/d/1PGyQbY8l9K4_ZeNZPWz40bR25OVZPmMZsqOhm7lrwcA/edit?usp=sharing)

---
## Program Flow

- Like a list of instructions code is read from left to right, top to bottom.

	- Go forward 2 steps
	- Turn left 90 degrees
	- Go backwards 5 steps
	- Turn right 180 degrees

- We can control flow using methods, loops and logic.

	- Go forward 2 steps
	- Repeat the first instruction 3 times
	- Turn left 90 degrees
	- Go backwards 5 steps
	- If we're facing north go back to step one
	- Turn right 180 degrees

### Helpful Links

to read

- [Compilation and Execution of a Java Program - GeeksforGeeks](https://www.geeksforgeeks.org/compilation-execution-java-program/)
- [Control Flow Statements - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)

---
## Boolean Expressions

- Helps us make decisions
- Allows us to control the flow of a program
- Used for testing conditions
	- Relational
	- Conditional
	
```java
boolean theSunIsHot = true;
boolean iceMelts = true;
boolean applesAreAVegetable = false;
boolean blueIsRed = false;
```

### Helpful Links

to read

- [Java Booleans - w3schools](https://www.w3schools.com/java/java_booleans.asp)

---
## Relational Operators

- == (equals)
- <, > (less than, greater than)
- != (does not equal)
- <=, >= (less than or equal, greater than or equal)

- We use relational operators to compare values in conjunction with conditional statements and loops.

```java
boolean equalsExample1 = 50 == (5 * 10); // true
boolean equalsExample2 = 49 == (5 * 10); // false
boolean lessThanExample1 = 2 < 4; // true
boolean lessThanExample2 = 6 < 4; // false
boolean greaterThanExample1 = 7 > 5; // true
boolean greaterThanExample2 = 1 > 5; // false
boolean doesNotEqualExample1 = 6 != 1; // true
boolean doesNotEqualExample2 = 1 != 1; // false
boolean lessThanOrEqualToExample1 = (10 * 5) <= (60 - 10); // true
boolean lessThanOrEqualToExample2 = (10 * 10) <= (60 - 10); // false
boolean greaterThanOrEqualToExample1 = (10 * 5) >= (60 - 10); // true
boolean greaterThanOrEqualToExample2 = (2 * 3) >= (60 - 10); // false
```

### Helpful Links

to read

- [Equality, Relational and Conditional Operators - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html)
- [Java Relational Operators with Examples - GeeksforGeeks](https://www.geeksforgeeks.org/java-relational-operators-with-examples/)
- [Java Operators - w3schools](https://www.w3schools.com/java/java_operators.asp)

---
## if Statements

- An if statement will run a block of code if a condition is met.
- The condition will be checked inside the if's parentheses. ()
- The block of code that will be run resides within the curly brackets. {}

```java
if (condition) {
	// execute this code if condition is true
}
```

```java
if (5 > 2) {
	System.out.print("This will be printed to the console");
}
```

```java
if (5 < 2) {
	System.out.print("This will not be printed to the console");
}
```

### Helpful Links

to read

- [Java If ... Else - w3schools](https://www.w3schools.com/java/java_conditions.asp)
- [The if-then and if-then-else Statements - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)

---
## if, else Statements

- The else statement will run a block of code for every condition that isn't true.

```java
if (condition) {
	// execute this code if condition is true
} else {
	// execute this code if condition is false
}
```

```java
if ((5 * 4) > 10) {
	System.out.print("This will be printed to the console");
} else {
	System.out.print("This will not be printed to the console");
}
```

```java
if (5 < (2 / 2)) {
	System.out.print("This will not be printed to the console");
} else {
	System.out.print("This will be printed to the console");
}
```

### Helpful Links

to read

- [Java If ... Else - w3schools](https://www.w3schools.com/java/java_conditions.asp)
- [The if-then and if-then-else Statements - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)

---
## if, else if, else Statements

- The else if statement allows us to check for other conditions

```java
if (condition) {
	// execute this code if condition is true
} else if (anotherCondition) {
	// execute this code if anotherCondition is true
} else {
	// execute this code if no conditions are true
}
```

```java
if ((5 * 8) >= (5 * 8)) {
	System.out.print("This will be printed to the console");
} else if (anotherCondition) {
	System.out.print("This will not be printed to the console");
} else {
	System.out.print("This will not be printed to the console");
}
```

```java
if (8 <= 2) {
	System.out.print("This will not be printed to the console");
} else if (8 >= 2) {
	System.out.print("This will be printed to the console");
} else {
	System.out.print("This will not be printed to the console");
}
```

- We can have multiple else if statements.

```java
if (8 <= 2) {
	System.out.print("This will not be printed to the console");
} else if (8 >= 48) {
	System.out.print("This will not be printed to the console");
} else if (8 == 8) {
	System.out.print("This will be printed to the console");
} else {
	System.out.print("This will not be printed to the console");
}
```

### Helpful Links

to read

- [Java If ... Else - w3schools](https://www.w3schools.com/java/java_conditions.asp)
- [The if-then and if-then-else Statements - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)

---
## switch Statements

- Switch statements allow us to compare an expression to several different values

```java
switch (expression) {
	case value1:
		// execute this code if expression == value1
		break;
	case value2:
		// execute this code if expression == value2
		break;
	default:
		// execute this code if no match was found
		break;
}
```

```java
int x;

switch(x = 4) {
	case 1:
		System.out.println("This will be printed to the console if x = 1");
		break;
	case 2:
		System.out.println("This will be printed to the console if x = 2");
		break;
	case 3:
		System.out.println("This will be printed to the console if x = 3");
		break;
	case 4:
		System.out.println("This will be printed to the console if x = 4");
		break;
	default:
		System.out.println("This will be printed to the console if x does not equal either 1, 2, 3 or 4");
}
```

### Helpful Links

to read

- [Java Switch - w3schools](https://www.w3schools.com/java/java_switch.asp)
- [Switch Statements in Java - tutorialspoint](https://www.tutorialspoint.com/java/switch_statement_in_java.htm)

---
## Loops

- Loops allow us to repeat a block of code.
- We can use for loops

```java
for (initialization; termination condition; increment) {
	// Repeat this block of code
}
```

```java
// This writes "Hello, World!" 5 times to the terminal
for (int i = 0; i < 5; i++) {
	System.out.println("Hello, World!");
}
```

- Here's a diagram of the for loop above

<img src="ForLoopFlowChart.png" />

- We can use while loops

```java
while(condition) {
	// Repeat this block of code
}
```

```java
// This writes "Hello, World!" to the console 5 times
int i = 0;

while (i < 5) {
	System.out.println("Hello, World!");
	i++;
}
```

- We can also use do while loops

```java
do {
	// Repeat this block of code
} while (condition);
```

```java
// This writes "Hello, World!" to the console 5 times
int i = 0;

do {
	System.out.println("Hello, World!");
	i++;
} while (i < 5);
```

- There are also enhanced for loops which will be covered in lesson 6 - Arrays

### Helpful Links

to read

- [Java For Loop - w3schools](https://www.w3schools.com/java/java_for_loop.asp)
- [Loops in Java - GeeksforGeeks](https://www.geeksforgeeks.org/loops-in-java/)
- [Loops in Java - javatpoint](https://www.javatpoint.com/java-for-loop)

---
## Activities

- Create a Random Number Generator
- Use that random number to control the flow of a program

---

[Lesson Quiz]()

| <img width=1000/> [Previous Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_1_getting_started/lesson_2_statements_expressions_datatypes_and_variables) | <img width=1000/> [Home](https://github.com/Kevin-Lago/Java-Course-Guide) | <img width=1000> [Next Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_1_getting_started/lesson_4_debugging) |
|:---|:---:|---:|
