package com.luxoft.hibernate.dao.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import com.luxoft.hibernate.dao.entity.PerformanceParticipants;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Table(name = "PERFORMANCE_PARTICIPANTS")
public class PerformanceParticipants implements Serializable {

    @Id
    @Column
    private long performanceId;
    @Id
    @Column
    private long StudentId;

    public PerformanceParticipants(long performanceId, long StudentId) {
        this.performanceId = performanceId;
        this.StudentId = StudentId;
    }

    public long getPerformanceId() {
        return performanceId;
    }

    public void setPerformanceId(long performanceId) {
        this.performanceId = performanceId;
    }

    public long getStudentId() {
        return StudentId;
    }

    public void setStudentId(long studentId) {
        StudentId = studentId;
    }

    @Override
    public String toString() {
        return "PerformanceParticipants{" +
                "performanceId=" + performanceId +
                ", StudentId=" + StudentId +
                '}';
    }
}
