package adapter.impl;

import java.util.ArrayList;
import java.util.List;

import adaptee.Pintor;
import adaptee.impl.PintorConteudo;
import adaptee.impl.PintorLinha;
import adaptee.impl.PintorMargem;
import adapter.Figura;

public class FiguraTabela implements Figura {
    
    private List<List<String>> tabela;
    private Pintor pintor;

    private int linhas;
    private int colunas;

    public FiguraTabela(int linhas, int colunas) {
        this.tabela = new ArrayList<>();
        this.linhas = linhas;
        this.colunas = colunas;

        List<String> linha;

        for (int i = 0; i < linhas; i++) {
            linha = new ArrayList<>();
            for (int j = 0; j < colunas; j++) {
                linha.add("null");
            }
            this.tabela.add(linha);
        }

    }
    
    public void desenhar(int tamanho, char pincel) {

        pintor = new PintorLinha(pincel);
        String linha = pintor.pintar(tamanho);
        
        pintor = new PintorMargem(pincel, 2);
        String celulas = pintor.pintar((tamanho - 2)/colunas).repeat(colunas);

        System.out.println(linha);

        for(int i = 0; i < linhas; i++){
            System.out.println(celulas);
            for(int j = 0; j < colunas; j++){

                pintor = new PintorConteudo(pincel, 2, this.tabela.get(i).get(j));
                String conteudo = pintor.pintar((tamanho - 2) / colunas);
                System.out.print(conteudo);
            }
            System.out.print("\n");
            System.out.println(celulas);
            System.out.println(linha);
        }
    }

    public void setCelulaTabela(int linha, int coluna, String conteudo){
        tabela.get(linha).set(coluna, conteudo);
    }
}
