package adaptee.impl;

import adaptee.Pintor;

public class PintorMargem implements Pintor {
    
    private char tinta;
    private int margem;

    public PintorMargem(char tinta, int margem) {
        this.tinta = tinta;
        setMargem(margem);
    }

    public String pintar(int tamanho){
        
        String linha = new String();

        int inicio = margem / 2;
        int fim = tamanho - (margem / 2);

        for(int n = 0; n <= tamanho; n++){

            if(n < inicio || n > fim) {
            linha += this.tinta;
            } else {
                linha += " ";
            }
        }

        return linha;
    }

    public void setTinta(char tinta){
        this.tinta = tinta;
    }

    public void setMargem(int margem){
        if(margem % 2 == 1) 
            this.margem = margem + 1;
        
        this.margem = margem;
    }
}
