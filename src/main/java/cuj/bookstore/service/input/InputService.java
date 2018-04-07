package cuj.bookstore.service.input;

import cuj.bookstore.domain.StudentInfo;

import java.util.List;

/**
 * Created by cujamin on 2018/4/7.
 */
public interface InputService {
    List<StudentInfo> readFromFile(String fileName);
}
