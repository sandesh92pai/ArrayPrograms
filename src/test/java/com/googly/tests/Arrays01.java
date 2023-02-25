package com.googly.tests;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Arrays01 {
	 Scanner sc = new Scanner(System.in);
	
	@Test
	public void sortingArrays() {
		int[] arr = new int[5];
		
		System.out.println("Enter the elements of the arrays");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();	
		}
		System.out.println("Array Before sorting "+Arrays.toString(arr));
		int temp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j])
				{
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		System.out.println("Array sorted in  asending "+Arrays.toString(arr));
		
		
		Arrays.sort(arr);
		
		System.out.println("Array sorted in  descending "+Arrays.toString(arr));
	}

}
