package com.github.jjarfi.mapper;

import com.github.jjarfi.bean.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface StudentMapper {

    @Insert("")
    int add(Student student);

    @Update("")
    int update (Student student);

    @Delete("")
    int deletebsno(String no);

    @Select("")
    Student queryStudentBysno(String sno);

}
