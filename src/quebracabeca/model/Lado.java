/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quebracabeca.model;

/**
 *
 * @author aluno
 */
public class Lado {
    //1 = Tem 0 = Não tem
    private int canto1;
    private int canto2; 
    
    public Lado(int canto1, int canto2) {
        this.canto1 = canto1;
        this.canto2 = canto2;
    }
    
    public int getCanto1() {
        return this.canto1;
    }
    
    public int getCanto2() {
        return this.canto2;
    }
}
