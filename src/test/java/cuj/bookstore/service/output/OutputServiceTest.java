package cuj.bookstore.service.output;

import cuj.bookstore.domain.StudentInfo;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by cujamin on 2018/4/6.
 */
public class OutputServiceTest {
    OutputService outputService = null;
    List<StudentInfo> list = new LinkedList<StudentInfo>();
    @Before
    public void setUp() throws Exception {
        outputService = new OutputServiceImpl();
        StudentInfo studentInfo1 = new StudentInfo(2001,99,19);
        StudentInfo studentInfo2 = new StudentInfo(2002,60,18);
        StudentInfo studentInfo3 = new StudentInfo(2003,70,17);
        StudentInfo studentInfo4 = new StudentInfo(2004,80,20);
        StudentInfo studentInfo5 = new StudentInfo(2005,85,10);
        list.add(studentInfo1);
        list.add(studentInfo2);
        list.add(studentInfo3);
        list.add(studentInfo4);
        list.add(studentInfo5);
    }

    @Test
    public void outputOnScreem() throws Exception {
        outputService.outputOnScreem(list);
    }

    @Test
    public void outputInFile() throws Exception {
        outputService.outputInFile(list,"TestResult2.csv","GBK");
    }
}