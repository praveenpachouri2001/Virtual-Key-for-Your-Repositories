
package com.VirtualKey;

public class MainWindow {

	public static void main(String[] args) {

		// Create "main" folder if not present in current folder structure

		FileWindow.createMainFolderIfNotPresent();

		WelcomeWindow.printWelcomeScreen();

		HandleOptions.handleWelcomeScreenInput();
	}

}