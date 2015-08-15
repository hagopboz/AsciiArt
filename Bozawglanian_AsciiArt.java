/*************************************************************** 
* file: Bozawglanian_AsciiArt.java 
* author: Hagop Bozawglanian
* class: CS 141 – Programming and Problem Solving 
* 
* assignment: program 3 
* date last modified: 10/27/2014 
* 
* purpose: This program will read a text from the file, the 
* program will "traverse" the rows and columns of the array (with 
* nested for-loops) and print out the array in the proper order to 
* do the following transformations 
****************************************************************/ 

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bozawglanian_AsciiArt {

	public static void main(String[] args) throws FileNotFoundException {

		int x = -1;
		int y = -1;

		String[] words = {};
		File file1 = new File("monalisa.txt");

		Scanner scan = new Scanner(file1);

		int counter = 0;
		x = scan.nextInt();
		y = scan.nextInt();
		scan.nextLine();
		words = new String[y];
		while (scan.hasNext()) {
			words[counter++] = scan.nextLine();
		}

		char[][] strings = new char[x][y];
		for (int a = 0; a < strings.length; a++) {
			for (int b = 0; b < words.length; b++) {
				strings[a][b] = words[a].charAt(b);
			}
		}

		System.out.println("Original Text: \n");
		for (int a = 0; a < strings.length; a++) {
			for (int b = 0; b < words.length; b++) {
				System.out.print(strings[a][b]);

			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Transformations:");
		System.out.println();

		for (int a = 0; a < strings.length; a++) {
			for (int b = 0; b < words.length; b++) {
				System.out.print(strings[x - 1 - a][b]);
			}
			System.out.println();
		}
		System.out.println();
		for (int a = 0; a < strings.length; a++) {
			for (int b = 0; b < words.length; b++) {
				System.out.print(strings[a][y - 1 - b]);
			}
			System.out.println();

		}
		System.out.println();
		for (int a = 0; a < strings.length; a++) {
			for (int b = 0; b < words.length; b++) {
				System.out.print(strings[x - 1 - a][y - 1 - b]);
			}
			System.out.println();
		}

	}
}
