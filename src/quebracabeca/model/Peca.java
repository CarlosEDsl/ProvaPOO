/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quebracabeca.model;

/**
 *
 * @author aluno
 */
public abstract class Peca {
    private Lado[] lado; //0 - Cima, 1- Direita, 2- Baixo, 3-Esquerda
    private Peca[] vizinhos; //0 - Cima, 1- Direita, 2- Baixo, 3-Esquerda
    
    public Peca(Lado[] lado) {
        this.lado = lado;
        this.vizinhos = new Peca[4];
    }
    
    public Lado getLado(int lado) {
        return this.lado[lado];
    }
    
    public Peca getVizinho(int lado) {
        return this.vizinhos[lado];
    }
    
    public Lado getLadoContrario(int lado) {
        switch(lado) {
            case 0: return this.lado[2];
            case 1: return this.lado[3];
            case 2: return this.lado[0];
            case 3: return this.lado[1];
        }
        return this.lado[1];
    }
    
    public abstract boolean podeEncaixar(Peca peca, int ladoVerificar);

    
}
