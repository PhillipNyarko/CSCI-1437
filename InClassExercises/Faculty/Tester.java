public class Tester {
    public static void main(String[] args){
        //Create object of each class
        Faculty faculty = new Faculty("Brandon Earwood", "Lecturer");
        Course course  = new Course("Programming Fundamentals II", faculty);
// print title of course and faculty member name
        System.out.println("The course is " + course.getTitle());
        System.out.println("The Lecturer's name is " + course.getFaculty().getName());
    }
}
