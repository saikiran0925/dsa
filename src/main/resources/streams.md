Absolutely! Here are some problems of varying difficulty to help you practice using Java Streams effectively. Each problem is designed to help you explore different aspects of the Stream API, from filtering and mapping to more advanced operations like grouping and parallel streams.

---

### Problem Set

#### 1. **Filter and Mapping Basics**

**Problem**: Given a list of integers, filter out the odd numbers, square each remaining number, and return the list of squared numbers.

Example:
```java
Input: [1, 2, 3, 4, 5]
Output: [4, 16]
```

---

#### 2. **Finding Maximum and Minimum Values**

**Problem**: Given a list of floating-point numbers, find the maximum and minimum values using streams.

Example:
```java
Input: [1.5, 3.8, -2.4, 7.9, 0.2]
Output: Max: 7.9, Min: -2.4
```

---

#### 3. **String Length Filtering**

**Problem**: Given a list of strings, filter out strings with less than 4 characters, sort them alphabetically, and return the result as a list.

Example:
```java
Input: ["apple", "bat", "cat", "elephant"]
Output: ["apple", "elephant"]
```

---

#### 4. **Count Words that Start with a Specific Letter**

**Problem**: Given a list of words and a character, count how many words start with that character.

Example:
```java
Input: ["apple", "apricot", "banana", "avocado"], 'a'
Output: 3
```

---

#### 5. **Convert List of Strings to Uppercase**

**Problem**: Convert all strings in a given list to uppercase using streams.

Example:
```java
Input: ["hello", "world"]
Output: ["HELLO", "WORLD"]
```

---

#### 6. **Sum of Even Numbers**

**Problem**: Given a list of integers, find the sum of all even numbers.

Example:
```java
Input: [3, 4, 7, 10, 12]
Output: 26
```

---

#### 7. **Flatten a List of Lists**

**Problem**: Given a list of lists of integers, flatten it into a single list.

Example:
```java
Input: [[1, 2], [3, 4, 5], [6]]
Output: [1, 2, 3, 4, 5, 6]
```

---

#### 8. **Group Strings by First Character**

**Problem**: Given a list of strings, group them by their first character and return a map where the key is the first character, and the value is a list of strings starting with that character.

Example:
```java
Input: ["apple", "banana", "avocado", "blueberry"]
Output: {a=[apple, avocado], b=[banana, blueberry]}
```

---

#### 9. **Calculate Average of Numbers**

**Problem**: Given a list of integers, calculate the average value. If the list is empty, return 0.

Example:
```java
Input: [10, 20, 30, 40]
Output: 25.0
```

---

#### 10. **Partition List of Integers into Even and Odd**

**Problem**: Given a list of integers, partition it into a map with two keys: `true` for even numbers and `false` for odd numbers.

Example:
```java
Input: [1, 2, 3, 4, 5, 6]
Output: {false=[1, 3, 5], true=[2, 4, 6]}
```

---

#### 11. **Find the Longest String**

**Problem**: Given a list of strings, find the longest string. If there is a tie, return any of the longest strings.

Example:
```java
Input: ["apple", "banana", "cherry", "date"]
Output: "banana"
```

---

#### 12. **Counting Occurrences of Characters in a String**

**Problem**: Given a string, count occurrences of each character and return a map with characters as keys and occurrences as values.

Example:
```java
Input: "hello"
Output: {h=1, e=1, l=2, o=1}
```

---

#### 13. **Sort a List of People by Age**

**Problem**: Given a list of `Person` objects (where each object has a `name` and an `age`), sort the list by age in descending order and return the sorted list.

Example:
```java
Input: [Person("Alice", 30), Person("Bob", 25), Person("Charlie", 35)]
Output: [Person("Charlie", 35), Person("Alice", 30), Person("Bob", 25)]
```

---

#### 14. **Sum of Squares of Odd Numbers**

**Problem**: Given a list of integers, calculate the sum of squares of odd numbers.

Example:
```java
Input: [1, 2, 3, 4, 5]
Output: 35 (since 1^2 + 3^2 + 5^2 = 35)
```

---

#### 15. **Find Distinct Words in a Sentence**

**Problem**: Given a sentence (string), split it into words, remove duplicates, sort the words alphabetically, and return a list.

Example:
```java
Input: "the quick brown fox jumps over the lazy dog"
Output: ["brown", "dog", "fox", "jumps", "lazy", "over", "quick", "the"]
```

---

#### 16. **Generate First N Fibonacci Numbers**

**Problem**: Generate the first N Fibonacci numbers using streams.

Example:
```java
Input: N = 7
Output: [0, 1, 1, 2, 3, 5, 8]
```

---

#### 17. **Count Prime Numbers in a Range**

**Problem**: Given a range of numbers, count how many of them are prime.

Example:
```java
Input: 10 to 20
Output: 4 (Prime numbers are 11, 13, 17, and 19)
```

---

#### 18. **Calculate Total Age of People Above a Certain Age**

**Problem**: Given a list of `Person` objects, find the total age of all people above a given age.

Example:
```java
Input: [Person("Alice", 30), Person("Bob", 40), Person("Charlie", 25)], age limit = 30
Output: 40 (only Bob is above 30)
```

---

#### 19. **Find Duplicate Elements in a List**

**Problem**: Given a list of integers, find all duplicate elements and return them as a list.

Example:
```java
Input: [1, 2, 3, 4, 2, 5, 3]
Output: [2, 3]
```

---

#### 20. **Identify Palindromic Words**

**Problem**: Given a list of words, identify the words that are palindromic (words that read the same forwards and backwards).

Example:
```java
Input: ["madam", "racecar", "java", "level"]
Output: ["madam", "racecar", "level"]
```

---

These problems will give you great practice with Java Streams and help you build skills in various areas like filtering, mapping, reducing, sorting, grouping, and parallel processing. Try to solve each problem using streams, and experiment with different stream methods to understand how they work together. Let me know if you'd like to see solutions to any of these!
