
package com.flota.flotavehiculos;

import java.util.List;

public interface TipovehiculoService {
    //Aqui estaran los metodos que se van a utilizar para el CRUD
    List<Tipovehiculo>listar();
    Tipovehiculo listarId(int idtv);
    Tipovehiculo add(Tipovehiculo tv);
    Tipovehiculo edit(Tipovehiculo tv);
    Tipovehiculo delete(int idtv);
}
