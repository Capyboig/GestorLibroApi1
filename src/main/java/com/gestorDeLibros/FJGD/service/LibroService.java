package com.gestorDeLibros.FJGD.service;

import com.gestorDeLibros.FJGD.model.Libro;
import com.gestorDeLibros.FJGD.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> listarTodos() {
        return libroRepository.findAll();
    }

    public Optional<Libro> buscarPorId(Long id) {
        return libroRepository.findById(id);
    }

    public Libro guardar(Libro libro) {
        return libroRepository.save(libro);
    }

    public Optional<Libro> actualizar(Long id, Libro libroActualizado) {
        return libroRepository.findById(id).map(libro -> {
            libro.setTitulo(libroActualizado.getTitulo());
            libro.setAutor(libroActualizado.getAutor());
            libro.setAnioPublicacion(libroActualizado.getAnioPublicacion());
            libro.setPrecio(libroActualizado.getPrecio());
            libro.setDisponible(libroActualizado.isDisponible());
            return libroRepository.save(libro);
        });
    }

    public void eliminar(Long id) {
        libroRepository.deleteById(id);
    }
}