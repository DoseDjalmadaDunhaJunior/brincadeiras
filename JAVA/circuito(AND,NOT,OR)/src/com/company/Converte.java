package com.company;

public class Converte {
    public Boolean paraBol(int n){
        Boolean resp;
        if(n == 1){
            resp = true;
        }
        else{
            resp = false;
        }
        return resp;
    }

    public int paraInt(Boolean n){
        int resp;
        if(n == true){
            resp = 1;
        }
        else{
            resp = 0;
        }
        return resp;
    }
}
