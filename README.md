# Data Structures Revision

## Table of Contents
- [Purpose](#purpose)
- [Project Structure](#project-structure)
- [Implementation Notes](#implementation-notes)
- [Instructions](#instructions)
  - [Instructions for using this Repository](#instructions-for-using-this-repository)
  - [Instructions for using this README](#instructions-to-use-this-readme)
- [How To Run Locally](#how-to-run-locally)


## Purpose
This project is a clean-room re-implementation of selected Java data structures across Java SE versions 5–10.
The goal is to understand how core collection structures evolve across versions and to reinforce concepts such as abstraction, interfaces, and implementation design.

## Project Structure
The repository is organized by Java SE version:

- [Java_SE_5](./src/Java_SE_5)
- [Java_SE_6](./src/Java_SE_6)
- [Java_SE_7](./src/Java_SE_7)
- [Java_SE_8](./src/Java_SE_8) (in progress)
- [Java_SE_9](./src/Java_SE_9)
- [Java_SE_10](./src/Java_SE_10)

Each folder contains its own implementation of interfaces, abstract classes, and concrete data structures.

## Implementation Notes
- All implementations are custom (no use of `java.util`)
- Each version is fully independent
- Focus is on learning and understanding, not production use

## Instructions

### Instructions for using this Repository
This repository contains a clean-room implementation of selected Java data structures across multiple Java SE versions (5–10).

Each version is independent and self-contained. To use or modify the code, clone the repository locally.

---

### Instructions to use this README
This README provides a structured overview of the repository.

For detailed behavior and implementation:
- Refer to the source code inside each version folder
- Use `Main.java` in each version to test functionality

---

### How to Run Locally

1. Clone the repository:
```bash
git clone https://github.com/tun67213/DataStructuresRevision.git
cd DataStructuresRevision
```
2. Navigate to the Java SE version you want to test:
```bash
cd Java_SE_7
```

3. Add code into the Main.java file to test like the following:
```java
public static void main(String[] args)
{
    // To test methods associated with list and how they work in an ArrayList
    List<Integer> list = new ArrayList<>();

    // To test methods associated with ArrayList and how their unique methods work
    ArrayList<Integer> arrayList = new ArrayList<>();
}
```

4. Compile Main.java:
```bash
javac Main.java
```

5. Run the program:
```bash
java Main
```

6. Follow the comments inside `Main.java` to test the available data structures.
Repeat these steps inside any other `Java_SE_n` folder to test a different version.
