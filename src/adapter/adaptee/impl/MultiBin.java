package adapter.adaptee.impl;

public class MultiBin {
    
    public Boolean calc(Boolean a, Boolean b){

        // Retorna o bit da primeira casa decimal

        if (a == b && a == true)
        return true;

        if ( a == b && a == false)
        return false;
        
        return false;
    }
}
