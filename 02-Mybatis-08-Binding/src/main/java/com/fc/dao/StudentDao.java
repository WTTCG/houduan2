package com.fc.dao;

import com.fc.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface StudentDao {
    Student findByIdAndName(Integer id, String name);
    Student findByAgeAndName(Integer age, String name);
    Student findByGenderAndName(@Param("gender") String gender, @Param("name")String name);
    int insert(@Param("name")String name, @Param("age")Integer age, @Param("gender") String gender, @Param("birthday")Date birthday, @Param("info")String info );
    int insert(Map<String, Object> map);
    int insertStudent(Student student);

}
