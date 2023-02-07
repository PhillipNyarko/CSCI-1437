public class Course {
    // define two private fields  (title and faculty)
    private String title;
    private Faculty faculty;

    public Course(){ // constructor
        title = "N/A";
        faculty = new Faculty();
    }

    public Course(String title, Faculty faculty){ // args constructor
        this.title  = title;
        this.faculty = new Faculty(faculty.getName(), faculty.getPosition());
    }

    // setters and getters (accessors and mutators)
    public String getTitle(){
        return title;
    }

    public void setName(String title){
        this.title = title;
    }

    // deep copy for faculty methods
    public Faculty getFaculty(){
        return new Faculty(this.faculty.getName(), this.faculty.getPosition());
    }

    public void setFaculty(Faculty faculty){
        this.faculty = new Faculty(faculty.getName(), faculty.getPosition());
    }
}
