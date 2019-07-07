package com.example.proyectocalculadora;

public class OperacionesMatematicas {

    private double num1;
    private double num2;


    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    //metodos customize

    public double Sumar(){
        return this.num1 + this.num2;
    }

    public double Restar(){
        return this.num1 - this.num2;
    }

    public double Multiplicar(){
        return this.num1 * this.num2;
    }

    public double Dividir(){
        return this.num1 / this.num2;
    }




}
