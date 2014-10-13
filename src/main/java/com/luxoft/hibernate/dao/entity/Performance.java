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
    @Id
    @Column
    private long compositionId;

    public Performance(long id, long compositionId) {
        this.id = id;
        this.compositionId = compositionId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCompositionId() {
        return compositionId;
    }

    public void setCompositionId(long compositionId) {
        this.compositionId = compositionId;
    }

    @Override
    public String toString() {
        return "Performance{" +
                "id=" + id +
                ", compositionId=" + compositionId +
                '}';
    }
}
