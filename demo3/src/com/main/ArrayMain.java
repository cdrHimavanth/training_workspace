package com.main;

import com.service.BusinessLogic;

public class ArrayMain {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5, 6 };

		System.out.println(intArray.length);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		BusinessLogic businessLogic = new BusinessLogic();
		System.out.println("The first occurence of the element " + 3 + " in the given array is at index : "
				+ businessLogic.search(intArray, 3));
		System.out.println("Note -1 as index means the element is not present in the array");
		System.out.println("Sum of elements of given array : " + businessLogic.sumOfElements(intArray));

		int[] sortedArray = BusinessLogic.specialSort(intArray);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}

	}

}
