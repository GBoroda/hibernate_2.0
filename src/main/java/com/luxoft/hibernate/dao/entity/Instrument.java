package com.luxoft.hibernate.dao.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import com.luxoft.hibernate.dao.entity.PerformanceParticipants;

import javax.persistence.*;
import java.lang.reflect.Constructor;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "INSTRUMENT")
public class Instrument {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "PRODUCER")
    private String producer;
    @Column(name = "PROD_DATE")
    private Date prodDate;
    @Column(name = "PURCH_DATE")
    private Date purchDate;

    @OneToMany(mappedBy = "instrument", fetch = FetchType.EAGER)
    private List<Student> students;

    public Instrument() {
    }

    public Instrument(String type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Date getProdDate() {
        return prodDate;
    }

    public void setProdDate(Date prodDate) {
        this.prodDate = prodDate;
    }

    public Date getPurchDate() {
        return purchDate;
    }

    public void setPurchDate(Date purchDate) {
        this.purchDate = purchDate;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", producer='" + producer + '\'' +
                ", prodDate=" + prodDate +
                ", purchDate=" + purchDate +
                '}';
    }

}
