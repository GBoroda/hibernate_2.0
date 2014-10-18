package com.luxoft.hibernate.dao.service;

import com.luxoft.hibernate.dao.entity.Composition;
import com.luxoft.hibernate.dao.entity.Performance;
import com.luxoft.hibernate.dao.entity.Student;

import java.util.Collection;
import java.util.List;

public interface PerformanceService {

    List<Performance> getPerformances();
    void setComposition(Performance performance, Composition composition);
    void addStudentToPerformance(Performance performance, Student student);
    void showDetails(Performance performance);
    void showDetails(Collection<Performance> performances);

}
