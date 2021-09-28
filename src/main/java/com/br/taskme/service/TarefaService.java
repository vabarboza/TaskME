
package com.br.taskme.service;

import com.br.taskme.models.Tarefa;
import java.util.List;
import java.util.Optional;

public interface TarefaService {
    
    public Tarefa addTarefa(Tarefa tarefa);

    public List<Tarefa> listTarefa();

    public Optional<Tarefa> listTarefaId(Integer integer);

    public Tarefa updateTarefa(Tarefa tarefa);

    public void deleteTarefaId(Integer idTarefa);
}
