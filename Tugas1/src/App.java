public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("/n");
        
        //
        person mikasa = new person("Mikasa", "Rose Wall");
        System.out.println(mikasa.getData());

        //
        student student = new student("Levi", "Paradise Island");
        System.out.println(student.getData());
        student.addCourseGrade("Java", 83);
        student.addCourseGrade("Javascript", 70);

        //
        teacher teacher = new teacher("Erwin", "Main island");
        System.out.println(teacher.getData()+"/n");
        System.out.println(teacher.addCourse("Javascript"));
        System.out.println(teacher.addCourse("Java"));
        System.out.println(" ");
        //
        System.out.println(teacher.removeCourse("Java"));

    }
}
