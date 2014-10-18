package com.luxoft.hibernate.dao.service;

import com.luxoft.hibernate.dao.SchoolDao;
import com.luxoft.hibernate.dao.entity.Instrument;
import com.luxoft.hibernate.dao.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Repository
public class StudentServiceImpl implements StudentService {

    @Autowired
    private SchoolDao schoolDao;

    @Override
    @Transactional
    public List<Student> getStudents() {

        return schoolDao.getAllStudents();
    }

    @Override
    @Transactional
    public void saveOrUpdate(Student student) {

        schoolDao.saveStudent(student);
    }

    @Override
    @Transactional
    public void remove(Student student) {

        schoolDao.removeStudent(student);
    }

    @Override
    @Transactional
    public void changeInstruments(Student student1, Student student2) {

        Instrument instrument1 = student1.getInstrument();
        Instrument instrument2 = student2.getInstrument();

        student1.setInstrument(instrument2);
        schoolDao.saveStudent(student1);

        student2.setInstrument(instrument1);
        schoolDao.saveStudent(student2);
    }

    @Override
    @Transactional
    public List<Student> getByInstrumentType(String type) {

        return schoolDao.getAllStudentWithInstrument(type);
    }

    @Override
    @Transactional
    public List<Student> getByInstrumentProdDate(Date prodDate) {

        return schoolDao.getByInstrumentProdDate(prodDate);
    }
}