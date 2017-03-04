package br.com.cidacastello.java.sao.colony;

import br.com.cidacastello.java.sao.domain.model.Peca;

/**
 * CLASSE PARA TESTAR OS CÁLCULOS DE OTIMIZAÇÃO
 * 
 * @author Cida
 */
public class CalculosOtimizacao {
    
    /**
     * PEGA A MARGEM DE CONTRIBUIÇÃO TOTAL
     * 
     * @param peca PASSA UM VETOR DE PEÇAS
     * @return O TOTAL DA MARGEM DE CONTRIBUIÇÃO
     */
    public static double getMargemContribuicaoTotal(Peca[] peca){
        double total = 0;
        for (Peca p : peca) {
            total += p.getTotalMargemContribuicao();
        }
        return total;
    }
    
}
