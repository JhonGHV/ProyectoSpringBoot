package com.example.TurismoAppSpringBoot.repositorios;

import com.example.TurismoAppSpringBoot.modelos.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Empresarepositorio extends JpaRepository<Empresa,Integer> {

}