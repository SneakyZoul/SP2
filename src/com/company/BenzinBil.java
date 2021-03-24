package com.company;

public class BenzinBil extends Bil
{
    private int oktantal = 0;
    private int kmPrl = 0;

    public BenzinBil( int regNr, String mærke, String model, int årgang, int antalDøre,int oktantal, int kmPrlint) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrl = kmPrl;
    }

    @Override
    public double grønAfgift() {
        if (this.kmPrl < 5)
        {
            return 10470;

        } else if (5 <= this.kmPrl && this.kmPrl < 10)
        {
            return 5500;

        } else if (10 <= this.kmPrl && this.kmPrl < 15)
        {
            return 2340;

        } else if (15 <= this.kmPrl && this.kmPrl < 20)
        {
            return 1050;

        } else if (20 <= this.kmPrl && this.kmPrl < 50)

        {
            return 330;

        } else {

            return -1;
        }
    }

    @Override
    public String toString() {
        return '\n' + "-----------------------" +'\n' +
                "BenzinBil" + '\n' +
                "oktantal:" + oktantal + '\n' +
                "kmPrl:" + kmPrl + '\n' +
                "regNr:" + regNr + '\n' +
                "mærke:" + mærke + '\n' +
                "model:" + model + '\n'+
                "årgang:" + årgang + '\n' +
                "antaldøre:" + antaldøre;
    }
}