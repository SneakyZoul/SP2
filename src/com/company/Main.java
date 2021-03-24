package com.company;

public class Main {

    public static void main(String[] args) {
    Bil bil1 = new DiselBil(23342,"BMW","X2",2002,5,10,true);
    Bil bil2 = new ElBil(34254,"Suzuki","Swift",2019,3,15,15);
    Bil bil3 = new BenzinBil(25523,"Farrai","Spider",2012,3,10,5);
    Garage garage = new Garage("Bivers Garage");

    garage.tilføjbiler(bil1);
    garage.tilføjbiler(bil2);
    garage.tilføjbiler(bil3);
    System.out.println(garage);
garage.calSumFee();

    }

    }


