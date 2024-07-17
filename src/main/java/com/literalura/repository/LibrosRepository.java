package com.literalura.repository;

import com.literalura.modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LibrosRepository extends JpaRepository<Libro, Long> {
    Optional<Libro> findByTituloContainsIgnoreCase(String nombreSerie);

    List<Libro> findByIdioma(String idioma);

}
