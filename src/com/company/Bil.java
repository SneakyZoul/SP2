package com.company;

public abstract class Bil
{
     int regNr = 0;
     String mærke = "";
     String model = "";
     int årgang = 0 ;
     int antaldøre = 0;



    public Bil (int regNr, String mærke, String model, int årgang, int antalDøre)
    {
        this.regNr = regNr;
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antaldøre = antalDøre;
    }

    public abstract double grønAfgift();
}
