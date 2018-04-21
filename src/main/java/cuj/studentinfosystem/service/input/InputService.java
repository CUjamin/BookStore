package cuj.studentinfosystem.service.input;

import cuj.studentinfosystem.domain.StudentInfo;

import java.util.List;

/**
 * Created by cujamin on 2018/4/7.
 */
public interface InputService {
    List<StudentInfo> readFromFile(String fileName);
}
