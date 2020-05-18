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

package com.jalasoft.HerencyPoliform;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.List;
import com.jalasoft.HerencyPoliform.Land;

public class LisLandTransport {

    List<Land> land = new ArrayList<>();

    public void addLand(Land land){
        /*
        * Read the transport info and add in the land list
        * */
        this.land.add(land);

    }

    public void display(){
        /*
        * this method display the land list in console
        * */
        land.stream().forEach(value -> System.out.println(value.displayData()));

    }



}
