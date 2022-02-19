package repository;


import model.Sentinel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SentinelRepository extends JpaRepository<Sentinel, Long> {
}
