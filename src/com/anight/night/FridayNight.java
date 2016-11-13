package com.anight.night;

import com.anight.staff.AbstractStaff;
import com.anight.staff.HeadBarman;

import java.util.ArrayList;

/**
 * Created by inly4 on 13/11/2016.
 */
public class FridayNight extends Night{

    public FridayNight(){


    }

    public ArrayList<AbstractStaff> setStaff(){
        headBarman = new HeadBarman("Stevan");
        staff.add(headBarman);

        return staff;
    }

}
