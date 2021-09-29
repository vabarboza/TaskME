package com.br.taskme.controller;

import com.br.taskme.models.Prioridade;
import com.br.taskme.service.PrioridadeService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PrioridadeController {

    @Autowired
    private PrioridadeService prioridadeService;

    @GetMapping("/prioridade")
    public ResponseEntity<List<Prioridade>> listaPrioridade() {
        return ResponseEntity.status(HttpStatus.OK).body(prioridadeService.listPrioridade());
    }

    @GetMapping("/prioridade/{id}")
    public ResponseEntity<Optional<Prioridade>> listaPrioridadeId(@PathVariable Integer idPrioridade) {
        return ResponseEntity.status(HttpStatus.OK).body(prioridadeService.listPrioridadeId(idPrioridade));
    }

    @PostMapping("/prioridade")
    public ResponseEntity<Prioridade> addPrioridade(@RequestBody Prioridade prioridade) {
        return ResponseEntity.status(HttpStatus.CREATED).body(prioridadeService.addPrioridade(prioridade));
    }

    @PutMapping("/prioridade")
    public ResponseEntity<Prioridade> editPrioridade(@RequestBody Prioridade prioridade) {
        return ResponseEntity.status(HttpStatus.OK).body(prioridadeService.updatePrioridade(prioridade));
    }

    @DeleteMapping("/prioridade/{id}")
    public ResponseEntity<String> removePrioridade(@PathVariable Integer integer) {
        prioridadeService.deletePrioridadeId(integer);
        return ResponseEntity.status(HttpStatus.OK).body("Prioridade removida com sucesso");
    }
}
