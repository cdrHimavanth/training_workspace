package com.main;
import java.util.Scanner;
import com.model.User;
import com.service.DbWorks;
import com.service.DbWorksImpl;
public class DbMainTerminalApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean go = true;
		System.out.println("YOU HAVE ENTERED USER TERMINAL PLEASE FOLLOW THE INSTRUCTIONS");
		DbWorks dbWorks = new DbWorksImpl();
		while(go) {
			System.out.println("Enter 1 to create new user");
			System.out.println("Enter 2 to read all users data");
			System.out.println("Enter 3 to update user");
			System.out.println("Enter 4 to remove an user");
			System.out.println();
			int choice = scan.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Please have no spaces in username or password as it have to be single word");
					System.out.println();
					System.out.println("Enter username ");
					scan.nextLine();
					String name = scan.nextLine();
					System.out.println("Enter password ");
					String password = scan.nextLine();
					User user = dbWorks.createUser(name,password);
					if(user!=null) {
						System.out.println(user);
					}else {
						System.out.println("dommmm");
					}
					break;
				case 2:
					dbWorks.readAllUsers();
					break;
				case 3:
					System.out.println("Please have no spaces in username or password as it have to be single word");
					System.out.println();
					System.out.println("Enter user id ");
					int id = scan.nextInt();
					System.out.println("Enter username ");
					scan.nextLine();
					String name1 = scan.nextLine();
					System.out.println("Enter password ");
					String password1 = scan.nextLine();
					dbWorks.updateUser(id, name1, password1);
					break;
				case 4:
					System.out.println("Enter user id ");
					int id2 = scan.nextInt();
					dbWorks.deleteUserById(id2);
					break;
				default:
					go=false;
			}
			System.out.println();
			System.out.println();
		}
		System.out.println("----------Terminated----------");
		scan.close();
	}

}
