package com.luxoft.hibernate.dao;


import com.luxoft.hibernate.dao.entity.Composition;
import com.luxoft.hibernate.dao.entity.Performance;
import com.luxoft.hibernate.dao.entity.Student;
import com.luxoft.hibernate.dao.entity.Instrument;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Repository
public class SchoolDaoImpl implements SchoolDao {

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
    public List<Performance> getPerformance() {
        return sessionFactory.getCurrentSession().createQuery("from Performance").list();
    }

    @Override
    public List<Composition> getComposition() {
        return sessionFactory.getCurrentSession().createQuery("from Composition").list();
    }

    @Override
    public List<Student> getByInstrumentProdDate(Date prodDate) {

        return sessionFactory.getCurrentSession()
                .createQuery("select s from Student " +
                        "as s inner join s.instrument as i where i.prodDate=:prodDate")
                .setDate("prodDate", prodDate)
                .list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> getAllStudentWithInstrument(String instrument) {
        Query query = sessionFactory.getCurrentSession().createQuery("SELECT s FROM Student s WHERE s.instrument.type = :instrumentType");
        query.setParameter("instrumentType", instrument);
        return query.list();
    }

    @Override
    public void removeComposition(Composition composition) {
        sessionFactory.getCurrentSession().delete(composition);
    }

    @Override
    public void savePerformance(Performance performance) {
        sessionFactory.getCurrentSession().save(performance);
    }

    @Override
    public void removeStudent(Student student) {
        sessionFactory.getCurrentSession().delete(student);
    }

    @Override
    @Transactional(readOnly = false)
    public Long addStudent(String firstName, String lastName, Date birth_date) {
        Student student = new Student(firstName, lastName, birth_date);
        return (Long) sessionFactory.getCurrentSession().save(student);

    }

    @Override
    public Long addInstrument(String type, String producer, Date prodDate, Date purchDate) {
        Instrument instrument = new Instrument(type, producer, prodDate, purchDate);
        return (Long) sessionFactory.getCurrentSession().save(instrument);
    }

    @Override
    public void removeInstrument(Instrument instrument) {
        sessionFactory.getCurrentSession().delete(instrument);
    }

    @Override
    public void saveComposition(Composition composition) {
        sessionFactory.getCurrentSession().save(composition);
    }

}
