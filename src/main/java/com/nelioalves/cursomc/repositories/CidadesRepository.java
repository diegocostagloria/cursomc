package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.dominio.Categoria;
import com.nelioalves.cursomc.dominio.Cidades;

@Repository
public interface CidadesRepository extends JpaRepository<Cidades, Integer> {

}
