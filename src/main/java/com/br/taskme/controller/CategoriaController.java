
package com.br.taskme.controller;

import com.br.taskme.models.Categoria;
import com.br.taskme.service.CategoriaService;
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
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/categorias")
    public ResponseEntity<List<Categoria>> listCategoria(){
        return ResponseEntity.status(HttpStatus.OK).body(categoriaService.listCategoria());
    }
    
    @GetMapping("/categorias/{id}")
    public ResponseEntity<Optional<Categoria>> listaCategoriaId(@PathVariable Integer idCategoria){
        return ResponseEntity.status(HttpStatus.OK).body(categoriaService.listCategoriaId(idCategoria));
    }
    
    @PostMapping("/categorias")
    public ResponseEntity<Categoria> addCategoria(@RequestBody Categoria categoria){
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaService.addCategoria(categoria));
    }
    
    @PutMapping("/categorias")
    public ResponseEntity<Categoria> editCategoria(@RequestBody Categoria categoria){
        return ResponseEntity.status(HttpStatus.OK).body(categoriaService.updateCategoria(categoria));
    }
    
    @DeleteMapping("/categorias/{id}")
    public ResponseEntity<String> removeCategoria(@PathVariable Integer integer){
        categoriaService.deleteCatagoriaId(integer);
        return ResponseEntity.status(HttpStatus.OK).body("Categoria removida com sucesso");
    }
}
