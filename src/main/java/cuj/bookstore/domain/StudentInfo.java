package cuj.bookstore.domain;

/**
 * Created by cujamin on 2018/4/6.
 */
public class StudentInfo {
    private int studentId;
    private String name;
    private int age;
    private int score;

    public StudentInfo(int studentId, String name, int age, int score) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.score = score;
    }


    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
