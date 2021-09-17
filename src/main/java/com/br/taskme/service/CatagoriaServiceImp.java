package com.br.taskme.service;

import com.example.demo.model.Categoria;
import com.example.demo.repository.CategoriaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatagoriaServiceImp implements CategoriaService{
   
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria addCategoria(Categoria categoria) {
       return categoriaRepository.save(categoria);
        
    }

    @Override
    public List<Categoria> listCategoria() {
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<Categoria> listCategoriaId(Integer integer) {
        return categoriaRepository.findById(integer);
    }

    @Override
    public Categoria updateCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public void deleteCatagoriaId(Integer idCategoria) {
        categoriaRepository.deleteById(idCategoria);
    }
    
    
    
}
