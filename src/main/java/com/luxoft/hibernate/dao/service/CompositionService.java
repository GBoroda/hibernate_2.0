package com.luxoft.hibernate.dao.service;

import com.luxoft.hibernate.dao.entity.Composition;

import java.util.List;

public interface CompositionService {

    List<Composition> getCompositions();
    void saveOrUpdate(Composition composition);
    void remove(Composition composition);

}
