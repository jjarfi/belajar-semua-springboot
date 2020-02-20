package com.github.jjarfi.service;

import com.github.jjarfi.bean.Student;

public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    Student queryStudentByno(String sno);
}
