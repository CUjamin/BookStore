package cuj.bookstore.domain;

/**
 * Created by cujamin on 2018/4/6.
 */
public class StudentInfo {
    private int studentId;
    private int score;
    private int age;

    public StudentInfo(int studentId, int score, int age) {
        this.studentId = studentId;
        this.score = score;
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }
//
//    public void setStudentId(int studentId) {
//        this.studentId = studentId;
//    }

    public int getScore() {
        return score;
    }
//
//    public void setScore(int score) {
//        this.score = score;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    @Override
    public String toString()
    {
        return " [ studentId:"+studentId+";"+
                "score:"+score+";"+
                "age:"+age+" ] ";
    }
}
