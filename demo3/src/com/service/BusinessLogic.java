package com.service;

import com.model.Employee;

public class BusinessLogic {
	public int search(int[] searchArray, int searchElement) {
		for (int i = 0; i < searchArray.length; i++) {
			if (searchArray[i] == searchElement) {
				return i;
			}
		}
		return -1;
	}

	public int occurences(int[] searchArray, int searchElement) {
		int count = 0;
		for (int i = 0; i < searchArray.length; i++) {
			if (searchArray[i] == searchElement) {
				count += 1;
			}
		}
		return count;
	}

	public int sumOfSalaries(Employee[] array1) {
		int sum = 0;
		for (int i = 0; i < array1.length; i++) {
			sum += array1[i].getEmpSalary();
		}
		return sum;
	}

	public int sumOfElements(int[] searchArray) {
		int sum = 0;
		for (int i = 0; i < searchArray.length; i++) {
			sum += searchArray[i];
		}
		return sum;
	}

	public boolean searchByEmployeeId(Employee[] empArray, int id) {
		boolean bool = false;
		for (int i = 0; i < empArray.length; i++) {
			if (empArray[i].getEmpId() == id) {
				bool = true;
			}
		}
		return bool;
	}

	public static Employee[] checkSalaries(Employee[] empArr, float salary) {
		int count = 0;
		for (int i = 0; i < empArr.length; i++) {
			if ((float)empArr[i].getEmpSalary() == salary) {
				count++;
			}
		}
		Employee[] chosen = new Employee[count];
		int j = 0;
		for (int i = 0; i < empArr.length; i++) {
			if (empArr[i].getEmpSalary() == salary) {
				chosen[j] = empArr[i];
				j++;
			}
		}
		return chosen;
	}
	// Yet to complete

	public static int[] specialSort(int[] arr) {
		boolean isNotSorted = true;
		int count = 0;
		while (isNotSorted) {
			count++;
			int temp;
			for (int i = 0; i < arr.length - 1; i++) {
				count++;
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			for (int i = 0; i < arr.length - 1; i++) {
				count++;
				if (arr[i] <= arr[i + 1]) {
					isNotSorted = false;
				} else {
					isNotSorted = true;
					break;
				}
			}
		}
		System.out.println("Count is : " + count);
		return arr;
	}

}
