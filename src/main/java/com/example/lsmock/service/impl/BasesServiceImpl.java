package com.example.lsmock.service.impl;

import com.example.lsmock.dao.Bases;
import com.example.lsmock.mapper.BasesMapper;
import com.example.lsmock.service.BasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasesServiceImpl implements BasesService{

    @Autowired
    BasesMapper basesMapper;

    @Override
    public List<Bases> findAll() {
        return basesMapper.findAll();
    }

    @Override
    public Bases findBases(Bases bases) {
        return basesMapper.findBases(bases);
    }

    @Override
    public void addBases(Bases bases) {
        basesMapper.addBases(bases);
    }

    @Override
    public void deleteBases(Bases bases) {
        basesMapper.deleteBases(bases);
    }
}
