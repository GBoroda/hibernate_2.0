package com.luxoft.hibernate.dao;


import com.luxoft.hibernate.dao.entity.Student;
import com.luxoft.hibernate.dao.entity.Instrument;
import org.hibernate.Query;
import com.luxoft.hibernate.dao.entity.PerformanceParticipants;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sun.util.calendar.LocalGregorianCalendar;

import java.util.Date;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional(readOnly = true)
    public List<Student> getAllStudents() {
        return sessionFactory.getCurrentSession().createQuery("from Student").list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Instrument> getAllInstruments() {
        return sessionFactory.getCurrentSession().createQuery("from Instrument").list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> getAllStudentWithInstrument(String instrument) {
        Query query = sessionFactory.getCurrentSession().createQuery("SELECT s FROM Student s WHERE s.instrument.type = :instrumentType");
        query.setParameter("instrumentType", instrument);
        return query.list();
    }

}