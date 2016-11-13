package com.anight.staff;

/**
 * Created by inly4 on 13/11/2016.
 */
public class GlassCollector extends AbstractWorkerObserver {
    private int counterFrequencey;
    public GlassCollector(String name){
        this.name = name;
        setLevels(name);
    }

    private void setLevels(String name){
        switch(name){
            case "":
                skillLevel = 1;
                counterFrequencey = 2;
        }
    }

    @Override
    public void update() {

    }
}
