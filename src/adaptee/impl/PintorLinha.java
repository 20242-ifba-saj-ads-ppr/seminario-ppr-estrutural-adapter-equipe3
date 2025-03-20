package adaptee.impl;

import adaptee.Pintor;

public class PintorLinha implements Pintor {
    
    private char tinta;

    public PintorLinha(char tinta) {
        this.tinta = tinta;
    }

    public String pintar(int tamanho){
        
        String linha = new String();

        for(int n = 0; n <= tamanho; n++){
            linha += this.tinta;
        }

        return linha;
    }

    public void setTinta(char tinta){
        this.tinta = tinta;
    }
}
