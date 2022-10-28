package com.example.apptaller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//Clase creada para las especificaciones de un Vehiculo
class Vehiculo(val traccion:Array<Traccion>, val motor:String, val tipoDeVehiculo:Array<TipoDeVehiculo>, val capacidad:Int){
    enum class Traccion{
        AUTOMATICA,
        MANUAL
    }
    enum class TipoDeVehiculo{
        PARTICULAR,
        PRIVADO,
    }
    //Metodo de salida de ficha de los vehiculos
    fun ficha(){
        println("=================================================")
        println("FICHA DEL VEHICULO")
        println("Motor - $motor")
        println("Capacidad - $capacidad")

        for (caja in traccion) println("Vehiculo de traccion $caja")

        for (modelo in tipoDeVehiculo) println("Vehiculo $modelo")
    }
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        validarEdades()
        tablaDeMultplicar()
        listado()
        auto.ficha()
        calculoIva()
        validacionCedula()
    }

    //Validar si una persona es mayor o menor de edad
    fun validarEdades() {
        val edad = 21
        println("=================================================")
        println("VALIDACION DE EDADES")

        //estructura condicional para evaluar la edad ingresada
        if (edad >= 18){
            println("Usted es mayor de edad")
        }else{
            println("Usted es menor de edad")
        }
    }

    //Presentar la tabla de multiplicar de n numero de forma ascendente y descendente
    fun tablaDeMultplicar() {
        println("=================================================")
        println("TABLAS DE MULTIPLICAR ")
        var num = 5
        println("Acscendente")

        //Ciclo de recorrido para crear la multiplicacion con el iterador y el numero ingresado
        //Manera Ascendente
        for (i in 0 ..10){
            var result = num * i
            println("$num * $i = $result")
        }

        //Manera Descendente
        println("Descendente")
        for (x in 10 downTo 0 ){
            var result = num * x
            println("$num * $x = $result")
        }
    }

    //Mostrar el listado de paralelo de la materia de Plataformas móviles y
    // los subgrupos por proyectos (Mostrar los resultados ordenados).

    fun listado(){
        println("=================================================")
        println("LISTADO DE ESTUDIANTES Y PROYECTOS ")

        //Creacion de listas para cada uno de los grupos y subgrupos
        var lista= arrayListOf<String>()
        var pro1 = arrayListOf<String>()
        var pro2 = arrayListOf<String>()

        lista.addAll(listOf("Jose",
            "Mateo",
            "Carlos",
            "Diego",
            "Bryan"))
        println("Listado de Estudiantes")
        println(lista)

        //Division manual de los estudiantes mediantes los Arrays de los mismos
        println("Estudiantes Proyecto 1: Flutter")
        pro1.add(lista.get(1))
        pro1.add(lista.get(2))
        pro1.add(lista.get(4))
        println(pro1)

        println("Estudiantes Proyecto 2: Kotlin")
        pro2.add(lista.get(0))
        pro2.add(lista.get(3))
        println(pro2)
    }

    //Obtener el valor del iva correspondiente al 12% de
    fun calculoIva() {
        println("=================================================")
        println("CALCULO DEL VALOR DE IVA ")

        //Declaracion de Variables
        var total = 350
        var iva = total * 0.12
        var resultado =  total - iva

        //Mensajes de salida
        println("Valor inicial a pagar = $total")
        println("El iva de $total es igual a $iva")
        println("Valor total a pagar = $resultado")
    }
    //Presentar las propiedades de un vehículo utilizando clases, como tracción,
    //motor, tipo de vehículo, capacidad

    //Creacion de la vvariable del vehiculo
    val auto = Vehiculo(
        traccion = arrayOf(Vehiculo.Traccion.AUTOMATICA),
        motor = "A45FDA3FD46GHG",
        tipoDeVehiculo = arrayOf(Vehiculo.TipoDeVehiculo.PARTICULAR),
        capacidad = 12,
    )

    fun validacionCedula(){
        println("=================================================")
        println("VALIDACION DEL NUMERO DE CEDULA ")

        //Creacion de listas de informacion y variables de control
        val digitos = arrayListOf<Int>(1,7,2,3,1,8,6,7,5,3)
        var validador = 0
        var controlador1 = 0
        var controlador2 = 0


        println("Numero de CI: $digitos")

        //Metodo para evaluar cada digito y sus funciones
        for (i in 0 ..8){
            if((i+1)%2!=0){
                if((digitos[i]*2)>9){

                    //Nota: Al tener valores de 2 y 1 como multiplicadores,
                    // aquellos valores digitos de dos terminos pueden ser restados por nueve.
                    controlador1 = ((digitos[i]* 2)-9)
                }else{
                    controlador1 = (digitos[i]*2)
                }
                validador = validador + controlador1
            }else{
                validador = validador + digitos[i]
            }
        }

        //Metodo para validar el numero segun su comportamiento
        if((validador%10)!=0){
            controlador2 = validador/10
            controlador2.toInt()
            controlador2 = ((controlador2 + 1)*10)
        }else{
            controlador2 = 0
        }
        if((controlador2 - validador)== digitos.last()){
            println("Numero de Cedula validado correctamente")
        }else{
            println("No se pudo validar el numero de cedula")
        }

    }
}
