package _02_More_Algorithms;

import java.util.Arrays;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i ++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int counter = 0;
		for(int i = 0; i < oysters.size(); i ++) {
			if(oysters.get(i) == true) {
				counter++;
			}
		}
		return counter;
	}
	
	public static double findTallest(List<Double> peeps) {
		int tallest = 0;
		for(int i = 1; i < peeps.size(); i ++) {
			if(peeps.get(i) > peeps.get(tallest)) {
				tallest = i;
			}
		}
		return peeps.get(tallest);
	}
	
	public static String findLongestWord(List<String> words) {
		int longest = 0;
		for(int i = 1; i < words.size(); i ++) {
			if(words.get(i).length() > words.get(longest).length()) {
				longest = i;
			}
		}
		return words.get(longest);
	}
	
	public static boolean containsSOS(List<String> message) {
		String sos = "... --- ...";
		for(int i = 1; i < message.size(); i ++) {
			for(int j = 1; j < message.get(i).length()-11; j ++) {
				if(sos.equals(message.get(i).substring(j, j+11))){
					return true;
				}
			}
		}
		return false;
	}
	
	public static List<Double> sortScores(List<Double> results) {
		boolean b = true;
		while (b) {
			b = false;
			for(int i = 1; i < results.size(); i++) {
				if(results.get(i-1) > results.get(i)) {
					double x = results.get(i-1);
					results.set(i-1, results.get(i));
					results.set(i,x);
					b = true;
				}
			}
		}
		return results;
	}
	
	public static List<String> sortDNA(List<String> sequences) {
		boolean b = true;
		while (b) {
			b = false;
			for(int i = 1; i < sequences.size(); i++) {
				if(sequences.get(i-1).length() > sequences.get(i).length()) {
					String x = sequences.get(i-1);
					sequences.set(i-1, sequences.get(i));
					sequences.set(i,x);
					b = true;
				}
			}
		}
		return sequences; 
	}
	
	public static List<String> sortWords(List<String> words) {
		List<String> alphabet = Arrays.asList(new String[] {"a","b","c","d","e","f","g","h","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"});
		boolean b = true;
		boolean wordOneFirst = false;
		boolean wordTwoFirst = false;
		while (b) {
			b = false;
			for(int i = 1; i < words.size()-1; i++) {
				for(int j = 1; j < words.get(i).length(); j++) {
					for(int l = 1; l < alphabet.size(); l++) {
						wordOneFirst = false;
						wordTwoFirst = false;
						if(words.get(i).substring(j, j+1).equals(alphabet.get(l))) {
							wordOneFirst = true;
						}
						if(words.get(i+1).length() < j) {
							l = alphabet.size();
							j = words.get(i).length();
							wordOneFirst = false;
						}else if(words.get(i+1).substring(j, j+1).equals(alphabet.get(l))) {
							wordTwoFirst = true;
						}
						if(wordOneFirst == true && wordTwoFirst == false) {
							String x = words.get(i-1);
							words.set(i-1, words.get(i));
							words.set(i,x);
							System.out.println("true");
							l = alphabet.size();
							j = words.get(i).length();
							b = true;
						}
					}
				}
			}
		}
		return words; 
	}
	
}
