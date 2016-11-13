package com.anight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public Main(String [] args)throws IOException{
        //TODO
        //pritn options
        System.out.println("Enter the number for the type of night");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String night = br.readLine();
        Bar bar = new Bar();
        bar.setNight(night);
    }
    public static void main(String[] args) {
	// write your code here
    }
}
