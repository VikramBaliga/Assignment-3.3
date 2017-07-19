package Assignment3;

import java.util.Scanner;

public class StudentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=0;
		System.out.println("Enter the number of Students");
		n = sc.nextInt();
		Student[] students = new Student[n];
		
		for(int i=0;i<students.length;i++)
		{
			students[i] = new Student();
			System.out.println("Enter Student ID");
			students[i].setStudentId(sc.nextInt());
			System.out.println("Enter Student Name");
			students[i].setStudentName(sc.next());
			System.out.println("Enter Student Age");
			students[i].setAge(sc.nextInt());
			System.out.println("En2" +
					"ter Subject 1 Marks");
			students[i].setSubject1(sc.nextInt());
			System.out.println("Enter Subject 2 Marks");
			students[i].setSubject2(sc.nextInt());
			System.out.println("Enter Subject 3 Marks");
			students[i].setSubject3(sc.nextInt());
			System.out.println("Enter Subject 4 Marks");
			students[i].setSubject4(sc.nextInt());
			System.out.println("Enter Subject 5 Marks");
			students[i].setSubject5(sc.nextInt());
			students[i].setResult(students[i].EvaluateResult(students[i]));
		}

		for(int i=0;i<students.length;i++)
		{
			students[i].Display(students[i]);
		}
	}

}
