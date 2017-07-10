//Write a program to demonstrate the use of method overloading and method overriding.

/* Method overriding */
package com.acadgild.assignment; //package declaration

//dynamic polymorphism

class A
{
void cal(double x)   //Method overriding
{
            System.out.println("square value="+(x*x));
}
}
class B extends A
{
void cal(double x)   //Method overriding
{
            System.out.println("square root="+Math.sqrt(x));
}
}

public class Assignment1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Method overriding");
		A a=new A();
        a.cal(15);
	}

}
