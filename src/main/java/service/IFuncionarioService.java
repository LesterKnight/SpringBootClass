package service;

import com.miranda.domain.Cargo;
import com.miranda.domain.Funcionario;

import java.util.List;

public interface IFuncionarioService {
    void salvar(Funcionario funcionario);
    void editar(Funcionario funcionario);
    void excluir(Long id);
    Funcionario buscarPorId(Long id);
    List<Funcionario>buscarTodos();
}
