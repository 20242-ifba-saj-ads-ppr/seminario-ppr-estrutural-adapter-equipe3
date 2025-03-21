import adapter.impl.FiguraTabela;

public class AppGerarFiguras {
    
    public static void main(String[] args) {
        
        FiguraTabela figura = new FiguraTabela(3, 3);

        figura.desenhar(41, '-');

        figura.setCelulaTabela(0, 0, "um");
        figura.setCelulaTabela(1, 0, "dois");
        figura.setCelulaTabela(2, 0, "três");

        figura.setCelulaTabela(0, 1, "quatro");
        figura.setCelulaTabela(1, 1, "cinco");
        figura.setCelulaTabela(2, 1, "seis");

        figura.setCelulaTabela(0, 2, "sete");
        figura.setCelulaTabela(1, 2, "oito");
        figura.setCelulaTabela(2, 2, "nove");

        figura.desenhar(77, '+');

        /* Pintor pintor;
        
        pintor = new PintorLinha('#');
        String linha = pintor.pintar(50);

        pintor = new PintorMargem('#', 8);
        String margem = pintor.pintar(50);

        pintor = new PintorConteudo('#', 8, "C A B E Ç A L H O");
        String titulo = pintor.pintar(50);

        System.out.println(linha);
        System.out.println(margem);
        System.out.println(titulo);
        System.out.println(margem);
        System.out.println(linha); */
        
    }
}
