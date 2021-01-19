import java.util.*;

public class student extends person{
    ArrayList<String> courses = new ArrayList<String>();
    ArrayList<Integer> grades = new ArrayList<Integer>();
    String course;
    int grade;
    int numCourse;

    student(String name, String address){
        super(name, address);
    }

    void addCourseGrade(String course, int grade){
        this.numCourse = this.numCourse+1;
        this.course = course;
        this.grade = grade;
        courses.add(this.course);
        grades.add(this.grade);
    }
void printGrades(){
    System.out.println("Grades : " +grades);
}

double getAvarageGrade(){
    double total = 0;
    for(int value : grades){
        total = total + value;
    }
    return (double) Math.round(total/numCourse*100)/100;
}

String getData(){
    return "student : "+super.name+'('+super.address+')';
}




}
