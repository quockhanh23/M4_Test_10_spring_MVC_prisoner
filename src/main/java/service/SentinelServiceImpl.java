package service;


import model.Prisoner;
import model.Sentinel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import repository.SentinelRepository;

import java.util.Optional;

@Service
public class SentinelServiceImpl implements SentinelService {
    @Autowired
    private SentinelRepository sentinelRepository;

    @Override
    public Iterable<Prisoner> findAll() {
        return null;
    }

    @Override
    public Page<Sentinel> findAll(Pageable pageable) {
        return sentinelRepository.findAll(pageable);
    }

    @Override
    public Optional<Sentinel> findById(Long id) {
        return sentinelRepository.findById(id);
    }

    @Override
    public void save(Sentinel sentinel) {
        sentinelRepository.save(sentinel);
    }

    @Override
    public void remove(Long id) {
        sentinelRepository.deleteById(id);
    }
}
