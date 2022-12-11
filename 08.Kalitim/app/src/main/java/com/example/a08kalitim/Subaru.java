package com.example.a08kalitim;

public class Subaru extends Araba{
    private String motorHacmi;

    public Subaru(){
        super();
        System.out.println("Subaru Boş Constructor'ı Çalıştı");
    }

    public Subaru(String motorHacmi) {
        super("Sedan");
        this.motorHacmi = motorHacmi;
        System.out.println("Subaru Dolu Constructor'ı Çalıştı");
    }

    public String getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(String motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

}
