package com.luxoft.hibernate.dao.service;


import com.luxoft.hibernate.dao.SchoolDao;
import com.luxoft.hibernate.dao.entity.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InstrumentServiceImpl implements InstrumentService {

    @Autowired
    private SchoolDao instrumentDao;

    @Override
    @Transactional
    public List<Instrument> getInstruments() {

        return instrumentDao.getAllInstruments();
    }

    @Override
    @Transactional
    public void add(Instrument instrument) {

        instrumentDao.saveInstrument(instrument);
    }

    @Override
    @Transactional
    public void remove(Instrument instrument) {

        instrumentDao.removeInstrument(instrument);
    }
}