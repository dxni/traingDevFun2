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

package com.jalasoft;
import com.jalasoft.HerencyPoliform.Bicycle;
import com.jalasoft.HerencyPoliform.Car;
import com.jalasoft.HerencyPoliform.LisLandTransport;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Practice 3");
        LisLandTransport trans = new LisLandTransport();
        trans.addLand(new Bicycle("Cross",1500,false,false));
        trans.addLand( new Car("Audi", 20000, true,false));
        trans.display();
    }
}
