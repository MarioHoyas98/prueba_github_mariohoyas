package com.mariohoyas.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variablesYconstantes()

        tiposDeDatos()
    }

    private fun tiposDeDatos() {
        //String
        val myString = "Hola manin"
        val myString2 = "queso"
        val myString3 = "ricon"
        val myString4 = myString+" "+myString2+" "+myString3
        //int
        val myInt = 1
    }

    /*
        Aquí vamos a hablar de constantes y variables
     */
    private fun variablesYconstantes(){
        //Variables
        var myFirstVariable = "Hola manin"

        println(myFirstVariable)

        myFirstVariable = "Binvenido loco"

        println(myFirstVariable)

        //Constantes


    }




}