package com.luxoft.hibernate.dao.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import com.luxoft.hibernate.dao.entity.PerformanceParticipants;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "PERFORMANCE")
public class Performance implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(targetEntity = Composition.class)
    Composition composition;
    @OneToMany(targetEntity = Student.class, cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="PERFORMANCE_PARTICIPANTS",
            joinColumns={@JoinColumn(name="PERFORMANCE_ID")},
            inverseJoinColumns={@JoinColumn(name="STUDENT_ID")})
    private Set<Student> students;



    public Composition getComposition() {
        return composition;
    }

    public void setComposition(Composition composition) {
        this.composition = composition;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Performance{" +
                "id=" + id +
                ", composition=" + composition +
                ", students=" + students +
                '}';
    }
}
