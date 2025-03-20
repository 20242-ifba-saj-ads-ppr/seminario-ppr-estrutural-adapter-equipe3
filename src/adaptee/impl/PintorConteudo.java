package adaptee.impl;

import adaptee.Pintor;

public class PintorConteudo implements Pintor {
    
    private char tinta;
    private int margem;
    private String conteudo;

    public PintorConteudo(char tinta, int margem, String conteudo) {
        this.tinta = tinta;
        setMargem(margem);
        setConteudo(conteudo);
    }

    public String pintar(int tamanho){
        
        String linha = new String();

        int tamanhoReal = tamanho - conteudo.length();
        int inicio = margem / 2;
        int fim = tamanhoReal - (margem / 2);
        
        int meio = (tamanho / 2) - (conteudo.length() / 2);

        for(int n = 0; n <= tamanhoReal; n++){

            if(n < inicio || n > fim) {
            linha += this.tinta;
            } else if ( n == meio) {
                linha += conteudo + " ";
            } 
            else {
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

    public void setConteudo(String conteudo){
        if(conteudo.length() % 2 == 1) 
            this.conteudo = conteudo + " ";
        
        this.conteudo = conteudo;
    }
}