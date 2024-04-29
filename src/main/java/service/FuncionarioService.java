package service;
import com.miranda.dao.IFuncionarioDao;
import com.miranda.domain.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class FuncionarioService implements IFuncionarioService {
    @Autowired
    private IFuncionarioDao dao;
    @Override @Transactional(readOnly = false)
    public void salvar(Funcionario funcionario) {
        dao.save(funcionario);
    }

    @Override @Transactional(readOnly = false)
    public void editar(Funcionario funcionario) {
        dao.update(funcionario);
    }

    @Override @Transactional(readOnly = false)
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public Funcionario buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<Funcionario> buscarTodos() {
        return dao.findAll();
    }
}
