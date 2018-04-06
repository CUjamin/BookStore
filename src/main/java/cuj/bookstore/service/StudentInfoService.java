package cuj.bookstore.service;

import cuj.bookstore.domain.StudentInfo;

import java.util.List;

/**
 * Created by cujamin on 2018/4/6.
 */
public interface StudentInfoService {
    List<StudentInfo> sortStudentsInfo(String sortType);
}
