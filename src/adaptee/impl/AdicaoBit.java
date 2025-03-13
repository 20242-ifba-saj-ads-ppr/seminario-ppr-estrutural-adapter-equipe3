package adaptee.impl;

import adaptee.CalcBit;

public class AdicaoBit implements CalcBit {
    
    public Boolean calc(Boolean a, Boolean b){

        // Retorna o bit da primeira casa decimal

        if (a == b) 
        return false;

        return true;
    }
}
