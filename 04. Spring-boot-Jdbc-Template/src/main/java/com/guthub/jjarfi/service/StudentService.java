package com.guthub.jjarfi.service;

import com.guthub.jjarfi.bean.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {

    int add(Student student);
    int update(Student student);
    int deleteByno(String sno);

    List<Map<String, Object>> queryStudentListMap();
    Student queryStudentBySno(String sno);
}
