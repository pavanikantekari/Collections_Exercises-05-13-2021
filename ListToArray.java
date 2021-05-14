package com.collection.assignment;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
	public static void convertToArray() {
		List<Integer> inputList = new ArrayList<Integer>();
		inputList.add(111);
		inputList.add(231);
		inputList.add(430);

		Integer[] array = (Integer[]) inputList.toArray(new Integer[inputList.size()]);

		System.out.println("[" +  array[0] + "," + array[1] + "," + array[2] + "]");

	}

	public static void main(String[] args) {
		convertToArray();
	}

}
