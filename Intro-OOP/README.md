### OOP - POO
La programación Orientada a objetos es una forma especial de programar, más cercana a como expresaríamos las cosas en la vida real que otros tipos de programación.

La POO no es difícil, pero es una manera especial de pensar, a veces subjetiva de quien la programa, de manera que la forma de hacer las cosas puede ser diferente según el programador. Aunque podamos hacer los programas de formas distintas, no todas ellas son correctas, lo difícil no es programar orientado a objetos sino programar bien. Programar bien es importante porque así nos podemos aprovechar de todas las ventajas de la POO.

#### Cómo se piensa en objetos
Pensar en términos de objetos es muy parecido a cómo lo haríamos en la vida real. Por ejemplo vamos a pensar en un coche para tratar de modelizarlo en un esquema de POO. Diríamos que el coche es el elemento principal que tiene una serie de características, como podrían ser el color, el modelo o la marca. Además tiene una serie de funcionalidades asociadas, como pueden ser ponerse en marcha, parar o aparcar.

#### Clases en POO
Las clases son declaraciones de objetos, también se podrían definir como abstracciones de objetos. Esto quiere decir que la definición de un objeto es la clase. Cuando programamos un objeto y definimos sus características y funcionalidades en realidad lo que estamos haciendo es programar una clase.

- ##### Propiedades en clases 
  - Las propiedades o atributos son las características de los objetos. Cuando definimos una propiedad normalmente especificamos su nombre y su tipo. Nos podemos hacer a la idea de que las propiedades son algo así como variables donde almacenamos datos relacionados con los objetos.

- ##### Métodos en las clases 
  - Son las funcionalidades asociadas a los objetos. Cuando estamos programando las clases las llamamos métodos. Los métodos son como funciones que están asociadas a un objeto.
  
#### Objetos en POO
Los objetos son ejemplares de una clase cualquiera. Cuando creamos un ejemplar tenemos que especificar la clase a partir de la cual se creará. Esta acción de crear un objeto a partir de una clase se llama instanciar.

#### Ejemplo básico:

```java
	//Instancia objeto.
	Coche miCoche = new Coche();
	//Atributo de la clase coche() llamada desde el objeto que se intancio.
	miCoche.color = rojo;
	//Método de la clase coche()  llamado desde el objeto que se instancio.
	miCoche.ponerseEnMarcha();
```

Fuente:
https://desarrolloweb.com/articulos/499.php