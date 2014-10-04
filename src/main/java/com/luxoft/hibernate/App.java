package com.luxoft.hibernate;

import com.luxoft.hibernate.dao.StudentDao;
import com.luxoft.hibernate.dao.entity.Instrument;
import com.luxoft.hibernate.dao.entity.Student;
import org.h2.command.dml.Insert;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.luxoft.hibernate.dao.entity.PerformanceParticipants;

import java.beans.Statement;
import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class App {
    public static void main( String[] args ) throws SQLException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("app-context.xml");



        StudentDao dao = context.getBean(StudentDao.class);

        Student student = new Student(1, 12, "misah", "spgu", Date);

        System.out.println(dao.getAllStudents());

        //System.out.println(dao.getAllInstruments());

        //System.out.println(dao.getAllStudentWithInstrument("Guitar"));
    }
}
