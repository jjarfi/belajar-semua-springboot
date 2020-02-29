package com.guthub.jjarfi.dao.impl;

import com.guthub.jjarfi.bean.Student;
import com.guthub.jjarfi.dao.StudentDao;
import com.guthub.jjarfi.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Type;
import java.sql.Types;
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
        String sql = "update student set sname = ?,ssex = ? where sno = ?";
        Object[] args = {student.getName(), student.getSex(), student.getSno()};
        int [] argTypes = {Types.VARCHAR, Types.VARCHAR, Types.VARCHAR};
        return this.jdbcTemplate.update(sql, args,argTypes);
    }

    @Override
    public int deleteStudentByNo(String sno) {
        String sql = "delete from student where sno = ?";
        Object[] args = {sno};
        int[] argTypes = {Types.VARCHAR};
        return this.jdbcTemplate.update(sql,args,argTypes);
    }

    @Override
    public List<Map<String, Object>> queryStudentListMap() {
        String sql = "select * from student";
        return this.jdbcTemplate.queryForList(sql);
    }

    @Override
    public Student queryStudentBySno(String Sno) {
        String sql = "select * from student where sno = ?";
        Object[] args ={Sno};
        int[]argTypes = {Types.VARCHAR};
        List<Student>studentList = this.jdbcTemplate.query(sql,args,argTypes, new StudentMapper());
        if (studentList!= null && studentList.size()>0){
            return studentList.get(0);
        }else {
            return null;
        }
    }
}
