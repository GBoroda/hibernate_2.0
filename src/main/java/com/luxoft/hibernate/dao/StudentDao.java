package com.luxoft.hibernate.dao;

import com.luxoft.hibernate.dao.entity.Instrument;
import com.luxoft.hibernate.dao.entity.Student;
import com.luxoft.hibernate.dao.entity.PerformanceParticipants;

import java.util.Date;
import java.util.List;

public interface StudentDao {

    List<Student> getAllStudents();

    List<Instrument> getAllInstruments();

    List<Student> getAllStudentWithInstrument(String instrument);

}
