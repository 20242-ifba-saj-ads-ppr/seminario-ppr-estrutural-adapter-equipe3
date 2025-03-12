package adapter.adaptee.impl;

import adapter.adaptee.CalcBin;

public class AdicaoBin implements CalcBin {
    
    public Boolean calc(Boolean a, Boolean b){

        // Retorna o bit da primeira casa decimal

        if (a == b) 
        return false;

        return true;
    }
}
