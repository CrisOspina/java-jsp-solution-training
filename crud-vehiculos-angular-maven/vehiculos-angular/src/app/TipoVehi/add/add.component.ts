import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';
import { Tipovehiculo } from 'src/app/Modelo/Tipovehiculo';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  //Crear el objeto tipovehiculo
  tipovehiculo:Tipovehiculo=new Tipovehiculo();

  //Crear las variables router y service en el constructor
  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit() {
  }

  // Metodo guardar que utiliza el metodo createTipovehiculos del archivo service
  // public idtv= { idtv: ''};
  // public nomtv= { nomtv: ''};  
  Guardar(){  
    this.service.createTipovehiculos(this.tipovehiculo)
    .subscribe(data=>{
      alert("Tipo Vehiculo Guardado");
      this.router.navigate(["listar"]);   //navegar hacia el componente listar que esta enrrutado en el archivo app-routing
    })
  }
  
  // submitted = false;
  // tipovehiculo: Tipovehiculo= new Tipovehiculo();

  // newTipoVehiculo(): void {
  //   this.submitted = false;
  //   this.tipovehiculo = new Tipovehiculo();
  // }

  // Guardar() {    
  //   this.service.createTipovehiculos(this.tipovehiculo)
  //   .subscribe(data=>{      
  //     alert("Tipo Vehiculo Guardado");
  //     this.tipovehiculo=new Tipovehiculo();
  //     this.router.navigate(["listar"]);
  //   })
  // }

  // onSubmit() {
  //   this.submitted = true;
  //   this.Guardar();
  // }

}
// NOTA: Ir al proyecto back-end e implementar el metodo add de la class TipovehiculoServiceImp.java
// agregando dentro del metodo la siguiente linea de codigo:
      // return repositorio.save(tv);

