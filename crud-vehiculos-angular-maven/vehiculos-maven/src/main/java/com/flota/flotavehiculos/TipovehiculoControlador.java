
package com.flota.flotavehiculos;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Desde el controlador se hara referencia al proyecto front-end
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/tipovehiculos"})
// el nombre /tipovehiculos se referencia en el proyecto front-end en el archivo service.service

public class TipovehiculoControlador {
    //agregar las anotaciones respectivas
    //Desde aca se hara referencia al proyecto front-end, brindandole todo el servicio que solicite
    @Autowired
    TipovehiculoService service;
    
    //Anotacion para listar los tipos de vehiculo
    @GetMapping
    public List<Tipovehiculo>listar(){
        return service.listar();
    }
    
    //Anotacion para guardar un tipo de vehiculo
    //@RequestBody: deserializa automáticamente el JSON en un tipo de Java
    @PostMapping
    public Tipovehiculo agregar(@RequestBody Tipovehiculo tv){
       return service.add(tv);       
    }
        //Guardar los cambion: Parar el proyecto y ejecutarlo nuevamente para que tome los cambios
        // Ahora regresar a angular, subir el servidor y probar registrando un tipo de vehiculo
        //Verificar en el listado y en la BD
    
    @GetMapping(path = {"/{idtv}"})
    public Tipovehiculo listarId(@PathVariable("idtv")int idtv){
        return service.listarId(idtv);
    }
    @PutMapping(path = {"/{idtv}"})
    public Tipovehiculo editar(@RequestBody Tipovehiculo tv,@PathVariable("idtv") int idtv){
        tv.setIdtv(idtv);
        return service.edit(tv);
    }
    @DeleteMapping(path = {"/{idtv}"})
    public Tipovehiculo delete(@PathVariable("idtv") int  idtv){
        return service.delete(idtv);
    }
}
