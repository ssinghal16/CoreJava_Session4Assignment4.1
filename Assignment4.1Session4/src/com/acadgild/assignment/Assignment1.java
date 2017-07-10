//Write a program to demonstrate the use of method overloading and method overriding.

/* Method overloading */

package com.acadgild.assignment; //package declaration 

//dynamic polymorphism
class Sum
{
void add(int a, int b)      //Method overloading
{
            System.out.println("Sum of two="+(a+b));
}

void add(int a, int b,int c)   //Method overloading
{
            System.out.println("Sum of three="+(a+b+c));
}
}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Method overloading");
		Sum s=new Sum();
        s.add(10,15);
        s.add(10,20,30);
	}

}
