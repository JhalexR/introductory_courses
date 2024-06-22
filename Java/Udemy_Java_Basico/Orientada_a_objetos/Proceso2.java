package Udemy_Java_Basico.Orientada_a_objetos;

import java.util.Scanner;

//Leccion sobre metodos con argumentos que devuelven un valor

//codigo recibe tres numeros del usuario y muestra como resultado 
//en pantalla muestra cual es el numero mayor y el numero menor de los tres

public class Proceso2 {

    //metodo llamado desde el main no tiene argumentos y no retorna datos
    public void introducirPorTeclado(){

        //Solicitar y guardar los tres numeros en la variables para enviarlos a los metodos
        //que usan argumentos y retornan valores
        Scanner num=new Scanner(System.in);

        System.out.print("introduce valor:");
        int numero1=num.nextInt();
        
        System.out.print("introduce valor:");
        int numero2=num.nextInt();
        
        System.out.print("introduce valor:");
		int numero3=num.nextInt();

        //declaracion de variables donde se almacenará el retorno de los metodos.
        int superior, inferior;
        
        //se invoca al metodo que devuelve el numero superior entre los 3
        superior=algoritmoSuperior(numero1,numero2,numero3);

        //se invoca al metodo que devuelve el numero inferior entre los 3
        inferior=algoritmoInferior(numero1,numero2,numero3);

        //muestra de los resultados por pantalla
        System.out.println("el numero mayor es:"+superior);
        System.out.println("el numero memor es:"+inferior);

        num.close();

    }

    //primer metodo que tiene los tres numeros ingresados y retorna el numero superior
    public int algoritmoSuperior(int num1, int num2, int num3){
		int sup;
		if(num1 > num2 && num1 >num3){		
			sup=num1;
		}else{
			if(num2 > num3)	{
				sup=num2;
			
			}else{
				sup=num3;
			}
		}
		return sup;
	}

    //segundo metodo que tiene los tres numeros ingresados y retorna el numero inferior
    public int algoritmoInferior(int num1, int num2, int num3){
		int sup;
		if(num1 < num2 && num1 < num3){
			sup=num1;
		}else{
			if(num2 < num3){
				sup=num2;
			}else{
				sup=num3;
			}
		}
		return sup;
	}


    //funcion principal main
    public static void main(String[] ar)
	{
		Proceso2 resultado = new Proceso2(); //creacion de objeto
		resultado.introducirPorTeclado();    //invocacion metodo del objeto
	}

}
