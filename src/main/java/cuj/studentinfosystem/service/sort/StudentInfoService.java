package cuj.studentinfosystem.service.sort;

import cuj.studentinfosystem.domain.StudentInfo;

import java.util.List;

/**
 * Created by cujamin on 2018/4/6.
 */
public interface StudentInfoService {
    List<StudentInfo> ascendStudentsInfo(List<StudentInfo> list,String sortType );
    List<StudentInfo> descendStudentsInfo(List<StudentInfo> list,String sortType );
}
