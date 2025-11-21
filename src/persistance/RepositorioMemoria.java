package persistance;

import java.util.ArrayList;
import java.util.List;

public class RepositorioMemoria <T> implements IRepositorio<T>{

    private List<T> dados;


    @Override
    public void save(T t) {
        System.out.println("Item save in your repositore");

    }

    @Override
    public List<T> listAll() {
        return new ArrayList<>(this.dados);
    }

    @Override
    public void delete(T t) {
        this.dados.remove(t);
        System.out.println("Item remove in the repositore");

    }
}
