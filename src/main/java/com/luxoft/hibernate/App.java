package com.luxoft.hibernate;

import com.luxoft.hibernate.dao.StudentDao;
import com.luxoft.hibernate.dao.entity.Instrument;
import com.luxoft.hibernate.dao.entity.Student;
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParseException;
import org.h2.command.dml.Insert;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.luxoft.hibernate.dao.entity.PerformanceParticipants;

import java.beans.Statement;
import java.sql.*;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.util.concurrent.Executor;

public class App {
    public static void main( String[] args ) throws java.text.ParseException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("app-context.xml");


        Format fmt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        date = (Date) ((DateFormat) fmt).parse("2011-04-12");



        StudentDao dao = context.getBean(StudentDao.class);
        dao.addStudent("name", "notname", date);

        //System.out.println(fmt);

        System.out.println(dao.getAllStudents());

        //System.out.println(dao.getAllInstruments());

        //System.out.println(dao.getAllStudentWithInstrument("Guitar"));
    }
}
