package com.guthub.jjarfi.dao;

import com.guthub.jjarfi.bean.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {

    int add (Student student);
    int update (Student student);
    int deleteStudentByNo(String sno);
    List<Map<String, Object>> queryStudentListMap();
    Student queryStudentBySno(String Sno);
}
