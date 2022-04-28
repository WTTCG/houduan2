package com.fc.test;

import com.fc.dao.StudentDao;
import com.fc.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisTest {
    @Test
    public void testInsertOnObject(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = factory.openSession();
            StudentDao studentDao = session.getMapper(StudentDao.class);
            Student student=new Student();
            student.setName("鞠婧祎");
            student.setAge((byte)27);
            student.setGender("女");
            student.setBirthday(new Date());
            student.setInfo("四千年");
            int affectedRows = studentDao.insertStudent(student);
            System.out.println("受影响的行数"+affectedRows);
            session.commit();
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testInsert(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = factory.openSession();
            StudentDao studentDao = session.getMapper(StudentDao.class);
            Map<String,Object> map=new HashMap<>();
            map.put("name","小点点");
            map.put("age","3");
            map.put("gender","男");
            map.put("birthday",new Date());
            map.put("info","小可爱");
            int affectedRows = studentDao.insert(map);
            System.out.println("受影响的行数"+affectedRows);
            session.commit();
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testFindByGenderAndName(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = factory.openSession();
            StudentDao studentDao = session.getMapper(StudentDao.class);
            Student student = studentDao.findByGenderAndName("男", "凤凰传奇");
            System.out.println(student);
            session.commit();
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testFindByAgeAndName(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = factory.openSession();
            StudentDao studentDao = session.getMapper(StudentDao.class);
            Student student = studentDao.findByAgeAndName(22, "凤凰传奇");
            System.out.println(student);
            session.commit();
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test(){
            try {
                InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
                SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
                SqlSession session = factory.openSession();
                StudentDao studentDao = session.getMapper(StudentDao.class);
                Student student = studentDao.findByIdAndName(1, "凤凰传奇");
                System.out.println(student);
                session.commit();
                session.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
