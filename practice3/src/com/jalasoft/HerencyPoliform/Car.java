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
import com.jalasoft.HerencyPoliform.Land;

public class Car extends Land {

    boolean useGas;

    public  Car(String name, int price,boolean hasMotor, boolean useGas){
        super(name, price, hasMotor);
        this.useGas=useGas;
    }

    @Override
    public String displayData() {
        /*
         * this method displays if the car  use Gas ...return false or true
         * */
        return super.displayData()+", useGas= "+ useGas;
    }

}
