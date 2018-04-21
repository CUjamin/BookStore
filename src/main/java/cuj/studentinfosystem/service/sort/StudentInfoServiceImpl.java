package cuj.studentinfosystem.service.sort;

import cuj.studentinfosystem.constants.SortType;
import cuj.studentinfosystem.domain.StudentInfo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by cujamin on 2018/4/6.
 */
public class StudentInfoServiceImpl implements StudentInfoService {

    /**
     * ascend StudentsInfo List by sortType
     * @param list
     * @param sortType
     * @return
     */
    public List<StudentInfo> ascendStudentsInfo(List<StudentInfo> list , String sortType )
    {
        return sortStudentsInfo(list ,sortType, true);
    }

    /**
     * descend StudentsInfo List by sortType
     * @param list
     * @param sortType
     * @return
     */
    public List<StudentInfo> descendStudentsInfo(List<StudentInfo> list , String sortType )
    {
        return sortStudentsInfo( list,sortType,false);
    }

    /**
     * sort StudentsInfo List
     * @param sortType
     * @param ascending true is ascending ; false is descending
     * @return
     */
    private  List<StudentInfo> sortStudentsInfo(List<StudentInfo> list ,String sortType,boolean ascending) {
        Comparator<StudentInfo> comparator = null;

        switch (sortType)
        {
            case SortType.STUDENTS_ID:
                comparator = new Comparator<StudentInfo>(){
                    public int compare(StudentInfo arg0, StudentInfo arg1) {
                        return arg0.getStudentId()-arg1.getStudentId();}};
                break;
            case SortType.SCORE:
                comparator = new Comparator<StudentInfo>(){
                    public int compare(StudentInfo arg0, StudentInfo arg1) {
                        return arg0.getScore()-arg1.getScore();}};
                break;
            default:
                comparator = new Comparator<StudentInfo>(){
                    public int compare(StudentInfo arg0, StudentInfo arg1) {
                        return arg0.getAge()-arg1.getAge();}};

        }
        Collections.sort(list,comparator);
        if(!ascending) Collections.reverse(list);
        return list;
    }
}
