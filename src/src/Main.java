package src;

import java.util.Collection;
import java.util.Scanner;
import src.ToDoList;

public class Main {
	private static ToDoList tdl = new ToDoList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			String option = showMenu();
			
			if(option.equals("1"))
			{

				addTask();
			}
			else if (option.equals("2")) {
				deleteTask();
			}
			else if (option.equals("3")) {
				updateTask();
			}
			else if (option.equals("4")) {
				viewTask();
			}
			else if (option.equals("5")) {
				break;
			}
			else {
				System.out.println("Invalid option");
			}
				
		}
		
	}
	
	public static String showMenu() {
		System.out.println("   Menu \n1. Add task\n2. Delete Task\n3. Update Complete task\n4. View Task \n5. Quit");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		return x;
	}
	
	public static void addTask() {
		System.out.println("\n\nEnter Task Description:");
		Scanner sc2 = new Scanner(System.in);
		String desc = sc2.nextLine();
		tdl.addTask(new Task(desc,false));
		System.out.println("\n\nNew Task Added \n");
	}
	
	public static void deleteTask() {
		System.out.println("\n\nChoose Task to delete(Enter Task Description Name):");
		Collection <Task> res = tdl.getAllTasks();
		System.out.println("\n\n(Description,Status) \n");
		 for (Task s : res) {
			 String stats = "";
			 
			 if(s.isComplete()) {
				 stats = "Completed";
			 }
			 else {
				 stats = "Incomplete";
			 }
			 
			 System.out.println("(" + s.getDescription() + "," + stats + ")");
		
		
		
		 }
		 System.out.println("\n");
		 Scanner sc3 = new Scanner(System.in);
		String desc = sc3.nextLine();
		tdl.removeTask(desc);
		System.out.println("\n\nTask Deleted \n");
	}
	
	public static void updateTask() {
		System.out.println("\n\nChoose Task to be set as Completed(Enter Task Description Name):");
		Collection <Task> res = tdl.getAllTasks();
		System.out.println("\n\n(Description,Status) \n");
		 for (Task s : res) {
			 String stats = "";
			 
			 if(s.isComplete()) {
				 stats = "Completed";
			 }
			 else {
				 stats = "Incomplete";
			 }
			 
			 System.out.println("(" + s.getDescription() + "," + stats + ")");
		
		
		
		 }
		 System.out.println("\n");
		 Scanner sc4 = new Scanner(System.in);
		String desc = sc4.nextLine();
		tdl.completeTask(desc);
		System.out.println("\n\nTask Updated \n");
	}
	public static void viewTask() {
		System.out.println("\n\n(Description,Status) \n");
		 Collection <Task> res = tdl.getAllTasks();
		 
		 for (Task s : res) {
			 String stats = "";
			 
			 if(s.isComplete()) {
				 stats = "Completed";
			 }
			 else {
				 stats = "Incomplete";
			 }
			 
			 System.out.println("(" + s.getDescription() + "," + stats + ")");
		 }
		 System.out.println("\n");
//		Scanner sc2 = new Scanner(System.in);
//		String desc = sc2.nextLine();
//		tdl.addTask(new Task(desc,false));
//		System.out.println("\n\nNew Task Added \n");
		
	}

}
