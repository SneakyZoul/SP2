package com.company;

import java.util.ArrayList;

public class Garage
{   String garageName;
    ArrayList<Bil> biler = new ArrayList<>();

public Garage ( String garageName )
{
    this.garageName = garageName;
}

        public void tilføjbiler(Bil bil)
        {
            biler.add(bil);

        }
    public void calSumFee()
    {

            double res = 0;
            for (Bil a : biler)
            {
                res += a.grønAfgift();
            }

            System.out.println("Samlet grøn afgift for bilpark: "+res);
        }




    @Override
    public String toString() {
        return  garageName + " has" + " " + biler.size() + " " + "Cars" + biler ;
    }
}

