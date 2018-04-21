package cuj.studentinfosystem;


import cuj.studentinfosystem.constants.SortType;
import cuj.studentinfosystem.domain.StudentInfo;
import cuj.studentinfosystem.service.input.InputService;
import cuj.studentinfosystem.service.input.InputServiceImpl;
import cuj.studentinfosystem.service.output.OutputService;
import cuj.studentinfosystem.service.output.OutputServiceImpl;
import cuj.studentinfosystem.service.sort.StudentInfoService;
import cuj.studentinfosystem.service.sort.StudentInfoServiceImpl;

import java.util.List;
import java.util.Scanner;

/**
 * Created by cujamin on 2018/4/3.
 */
public class StudentInfoSystem {
    public static void main(String[] args) {

        InputService inputService = new InputServiceImpl();
        OutputService outputService = new OutputServiceImpl();
        StudentInfoService studentInfoService = new StudentInfoServiceImpl();
        boolean flag = true;

        while(flag)
        {
            System.out.println("是否需要对成绩单排序：输入Y或者N");
            Scanner input = new Scanner(System.in);
            String goon = input.nextLine().trim();
            if("N".equalsIgnoreCase(goon))break;
            else if("Y".equalsIgnoreCase(goon))
            {
                System.out.println("清楚输入文件名：");
                String fileName = input.nextLine().trim();
                List<StudentInfo> list = inputService.readFromFile(fileName);
                System.out.println("请选择排序依据，选项为：1-学号，2-年龄，3-成绩");
                int type = Integer.parseInt(input.nextLine().trim());
                String sortType = null;
                switch(type)
                {
                    case 1:sortType = SortType.STUDENTS_ID;break;
                    case 2:sortType = SortType.AGE;break;
                    case 3:sortType = SortType.SCORE;break;
                }

                System.out.println("请选择升序还是降序，选项：1-升序，2-降序");
                int st = Integer.parseInt(input.nextLine().trim());
                switch(st)
                {
                    case 1:list = studentInfoService.ascendStudentsInfo(list,sortType);break;
                    case 2:list = studentInfoService.descendStudentsInfo(list,sortType);break;
                }

                System.out.println("请选择输出方式，选项：1-控制台，2-文件");
                int outputType = Integer.parseInt(input.nextLine().trim());
                switch(outputType)
                {
                    case 1:outputService.outputOnScreem(list);break;
                    case 2:
                    {
                        System.out.println("请输入输出文件名：");
                        String outputFileName =input.next().trim();
                        outputService.outputInFile(list,outputFileName,"GBK");
                    }
                    break;
                }
                System.out.println("排序完成");
            }else
            {
                System.out.println("输入出错");
                continue;
            }
        }
    }
}
