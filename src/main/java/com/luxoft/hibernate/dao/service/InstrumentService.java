package com.luxoft.hibernate.dao.service;

import com.luxoft.hibernate.dao.entity.Instrument;

import java.util.List;

public interface InstrumentService {

    List<Instrument> getInstruments();
    void add (Instrument instrument);
    void remove(Instrument instrument);

}
