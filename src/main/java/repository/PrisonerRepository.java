package repository;

import model.Prisoner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrisonerRepository extends JpaRepository<Prisoner, Long> {
    Page<Prisoner> findAllByNameContaining(String name, Pageable pageable);

}
