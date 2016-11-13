package com.anight.staff;

/**
 * Created by inly4 on 13/11/2016.
 */
public class Worker extends AbstractWorkerObserver {

    public Worker(String name){
        this.name = name;
        setLevels(name);
    }

    private void setLevels(String name){
        switch (name){
            case "James":
                break;
            case "Seth":
                break;
            case "Pug":
                break;

        }

    }

    @Override
    public void update() {

    }
}
