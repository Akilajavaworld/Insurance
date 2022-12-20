package tamilnadu.chennai;

import java.util.Scanner;

public class Cgpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter total number of Paper ");
		    int Given = sc.nextInt();
		    int[] num = new int[Given];
		    for (int i = 0; i < num.length; i++) {
		    System.out.println("Enter " + (i + 1) + "st mark");
		    num[i]=sc.nextInt();
		    }
		int sum_of_paper= 0; 
		Float average;

		// access all elements using for each loop
		// add each element in sum
		for (int number: num) {
		  sum_of_paper += number;
		}

		// get the total number of elements
		int total_number_of_papers = num.length;

		// calculate the average
		// convert the average from int to double
		average =  ((float)sum_of_paper / (float)total_number_of_papers);

		System.out.println("Sum = " + sum_of_paper);
		System.out.println("Average = " + average);
		float f =average ; 
		int number1;
		number1 = (int)f;
		if(average>90)
		{
	    System.out.println("Your Grade is O and Your Grade Point is 10");
		}
		  else if(average>80)
		  {
	      System.out.println("Your Grade is A+ and Your Grade Point is 9");	
		  }
		  else if(average>75)
		  {
		  System.out.println("Your Grade is A and Your Grade Point is 8");
		  }
		  else if(average>70)
		  {
		  System.out.println("Your Grade is B and Your Grade Point is 7");
		  }
		  else  if(average>65)
		  {
	      System.out.println("Your Grade is C and Your Grade Point is 6");  
		  }
		  else if(average>60)
		  {
	      System.out.println("Your Grade is D and Your Grade Point is 5");   
		  }
		  else
		  {
			System.out.println("Your Grade id E and Your Grade Point is 4");  
		  }
		System.out.println("All the Best");
}}
