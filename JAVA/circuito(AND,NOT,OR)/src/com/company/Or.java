package com.company;

public class Or extends Converte{
    public int ou(int A, int B) {
        Boolean aa, bb;
        aa = super.paraBol(A);
        bb = super.paraBol(B);

        if ((aa == false) && (bb == false)) {

        } else {
            aa = true;
        }
        return super.paraInt(aa);
    }
}
