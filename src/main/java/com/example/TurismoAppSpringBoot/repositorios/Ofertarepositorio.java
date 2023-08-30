package com.example.TurismoAppSpringBoot.repositorios;

import com.example.TurismoAppSpringBoot.modelos.Empresa;
import com.example.TurismoAppSpringBoot.modelos.Oferta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ofertarepositorio extends JpaRepository<Oferta,Integer> {
}