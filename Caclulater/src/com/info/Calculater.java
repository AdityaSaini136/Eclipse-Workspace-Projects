package com.info;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.ADD\n2.SUB\n3.MUL\n4.DIV");
		System.out.println("Enter the choice ch=");		
		double nd = sc.nextDouble();
		if(nd==1) {
			int i = 10;
			int y = 20;
			int c = i+y;
			System.out.println("Result after Adding :> "+c);
		}
		else if(nd==2) {
			int i = 10;
			int y = 20;
			int c = i-y;
			System.out.println("Result after Subtraction : >"+c);
		}
	
		else if (nd==3) {
			int i = 10;
			int y = 20;
			int c = i*y;
			System.out.println("Result after Multiply :> "+c);
		}
		
		else  {
			int i = 100;
			int y = 20;
			int c = i/y;
			System.out.println("Result after Division : >"+c);
		}

	}
}
