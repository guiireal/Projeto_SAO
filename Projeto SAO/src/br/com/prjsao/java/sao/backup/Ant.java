package br.com.cidacastello.java.sao.backup;

import br.com.cidacastello.java.sao.domain.model.Maquina;
import br.com.cidacastello.java.sao.domain.model.Operacao;
import br.com.cidacastello.java.sao.domain.model.Peca;

/**
 * Formiga
 * 
 * @author Cida
 */
public class Ant {

    Peca pecaExtraMC[], pecaExtraPE[];
    Maquina maquina[];
    Operacao operacao[], auxOperacao[];

    public Ant(Peca peca[], Maquina maquina[], Operacao operacao[]) {
        this.pecaExtraMC = peca;
        this.pecaExtraPE = peca;
        this.maquina = maquina;
        this.operacao = operacao;
    }
    
   /**
    * PARA CALCULAR A QTDE MÁXIMA DE PEÇAS POSSÍVEIS P/ O
    * TEMPO DISPONÍVEL (OCIOSIDADE) DA MÁQUINA
    * 
    * @param op VETOR DE OPERAÇÃO
    */
    public void calcularQtdeMaximaPeca(Operacao op[]) {
        this.auxOperacao = op;
        int qtdeMax;
        for (int i = 0; i < auxOperacao.length; i++) {
            qtdeMax = (int) (operacao[i].getMaquina().getOciosidade_gargalo() / operacao[i].getTempoOcupacaoMaquinaPeca());
            if (auxOperacao[i].getPeca().getQuantidade() >= qtdeMax) 
                auxOperacao[i].getPeca().setQuantidade(qtdeMax);
        }
    }
    
}
