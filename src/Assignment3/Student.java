package Assignment3;

public class Student {
	
	private int studentId;
	private String studentName;
	private int age;
	private int subject1;
	private int subject2;
	private int subject3;
	private int subject4;
	private int subject5;
	private String result;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSubject1() {
		return subject1;
	}
	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}
	public int getSubject2() {
		return subject2;
	}
	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}
	public int getSubject3() {
		return subject3;
	}
	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}
	public int getSubject4() {
		return subject4;
	}
	public void setSubject4(int subject4) {
		this.subject4 = subject4;
	}
	public int getSubject5() {
		return subject5;
	}
	public void setSubject5(int subject5) {
		this.subject5 = subject5;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	public String EvaluateResult(Student student)
	{
		int totalMarks = student.subject1+student.subject2+student.subject3+student.subject4+student.subject5;
		if(totalMarks/5 > 45)
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
 	}
	
	public void Display(Student student)
	{
		System.out.println("Student ID "+student.studentId);
		System.out.println("Student Name "+student.studentName);
		System.out.println("Age "+student.age);
		int totalMarks = student.subject1+student.subject2+student.subject3+student.subject4+student.subject5;
		float percentage = totalMarks/5;
		System.out.println("Total Marks "+totalMarks);
		System.out.println("Percentage "+percentage);
		System.out.println("Result "+student.result);
	}
}
	
	

