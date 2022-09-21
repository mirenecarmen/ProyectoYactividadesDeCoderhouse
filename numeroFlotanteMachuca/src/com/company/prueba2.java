package com.company;

public class prueba2 {
    public static void main(String[] args) {
        //éste es el intento n°2,quiero usar una operacion aritmetica para separar la parte entera del decimal
        float numA = 2.35f;
        System.out.printf("El numero original es:\n" + numA);
        //al float lo almaceno en una variable de tipo entero,me guarda la parte entera
        int ent = (int)numA;
        System.out.printf("\nLa parte entera es:\n" + ent);
        //al float lo almaceno en una variable de tipo double,me convierte el numero en decimal con mas cifras despues
        //de la coma
        double dec = (double) numA;
        //al nro convertido en decimal (double) le resto el entero
        double resul=(double) dec - ent;
        System.out.printf("\nLa parte decimal es:\n" + resul);







    }
}
