package Udemy_Java_Basico.Orientada_a_objetos;

import java.util.Scanner;

//Leccion sobre metodos con argumentos

//codigo que genera las tabla de multiplicar del 1 al 10 de un numero ingresado
//para terminar el programa se digita -1

public class proceso {

    //primer metodo sin argumnentos
    public void introducir(){

        //declaracion tipo scanner
        Scanner dato=new Scanner(System.in);
        int numero;

        //solicitud e ingreso de numero del que se genera tabla y opcion de terminacion
        do
        {
            System.out.print("introducir numero:");
            numero=dato.nextInt();
            if(numero!=-1)
            {
                producir(numero);//se invoca al segundo metodo enviandole un argumento
            }
        }
        while(numero!=-1);
        dato.close();
    }

    //metodo con argumentos que retorna la tabla
    public void producir(int n)
    {
        for(int x=n;x<=n*10;x=x+n)
        {
            System.out.print(x+"-");
        }
    }

    //metodo principal main
	public static void main(String[] args) {
		
		proceso tabla;        //creacion de objeto
	  	tabla=new proceso();  //creacion de objeto
	  	tabla.introducir();   //Invocar metodo del objeto
		 
	}
}
