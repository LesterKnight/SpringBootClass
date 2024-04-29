package service;

import com.miranda.domain.Cargo;

import java.util.List;

public interface ICargoService {
    void salvar(Cargo cargo);
    void editar(Cargo cargo);
    void excluir(Long id);
    Cargo buscarPorId(Long id);
    List<Cargo> buscarTodos();
}
