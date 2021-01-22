package com.lockedme.assessment;

import java.io.IOException;
import java.util.Scanner;

public class CompanyLockers {
	Scanner scan = null;

	private void mainMenu() throws IOException {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("                  <<<<<<<<< Welcome to LockedMe.com >>>>>>>>                                  ");
		System.out.println("                                                                                            ");
		System.out.println("                    		----------------Developer: Anjana Antony                         ");
		System.out.println("                    		----------------Position: Java Full Stack Developer              ");
		mainMenuDisplay();
	}

	private void mainMenuDisplay() throws IOException {
		System.out.println("		Select any options from below ");
		System.out.println(" ");
		System.out.println("		1. Display the files in ascending order from ");
		System.out.println("		2. File Manipulations ");
		System.out.println("		3. Exit Application");
		System.out.println(" ");
		
		System.out.print("		Please Select From Options: ");
		System.out.print(" ");
		scan = new Scanner(System.in);
		if (scan.hasNextInt()) {
			switch (scan.nextInt()) {
			case 1:
				FileHandle fileSort = new FileHandle();
				fileSort.fileNameDisp();
				mainMenuDisplay();
			case 2:
				subDisplay();
			case 3:
				exitpgm();
			default:
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" Please enter a valid input ");
				mainMenuDisplay();
			}
		} else System.out.println(" Please enter a valid input ");
		
		}

	private void subDisplay() throws IOException {
		System.out.println(" ");
		System.out.println("	Select 1,2 or 3 for file manipulations");
		System.out.println("	1. Add a file");
		System.out.println("	2. Delete a File ");
		System.out.println("	3. Search a file");
		System.out.println("	4. Back to Main Menu");

		System.out.println(" ");
		
		System.out.print("		Please Select From Options: ");
		System.out.print(" ");
		scan = new Scanner(System.in);
		if (scan.hasNextInt()) {
			switch (scan.nextInt()) {
				case 1:
					CreateFileE createFile = new CreateFileE();
					createFile.fileCreate();
					subDisplay();
				case 2:
					DeleteFile1 deleteFile = new DeleteFile1();
					deleteFile.delteFile();
					subDisplay();
				case 3:
					FileSearch searchF = new FileSearch();
					searchF.fileSearch();
					subDisplay();
				case 4:
					mainMenuDisplay();
				default:
					System.out.println(" Please enter a valid input ");
					subDisplay();
			}
		} else System.out.println(" Please enter a valid input ");
		subDisplay();
	}

	private void exitpgm() {
		System.out.println(" ");
		System.out.println("			Thank you for using LockedMe.com");
		java.lang.System.exit(0);
	}



	public static void main(String[] args) throws IOException {
		CompanyLockers disp = new CompanyLockers();
		disp.mainMenu();
	}
}
