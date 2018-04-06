package cuj.bookstore.service.output;

import cuj.bookstore.domain.StudentInfo;

import java.util.List;

/**
 * Created by cujamin on 2018/4/6.
 */
public interface OutputService {
    void outputOnScreem(List<StudentInfo> list);
    void outputInFile(List<StudentInfo> list , String fileName , String charsetName );
}
