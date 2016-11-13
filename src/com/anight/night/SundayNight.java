package com.anight.night;

import com.anight.staff.AbstractStaff;
import com.anight.staff.Barman;
import com.anight.staff.HeadBarman;

import java.util.ArrayList;

/**
 * Created by inly4 on 13/11/2016.
 */
public class SundayNight extends Night{
    @Override
    public ArrayList<AbstractStaff> setStaff() {
        HeadBarman tim = new HeadBarman("Tim");
        staff.add(tim);
        AbstractStaff dirmuid = new Barman("Dirmuid");
        staff.add(dirmuid);
        AbstractStaff owen = new Barman("Owen");
        staff.add(dirmuid);

        return staff;
    }
}
