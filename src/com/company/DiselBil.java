package com.company;

public class DiselBil extends Bil
{
    private boolean harPartikelFilter = true;
     int kmPrL = 0;

    public DiselBil(int regNr,String mærke,String model, int årgang,int antalDøre,int kmPrL,boolean harPartikelFilter)
    {
        super( regNr,mærke, model, årgang,  antalDøre);
       this.harPartikelFilter = harPartikelFilter;
       this.kmPrL = kmPrL;

    }
    @Override
    public double grønAfgift()
    {
        if (this.kmPrL < 5)
        {
            return 10470+15260+harPartikelFilter();

        } else if (5 <= this.kmPrL && this.kmPrL < 10)
        {
            return 5500+2770+harPartikelFilter();

        } else if (10 <= this.kmPrL && this.kmPrL < 15)
        {
            return 2340+1850+harPartikelFilter();

        } else if (15 <= this.kmPrL && this.kmPrL < 20)
        {
            return 1050+1390+harPartikelFilter();

        } else if (20 <= this.kmPrL && this.kmPrL < 50)

        {
            return 330+130+harPartikelFilter();

        } else {

            return -1;
        }
    }
    public int harPartikelFilter()
    {
        if(!harPartikelFilter)
        {
            return 1000;
        }
        else return 0;
    }

    @Override
    public String toString() {
        return '\n' + "-----------------------" +'\n' +
                '\n'+"DiselBil" +'\n' +
                "regNr" + regNr + '\n'+
                "mærke:" + mærke + '\n'+
                "model:" + model + '\n'+
                "årgang:" + årgang +'\n'+
                "antaldøre:" + antaldøre + '\n'+
                "harPartikelFilter:" + harPartikelFilter + '\n' +
                "kmPrL:" + kmPrL;
    }
}
