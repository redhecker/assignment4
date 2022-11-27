package assignment4;

import java.util.ArrayList;

public class CourseDatabase {
    private ArrayList<Course> courseList = new ArrayList<Course>();

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public CourseDatabase(ArrayList<Course> courseList){
        this.courseList = courseList;
    }
    public CourseDatabase(){}


    public void addCourse(Course newCourse){
        courseList.add(newCourse);
    }

    //remove the class
    public void removeCourse(String courseID, int classID){
        for(Course x : courseList){
            if(x.getCourseID()==courseID && x.getClassID()==classID){
                courseList.remove(x);
            }
        }
    }

    //remove the whole course
    public void removeCourse(Course course){
        try{
            courseList.remove(course);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    //search by ...
    public ArrayList<Course> searchCourseByID(String courseID){
        ArrayList<Course> course = new ArrayList<>();
        for(Course c : courseList){
            if(c.getCourseID() == courseID)course.add(c);
        }
        return course;
    }
    public ArrayList<Course> searchCourseByTeacherName(String teacherName){
        ArrayList<Course> course = new ArrayList<>();
        for(Course c : courseList){
            if(c.getTeacherName() == teacherName)course.add(c);
        }
        return course;
    }
    public ArrayList<Course> searchCourseByCourseName(String courseName){
        ArrayList<Course> course = new ArrayList<>();
        for(Course c : courseList){
            if(c.getCourseName() == courseName)course.add(c);
        }
        return course;
    }
    public ArrayList<Course> searchCourseByCourseTime(String startTime, String endTime){
        ArrayList<Course> course = new ArrayList<>();
        for(Course c : courseList){
            for(SUSTechTime time : c.getTimeList()){
                if(time.getStartTime() == startTime&&time.getEndTime()==endTime){
                    course.add(c);
                }
            }
        }
        return course;
    }
}
