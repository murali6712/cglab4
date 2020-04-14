package com.cg.lab4.exercise1;

public class SumOfCubes {
	void sumOfCubes(int number)
	{
		int count = 0;
		// TODO Auto-generated method stub
		while (number > 0)
		{
			int temp = number % 10;
			int cube = temp * temp * temp;
			number = number / 10 ;
			count = count + cube;
		}
		System.out.println("Sum of the digits of the cube is:" + count);
	}
}
