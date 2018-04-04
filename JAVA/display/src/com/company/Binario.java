package com.company;

public class Binario {
    //zera os valores boleanos
    public Binario(){
        a = 0;
        b = d = c = a;

    }
    //numero possivel 0 <= x <= 15
    public void conta(double n) {
        if (n < 0 || n > 15) {
            System.out.println("valor inserido nao é possivel de ser visualizado");
        } else {
            if (n >= 0.5 && n < 1) {
                c = 1;
            } else {
                double naux;
                int p = 4;
                int vet[] = new int[p];
                while (n >= 1) {
                    p--;
                    n = (n / 2);
                    naux = n - inteiro(n);
                    if (naux >= 0.5) {
                        vet[p] = 1;
                    }
                    else{
                        vet[p] = 0;
                    }
                }
                d = vet[3];
                c = vet[2];
                b = vet[1];
                a = vet[0];
            }
        }
    }

    //descobre qual é a parte inteira de um numero double
    public double inteiro(double n) {
        //se respeitada a regra do valor ser maior que zero e no maximo 15
        // sera impossivel a parte inteira ser maior que 8
        int gg = 8;
        int pp = 7;
        int ok = 0;
        while (ok == 0) {
            if((gg >= n) && (pp <= n)){
                ok = 1;
            }
            else{
                gg--;
                pp--;
            }
        }
        return pp;
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public int getC(){
        return c;
    }

    public int getD(){
        return d;
    }

    private int a;
    private int b;
    private int c;
    private int d;
}
