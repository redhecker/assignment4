package assignment4;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private ArrayList<Course> curriculum = new ArrayList<Course>();
    private ArrayList<Integer> c = new ArrayList<>();

    public ArrayList<Integer> getCredits() {
        return c;
    }

    public ArrayList<Course> getCurriculum() {
        return curriculum;
    }

    private int remainingCredit = 100;

    public Student(int studentID) {
        this.studentID = studentID;
    }

    public boolean selectCourse(Course course, int credit){
        if(credit > remainingCredit | credit == 0){
            return false;
        }
        for(Course x : curriculum){
            for(SUSTechTime time1 : x.getTimeList()){
                for(SUSTechTime time2 : course.getTimeList()) {
                    if ((time2.getWeekType() == WeekType.Every | time2.getWeekType() == time1.getWeekType())
                    && time2.getWeekday() == time1.getWeekday() && time1.getStartTime() == time2.getStartTime()
                    && time1.getEndTime() == time2.getEndTime()){
                        return false;
                    }
                }
            }
        }
        curriculum.add(course);
        c.add(credit);
        changeCredit(course , credit);
        return true;
    }

    public void dropCourse(Course course){
        try{
            curriculum.remove(course);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void changeCredit(Course course, int credit){
        course.addCredit(credit);
        remainingCredit -= credit;
    }

}
