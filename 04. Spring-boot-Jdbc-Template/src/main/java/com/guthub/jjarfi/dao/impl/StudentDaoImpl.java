package com.guthub.jjarfi.dao.impl;

import com.guthub.jjarfi.bean.Student;
import com.guthub.jjarfi.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Student student) {
        String sql = "insert into student (sno, sname, ssex) values(:sno,:sname,:ssex)";
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(this.jdbcTemplate.getDataSource());
        return npjt.update(sql, new BeanPropertySqlParameterSource(student));
    }

    @Override
    public int update(Student student) {
        return 0;
    }

    @Override
    public int deleteStudentByNo(String sno) {
        return 0;
    }

    @Override
    public List<Map<String, Object>> queryStudentListMap() {
        return null;
    }

    @Override
    public Student queryStudentBySno(String Sno) {
        return null;
    }
}
