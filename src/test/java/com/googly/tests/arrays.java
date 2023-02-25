package com.googly.tests;

import java.util.Iterator;
import java.util.Scanner;

import org.testng.annotations.Test;

public class arrays {
	 Scanner sc = new Scanner(System.in);
	
	
	@Test
	public void readArraysElement()
	{
		 
		 System.out.println(" Enter size of the array ");
		 
		 int n = sc.nextInt();
		 
		 int[] arr;
		 
		 arr = new int [n];
		 
		 System.out.println(" Enter "+n+" Elements");
		 
		 for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		 
		 System.out.println(" Elements in the array are : ");
		 
//		 for (int i = 0; i < arr.length; i++) {
//		     System.out.println(arr[i]);
//		}
		 
		 for (int i : arr) {
			System.out.println(i);
		}
		 
	}
	
	

	@Test
	public void indexedArrays() {
		System.out.println(" Enter the array size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Now Enter "+n+" elements one by one");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println(" Elements in the array with index : ");
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("index "+i+" Element is "+arr[i]);
			
		}
	
	}
	
	
	@Test
	public void sumOfElements() {
	
		int[] arr = new int[5];
		int sum =0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the "+i+" Element");
			arr[i] = sc.nextInt();
			sum = sum +arr[i];
			}
	
		System.out.println("Sum of all the elements in the array is : "+sum);
	}
	
	@Test
	public void evenNumberInAnArray() {
		
		int[] arr = new int[5];
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]%2==0) {
				sum = sum+arr[i];
			}
		}
		
		System.out.println("Sum of all the even elements in the array is : "+sum);
	}
	
	
	@Test
	public void IsElementNegative() {
		int [] arr = new int[5];
		int sum = 0;
		int psum = 0;
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {	
		if(arr[i]<0) {
			sum = sum + arr[i];
		}
		else {
		psum = psum +arr[i];	
		}
		}
		
		System.out.println("Sum of negative number is : "+sum);
		
		System.out.println("Sum of positive number is : "+psum);
	}

	
	@Test
	public void arrayAddingElement() {
		int [] arr = new int [5];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]%3==0&arr[i]%2==0) {
				sum = sum +arr[i];
			}
			}
		System.out.println("Sum of elements wjich are divisible by 3 is "+sum);
	}
	
	
	@Test
	public void maxElementInArray() {
		System.out.println("Enter the size of Array");
	
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		
		
		
		System.out.println("Enter the elements one by one");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if(min>arr[i]) {
				min = arr[i];
			}
			if(max<arr[i]) {
				max = arr[i];
			}
		}

		System.out.println("The min element is : "+min);
		
		System.out.println("The max element is : "+max);
	}
}
