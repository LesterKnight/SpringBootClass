package com.miranda.dao;

import com.miranda.domain.Departamento;
import org.springframework.stereotype.Repository;

@Repository
public class DepartamentoDao extends AbstractDao<Departamento, Long> implements IDepartamentoDao {
}
