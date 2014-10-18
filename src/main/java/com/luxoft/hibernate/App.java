package com.luxoft.hibernate;

import com.luxoft.hibernate.dao.SchoolDao;
import com.luxoft.hibernate.dao.entity.*;
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParseException;
import org.h2.command.dml.Insert;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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


        // добавление нового студента
        //Format fmt = new SimpleDateFormat("yyyy-MM-dd");
        //Date date = new Date();
        //date = (Date) ((DateFormat) fmt).parse("2011-04-12");
        SchoolDao dao = context.getBean(SchoolDao.class);
        //dao.addStudent("Guy", "Newbie", date);

        //Вызвать список студентов
        //System.out.println(dao.getAllStudents());

        //TODO дать студенту инструмент

        //TODO записать студента в группу

        //TODO добавить группу на концерт

        //TODO добавить песню в репертуар группы

        //TODO подробный вывод какую песню играет какая группа. И кто в этой группе состоит

        //Список инструменто в муз. школе
        //System.out.println(dao.getAllInstruments());

        //поиск студентов играющих на определенном инструменте
        //System.out.println(dao.getAllStudentWithInstrument("Guitar"));

        List<Performance> list = dao.getPerformances();
        List<Composition> compositions = dao.getCompositions();
        List<Student> students = dao.getAllStudents();

        Performance performance = list.get(2);

        dao.showDetails(performance);

        Composition composition = compositions.get(0);



        Student student = students.get(1);
        dao.addStudentToPerformance(performance, student);

        String s = "";

    }
}
