package service;


import model.Prisoner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PrisonerService extends GeneralService<Prisoner> {
    Page<Prisoner> findAllByNameContaining(String name, Pageable pageable);
}
