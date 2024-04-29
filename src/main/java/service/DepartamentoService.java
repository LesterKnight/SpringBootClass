package service;
import com.miranda.dao.IDepartamentoDao;
import com.miranda.domain.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class DepartamentoService implements  IDepartamentoService{
    @Autowired
    private IDepartamentoDao dao;
    @Override @Transactional(readOnly = false)
    public void salvar(Departamento departamento) {
        dao.save(departamento);
    }

    @Override @Transactional(readOnly = false)
    public void editar(Departamento departamento) {
        dao.update(departamento);
    }

    @Override @Transactional(readOnly = false)
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public Departamento buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<Departamento> buscarTodos() {
        return dao.findAll();
    }
}
