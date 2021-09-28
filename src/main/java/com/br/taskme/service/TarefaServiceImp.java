
package com.br.taskme.service;

import com.br.taskme.models.Tarefa;
import com.br.taskme.repository.TarefaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

public class TarefaServiceImp implements TarefaService{

    @Autowired
    private TarefaRepository tarefaRepository;
    
    @Override
    public Tarefa addTarefa(Tarefa tarefa) {
    return tarefaRepository.save(tarefa);
    }

    @Override
    public List<Tarefa> listTarefa() {
        return tarefaRepository.findAll();
    }

    @Override
    public Optional<Tarefa> listTarefaId(Integer integer) {
        return tarefaRepository.findById(integer);
    }

    @Override
    public Tarefa updateTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    @Override
    public void deleteTarefaId(Integer idTarefa) {
        tarefaRepository.deleteById(idTarefa);
    }
    
}
