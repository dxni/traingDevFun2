/*
 *
 *  * Copyright (c) 2020 Jalasoft.
 *  *
 *  * This software is the confidential and proprietary information of Jalasoft.
 *  * ("Confidential Information"). You shall not disclose such Confidential
 *  * Information and shall use it only in accordance with the terms of the
 *  * license agreement you entered into with Jalasoft.
 *
 */

package com.jalasoft.practices.loop;

import java.util.ArrayList;
import java.util.List;

public class Task {

    /*metodo que hicimos en clases*/
    public void practice() {
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(15);
        test.add(6);
        test.add(11);
        test.add(4);

        for (int index = 0; index < test.size(); index++) {
            System.out.println(test.get(index));
        }
        System.out.println("=-=-=-=-=-==-=-=-=-=-=-=-=-");
        test.stream().forEach(value -> System.out.println(value));
        System.out.println("=-=-=-=-=-==-=-=-=-=-=-=-=-");
        for (int index = 0; index < test.size(); index++) {
            if (test.get(index)<10){
                System.out.println(test.get(index));
            }
        }
        System.out.println("=-=-=-=-=-==-=-=-=-=-=-=-=-");
        test.stream()
                .filter(value -> value < 10)
                .filter(value ->value%2 ==0)
                .forEach(value -> System.out.println(value));

        System.out.println("=-=-=-=-=-==-=-=-=-=-=-=-=-");
    }
    /*Metodo para buscar las cadenas de la lista que empiezan con A*/
    public void onlyA(){
        List<String> test = new ArrayList<>();
        test.add("Bolivia");
        test.add("Argentina");
        test.add("Argelia");
        test.add("Portugal");
        test.add("Australia");

        System.out.println("La lista es la siguiente: ");
        test.stream().forEach(value -> System.out.println(value));
        System.out.println("--------------------------------");
        System.out.println("Las cadenas que empiezan con A son: ");
        test.stream()
                .filter(value ->value.startsWith("A"))
                .forEach(value ->System.out.println(value));
        System.out.println("--------------------------------");
        }

     /*Metodo que muestras las cadenas de la lista que contengan mas de 5 caracteres*/
     public void moreThanfivecharacters(){
         List<String> test = new ArrayList<>();
         test.add("Bolivia");
         test.add("Argentina");
         test.add("Argelia");
         test.add("Portugal");
         test.add("Australia");
         test.add("Gato");
         test.add("Cinco");
         test.stream().forEach(value -> System.out.println(value));
         System.out.println("La lista es la siguiente:");
         System.out.println("--------------------------------");

        /*  usando un For
        for (int index = 0; index < test.size(); index++) {
             if(test.get(index).length()>5){
                 System.out.println(test.get(index));
             }
         }
         */
         System.out.println("Las cadenas mayores de 5 caracteres son:");
         test.stream()
                 .filter(value->value.length()>5)
                 .forEach(value ->System.out.println(value));
         System.out.println("--------------------------------");

     }

     /*Metodo para mostrar las cadenas de las listas que la suma de sus caracteres sea par*/
     public void sumaCaracteresPar(){
         List<String> test = new ArrayList<>();
         test.add("Bolivia");
         test.add("Argentina");
         test.add("Argelia");
         test.add("Portugal");
         test.add("Australia");
         test.add("Gato");
         test.add("Cinco");
         System.out.println("La lista es la siguiente:");
         System.out.println("--------------------------------");

        /* usando un for para la suma
         for (int index = 0; index < test.size(); index++) {
             int Sum = 0;
             Sum = test.get(index).length();
             if (Sum % 2 == 0) {
                 System.out.println("La cadema es: "+test.get(index)+" la suma es par:" + Sum);
             }
         }
         */
         test.stream()
                 .filter(value->value.length()%2==0)
                 .forEach(value ->System.out.println("La cadena es: "+value+"la suma de sus caracteres es par = "+value.length()));
         System.out.println("--------------------------------");


     }

    // @ToDo debo crear un metodo para llenar el Arraylist desde consola


}
