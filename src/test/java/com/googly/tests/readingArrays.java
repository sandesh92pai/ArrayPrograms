package com.googly.tests;

import java.util.Arrays;

import org.testng.annotations.Test;

public class readingArrays {
	
	@Test
	public void readArrayElement() {
		int[] arr = {101,11,112,113,114};
		System.out.println(Arrays.toString(arr));	
	}
	
	// Using for each loop
	
	@Test
	public void usingforEachLoop() {
		int[] arr = {101,11,112,113,114};
		for (int i : arr) {
		System.out.println(i);
		}
	}

}
