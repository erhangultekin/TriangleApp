package com.erhangultekin.vize;

public class Ucgen {
    int kenar1;
    int kenar2;
    int kenar3;


    public Ucgen(int kenar1,int kenar2,int kenar3){
        this.kenar1=kenar1;
        this.kenar2=kenar2;
        this.kenar3=kenar3;
    }

    public boolean isValid(){
        if(kenar1 + kenar2 <= kenar3 ||
                kenar1 + kenar3 <= kenar2 ||
                kenar2 + kenar3 <= kenar1){
            return false;
        }
        else{
            return true;
        }

    }

    public int getKenar1() {
        return kenar1;
    }

    public void setKenar1(int kenar1) {
        this.kenar1 = kenar1;
    }

    public int getKenar2() {
        return kenar2;
    }

    public void setKenar2(int kenar2) {
        this.kenar2 = kenar2;
    }

    public int getKenar3() {
        return kenar3;
    }

    public void setKenar3(int kenar3) {
        this.kenar3 = kenar3;
    }
}
