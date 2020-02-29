package com.guthub.jjarfi.service.impl;

import com.guthub.jjarfi.bean.Student;
import com.guthub.jjarfi.dao.StudentDao;
import com.guthub.jjarfi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentdao;

    @Override
    public int add(Student student) {
        return this.studentdao.add(student);
    }

    @Override
    public int update(Student student) {
        return this.studentdao.update(student);
    }

    @Override
    public int deleteByno(String sno) {
        return this.studentdao.deleteStudentByNo(sno);
    }

    @Override
    public List<Map<String, Object>> queryStudentListMap() {
        return this.studentdao.queryStudentListMap();
    }

    @Override
    public Student queryStudentBySno(String sno) {
        return this.studentdao.queryStudentBySno(sno);
    }
}
