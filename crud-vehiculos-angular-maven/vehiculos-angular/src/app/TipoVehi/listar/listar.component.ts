import { Component, OnInit } from '@angular/core';
import { Tipovehiculo } from 'src/app/Modelo/Tipovehiculo';
import { ServiceService } from '../../Service/service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {

  tipovehiculos:Tipovehiculo[];
  constructor(private service:ServiceService, private router:Router) { }

  ngOnInit() {
    this.service.getTipovehiculos()
    .subscribe(
      data=>{
        this.tipovehiculos=data;
      }
    )
  }

  Editar(tipovehiculo:Tipovehiculo):void{
    localStorage.setItem("idtv",tipovehiculo.idtv.toString());  //Enviando el id de la fila seleccionada
    //Luego debe navegar hacia el formulario edit; el cual esta como uno de los path en el archivo
    //app-routing-module
    this.router.navigate(['edit']);  //si se desea ir a la aplicacion y en el listado precionar el boton 
    // editar de alguno de los registros. Debe mostrar el formulario para editar pero aun vacio
    //Luego ir al archivo edit.component.ts. para crear el metodo editar el cual recibe el id a actualizar
  }

  Delete(tipovehiculo:Tipovehiculo){
    this.service.deleteTipovehiculo(tipovehiculo)
    .subscribe(data=>{
      this.tipovehiculos=this.tipovehiculos.filter(tv=>tv!==tipovehiculo);
      alert("Usuario eliminado...");
    })
  }
}
