package service;

import model.Prisoner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface GeneralService<T> {
    Iterable<Prisoner> findAll();
    Page<T> findAll(Pageable pageable);

    Optional<T> findById(Long id);

    void save(T t);

    void remove(Long id);
}
