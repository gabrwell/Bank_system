package persistance;

import java.util.List;

public interface IRepositorio <T> {

    void save (T t);

    List<T> listAll();

    void delete(T t);

}
