package cuj.studentinfosystem.service.input;

import cuj.studentinfosystem.domain.StudentInfo;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by cujamin on 2018/4/13.
 */
public class InputServiceTest {
    private InputService inputService = null;
    @Before
    public void setUp() throws Exception {
        inputService = new InputServiceImpl();
    }

    @Test
    public void readFromFile() throws Exception {
        List<StudentInfo> list = inputService.readFromFile("测试题目.csv");
        System.out.println("测试题目.csv内容："+list);

        assert (!list.isEmpty()):"读取文件 测试题目.csv 失败";


        List<StudentInfo> list2 = inputService.readFromFile("不存在的文件.csv");
        System.out.println("不存在的文件.csv内容:"+list2);

        assert (list2.isEmpty()):"读取不存在的文件发生错误";

        System.out.println("测试通过");

    }
}