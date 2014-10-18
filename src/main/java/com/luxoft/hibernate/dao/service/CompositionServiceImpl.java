package com.luxoft.hibernate.dao.service;

import com.luxoft.hibernate.dao.SchoolDao;
import com.luxoft.hibernate.dao.entity.Composition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

    @Service
    public class CompositionServiceImpl implements CompositionService {

        @Autowired
        private SchoolDao compositionDao;

        @Override
        @Transactional
        public List<Composition> getCompositions() {

            return compositionDao.getCompositions();
        }

        @Override
        @Transactional
        public void saveOrUpdate(Composition composition) {

            compositionDao.saveComposition(composition);
        }

        @Override
        @Transactional
        public void remove(Composition composition) {

            compositionDao.removeComposition(composition);
        }
}
