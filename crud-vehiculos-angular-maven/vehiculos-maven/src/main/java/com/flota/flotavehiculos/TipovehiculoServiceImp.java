
package com.flota.flotavehiculos;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipovehiculoServiceImp implements TipovehiculoService{
    //Para agregar todos los metodos de esta interface. E implementar por ahora solo el de listar
    //Para ello se debe colocar las anotaciones correspondientes (@Service y @Autowired)
    //esta ultima anotacion para crear una variable de tipo repositorio para traer el metodo findAll() listar todo
    @Autowired
    private TipovehiculoRepositorio repositorio;
    
    @Override
    public List<Tipovehiculo> listar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.findAll();
    }

    @Override
    public Tipovehiculo listarId(int idtv) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.findOne(idtv);
    }

    @Override
    public Tipovehiculo add(Tipovehiculo tv) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.save(tv);
    }
    // Luego en el controlador crear el siguiente metodo mapeado
      // @PostMapping
      // public Tipovehiculo agregar(@RequestBody Tipovehiculo tv){
      //   return service.add(tv);
      // }

    @Override
    public Tipovehiculo edit(Tipovehiculo tv) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.save(tv);
    }

    @Override
    public Tipovehiculo delete(int idtv) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Tipovehiculo tv = repositorio.findOne(idtv);
        if(tv != null){
            repositorio.delete(tv);
        }
        return tv;
    }
        
}
