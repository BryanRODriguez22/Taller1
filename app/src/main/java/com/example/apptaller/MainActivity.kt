package com.example.apptaller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
Mostrar el listado de paralelo de la materia de Plataformas móviles y
los subgrupos por proyectos (Mostrar los resultados ordenados).
Presentar las propiedades de un vehículo utilizando clases, como tracción,
motor, tipo de vehículo, capacidad

 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        validarEdades()
        tablaDeMultplicar()
    }

    //Validar si una persona es mayor o menor de edad
    fun validarEdades() {
        println("Validacion de Edades")
        println("Ingrese la edad a validar: ")
        var edad = readLine()!!.toInt()

        if (edad >= 18){
            println("Usted es mayor de edad")
        }else{
            println("Usted es menor de edad")
        }
    }

    //Presentar la tabla de multiplicar de n numero de forma ascendente y descendente
    fun tablaDeMultplicar() {
        println("Tablas de multiplicar ")
        var num = 5
        println("Acscendente")
         for (i in 0 ..10){
             var result = num * i
             println("$num * $i = $result")
        }
        println("Descendente")
        for (x in 0 downTo 10 ){
            var result = num * x
            println("$num * $x = $result")
        }
    }

    fun listado(){
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

    fun calculoIva() {
        var total = 350
        var iva = total * 0.12
        var resultado =  total - iva
        println("Valor inicial a pagar = $total")
        println("El iva de $total es igual a $iva")
        println("Valor total a pagar = $resultado")
    }


}
