package com.anight.staff;

import com.anight.Observer;

import java.util.ArrayList;

/**
 * Created by inly4 on 12/11/2016.
 */
public class Barman extends AbstractStaff  {
    private ArrayList<Observer> Observers;
    public  Barman(String name){
        this.name = name;

    }

    public int getState(){

        return 0;
    }

    public void setState(){

    }

    public void attach(){

    }

    public void notifyAllObservers(){

    }

}
