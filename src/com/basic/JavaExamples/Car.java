package com.basic.JavaExamples;

import java.awt.*;

public class Car {
    // Data Types
    // int --> Integer 1, 2, 3
    // double --> Decimal 34.5, 32.1
    // String --> "Sriram" or "Hello World"
    // Color --> from awt library
    // boolean --> true or false

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailLightsWorking;

    public Car(double inputAvgMPG, String inputLicensePlate, Color inputPaintColor, boolean inputAreTailLightsWorking){
        this.averageMilesPerGallon = inputAvgMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailLightsWorking = inputAreTailLightsWorking;
    }

    public double speedingUp(double currentSpeed){
        currentSpeed += 100;
        return currentSpeed;
    }
}
