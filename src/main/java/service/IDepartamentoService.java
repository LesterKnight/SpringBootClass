package service;

import com.miranda.domain.Cargo;
import com.miranda.domain.Departamento;

import java.util.List;

public interface IDepartamentoService {
    void salvar(Departamento departamento);
    void editar(Departamento departamento);
    void excluir(Long id);
    Departamento buscarPorId(Long id);
    List<Departamento> buscarTodos();
}
