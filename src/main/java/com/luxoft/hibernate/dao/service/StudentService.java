package com.luxoft.hibernate.dao.service;

import com.luxoft.hibernate.dao.entity.Student;
import com.luxoft.hibernate.dao.entity.Instrument;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

public interface StudentService {

    List<Student> getStudents();
    void saveOrUpdate(Student student);
    void remove(Student student);
    void changeInstruments(Student student1, Student student2);
    List<Student> getByInstrumentType(String type);
    public List<Student> getByInstrumentProdDate(Date prodDate);
}
