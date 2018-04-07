package cuj.bookstore.service.input;

import cuj.bookstore.domain.StudentInfo;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by cujamin on 2018/4/7.
 */
public class InputServiceImpl implements InputService {
    @Override
    public List<StudentInfo> readFromFile(String fileName) {
        File file = new File(fileName);
        List<StudentInfo> list = new LinkedList<StudentInfo>();
        try
        {
            BufferedReader reader =new BufferedReader(new FileReader(file));
            String info = reader.readLine();
            info = reader.readLine();
            while(null!=info)
            {
                System.out.println(info);

                String[] infoArray = info.split(",");
                StudentInfo studentInfo = new StudentInfo(
                        Integer.parseInt(infoArray[0]),
                        Integer.parseInt(infoArray[1]),
                        Integer.parseInt(infoArray[2]));
                list.add(studentInfo);
                info = reader.readLine();
            }

        }catch (FileNotFoundException f)
        {
            System.out.println("没有找到该文件");
        }catch (IOException io)
        {
            System.out.println(" [ IOException ] ");
        }
        return list;
    }
}
