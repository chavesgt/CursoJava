/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testestipos;

/**
 *
 * @author Gabriel
 */
public class TestesTipos {

    public static void main(String[] args) {
        /*int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor); */
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.printf("%.3f", idade);
    }
}
