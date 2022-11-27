package assignment4;

import java.util.ArrayList;

public class Administrator {
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private CourseDatabase database = new CourseDatabase();

    public CourseDatabase getDatabase() {
        return database;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void addStudent(int studentID){
        studentList.add(new Student(studentID));
    }

    public void generateCurriculum(){
        for(Student stu : studentList){
            int i = 0;
            if(stu.getCurriculum().size() != 0) {
                for (;i<stu.getCurriculum().size();i++) {
                    if(!belongs(stu.getCurriculum().get(i),database))
                        stu.dropCourse(stu.getCurriculum().get(i));

                    if (stu.getCredits().get(i) < stu.getCurriculum().get(i).Lowest())
                        stu.dropCourse(stu.getCurriculum().get(i));
                }
            }
        }
    }

    private boolean belongs(Course course , CourseDatabase database){
        for(Course c : database.searchCourseByID(course.getCourseID())){
            if( c == course)return true;
        }
        return false;
    }
}