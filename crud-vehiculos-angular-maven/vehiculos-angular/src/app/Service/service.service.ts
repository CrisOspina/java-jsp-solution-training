import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Tipovehiculo } from '../Modelo/tipovehiculo';

// @Injectable({
//   providedIn: 'root'
// })
@Injectable()
export class ServiceService {

  constructor(private http:HttpClient) { }

  //Url del proyecto back nombre del proyecto (flotavehiculos) y el @RequestMapping (tipovehiculos) del controlador (TipovehiculoControlador)
  Url='http://localhost:8080/flotavehiculos/tipovehiculos';
  
  // Metodo para listar los datos tipovehiculos desde el proyecto back mediante su Url con this.Url en el siguiente metodo (getTipovehiculos)
  getTipovehiculos(){
    return this.http.get<Tipovehiculo[]>(this.Url);
  }

  // Metodo para guardar registros. 
  createTipovehiculos(tipovehiculo:Tipovehiculo){
    return this.http.post<Tipovehiculo>(this.Url,tipovehiculo);
  }
  //luego ir al archivo add.component.ts y crear el metodo Guardar()

  // Este metodo toma el id que se requiere actualizar
  getTipovehiculoId(idtv:number){
    return this.http.get<Tipovehiculo>(this.Url+"/"+idtv);
  }
  // estes es el metodo para actualizar
  updateTipovehiculo(tipovehiculo:Tipovehiculo){
    return this.http.put<Tipovehiculo>(this.Url+"/"+tipovehiculo.idtv,tipovehiculo);
  }

  //Metodo para eliminar
  deleteTipovehiculo(tipovehiculo:Tipovehiculo){
    return this.http.delete<Tipovehiculo>(this.Url+"/"+tipovehiculo.idtv);
  }

  // Luego ir al archivo listar.component.ts para crear el metod Editar() que se invoca en el formulario del archivo listar.component.html
}
