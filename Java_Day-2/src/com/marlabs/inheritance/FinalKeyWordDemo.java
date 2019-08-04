package com.marlabs.inheritance;

class UniversityStudentRule {
	// final class UniversityStudentRule {
	int studentId;
	String studentName;
	String studentCourse;
	String seatType;
	final double MAX_COURSE_FEE = 35000.00d; // final at variable level

	public UniversityStudentRule(int studentId, String studentName,
			String sutdentCourse, String seatType) {
		System.out.println("From Cons");
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCourse = sutdentCourse;
		this.seatType = seatType;
	}

	// final at Method Level
	public final double finalCourseFee() {
		double finalCourseFee = 0.0d;
		if ("Entrance".equals(seatType) && "CSE".equals(studentCourse)) {
			finalCourseFee = 23500.00d;
		} else if ("Entrance".equals(seatType) && "EEE".equals(studentCourse)) {
			finalCourseFee = 25500.00d;
		} else {
			// MAX_COURSE_FEE = 150000;
			finalCourseFee = MAX_COURSE_FEE;
		}
		return finalCourseFee;
	}

}

class ABCColleage extends UniversityStudentRule {

	public ABCColleage(int studentId, String studentName, String sutdentCourse,
			String seatType) {
		super(studentId, studentName, sutdentCourse, seatType);
	}

	/*
	 * @Override public double finalCourseFee() { double finalCourseFee = 0.0d;
	 * if ("Entrance".equals(seatType) && "CSE".equals(studentCourse)) {
	 * finalCourseFee = 203500.00d; } else if ("Entrance".equals(seatType) &&
	 * "EEE".equals(studentCourse)) { finalCourseFee = 205500.00d; } else { //
	 * finalCourseFee = MAX_COURSE_FEE; } return finalCourseFee; }
	 */

	public void displaySelectionDetails() {

		double totalFeeAmount = finalCourseFee();
		System.out.println(this);
		System.out.println("Course Cost Amount:" + "\t" + totalFeeAmount);
	}

	@Override
	public String toString() {
		return "ABCColleage [studentId=" + studentId + ", studentName="
				+ studentName + ", studentCourse=" + studentCourse
				+ ", seatType=" + seatType + ", MAX_COURSE_FEE="
				+ MAX_COURSE_FEE + "]";
	}

}

public class FinalKeyWordDemo {
	public static void main(String[] args) {
		ABCColleage colleageStudent = new ABCColleage(2001, "Srinivas", "EEE",
				"Entrance");
		colleageStudent.displaySelectionDetails();
	}
}
