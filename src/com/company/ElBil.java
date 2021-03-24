package com.company;

public class ElBil extends Bil {
    int whPrKm = 0;
    private int batterikapacitetKWh = 0;
    private int maxKm = 0;

    public ElBil( int regNr, String mærke, String model, int årgang, int antalDøre,int batterikapacitetKWh, int maxKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
    }
    @Override
    public double grønAfgift()
    {
        double temp = 100 / (whPrKm / 91.25);
        if (temp < 5) {
            return 10470;

        } else if (5 <= temp && temp < 10) {
            return 5500;

        } else if (10 <=temp && temp < 15) {
            return 2340;

        } else if (15 <= temp && temp < 20) {
            return 1050;

        } else if (20 <= temp && temp < 50) {
            return 330;

        } else {

            return 0;
        }
    }

    @Override
    public String toString() {
        return '\n' + "-----------------------" +'\n' +
                "ElBil" + '\n' +
                "regNr:" + regNr +'\n' +
                "mærke:" + mærke + '\n' +
                "model:" + model + '\n' +
                "årgang:" + årgang +'\n' +
                "antaldøre:" + antaldøre + '\n' +
                "whPrKm:" + whPrKm + '\n' +
                "batterikapacitetKWh:" + batterikapacitetKWh + '\n' +
                "maxKm:" + maxKm ;
    }
}
