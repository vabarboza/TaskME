package com.br.taskme.service;

import com.br.taskme.models.Categoria;
import java.util.List;
import java.util.Optional;


public interface CategoriaService {
    public Categoria addCategoria(Categoria categoria);
    
    public List<Categoria> listCategoria();
    
    public Optional<Categoria> listCategoriaId(Integer integer);
    
    public Categoria updateCategoria(Categoria categoria);
    
    public void deleteCatagoriaId(Integer idCategoria);
}
