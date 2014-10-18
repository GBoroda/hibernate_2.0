package com.luxoft.hibernate.dao.service;


import com.luxoft.hibernate.dao.SchoolDao;
import com.luxoft.hibernate.dao.entity.Composition;
import com.luxoft.hibernate.dao.entity.Performance;
import com.luxoft.hibernate.dao.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Service
public class PerformaceServiceImpl implements PerformanceService  {

    @Autowired
    private SchoolDao performanceDao;

    @Override
    @Transactional
    public List<Performance> getPerformances() {
        return performanceDao.getPerformances();
    }

    @Override
    @Transactional
    public void setComposition(Performance performance, Composition composition) {
        performance.setComposition(composition);
        performanceDao.savePerformance(performance);
    }

    @Override
    @Transactional
    public void addStudentToPerformance(Performance performance, Student student) {
        performance.getStudents().add(student);
        performanceDao.savePerformance(performance);
    }

    @Override
    public void showDetails(Performance performance) {
        System.out.println(performance.toString());
    }

    @Override
    public void showDetails(Collection<Performance> performances) {
        for (Performance performance : performances) {
            System.out.println(performance.toString());
        }
    }

}
