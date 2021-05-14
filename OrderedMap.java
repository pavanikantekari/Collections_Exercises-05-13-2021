package com.collection.assignment;

import java.util.HashMap;
import java.util.Map;

public class OrderedMap {
	private static Map<Integer, String> insertionOrderMap;

	public OrderedMap() {
		insertionOrderMap = new HashMap<Integer, String>();
	}

	public Map<Integer, String> getInsertionOrderMap() {
		return insertionOrderMap;
	}

	public void setInsertionOrderMap(Map<Integer, String> insertionOrderMap) {
		this.insertionOrderMap = insertionOrderMap;
	}

	public static void addElement(int key, String value) {
		insertionOrderMap.put(1, "sachin");
		insertionOrderMap.put(3, "pavani");
		insertionOrderMap.put(2, "Dhoni");
	}

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		OrderedMap op = new OrderedMap();
		op.addElement(0, null);
		System.out.println(op.getInsertionOrderMap());
	}
}
