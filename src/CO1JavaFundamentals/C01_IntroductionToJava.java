//# ☕ **01. Introduction to Java**
//
//Welcome to Java!
//
//Before writing lots of code, we first need to understand:
//
//        > **What is Java, why do we use it, and where is it useful?**
//
//        ---
//
//        ## **1. What is Java?**
//
//Java is a **high-level, object-oriented programming language** used to build different types of software applications.
//
//        ### **In simple words:**
//
//Java is a programming language that allows us to give instructions to a computer.
//
//        ### **Example:**
//
//        ```java
//System.out.println("Hello Java");
//```
//
//        ### **Output:**
//
//        ```text
//Hello Java
//```
//
//Here, we are telling Java to display **Hello Java** on the screen.
//
//---
//
//        ## **2. ☕ Why do we use Java?**
//
//Java is used because it is:
//
//        * Easy to learn compared with low-level languages
//* Object-oriented
//* Platform independent
//* Secure
//* Robust
//* Widely used in industry
//* Suitable for large applications
//
//### **Java is commonly used in:**
//
//        * Backend development
//* Enterprise applications
//* Banking systems
//* Web applications
//* Cloud applications
//* Android development
//* Large business applications
//
//---
//
//        ## **3. 🌍 Real-Life Example**
//
//Imagine a food-ordering application.
//
//A customer selects:
//
//        * **Pizza = ₹200**
//        * **Quantity = 2**
//
//The application needs to calculate the total.
//
//Java can perform this calculation:
//
//        ```java
//int price = 200;
//int quantity = 2;
//
//int total = price * quantity;
//
//System.out.println("Total = ₹" + total);
//```
//
//        ### **Output:**
//
//        ```text
//        Total = ₹400
//```
//
//So Java can be used to implement the **logic behind real applications**.
//
//        ---
//
//        # **4. 🚀 Important Features of Java**
//
//        ## **1. Object-Oriented**
//
//Java supports **Object-Oriented Programming (OOP)**.
//
//Real-world entities can be represented using **classes and objects**.
//
//        ### **Examples:**
//
//        * Student
//* Car
//* BankAccount
//* Employee
//* Product
//
//We will study OOP in detail later.
//
//---
//
//        ## **2. Platform Independent**
//
//Java follows the idea:
//
//        > **Write Once, Run Anywhere**
//
//Java source code is compiled into **bytecode**, which can be executed by a compatible JVM on different operating systems.
//
//        ### **Basic Flow:**
//
//        ```text
//Java Source Code
//       ↓
//Compiler
//       ↓
//Bytecode
//       ↓
//JVM
//       ↓
//Execution
//```
//
//        ---
//
//        ## **3. 🔐 Secure**
//
//Java provides various features that help make applications **safer and more controlled**.
//
//        ---
//
//        ## **4. 💪 Robust**
//
//Java has features such as **strong type checking** and **automatic memory management** that help create reliable applications.
//
//---
//
//        ## **5. ⚡ Multithreaded**
//
//Java supports running multiple tasks concurrently.
//
//        For example, an application might handle:
//
//        * Download file
//* Play music
//* Process user input
//
//at the same time.
//
//        ---
//
//        # **5. ⚔️ Java vs JavaScript**
//
//Java and JavaScript are **different programming languages**.
//
//        > **Java ≠ JavaScript**
//
//They have different syntax, ecosystems, and common use cases.
//
//---
//
//        # **6. ⚙️ How Java Basically Works**
//
//Suppose we write:
//
//        ```java
//class Hello {
//
//    public static void main(String[] args) {
//
//        System.out.println("Hello");
//
//    }
//
//}
//```
//
//        ### **The basic process is:**
//
//        ```text
//Source Code
//     ↓
//Java Compiler
//     ↓
//Bytecode
//     ↓
//JVM
//     ↓
//Program Execution
//```
//
//We will understand **JDK, JRE and JVM** in the next lesson.
//
//        ---
//
//        # **7. 💻 Basic Java Example**
//
//        ```java
package CO1JavaFundamentals;
public class C01_IntroductionToJava {
     public static void main(String[] args) {
         String name = "Rahul";
         int age = 20;
         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
     }
}


//Output:
//Name: Rahul
//Age: 20




