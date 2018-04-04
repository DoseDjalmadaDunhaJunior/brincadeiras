package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int op;
	System.out.println("insira a opcao desejada\n" +
            "1 - transformar Binario em decimal\n" +
            "2 - transformar decimal em Binario");
        Scanner uva = new Scanner(System.in);
        op = uva.nextInt();
        if(op == 1){
            int a,b,c,d;
            //Binario em decimal

            Tela sbt = new Tela();
            System.out.println("insira o valor Binario(4 digitos)");
            a = uva.nextInt();
            b = uva.nextInt();
            c = uva.nextInt();
            d = uva.nextInt();
            sbt.setTudo(a,b,c,d);
            sbt.resp();
            System.out.println("o valor em decimal é: " + sbt.getResp());
        }
        else{
            //decimal em Binario
            System.out.println("insira um valor em decimal(maior ou igual a zero e menor ou igual a 15)");
            double aux;
            aux = uva.nextDouble();
            //aux = 7;
            Binario dez = new Binario();
            dez.conta(aux);
            System.out.println("em binario fica: " + dez.getA() + dez.getB() + dez.getC() + dez.getD());
        }
    }
}
