package com.anight;

import com.anight.night.Night;
import com.anight.staff.AbstractStaff;

import java.util.ArrayList;

/**
 * Created by inly4 on 12/11/2016.
 */
public class Bar {
    private int state;
    private ArrayList<AbstractStaff> staff;
    private Night night;

    private void addStaff(AbstractStaff staffMember){
        staff.add(staffMember);
    }

    public void setState(int state){
        this.state = state;
    }
    public int getState(){
        return this.state;
    }
public void setNight(String snight)
{
    //this.night = nightFactory(snight);
    this.staff = night.setStaff();
}
}
