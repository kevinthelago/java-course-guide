| [Previous Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_3_intermediate_java/lesson_5_generics) <img width=1000/> | [Home](https://github.com/Kevin-Lago/Java-Course-Guide) <img width=1000/> | [Next Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_3_intermediate_java/lesson_7_structured_data) <img width=1000> |
|:---|:---:|---:|

# Unit 3 Lesson 6 - Algorithms

---
## History

> The word algorithm is derived from the Latin translation, Algoritmi de numero Indorum, of the 9th-century Persian mathematician [Muhammad ibn Musa al-Khwarizmi](https://en.wikipedia.org/wiki/Muhammad_ibn_Musa_al-Khwarizmi)'s arithmetic treatise "Al-Khwarizmi Concerning the Hindu Art of Reckoning" - [Wikipedia](https://en.wikipedia.org/wiki/Algorithm)

- Algorithms have existed for forever.
- Algorithms are a well-defined set of steps that take one or more values as an input and produce one or more values as an output in a finite amount of time.

---
## Algorithmic Thinking

- Break down your problems.
- Define the set of steps for getting an output from a given input.

---
## Correctness

> In theoretical computer science, an algorithm is correct with respect to a specification if it behaves as specified. Best explored is functional correctness, which refers to the input-output behavior of the algorithm. - [Wikipedia](https://en.wikipedia.org/wiki/Correctness_(computer_science))

- Must return a value
- Must complete execution in a finite amount of time
- Must output the same result every time for a given input set
- There are two types of correctness:
    - Partial Correctness
    - Total Correctness

---
## Computability Theory

> Computability theory, also known as recursion theory, is a branch of mathematical logic, computer science, and the theory of computation that originated in the 1930s with the study of computable functions and Turing degrees. - [Wikipedia](https://en.wikipedia.org/wiki/Computability_theory)

- [Models of Computation](https://en.wikipedia.org/wiki/Model_of_computation) can be categorized into three categories:
  - Sequential Models
  - Functional Models
  - Concurrent Models

---
## Computational Complexity Theory

> In theoretical computer science and mathematics, computational complexity theory focuses on classifying computational problems according to their resource usage, and relating these classes to each other. - [Wikipedia](https://en.wikipedia.org/wiki/Computational_complexity_theory)

- Algorithms can be categorized using the Computational Complexity Theory.
- With the [Analysis of Algorithms](https://en.wikipedia.org/wiki/Analysis_of_algorithms) we can define the worst case scenario for how long an algorithm will take to run.

---
## Time Complexity

> In computer science, the time complexity is the computational complexity that describes the amount of computer time it takes to run an algorithm. - [Wikipedia](https://en.wikipedia.org/wiki/Time_complexity)

- Time Complexity can be separated by [Best, Worst and Average](https://en.wikipedia.org/wiki/Best,_worst_and_average_case) runtimes.
- Big O notation represents the [Worst-case Complexity](https://en.wikipedia.org/wiki/Worst-case_complexity) of an algorithm.
- We use Theta $\theta$ to represent the [Average-case Complexity](https://en.wikipedia.org/wiki/Average-case_complexity) of an algorithm.
- We use Omega $\Omega$ to represent the Best-case Complexity of an Algorithm.

- Constant Time: O(1)
- Logarithmic Time: O(log n) or O(ln n)
- Linear Time: O(n)
- Quasilinear Time: O(n log n)
- Quadratic Time: O(n<sup>2</sup>)

![Polynomial Time Complexity Graph](assets/polynomial_time_complexity_graph_dark.svg#gh-dark-mode-only)
![Polynomial Time Complexity Graph](assets/polynomial_time_complexity_graph_light.svg#gh-light-mode-only)

- Factorial or Combinatorial Time: O(n!)
- Exponential Time: O(2<sup>n</sup>)

![Exponential Time Complexity Graph](assets/exponential_time_complexity_graph_dark.svg#gh-dark-mode-only)
![Exponential Time Complexity Graph](assets/exponential_time_complexity_graph_light.svg#gh-light-mode-only)

- Full Graphs

![Full Time Complexity Graph](assets/full_time_complexity_graph_dark.svg#gh-dark-mode-only)
![Full Time Complexity Graph](assets/full_time_complexity_graph_light.svg#gh-light-mode-only)

---
## Calculating Time Complexity

---
## Space Complexity

> The space Complexity of an algorithm is the total space taken by the algorithm with respect to the input size. Space complexity includes both Auxiliary space and space used by input. - [Geeks for Geeks](https://www.geeksforgeeks.org/g-fact-86/)

- Space Complexity is a measure of how much storage is needed for an algorithm to run.

---
## Calculating Space Complexity

---
## Sorting

Formal definition of a sorting equation

$\langle a_{1}, a_{2}, ..., a_{n} \rangle$

$\langle a_{1}^{'}, a_{2}^{'}, ..., a_{n}^{'} \rangle$

---
## The Fibonacci Series

> In mathematics, the Fibonacci numbers, commonly denoted F<sub>n</sub>, form a sequence, the Fibonacci sequence, in which each number is the sum of the two preceding ones. - [Wikipedia](https://en.wikipedia.org/wiki/Fibonacci_number)

- Without storing the subsequent values, find the n<sup>th</sup> fibonacci number.

```java
public static int fibonacciSeries(int n) {
    for (int i = n; i > 0; i--) {
        if (i < 2) {
            return 1;
        }
        return fibonacciSeries(i - 1) + fibonacciSeries(i - 2);
    }
    return 0;
}
```

---
## Sources

- [FreeCodeCamp Algorithms and Data Structures](https://www.freecodecamp.org/news/algorithms-and-data-structures-free-treehouse-course/)
- [MIT OpenCourseWare 6.006](https://ocw.mit.edu/courses/6-006-introduction-to-algorithms-spring-2020/)
- [Introduction to Algorithms - 4th Edition](http://mitpress.mit.edu/9780262046305/introduction-to-algorithms/)

| <img width=1000/> [Previous Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_3_intermediate_java/lesson_5_generics) | <img width=1000/> [Home](https://github.com/Kevin-Lago/Java-Course-Guide) | <img width=1000> [Next Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_3_intermediate_java/lesson_7_structured_data) |
|:---|:---:|---:|
