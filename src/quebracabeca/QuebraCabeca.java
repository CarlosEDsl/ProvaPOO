package quebracabeca;

import quebracabeca.model.Lado;
import quebracabeca.model.Peca;
import quebracabeca.model.PecaMeio;
import quebracabeca.model.Tabuleiro;

public class QuebraCabeca {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();

        Peca[] pecas = new PecaMeio[9];

        // Inicialização das peças com seus respectivos lados
        Lado[] lados1 = { new Lado(1, 0), new Lado(0, 1), new Lado(1, 0), new Lado(0, 1) };
        Lado[] lados2 = { new Lado(0, 1), new Lado(1, 0), new Lado(1, 1), new Lado(0, 1) };
        Lado[] lados3 = { new Lado(1, 0), new Lado(0, 1), new Lado(1, 0), new Lado(0, 1) };
        Lado[] lados4 = { new Lado(0, 1), new Lado(0, 1), new Lado(1, 1), new Lado(1, 1) };
        Lado[] lados5 = { new Lado(1, 1), new Lado(1, 0), new Lado(1, 0), new Lado(0, 1) };
        Lado[] lados6 = { new Lado(1, 0), new Lado(1, 0), new Lado(1, 1), new Lado(0, 1) };
        Lado[] lados7 = { new Lado(1, 1), new Lado(0, 1), new Lado(0, 1), new Lado(1, 0) };
        Lado[] lados8 = { new Lado(0, 1), new Lado(1, 0), new Lado(1, 0), new Lado(1, 0) };
        Lado[] lados9 = { new Lado(1, 0), new Lado(1, 0), new Lado(0, 1), new Lado(1, 1) };

        pecas[0] = new PecaMeio(lados1);
        pecas[1] = new PecaMeio(lados2);
        pecas[2] = new PecaMeio(lados3);
        pecas[3] = new PecaMeio(lados4);
        pecas[4] = new PecaMeio(lados5);
        pecas[5] = new PecaMeio(lados6);
        pecas[6] = new PecaMeio(lados7);
        pecas[7] = new PecaMeio(lados8);
        pecas[8] = new PecaMeio(lados9);

        // Tentar colocar cada peça em cada posição do tabuleiro 3x3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int p = 0; p < pecas.length; p++) {
                    if(pecas[p] != null) {
                        System.out.println("Tentando colocar peca " + (p + 1) + " na posicao (" + i + ", " + j + ")");
                    
                        boolean sucesso = tabuleiro.colocarPeca(i, j, pecas[p]);

                        if (!sucesso) {
                            System.out.println("Falha ao colocar peca " + (p + 1) + " na posicao (" + i + ", " + j + ")");
                        } else {
                            System.out.println("Peca " + (p + 1) + " colocada com sucesso na posicao (" + i + ", " + j + ")");
                            pecas[p] = null;
                            break;
                        }
                    }
                    
                }
            }
        }
    }
}
