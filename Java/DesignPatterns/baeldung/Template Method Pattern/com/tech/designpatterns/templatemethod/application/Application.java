package com.tech.designpatterns.templatemethod.application;

import com.tech.designpatterns.templatemethod.model.Computer;
import com.tech.designpatterns.templatemethod.model.ComputerBuilder;
import com.tech.designpatterns.templatemethod.model.HighEndComputerBuilder;
import com.tech.designpatterns.templatemethod.model.StandardComputerBuilder;

public class Application {
    
    public static void main(String[] args) {
        ComputerBuilder standardComputerBuilder = new StandardComputerBuilder();
        Computer standardComputer = standardComputerBuilder.buildComputer();
        standardComputer.getComputerParts().forEach((k, v) -> System.out.println("Part : " + k + " Value : " + v));
        
        ComputerBuilder highEndComputerBuilder = new HighEndComputerBuilder();
        Computer highEndComputer = highEndComputerBuilder.buildComputer();
        highEndComputer.getComputerParts().forEach((k, v) -> System.out.println("Part : " + k + " Value : " + v));
    }
}