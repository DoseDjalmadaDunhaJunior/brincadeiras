package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int op;
        Scanner but = new Scanner(System.in);
        System.out.println("deseja inserir qual(is) qual operação o(s) valor(es)\n" +
                "1 - AND\n" +
                "2 - NOT\n" +
                "3 - OR");
        op = but.nextInt();
        int n1;
        if (op == 2) {

            n1 = but.nextInt();
            Not coisa = new Not();
            Not obj = new Not();
            System.out.println("Resposta é: " + coisa.nao(n1));
        } else if (op == 1) {

            int n2;
            n1 = but.nextInt();
            n2 = but.nextInt();
            And coisa = new And();
            System.out.println("Resposta é: " + coisa.ee(n1, n2));
        } else {

            int n2;
            n1 = but.nextInt();
            n2 = but.nextInt();
            Or coisa = new Or();
            System.out.println("Resposta é: " + coisa.ou(n1, n2));
        }
    }
}