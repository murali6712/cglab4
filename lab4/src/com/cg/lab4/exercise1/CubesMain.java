package com.cg.lab4.exercise1;

import java.util.Scanner;


public class CubesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number to print the sum of cubes:");
		Scanner Sc = new Scanner(System.in);
		int number = Sc.nextInt();
		SumOfCubes obj = new SumOfCubes();
		obj.sumOfCubes(number);
	}

}
