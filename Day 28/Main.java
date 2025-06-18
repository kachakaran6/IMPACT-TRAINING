import java.util.*;
import java.lang.*;
import java.io.*;

class ComplexNumber {
    int real;
    int imaginary;

    ComplexNumber(int realpart, int imaginarypart) {
        real = realpart;
        imaginary = imaginarypart;
    }

    void display() {
        System.out.println(real + "+" +imaginary + "i");
    }

	 ComplexNumber add(ComplexNumber obj) {
        int newReal = real + obj.real;
        int newImaginary = imaginary + obj.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
}


public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		ComplexNumber c = new ComplexNumber(2, 3);
		ComplexNumber c2 = new ComplexNumber(4, 5);
		c.display();
		c2.display();

		ComplexNumber sum = c.add(c2);
		sum.display();
	}
}