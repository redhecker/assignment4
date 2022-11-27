package assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class Course {
    private String teacherName,courseName,courseID;
    private int classID,capacity;
    private ArrayList<SUSTechTime> timeList;
    private ArrayList<Integer> credit = new ArrayList<Integer>();

    public ArrayList<Integer> getCredit() {
        return credit;
    }

    public int Lowest(){
        if(credit.size()<=capacity)
            return 0;
        else{
            return credit.get(credit.size() - capacity);
        }
    }
    public void addCredit(int credit){
        this.credit.add(credit);
        Collections.sort(this.credit);
    }

    public Course(String teacherName, String courseName, String courseID,
                  int classID, ArrayList<SUSTechTime> timeList, int capacity){
        this.teacherName=teacherName;
        this.courseName=courseName;
        this.courseID=courseID;
        this.classID=classID;
        this.capacity=capacity;
        this.timeList=timeList;
    }

    String getCourseID(){
        return courseID;
    }

    String getTeacherName(){
        return teacherName;
    }

    String getCourseName(){
        return courseName;
    }

    int getClassID(){
        return classID;
    }


    int getCapacity(){
        return capacity;
    }

    ArrayList<SUSTechTime> getTimeList(){
        return timeList;
    }

    public String toString() {
        return "Course{" + this.getCourseID() + " " + this.getCourseName() + "-class "
                + this.getClassID() + " | " + this.getCapacity() + "}";
}


}
