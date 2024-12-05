package quebracabeca.model; 

  

public class Tabuleiro { 

  

    private Peca[][] tabuleiro; 

  

    public Tabuleiro() { 

        tabuleiro = new Peca[3][3]; // Matriz 3x3 para representar o tabuleiro 

    } 

  

    public boolean colocarPeca(int linha, int coluna, Peca peca) { 

        if (tabuleiro[linha][coluna] != null) { 

            System.out.println("Posicao ja ocupada!"); 

            return false; 

        } 

  

        boolean colocavel = false; 

  

        // Verifica a peça acima 

        if (linha > 0 && tabuleiro[linha - 1][coluna] != null) { 

            if (tabuleiro[linha - 1][coluna].podeEncaixar(peca, 2)) { 

                colocavel = true; 

            } else { 

                System.out.println("Nao encaixa com a peca de cima"); 

                return false; 

            } 

        } 

  

        // Verifica a peça à direita 

        if (coluna < 2 && tabuleiro[linha][coluna + 1] != null) { 

            if (tabuleiro[linha][coluna + 1].podeEncaixar(peca, 3)) { 

                colocavel = true; 

            } else { 

                System.out.println("Nao encaixa com a peca da direita"); 

                return false; 

            } 

        } 

  

        // Verifica a peça abaixo 

        if (linha < 2 && tabuleiro[linha + 1][coluna] != null) { 

            if (tabuleiro[linha + 1][coluna].podeEncaixar(peca, 0)) { 

                colocavel = true; 

            } else { 

                System.out.println("Nao encaixa com a peca de baixo"); 

                return false; 

            } 

        } 

  

        // Verifica a peça à esquerda 

        if (coluna > 0 && tabuleiro[linha][coluna - 1] != null) { 

            if (tabuleiro[linha][coluna - 1].podeEncaixar(peca, 1)) { 

                colocavel = true; 

            } else { 

                System.out.println("Nao encaixa com a peca da esquerda"); 

                return false; 

            } 

        } 

        if (!colocavel && !temPecaAdjacente(linha, coluna)) { 

            colocavel = true; 

        } 

  

        if (colocavel) { 

            tabuleiro[linha][coluna] = peca; 

            return true; 

        } 

  

        return false; 

    } 

  

    private boolean temPecaAdjacente(int linha, int coluna) { 

        return (linha > 0 && tabuleiro[linha - 1][coluna] != null) ||  // Cima 

               (coluna < 2 && tabuleiro[linha][coluna + 1] != null) || // Direita 

               (linha < 2 && tabuleiro[linha + 1][coluna] != null) ||  // Baixo 

               (coluna > 0 && tabuleiro[linha][coluna - 1] != null);   // Esquerda 

    } 

  

    public Peca getPeca(int linha, int coluna) { 

        return tabuleiro[linha][coluna]; 

    } 
} 

 