package com.miranda.dao;
import com.miranda.domain.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDao extends AbstractDao<Funcionario, Long> implements IFuncionarioDao {

}
