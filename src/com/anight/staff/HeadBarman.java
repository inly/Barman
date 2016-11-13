package com.anight.staff;

/**
 * Created by inly4 on 12/11/2016.
 */
public class HeadBarman extends AbstractStaff {

    public HeadBarman(String name){
        this.name = name;
        setLevels(name);
    }

    private void setLevels(String name){
        switch(name){
            case "Tim":
                this.skillLevel = 4;
                this.orederHandeling = 4;
                break;
            case "Dirmuid":
                this.skillLevel = 5;
                this.orederHandeling = 4;
                break;
            case "Steven":
                skillLevel = 1;
                this.orederHandeling = 1;
                break;
        }
    }
    private void listenToTony(){

    }
    private void doChange(){
        System.out.println(name + " doing change");
    }
    private void doTills(){
        System.out.println(name + " Doing tills");
    }
}
