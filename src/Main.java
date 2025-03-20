import adapter.impl.FiguraTabela;

public class Main {
    
    public static void main(String[] args) {
        
        FiguraTabela figura = new FiguraTabela(3, 3);

        figura.desenhar(50, '-');

        figura.setCelulaTabela(0, 0, "0 x 0");
        figura.setCelulaTabela(1, 0, "1 x 0");
        figura.setCelulaTabela(2, 0, "2 x 0");

        figura.setCelulaTabela(0, 1, "0 x 1");
        figura.setCelulaTabela(1, 1, "1 x 1");
        figura.setCelulaTabela(2, 1, "2 x 1");

        figura.setCelulaTabela(0, 2, "0 x 2");
        figura.setCelulaTabela(1, 2, "1 x 2");
        figura.setCelulaTabela(2, 2, "2 x 2");

        figura.desenhar(50, '+');

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
