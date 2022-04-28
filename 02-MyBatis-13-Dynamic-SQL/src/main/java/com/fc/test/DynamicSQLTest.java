package com.fc.test;

import com.fc.dao.StudentDao;
import com.fc.entity.Student;
import com.fc.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

public class DynamicSQLTest {
    @Test
    public void testDeleteMore(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

        int affectedRows = studentDao.deleteMore(1,3);

        MyBatisUtil.commit();

    }
    @Test
    public void testUpdateWithTrim(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
        Student student = new Student();
        student.setId(8);
        student.setAge((byte)20);
        student.setInfo("今晚打老虎");
        int affectedRows = studentDao.updateWithTrim(student);
        MyBatisUtil.commit();
    }
    @Test
    public void testUpdate(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
        Student student = new Student();
        student.setId(3);
        student.setAge((byte)100);
        student.setInfo("憨憨");
        int affectedRows = studentDao.update(student);
        MyBatisUtil.commit();
    }
    @Test
    public void testFindStudentWithTrim(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
        Student student = new Student();
        student.setGender("男");

        List<Student> students = studentDao.findByStudentWithTrim(student);
        for (Student temp : students) {
            System.out.println(temp);
        }
    }
    @Test
    public void testFindStudent(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
        Student student = new Student();
        student.setGender("男");

        List<Student> students = studentDao.findByStudent(student);
        for (Student temp : students) {
            System.out.println(temp);
        }
    }
    @Test
    public void testFindKeyword(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
        List<Student> students = studentDao.findByKeyword("%士%", 20);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void testFindAll(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
        List<Student> students = studentDao.findAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
