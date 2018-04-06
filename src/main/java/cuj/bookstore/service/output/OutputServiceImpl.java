package cuj.bookstore.service.output;

import cuj.bookstore.domain.StudentInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

/**
 * Created by cujamin on 2018/4/6.
 */
public class OutputServiceImpl implements OutputService {
    /**
     * output result on screem
     * @param list
     */
    @Override
    public void outputOnScreem(List<StudentInfo> list) {
        System.out.println(" 结果如下： ");
        for(StudentInfo studentInfo:list)
        {
            System.out.println(studentInfo.toString());
        }
    }

    /**
     * output result in file
     * @param list
     */
    @Override
    public void outputInFile(List<StudentInfo> list,String fileName,String charsetName) {
        OutputStreamWriter writer = null;
        FileOutputStream fout = null;
        try
        {
            fout = new FileOutputStream(new File(fileName));
            writer = new OutputStreamWriter(fout,charsetName);
            writer.append("学号");
            writer.append(",");
            writer.append("分数");
            writer.append(",");
            writer.append("年龄");
            writer.append("\r\n");
            for(StudentInfo studentInfo:list)
            {
                writer.append(studentInfo.getStudentId()+"");
                writer.append(",");
                writer.append(studentInfo.getScore()+"");
                writer.append(",");
                writer.append(studentInfo.getAge()+"");
                writer.append("\r\n");
            }
            writer.close();
            fout.close();
        }catch (IOException io)
        {
            System.out.println(" [ IOException ERROR ] "+io);
        }finally {
            writer = null;
            fout = null;
        }
    }
}
