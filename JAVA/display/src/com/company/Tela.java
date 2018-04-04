package com.company;

public class Tela {
    //zera os valores
    public Tela(){
       resp = 0;
       a = 0;
       b = 0;
       c = 0;
       d = 0;
    }
    //descobre o valor decimal de um numero Binario
    public void resp(){
        double aa,bb,cc,dd;
        aa = a * (Math.pow(2,3));
        bb = b * (Math.pow(2,2));
        cc = c * (Math.pow(2,1));
        dd = d * (Math.pow(2,0));
        resp = aa+bb+cc+dd;
    }
    //retorna o valor da resposta
    public double getResp(){
        return resp;
    }
    //transforma os boleanos em double;
    public void setTudo(int aa,int bb, int cc, int dd){
        if (aa == 1){
            a = 1;
        }
        if(bb == 1){
            b = 1;
        }
        if(cc == 1){
            c = 1;
        }
        if (dd == 1){
            d = 1;
        }
    }

    private double resp;
    private double a;
    private double b;
    private double c;
    private double d;
}
