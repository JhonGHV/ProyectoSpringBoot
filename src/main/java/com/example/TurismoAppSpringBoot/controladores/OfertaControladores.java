package com.example.TurismoAppSpringBoot.controladores;

import com.example.TurismoAppSpringBoot.modelos.Empresa;
import com.example.TurismoAppSpringBoot.modelos.Oferta;
import com.example.TurismoAppSpringBoot.servicios.Empresaservicio;
import com.example.TurismoAppSpringBoot.servicios.Ofertaservicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/oferta")
public class OfertaControladores {

    @Autowired
    Ofertaservicio ofertaservicio;


    @PostMapping
    public ResponseEntity<?> registrarOferta(@RequestBody Oferta datosOferta){
        return null;
    }




    @PutMapping
    public  ResponseEntity<?> editarOferta(@RequestBody Oferta datosNuevosOferta,@PathVariable Integer idOferta){
        return null;
    }



    @GetMapping
    public ResponseEntity<?> buscarUnaOferta(@PathVariable Integer id){
        return null;
    }




    @GetMapping
    public ResponseEntity<?> buscarTodasOferta(){
        return null;
    }



    @DeleteMapping
    public ResponseEntity<?> borrarOferta(@PathVariable Integer id){
        return null;
    }



}