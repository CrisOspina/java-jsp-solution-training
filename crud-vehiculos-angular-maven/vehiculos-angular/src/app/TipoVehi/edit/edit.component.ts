import { Component, OnInit } from '@angular/core';
import { Tipovehiculo } from 'src/app/Modelo/Tipovehiculo';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  tipovehiculo :Tipovehiculo=new Tipovehiculo();
  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit() {
    this.Editar();
  }

  //Metodo para editar el id recibido
  Editar(){
    let idtv=localStorage.getItem("idtv"); //el tvid viene del archivo listar.component.ts

    //actualizar sus datos
    this.service.getTipovehiculoId(+idtv)
    .subscribe(data=>{
      this.tipovehiculo=data;
    })
  }

  //Metodo para actualizar(guardar) los cambios
  Actualizar(tipovehiculo:Tipovehiculo){
    this.service.updateTipovehiculo(tipovehiculo)
    .subscribe(data=>{
      this.tipovehiculo=data;
      alert("Tipo Vehiculo Actualizado");
      this.router.navigate(["listar"]);
    })
  }
}

// NOTA: Ir al proyecto back-end e implementar los metodos listarId y edit de la class TipovehiculoServiceImp.java
// agregando dentro del metodo listarId la siguiente linea de codigo:
      // return repositorio.findOne(tv);
// Y en el metodo edit la siguiente linea de codigo:
      // return repositorio.save(tv);

// Luego en el controlador crear los siguientes metodos mapeado
      // @GetMapping(path = {"/{"tvid"}"})
      // public Tipovehiculo listarId(@PathVariable("tvid")int tvid){
      //   return service.listarId(tvid);
      // }


      // @PutMapping(path = {"/{"tvid"}"})
      // public Tipovehiculo editar(@RequestBody Tipovehiculo tv,@PathVariable("tvid")int tvid){
      //   tv.setTvid(tvid);
      //   return service.edit(tv);
      // }

//Guardar los cambion, parar el proyecto y ejecutarlo nuevamente para que tome los cambios
// y regresar a angular, subir el servidor y probar registrando un tipo de vehiculo
//Verificar en el listado haciendo click en el boton Edit y debera mostrar los datos del tv a editar
//Ahora falta guardar los cambios, para ello. Creamos en este mismo archivo (edit.component.ts) el metodo actualizar()
//Cuyo nombre debe ser igual al colocado en el boton del archivo edit.component.html
