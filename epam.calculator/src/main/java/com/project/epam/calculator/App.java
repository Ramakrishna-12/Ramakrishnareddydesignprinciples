package com.project.epam.calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter first number");
       double first=obj.nextDouble();
       System.out.println("Enter second number");
       double second=obj.nextDouble();
       System.out.println("Enter operation like - + , - , / , *");
       String op=obj.next();
       double result = 0;

       boolean d = false;
       if (op.equals("+"))
       {
    	   result= Addition.cal(first,second);
       }
       else if(op.equals("-"))
       {
    	   result= Substraction.cal(first,second);
       }
       else if(op.equals("*"))
       {
    	   result= Multiplication.cal(first,second);
       }
       else if(op.equals("/"))
       {
    	   result= Division.cal(first,second);
       }
       else
       {
    	   d=true;
       }
       if (d)
       {
    	   System.out.println("Enter correct operator");
       }
       else
    	   System.out.println(result);
       obj.close();
    }
}
