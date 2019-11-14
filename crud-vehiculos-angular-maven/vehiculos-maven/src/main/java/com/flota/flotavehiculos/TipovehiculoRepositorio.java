
package com.flota.flotavehiculos;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface TipovehiculoRepositorio extends Repository<Tipovehiculo, Integer>{
    //Declarar todos los metodos que se utilizaran
    //se crean con los nombres que recomienda spring
    List<Tipovehiculo>findAll();
    Tipovehiculo findOne(int idtv);
    Tipovehiculo save(Tipovehiculo tv);
    void delete(Tipovehiculo tv);
}
