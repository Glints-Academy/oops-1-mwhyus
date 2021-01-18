
import java.util.*;

public class teacher extends person{
    ArrayList<String> courses = new ArrayList<String>();
    String course;
    int numCourse;


    teacher(String name, String address){
        super(name, address);
    }


    boolean addCourse(String course){
        this.course = course;
        boolean status = false;
        if (courses.size()==0){
            courses.add(this.course);
            status = true;
        } else {
            for (String c : courses){
                if (c == this.course){
                    status = false;
                    break;
                } else {
                    this.numCourse = this.numCourse+1;
                    courses.add(this.course);
                    status = true;
                    break;
                }
            }

        }
        getCoursesAfterAdd();
        return status;
    }

    boolean removeCourse(String course){
        boolean status = false;
        this.course = course;

        if(courses.size()==0){
            status = false;
        } else {
            for (String c : courses){
                if(c != this.course){
                    status = false;
                    break;
                }
            }
        }
        getCoursesAfterRemove();
        return status;

    }

    void getCoursesAfterAdd(){
        System.out.println("Courses after add '"+this.courses+"' : "+courses);
    }

    void getCoursesAfterRemove(){
        System.out.println("Courses after remove '"+this.courses+"' : "+courses);
    }

    String getData(){
        return "teacher : "+super.name+"("+super.address+")";
    }

}
