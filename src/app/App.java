package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class App {
	static PrintStream output;
	static Random random = new Random();

	static String[] answers = { "honey pot", "increased", "Australia", "the world", "The Netherlands", "America",
			"reduce", "decreased", "harm-reduction", "Not in our neighborhood", "encourage", "opioids", "less", "crime",
			"high-risk", "died", "overdosed", "mental health care", "diseases such as HIV", "stigma", "approved",
			"safe place" };

	public static void main(String[] args) throws FileNotFoundException {
		output = System.out;
		ArrayList<Integer> used = new ArrayList<Integer>();

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int index = random.nextInt(22);
				if (!used.contains(index)) {
					used.add(index);
					output.print(answers[index]);
					output.print("\t\t\t\t\t\t\t\t");
				} else if (used.contains(index)) {
					j--; // System.out.println("index" + used.contains(index));
				}

			}
			output.println();
		}

		output.close();
	}
}