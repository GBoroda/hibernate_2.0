package com.luxoft.hibernate.dao;

import com.luxoft.hibernate.dao.entity.*;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface SchoolDao {


    List<Student> getAllStudents();
    List<Student> getAllStudentWithInstrument(String instrument);
    Long addStudent(String firstName, String lastName, Date birth_date);

    List<Instrument> getAllInstruments();

}
