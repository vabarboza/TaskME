package com.br.taskme.service;

import com.br.taskme.models.Prioridade;
import com.br.taskme.repository.PrioridadeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrioridadeServiceImp implements PrioridadeService {

    @Autowired
    private PrioridadeRepository prioridadeRepository;

    @Override
    public Prioridade addPrioridade(Prioridade prioridade) {
        return prioridadeRepository.save(prioridade);
    }

    @Override
    public List<Prioridade> listPrioridade() {
        return prioridadeRepository.findAll();
    }

    @Override
    public Optional<Prioridade> listPrioridadeId(Integer integer) {
        return prioridadeRepository.findById(integer);
    }

    @Override
    public Prioridade updatePrioridade(Prioridade prioridade) {
        return prioridadeRepository.save(prioridade);
    }

    @Override
    public void deletePrioridadeId(Integer idPrioridade) {
        prioridadeRepository.deleteById(idPrioridade);
    }

}
