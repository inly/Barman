package com.anight.night;

import com.anight.staff.AbstractStaff;
import com.anight.staff.HeadBarman;

import java.util.ArrayList;

/**
 * Created by inly4 on 13/11/2016.
 */
public abstract class Night {

    protected HeadBarman headBarman;
    int currentPhase;
    ArrayList<AbstractStaff> staff;

    public abstract ArrayList<AbstractStaff> setStaff();


}
