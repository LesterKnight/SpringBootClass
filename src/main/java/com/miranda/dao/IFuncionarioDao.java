package com.miranda.dao;
import com.miranda.domain.Funcionario;
import java.util.List;

public interface IFuncionarioDao {
    void save(Funcionario funcionario);
    void update(Funcionario funcionario);
    void delete(Long id);
    Funcionario findById(Long id);
    List<Funcionario> findAll();
}
