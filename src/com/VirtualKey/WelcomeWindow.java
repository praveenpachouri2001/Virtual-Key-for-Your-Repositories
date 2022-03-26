
package com.VirtualKey;

public class WelcomeWindow {
	public static void printWelcomeScreen() {

		System.out.println("**********************************************************\n\n"
				+ " Welcome to Virtual key for your Personal Repo Application  \n\n"
				+ "**********************************************************\n\n"
				+ " This application was developed by Praveen Kumar Pachouri.\n" + "\t\t **Organisation -: Wipro** \n\n"
				+ "***********************************************************\n");

		System.out.println("\tThis Application is used to :- \n\n" + " * Retreive All files From main Directory\n"
				+ " * Add , Delete,  Search files in main Directory \n\n"
				+ "***********************************************************\n");
	}

	public static void displayMenu() {

		System.out.println("\n****** Select any option number from below and press Enter ******\n\n"
				+ "1. Press 1 to Retrive All files from main directory \n"
				+ "2. Press 2 to Add, Delete, search files in main Directory\n" + "3. Press 3 to Exit  \n\n"
				+ "***********************************************************\n");

	}

	public static void displayFileMenuOptions() {

		System.out.println("\n****** Select any option number from below and press Enter ******\n\n"
				+ "1. Press 1 to Add file in main directory\n" + "2. Press 2 to Delete a file from main Directory\n"
				+ "3. Press 3 to Search a particular file in Main Directory\n"
				+ "4. Press 4 to Go back to Previous menu\n" + "5. Press 5 to Exit \n\n "
				+ "***********************************************************\n");
	}
}
