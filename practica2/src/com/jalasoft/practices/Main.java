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

package com.jalasoft.practices;
import com.jalasoft.practices.loop.Task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        boolean salir = false;
        int option;
        Task task = new Task ();
        /*Menu para manipular la Lista*/
        while (!salir) {
            System.out.println("1. Filtrar solo los que empiecen con la letra A.");
            System.out.println("2. Filtrar solo los que tengan mayor de 5 caracteres.");
            System.out.println("3. Filtrar solo los que la suma de sus caracteres sea par.");
            System.out.println("4. Salir!");

            try {
                System.out.println("Escriba una de las opciones: ");
                option = sn.nextInt();
                switch (option) {
                    case 1:
                        task.onlyA();
                        break;
                    case 2:
                        task.moreThanfivecharacters();
                        break;
                    case 3:
                        task.sumaCaracteresPar();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("*-*-** Solo numeros entre el 1 y 4 **-*-*");
                }

            } catch (InputMismatchException e) {
                System.out.println("*-*-** Debes insertar un numero **-*-*");
                sn.next();
            }
        }
    }
}
