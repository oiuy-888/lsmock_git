package com.example.lsmock.mapper;

import com.example.lsmock.dao.Consul;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ConsulMapper {

    public List<Consul> findAll();
    public void addConsul(Consul consul);
    public void updateConsul(Consul consul);
    public void deleteConsul(int id);
}
