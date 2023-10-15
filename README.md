# Dependencias
Diego Beñaldo

Ejercicio del receso

Diagrama VPP

Analisis del diagrama

Se creo una clase persona que contiene los siguientes atributos: el nombre de la persona, el destino y el tipo de vehiculo en el cual realizara el viaje a su destino, luego tenemos los metodos los cuales nos van a permitir darle valores a los atributos. Ademas de la funcion de calcular tiempo que sera para calcular el tiempo que demorara la persona en llegar al lugar.
Y tenemos la clase vehiculo, que contienen un atributo llamado tipovehiculo el cual estaran dentro los tipos de vehiculos como la moto, el auto y la bicicleta, de metodos tiene un constructor para dar los parametros a los atributos de la clase vehiculo y un getter para el atributo de la clase getTipovehiculo

![image](https://github.com/GatoMiau03/Dependencias/assets/142507343/638a6e4e-df85-45be-9927-a4dafca49c8b)


Codigo generado por el diagrama VPP
![image](https://github.com/GatoMiau03/Dependencias/assets/142507343/80ea31af-2c62-4918-892c-a710482efb91)
![image](https://github.com/GatoMiau03/Dependencias/assets/142507343/016e57ad-8aeb-4b70-9f49-9a10eba577a6)

Cambios entre el codigo entregado por el diagrama y el codigo final

![image](https://github.com/GatoMiau03/Dependencias/assets/142507343/460d57af-b5f5-4287-ba38-2d3875f5e4e2)
![image](https://github.com/GatoMiau03/Dependencias/assets/142507343/2e845d3d-e14d-4115-9ff1-dcd78398bfc6)
![image](https://github.com/GatoMiau03/Dependencias/assets/142507343/7d0495fa-77ad-4ee9-956d-b364a6b6e6fa)

Los cambios que podemos observar en la clase persona son que se cambio el public string calcularTiempoDestino por un public int calcularTiempo ya que el tiempo lo tendriamos como un valor numerico fijo, por ende utilizar string no seria apropiado.
Y para la clase de vehiculo los cambios principales fueron que se agrego un tipo de string y un int para el tiempo y el string fue para el tipo de vehiculo que se utilizaria, ademas de agregar un private int tiempoViaje para tener el tiempo de viaje como un valor de tipo int, mas alla de eso se agregaron funciones al main para demostrar el correcto funcionamiento del codigo

Pruebas unitarias
Se realizaron las siguientes pruebas unitarias para las clases persona y vehiculo

![image](https://github.com/GatoMiau03/Dependencias/assets/142507343/b7d9959e-65ce-480c-ac8d-2274614c9bc2)

Las primeras dos pruebas son similares, demuestran que el metodo getNombre y el metodo getDestino de de la clase persona devuelva lo esperado y para el tercer test se verifica que el metodo calcularTiempo devuelva de manera correcta el tiempo estimado.

![image](https://github.com/GatoMiau03/Dependencias/assets/142507343/79605d7c-c26b-4f41-a3be-3cdfa53f26ea)

Las pruebas de la clase vehiculo fueron las siguientes, un test para el metodo getTipoVehiculo la cual verifica que entregue correctamente el vehiculo indicado y no lo mezcle con algun otro valor y la prueba para el metodo getTiempoViaje que de igual forma que la clase anterior verifica que se entregue el tiempo estimado de manera correcta

Y por ultimo las relaciones de dependencia 

![image](https://github.com/GatoMiau03/Dependencias/assets/142507343/20971b25-50ef-416c-b68f-3c6b3bf22b02)

En la parte del System.out.printf al utilizar el persona.getNombre(), persona.getDestino(), persona.getVehiculo().getTipoVehiculo() tenemos una relacion de dependencia entre nuestra clase main y las clase persona y vehiculo y otra relacion la tenemos en el siguiente codigo

![image](https://github.com/GatoMiau03/Dependencias/assets/142507343/084bb907-778e-4d8b-be13-6e8016588827)

en la clase persona creamos un atributo llamado vehiculo que es de tipo Vehiculo ya que existe la clase Vehiculo por lo tanto se genera dependencia ya que necesitamos la clase vehiculo
