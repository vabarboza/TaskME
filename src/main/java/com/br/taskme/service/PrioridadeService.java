
package com.br.taskme.service;

import com.br.taskme.models.Prioridade;
import java.util.List;
import java.util.Optional;

public interface PrioridadeService {
    public Prioridade addPrioridade(Prioridade prioridade);
    
    public List<Prioridade> listPrioridade();
    
    public Optional<Prioridade> listPrioridadeId(Integer integer);
    
    public Prioridade updatePrioridade(Prioridade prioridade);
    
    public void deletePrioridadeId(Integer idPrioridade);
}
