package Estudio_Autonomo.Ambitos;

//Los parámetros de un método o constructor son accesibles solo dentro del método o constructor donde se declaran.
//Estos parámetros actúan como variables locales al método o constructor.

public class Parameter_Scope {
    void metodoConParametros(int parametro) {
        // parametro es accesible dentro de este método
        System.out.println("Parámetro: " + parametro);
    }

}