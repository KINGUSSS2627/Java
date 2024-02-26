# Codes

1. Hello World
2. Data types
3. Input
4. Operator
5. Strings
6. If Else
7. Switch Case
8. Loops
9. Array
10. Methodes

# Java

- In java file name is always alphaNuemeric
- consists of functions and classes
- Main Function is made public static void main

# Naming Convention

- For classes we use pascle convention
- For function we use camel casing

![image](https://github.com/KINGUSSS2627/Java/assets/107746269/a28df18d-e95f-4d1b-9ad0-84ca19e6b716)

# DataTypes

- int, bool, long, double, short, byte, float, char
- Long ke case mai last mai l, similarly float ke case mai f lagana padega

# Input

- import java.util.Scanner
- create Scanner sc = new Scanner(System.in)
- use various function like sc.nextInt, etc
- sc.hasNextInt() can be use to valdidate input as int

# Output

- System.out.println() -> gives a new line after it
- System.out.print() -> no new line
- System.out.printf() -> Similar to c printf and we can use %c, %d, etc
- System.out.format() -> same as printf

# Operator

- % can operate on decimal i.e 4.1 % 1.1 will give us remainder in decimal
- Consider precidence and associativity
- Results

  - byte + short = int
  - short + int = int
  - long + float = float
  - int + float = float
  - char + int = int
  - char + short = int
  - long + double = double
  - float + double = double

- i++ will first use i then increase and ++i will first increase and then use

# Strings

- String is a clas and not a premittive data type
- Strings are immutable and cant be changed
- Though we have some methode to get altered copy
  - s.length()
  - s.toLowerCase()
  - s.toUpperCase()
  - s.trim() -> remove leading trailing zeros
  - s.charAt() -> Return char at ith index
  - s.substring(start, end) -> end not included
  - s.replace() -> replace all occourance of char or str to another
  - s.indexOf() -> index of str firwst occurance we can specify strting index
  - s.equals(s1)
  - s.equalsIgnoreCase(s1)

# If Else

- Normal ifElse similar to C++

# Switch Case

- Similar Switch Case of C++

# Loops

- the Cond must be boolean
- Rest is same as C++

# Arrays

- Dclaration :

  - String s[] = new String[5];
  - String []s;
    s = new String[5];
  - String [][] s;
    s = new String[2][3];

- Methode
  - s.length -> Gives length of string

# Methode in Java

- Similar to functions in C++
- It is funciton clubbed inside the class
- Use static keyword to access methode without creating classes
- Can be overloaded similar to C++
- Arrays are passed by references similar holds for objects

# Variable Arguments

-
