package com.miranda.dao;

import com.miranda.domain.Cargo;

import java.util.List;

public interface ICargoDao {
    void save(Cargo cargo);
    void update(Cargo cargo);
    void delete(Long id);
    Cargo findById(Long id);
    List<Cargo> findAll();
}
