package com.company;

public class Not extends Converte{
    public int nao(int op){
        Boolean aux = super.paraBol(op);
        if(aux == true){
            aux = false;
        }
        else{
            aux = true;
        }
        int resp = super.paraInt(aux);
        return resp;
    }
}
