package resolucao;

import java.awt.Toolkit;

public class Resolucao {

    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int largura = toolkit.getScreenSize().width;
        int altua = toolkit.getScreenSize().height;
        System.out.println("A resolução da sua tela é "+largura+" x "+altua);

    }
    
}
