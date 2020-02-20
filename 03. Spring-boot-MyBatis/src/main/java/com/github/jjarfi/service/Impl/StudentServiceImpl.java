package com.github.jjarfi.service.Impl;

import com.github.jjarfi.bean.Student;
import com.github.jjarfi.mapper.StudentMapper;
import com.github.jjarfi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int add(Student student) {
        return 0;
    }

    @Override
    public int update(Student student) {
        return 0;
    }

    @Override
    public int deleteBysno(String sno) {
        return 0;
    }

    @Override
    public Student queryStudentByno(String sno) {
        return null;
    }
}
