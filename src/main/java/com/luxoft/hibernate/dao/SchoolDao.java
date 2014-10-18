package com.luxoft.hibernate.dao;

import com.luxoft.hibernate.dao.entity.*;
import javafx.scene.effect.InnerShadow;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface SchoolDao {


    List<Student> getAllStudents();
    List<Student> getAllStudentWithInstrument(String instrument);
    void removeStudent(Student student);
    void addStudentToPerformance(Performance performance, Student student);
    void saveStudent(Student student);

    List<Student> getByInstrumentProdDate(Date prodDate);

    Long addStudent(String firstName, String lastName, Date birth_date);
    Long addInstrument(String type, String producer, Date prodDate, Date purchDate);

    List<Instrument> getAllInstruments();
    void removeInstrument(Instrument instrument);

    List<Performance> getPerformances();
    List<Composition> getCompositions();

    void removeComposition(Composition composition);

    void savePerformance(Performance performance);
    void saveComposition(Composition composition);
    void saveInstrument(Instrument instrument);

    void showDetails(Performance performance);


}
