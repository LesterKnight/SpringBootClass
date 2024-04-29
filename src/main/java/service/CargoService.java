package service;
import com.miranda.dao.ICargoDao;
import com.miranda.domain.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class CargoService implements  ICargoService {
    @Autowired
    private ICargoDao dao;
    @Override @Transactional(readOnly = false)
    public void salvar(Cargo cargo) {
        dao.save(cargo);
    }

    @Override @Transactional(readOnly = false)
    public void editar(Cargo cargo) {
        dao.update(cargo);
    }

    @Override @Transactional(readOnly = false)
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public Cargo buscarPorId(Long id) {

        return dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<Cargo> buscarTodos() {

        return dao.findAll();
    }
}
