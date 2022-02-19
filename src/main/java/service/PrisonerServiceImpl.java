package service;

import model.Prisoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import repository.PrisonerRepository;

import java.util.Optional;

@Service
public class PrisonerServiceImpl implements PrisonerService {
    @Autowired
    private PrisonerRepository prisonerRepository;

    @Override
    public Iterable<Prisoner> findAll() {
        return prisonerRepository.findAll();
    }

    @Override
    public Page<Prisoner> findAll(Pageable pageable) {
        return prisonerRepository.findAll(pageable);
    }

    @Override
    public Optional<Prisoner> findById(Long id) {
        return prisonerRepository.findById(id);
    }

    @Override
    public void save(Prisoner prisoner) {
        prisonerRepository.save(prisoner);
    }

    @Override
    public void remove(Long id) {
        prisonerRepository.deleteById(id);
    }

    @Override
    public Page<Prisoner> findAllByNameContaining(String name, Pageable pageable) {
        return prisonerRepository.findAllByNameContaining(name, pageable);
    }
}
