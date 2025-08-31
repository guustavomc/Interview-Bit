/*In this Problem, you'll learn about different types of operators in Java, their syntax and how to use them with the help of examples.

Operators are symbols that perform operations on variables and values. For example, + is an operator used for addition, while * is also an operator used for multiplication.

Operators in Java can be classified into 6 types:

Arithmetic Operators
Assignment Operators
Relational Operators
Logical Operators
Unary Operators
Bitwise Operators
References: Click Here.

We will discuss about arithmetic operators and rest you can study from the references mentioned above.

Arithmetic Operators:

Arithmetic operators are used to perform arithmetic operations on variables and data. For example,

a + b;
Here, the + operator is used to add two variables a and b. Similarly, there are various other arithmetic operators in Java.

Operator       Operation
   +           Addition
   -           Subtraction
   *           Multiplication 
   /           Division
   %           Modulo Operation (Remainder after division)
Task:

You are given two integers as input a and b
You need to perform several tasks in the editor below:

In the variable named "add" store the sum of a and b.
In the variable named "sub" store the difference of a with b.
In the variable named "multi" store the multiplication of a and b.
In the variable named "div" store the division of a by b.
 

NOTE: You don't need to print anything.*/

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    /***Don't change anything here***/
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        inp.nextLine();
        int b = inp.nextInt();
        inp.nextLine();
        inp.close();
    /*********************************/
    
    /*Perform the task here*/
        
        int add = a + b;
        int sub = a - b;
        int multi = a * b;
        int div = a / b;
        
    /***********************/
    
    /******Don't change anything here******/
        System.out.println(add);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
    
    }
}
