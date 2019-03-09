package com.juxin.test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Words {
	public static void main(String[] args) {
		String text = "bb dd ff aa ee, bb cc aa bb dd, ee. ee ee";

		String[] words = text.split("[,./ ]");

		Map<String, Integer> myMap = new TreeMap<>();
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			if (key.length() > 0) {
				if (myMap.get(key) == null) {
					myMap.put(key, 1);
				} else {
					int value = myMap.get(key).intValue();
					value++;
					myMap.put(key, value);
				}
			}
		}

		Set<Map.Entry<String, Integer>> mySet = myMap.entrySet();
		for (Map.Entry<String, Integer> entry : mySet) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}
}
