/*
 *
 *  Copyright (c) 2020 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not disclose such Confidential
 *  Information and shall use it only in accordance with the terms of the
 *  license agreement you entered into with Jalasoft.
 * /
 */

package com.jalasoft.practice;

import com.jalasoft.practice.stream.Detalle;
import com.jalasoft.practice.stream.Pedido;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

/**
 * @author Dxnis
 * @version 1.1
 */
public class Main {

    public static void main(String[] args) {
        //Detalle de los pedidos
        Detalle detalle1 = new Detalle("cod1", "cocina", 2,1000,10);
        Detalle detalle2 = new Detalle("cod2", "lavadora", 1,2500,0);
        Detalle detalle3 = new Detalle("cod3", "plancha", 5,300,50);
        Detalle detalle4 = new Detalle("cod4", "mesa", 2,700,30);
        Detalle detalle5 = new Detalle("cod5", "muebles", 1,3500,0);
        Detalle detalle6 = new Detalle("cod6", "comoda", 3,800,100);
        Detalle detalle7 = new Detalle("cod7", "camisa", 10,100,10);
        Detalle detalle8 = new Detalle("cod8", "polera", 20,80,0);
        Detalle detalle9 = new Detalle("cod9", "zapatos", 8,400,200);

        // ped1
        List<Detalle> detalleList1 = new ArrayList<>();
        detalleList1.add(detalle1);
        detalleList1.add(detalle2);
        detalleList1.add(detalle3);

        // ped2
        List<Detalle> detalleList2 = new ArrayList<>();
        detalleList2.add(detalle4);
        detalleList2.add(detalle5);
        detalleList2.add(detalle6);

        // ped3
        List<Detalle> detalleList3 = new ArrayList<>();
        detalleList2.add(detalle7);
        detalleList2.add(detalle8);
        detalleList2.add(detalle9);

        // Los pedidos realizados
        Pedido pedido1 = new Pedido("ped1", "normal", "Juan Perez", "2020-05-05", detalleList1);
        Pedido pedido2 = new Pedido("ped2", "programado", "Maria Guaman", "2020-05-03",detalleList2);
        Pedido pedido3 = new Pedido("ped3", "normal","Juan Perez","2020-05-10", detalleList3);

        //agregar en la lista de pedidos
        List<Pedido> pedidoList = new ArrayList<>();
        pedidoList.add(pedido1);
        pedidoList.add(pedido2);
        pedidoList.add(pedido3);


        //1. Select cliente from Pedido
        System.out.println("--- Muestra los Clientes que hicieron pedidos ---");
        pedidoList.stream()
                .map(pedido -> pedido.getCliente())
                .forEach(value -> System.out.println(value));

        //2. Select cliente from Pedido where tipoPedido = "normal"
        System.out.println("--- Mostrar los Clientes que tenga de pedido Normal ---");
        pedidoList.stream()
                .filter(pedido -> pedido.getTipoPedido()=="normal")
                .map(pedido -> pedido.getCliente())
                .forEach(value -> System.out.println(value));

        //3. Select codPedido from Pedido where fecha = "2020-05-05"
        System.out.println("--- Mostar los codigos con pedidos realizados el 2020-05-05 ---");
        pedidoList.stream()
                .filter(pedido -> pedido.getFecha().isEqual(LocalDate.parse("2020-05-05")))
                .map(pedido -> pedido.getCodPedido())
                .forEach(value -> System.out.println(value));

        //4.Select producto from Detalle, Pedido where Pedido.codPedido = Detalle.codPedido and Pedido.codPedido = “ped1"
        System.out.println("--- Mostrar los productos del pedido1 ---");
        pedidoList.stream()
                .filter(pedido -> pedido.getCodPedido()=="ped1")
                .map(pedido -> pedido.getDetalleList())
                .flatMap(detalle ->detalle.stream())
                .map(detalle -> detalle.getProducto())
                .forEach(value -> System.out.println(value));

        //5. Select Detalle.producto from Detalle, Pedido where Pedido.codPedido = Detalle.codPedido and Detalle.cantidad > 8
        System.out.println("--- Mostrar el detalle del producto se haya pedido mayores a 8 unidades ---");
        pedidoList.stream()
                .map(pedido -> pedido.getDetalleList())
                .flatMap(detalles -> detalles.stream())
                .filter(detalle -> detalle.getCantidad()>8)
                .map(detalle -> detalle.getProducto())
                .forEach(value ->System.out.println(value));
    }
}
