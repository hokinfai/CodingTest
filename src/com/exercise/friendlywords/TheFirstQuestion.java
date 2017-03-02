package com.exercise.friendlywords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheFirstQuestion {
	static String[] friendlyWords(String[] input) {
		int index = 0;
		String[] result = new String[100];
		// String[] remaining = input;
		// List<String> remaining = Arrays.asList(input);
		List<String> remaining = new ArrayList<>();
		for (String in : input)
			remaining.add(in);

		for (int i = 1; i < remaining.size(); i++) {
			String incoming = remaining.get(0);
			if (incoming.length() == remaining.get(i).length()) {
				List<String> possible = new ArrayList<String>();
				possible.add(remaining.get(i));
				// System.out.println(possible.get(0).toString());
				char[] target = incoming.toLowerCase().toCharArray();
				Arrays.sort(target);
				for (String pos : possible) {
					char[] check = pos.toLowerCase().toCharArray();
					Arrays.sort(check);
					if (Arrays.equals(target, check)) {
						System.out.println(incoming);
						result[0] = incoming;
						index++;
						result[index] = pos;
								remaining.remove(pos);
								remaining.remove(incoming);
					}
				}
				for (String pri : remaining)
					System.out.println("remaining: " + pri);
				return result;
			}
		}

		return new String[] {};
	}

	public static void main(String[] args) {
		String[] a = { "cheating", "teaching", "deal", "dale" };
		String[] result = friendlyWords(a);
		for (String pr : result)
			System.out.println(pr);

	}

}
