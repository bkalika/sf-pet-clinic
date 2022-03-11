package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * @author @bkalika
 * Created on 11.03.2022 11:44 AM
 */
public interface CrudService<T, ID> {

    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
}
