/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quebracabeca.model;

/**
 *
 * @author aluno
 */
public class PecaMeio extends Peca{
    
    public PecaMeio(Lado[] lado) {
        super(lado);
    }

    @Override
    public boolean podeEncaixar(Peca peca, int ladoVindo) {
        boolean viravel = false;
        Lado ladoPecaMain;
        Lado ladoPecaVindo;
        
        ladoPecaMain = super.getLado(ladoVindo);
        ladoPecaVindo = super.getLadoContrario(ladoVindo);

        if((ladoPecaMain.getCanto1() == 1 && ladoPecaVindo.getCanto1() == 0
                && ladoPecaMain.getCanto2() == 0 && ladoPecaVindo.getCanto2() == 1)
                || (ladoPecaMain.getCanto1() == 0 && ladoPecaVindo.getCanto1() == 1
                && ladoPecaMain.getCanto2() == 1 && ladoPecaVindo.getCanto2() == 0)) {

            if(super.getVizinho(ladoVindo) == null) {
                viravel = true;
            }

        }

        return viravel;
    }
    
}
