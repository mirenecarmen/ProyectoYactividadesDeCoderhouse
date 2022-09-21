package com.company;

public class Main {

    public static void main(String[] args) {
        //busque un ejercicio similar a internet,éste convierte el float en string
        float num1 = 2.35f;
        //muestro el valor del dato de tipo float
        System.out.println("valor inicial:"+num1);
       String parteEnt = String.valueOf(num1);
       String[] floats = parteEnt.split("\\.");
        System.out.println("valor parte entera:"+floats[0]);
        System.out.println("valor parte decimal:"+floats[1]);

        //float parteDec = num1 - int (num1);

        //System.out.println("parte entera: "+parteEnt);
       // System.out.println("parte entera: "+parteDec);

	// write your code here
    }
}
