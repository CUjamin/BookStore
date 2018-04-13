package cuj.bookstore.service.sort;

import cuj.bookstore.constants.SortType;
import cuj.bookstore.domain.StudentInfo;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by cujamin on 2018/4/6.
 */
public class StudentInfoServiceTest {
    StudentInfoService studentInfoService = null;
    List<StudentInfo> list = new LinkedList<StudentInfo>();
    @Before
    public void setUp() throws Exception {
        studentInfoService = new StudentInfoServiceImpl();
        StudentInfo studentInfo1 = new StudentInfo(2001,"一",19,99);
        StudentInfo studentInfo2 = new StudentInfo(2002,"二",18,60);
        StudentInfo studentInfo3 = new StudentInfo(2003,"三",17,70);
        StudentInfo studentInfo4 = new StudentInfo(2004,"四",20,80);
        StudentInfo studentInfo5 = new StudentInfo(2005,"五",10,85);
        list.add(studentInfo1);
        list.add(studentInfo2);
        list.add(studentInfo3);
        list.add(studentInfo4);
        list.add(studentInfo5);
    }

    @Test
    public void ascendStudentsInfo() throws Exception {
        System.out.println("\n Sort by age:");
        List<StudentInfo> agetlist = studentInfoService.ascendStudentsInfo(list, SortType.AGE);
        for(StudentInfo studentInfo:agetlist)
        {
            System.out.println(studentInfo.toString());
        }

        System.out.println("\n Sort by score:");
        List<StudentInfo> scorelist = studentInfoService.ascendStudentsInfo(list, SortType.SCORE);
        for(StudentInfo studentInfo:scorelist)
        {
            System.out.println(studentInfo.toString());
        }
        System.out.println("\n Sort by id:");
        List<StudentInfo> idlist = studentInfoService.ascendStudentsInfo(list, SortType.STUDENTS_ID);
        for(StudentInfo studentInfo:idlist)
        {
            System.out.println(studentInfo.toString());
        }
        System.out.println("测试通过");
    }

    @Test
    public void descendStudentsInfo() throws Exception {
        System.out.println("\n Sort by age:");
        List<StudentInfo> agetlist = studentInfoService.descendStudentsInfo(list, SortType.AGE);
        for(StudentInfo studentInfo:agetlist)
        {
            System.out.println(studentInfo.toString());
        }

        System.out.println("\n Sort by score:");
        List<StudentInfo> scorelist = studentInfoService.descendStudentsInfo(list, SortType.SCORE);
        for(StudentInfo studentInfo:scorelist)
        {
            System.out.println(studentInfo.toString());
        }
        System.out.println("\n Sort by id:");
        List<StudentInfo> idlist = studentInfoService.descendStudentsInfo(list, SortType.STUDENTS_ID);
        for(StudentInfo studentInfo:idlist)
        {
            System.out.println(studentInfo.toString());
        }

        System.out.println("测试通过");
    }
}