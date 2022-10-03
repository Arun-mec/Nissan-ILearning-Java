package com.nissan.doe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nissan.app.NissanCrmApp;
import com.nissan.bean.Course;

public class CourseDao {
	
	// Store all the records
	static ArrayList<Course> arrCourseLists = new ArrayList<Course>();
	
	// Menu driven
	public static void menu() {
		
//		prompt input from the user
		Scanner scanner = new Scanner(System.in);
		int choice = 'n';
		do {
		System.out.println("-------  Course Management  ------ ");
		System.out.println("1. Add a courses\n2. Seacrh a course\n3. List all courses\n4. Modify course"
				+ "\n5. Delete Course\n6. Back\nEnter your choice");
		
		switch(Integer.parseInt(scanner.next())) {
		case 1: 
			// go to add course
			addCourse();
			break;
		case 2: 
			// go to search course
			searchCourse();
			break;
		case 3: 
			listAllCourses();
			// list all courses
			break;
		case 4: 
			updateCourse();
			// go to modify course
			break;
		case 5: 
			deleteCourse();
			// delete course
			break;
		case 6: 
			NissanCrmApp.mainMenu();
		default:
			System.out.println("Enter a valid input!");
		}
		
		System.out.println("Do you want to continue?");
		choice = scanner.next().charAt(0);
		}while(choice=='y' || choice=='Y');
	}

	private static void deleteCourse() {
		System.out.println("Delete");
		// TODO Auto-generated method stub
		char delChoice = 'n';
		int delId;
		
		do {
			Scanner delScanner = new Scanner(System.in);
			System.out.println("Enter the course Id to delete : ");
			delId = delScanner.nextInt();
			
			try {
				for (Course course : arrCourseLists) {
					if (course.getCourseCode()==delId) {
						arrCourseLists.remove(course);
						System.out.println("Congratulations your course has been removed successfully!");
					}else {
						System.out.println("SearchId is not found!!");
					}
				}
			}catch(Exception e) {
				System.out.println("Some error occured!");
			}
			
		}while(delChoice=='Y' || delChoice=='y');
		
	}

	private static void updateCourse() {
		System.out.println("Update course");

		// TODO Auto-generated method 

		char choice = 'n';
		int courseId;
		do {
			Scanner courseScanner = new Scanner(System.in);
			System.out.println("Enter the course Id to update : ");
			courseId = courseScanner.nextInt();
			try {
				for (Course course : arrCourseLists) {
					if (course.getCourseCode() == courseId) {
						updateCourseById(course);
						}
					}
			}
			catch(Exception ex) {
				System.out.println("Some error has been occured");
			}
		}while(choice=='y'|| choice =='Y');
	}

	private static void updateCourseById(Course course) {
		// TODO Auto-generated method stub
		
		int choice;
		Scanner updateScanner = new Scanner(System.in);
		Scanner updateIntScanner = new Scanner(System.in);
		System.out.println("Enter the field that you want to update..?\n");
		System.out.println("1. Course name\n2. Course Description\n3. Course Duration\n4. Course Fee");
		
		switch(updateIntScanner.nextInt()) {
		case 1: System.out.println("Enter the course name");
				course.setCourseName(updateScanner.nextLine());
				break;
		case 2: System.out.println("Enter the course description");
				course.setDescription(updateScanner.nextLine());
				break;
		case 3: System.out.println("Enter the course duration");
				course.setDuration(updateScanner.nextLine());
				break;
		case 4: System.out.println("Enter the course Fee");
				course.setFee(Double.parseDouble(updateScanner.nextLine()));
				break;
		default:
			System.out.println("Enter a valid input");
		}
	}

	private static void listAllCourses() {
		System.out.println("List all courses...");
		try {
			System.out.println("Course code\tCourse Name \tCourse Description\tCourse Duration\tCourse Fee\t"
					+ "Qualifications");
			for (Course course : arrCourseLists) {
				System.out.println(course.getCourseCode()+"\t"+"\t"+course.getCourseName()+"\t"+"\t"+course.getDescription()
				+"\t"+"\t"+"\t"+course.getDuration()+"\t"+course.getFee()+"\t"+"\t"
						+course.getQualifications());
			}
		}
		catch(Exception ex) {
			System.out.println("Some error has been occured!");
		}
		// TODO Auto-generated method stub
		
	}

	private static void searchCourse() {
		System.out.println("Search");
		char searchChoice = 'n';
		int searchId;
		
		do {
			Scanner scSearch = new Scanner(System.in);
			System.out.println("Enter the course Id to search : ");
			searchId = Integer.parseInt(scSearch.nextLine());
			
			try {
				for (Course course : arrCourseLists) {
					if (course.getCourseCode()==searchId) {
						System.out.println(course.toString());
					}
				}
			}catch(Exception e) {
				System.out.println("Some error occured!");
			}
			
		}while(searchChoice=='Y' || searchChoice=='y');
		
		// TODO Auto-generated method stub
		
	}

	private static void addCourse() {
		System.out.println("Add a course here....");
		char choice = 'n';
		
		try {
			do {
				
				//create an object
				Course course = new Course();
				
				// get input from the user
				Scanner objScanner = new Scanner(System.in);
				//auto generate course code
				course.setCourseCode(course.generateCourseCode());
				
				System.out.println("Enter the course name :");
				course.setCourseName(objScanner.next());
				
				System.out.println("Enter the course description :");
				course.setDescription(objScanner.next());
				
				System.out.println("Enter the course duration :");
				course.setDuration(objScanner.next());
				
				System.out.println("Enter the course fee :");
				course.setFee(Double.parseDouble(objScanner.next()));
				
				System.out.println("Enter the course qualifications :");
				ArrayList<String> qualifications = new ArrayList<String>();
				
				char choiceQual='x';
				
				do {
					System.out.println("1.Btech\n2.Mtech\n3.BCA\n4.MCA");
					System.out.println("Enter choice : ");
					
					//switch cases
					switch(Integer.parseInt(objScanner.next())) {
					case 1:
						qualifications.add("B-tech");
						break;
					case 2:
						qualifications.add("M-tech");
						break;
					case 3:
						qualifications.add("BCA");
						break;
					case 4:
						qualifications.add("MCA");
						break;
					default:
						System.out.println("Invalid input!");
					}
					System.out.println("Do you want to add a course?");
					choiceQual = objScanner.next().charAt(0);
					
				}while(choiceQual=='y' || choiceQual=='Y');
				
				course.setQualifications(qualifications);
				arrCourseLists.add(course);
				System.out.println("Congratulations! your course has been added successfully!");
			}while(choice=='y' || choice=='Y');
			}
		catch(Exception e) {
			System.out.println("Sorry something wrong!!");
		}
		finally {
			//go to main menu
			menu();
		}
		//add to global array list
	}
	
	// Add course
	// Search a course
	// List all courses
	// Update course
	// Delete course
	
}
