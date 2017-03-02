package com.exercise.friendlywords;

import java.util.Arrays;

public class FriendlyWords {
	static String[] friendlyWords(String[] input) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i].length() == input[j].length()) {
					char[] target = input[i].toLowerCase().toCharArray();
					Arrays.sort(target);
					char[] check = input[j].toLowerCase().toCharArray();
					Arrays.sort(check);
					if (Arrays.equals(target, check)) {
						if (!result.toString().contains(input[i]))
							result.append(input[i] + " ");
						if (!result.toString().contains(input[j]))
							result.append(input[j] + " ");
					}

				}

			}
			result.append("\n");
		}
		String answer = result.toString().replaceAll("\n+", "\n");
		String[] output = answer.split("\n");

		return output;
	}

	public static void main(String[] args) {
		String[] a = { "cheating", "teaching", "deal", "dale", "lead", "slient", "listen" , "abc", "bac", "bca", "ded", "edd"};
		String[] result = friendlyWords(a);
		for (String pr : result)
			System.out.println(pr);

	}
}
