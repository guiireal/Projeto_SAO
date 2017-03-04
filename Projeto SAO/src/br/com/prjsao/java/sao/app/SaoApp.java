package br.com.cidacastello.java.sao.app;

import br.com.cidacastello.java.sao.domain.model.Maquina;
import br.com.cidacastello.java.sao.domain.model.Operacao;
import br.com.cidacastello.java.sao.domain.model.Peca;

/**
 * CLASSE PARA TESTAR O APP
 * 
 * @author Cida
 */
public class SaoApp {
    
    /**
     * METODO PRINCIPAL EXECUTADO PELA JVM
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Maquina[] maquina = new Maquina[10];
        System.out.println("Máquinas cadastradas");
        String[] descricaoDaMaquina = {"torno","fresa","broca","maq4","maq5","maq6","maq7","maq8","maq9","maq10"};        
        for (int i = 0; i < 10; i++) {
            maquina[i] = new Maquina();
            maquina[i].setIdMaquina(i);
            maquina[i].setDescricaoDaMaquina(descricaoDaMaquina[i]);
            maquina[i].setTempoTotal(480.0);
            System.out.println(maquina[i].toString());
        }
	Peca peca = new Peca();
	peca.setDescricao("Eixo");
	peca.setQuantidade(20);
	System.out.println("\nPeça cadastrada");
	System.out.println(peca.toString());	
	int qtd = 2;	
	Operacao[] operacao = new Operacao[qtd];
	operacao[0] = new Operacao();
	operacao[0].setPeca(peca);
	operacao[0].setMaquina(maquina[0]);
	operacao[0].setTempoOcupacaoMaquinaPeca(.2);
	operacao[1] = new Operacao();
	operacao[1].setPeca(peca);
	operacao[1].setMaquina(maquina[2]);
	operacao[1].setTempoOcupacaoMaquinaPeca(20);
	System.out.println("\nOperação");
        for (Operacao op : operacao)
            System.out.println(op.toString());
    
    }
    
}
