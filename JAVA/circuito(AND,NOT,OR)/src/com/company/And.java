package com.company;

public class And extends Converte {
    public int ee(int A, int B) {
        Boolean aa, bb;
        aa = super.paraBol(A);
        bb = super.paraBol(B);

        if ((aa == true) && (bb == true)) {

        } else {
            aa = false;
        }
        return super.paraInt(aa);
    }
}
