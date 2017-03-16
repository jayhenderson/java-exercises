package org.launchcode.java.demos.java4python.school;

/**
 * Created by J on 3/13/2017.
 */
public class Student {

    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0,0);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public Student(int aStudentId) {
        this.studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits){
        this.numberOfCredits = aNumberOfCredits;
    }

    public double getGpa(){
        return this.gpa;
    }

    public void setGpa(double aGpa){
        this.gpa = aGpa;
    }

    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

    public boolean equals(Student otherStudent) {
        return otherStudent.getStudentId() == this.getStudentId();
    }

    public void addGrade(int courseCredits, double grade){
        double oldQualityScore = this.gpa * this.numberOfCredits;
        double newQualityScore = grade * courseCredits;
        double totalQualityScore = oldQualityScore + newQualityScore;
        this.numberOfCredits += courseCredits;
        this.gpa = totalQualityScore / this.numberOfCredits;

    }

    public String getGradeLevel() {
        if (this.numberOfCredits < 30) {
            return "freshman";
        } else if (this.numberOfCredits < 60) {
            return "sophomore";
        } else if (this.numberOfCredits < 90) {
            return "junior";
        } else {
            return "senior";
        }
    }
}
