package com.miranda.dao;
import com.miranda.domain.Departamento;
import java.util.List;

public interface IDepartamentoDao {
    void save(Departamento departamento);
    void update(Departamento departamento);
    void delete(Long id);
    Departamento findById(Long id);
    List<Departamento> findAll();
}
