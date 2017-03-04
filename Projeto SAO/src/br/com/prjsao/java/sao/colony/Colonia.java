package br.com.cidacastello.java.sao.colony;

import br.com.cidacastello.java.sao.domain.model.Maquina;
import br.com.cidacastello.java.sao.domain.model.Operacao;
import br.com.cidacastello.java.sao.domain.model.Peca;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

import javax.swing.JOptionPane;

/**
 * COLÔNIA DE FORMIGAS
 *
 * @author Guilherme França
 */
public class Colonia {
    
    Peca[] peca; // Vetor de peças
    Maquina[] maquina; // Vetor de máquinas
    Operacao[] operacao; // Vetor de operações
    Formiga formiga = new Formiga(peca, maquina, operacao); // Formiga
    double q; // Abrangencia das formigas (0 até 1), qto + proximo 1 , maior abrangencia na busca das formigas
    double chi; // Representa a taxa de evaporacao de feromonio ACO padrão
    int condicaoDeParada; // Max = 100
    static int m; // Conjunto de soluções m é gerado pelas formigas e adicionados na matrizT
    static int k; // Representa o numero de soluções aleatórias
    double[] vetorW; // Vetor que armazena os pesos de cada solução da tabela / estrutura
    double[] vetorProbabilidade; // Vetor para armazenar o calculo das probabilidades
    int qtdDeIteracoes; // Quantidade de iteraçoes do algorimto
    java.util.Random random = new java.util.Random(); // Gerador de números aleatórios

    /**
     * MÉTODO PARA CALCULAR O PESO
     *
     * @param indice - ÍNDICE DA TABELA
     * @return O CÁLCULO DO PESO
     */
    public double calculaPesoW(int indice) {
        double aux, aux2, auxE, auxK;
        auxK = k + 1;
        indice = indice + 1;
        aux = 1 / (q * auxK * Math.sqrt(2 * Math.PI));
        aux2 = Math.pow(indice - 1, 2) / (2 * Math.pow(q, 2)) * (Math.pow(auxK, q));
        auxE = Math.pow(Math.E, -aux2);
        
        return (aux * auxE);
    }
    
    /**
     * CALCULA A PROBABILIDADE
     * 
     * @param pesoW1 - UM PESO
     * @param totalDePesos - TOTAL DOS PESOS
     * @return A PROBABILIDADE
     */
    public double calculaProbabilidade(double pesoW1, double totalDePesos) {
        return (pesoW1 / totalDePesos);
    }

    /**
     * ROLETA
     * 
     * @param limite - LIMITE A SER ATINGIDO
     * @return O VALOR ATINGIDO DE SOLUÇÕES
     */
    public int roleta(double limite) {
        int i;
        double aux = 0; // CORRIGIR ESTA LINHA
        
        for (i = 0; i < k; i++) {
            if (aux <= limite) {
                // IMPLEMENTAR (aux = aux + stAtual(i).probabilidade)
            }
            else 
                return i;
        }
        if (i > k)
            i = k;
        
        return i;
    }
    
    /**
     * FUNÇÃO QUE FAZ A SOMA DOS PESOS
     * 
     * @return O SOMATÓRIO DOS PESOS DENTRE AS SOLUÇÕES ALEATÓRIAS
     */
    public double somatorioDosPesos() {
        double soma = 0;
        for (int i = 0; i < k; i++) {
            // IMPLEMENTAR (soma = soma + stAtual(i).pesoW)
        }
        
        return soma;
    }
    
    /**
     * INICIA A SOLUÇÃO PARA O CÁLCULO DE OTIMIZAÇÃO
     * 
     * @throws java.io.IOException - PODE LANÇAR UMA EXCEPTION DE ENTRADA/SAÍDA
     */
    public void iniciaSolucaoT() throws IOException {
        int i;
        int indiceSolucaoEscolhida;
        double totalPesos, escolhaSoulcaoProbabilidade;
        long horaInicial, horaFinal, diferenca;
        FileWriter fw;
        BufferedWriter escrever;
        String nomeArquivo;
        Estado[] auxiliar = new Estado[k + m + 1];
        
        for (i = 0; i < k; i++) {
            formiga.stAtual[i].sh = this.aleatorio((formiga.stInicial.sh * (1 - formiga.stPercParametros.sh / 1000)), 
                    (formiga.stInicial.sh * (1 + formiga.stPercParametros.sh / 100))); // COMANDO 1
            
            formiga.stAtual[i].cm = this.aleatorio((formiga.stInicial.cm * (1 - formiga.stPercParametros.cm / 1000)), 
                    (formiga.stInicial.cm * (1 + formiga.stPercParametros.cm / 100))); // COMANDO 2
            
            formiga.stAtual[i].kft = this.aleatorio((formiga.stInicial.kft * (1 - formiga.stPercParametros.kft / 1000)), 
                    (formiga.stInicial.kft * (1 + formiga.stPercParametros.kft / 100))); // COMANDO 3
            
            formiga.stAtual[i].tft = this.aleatorio((formiga.stInicial.tft * (1 - formiga.stPercParametros.tft / 1000)), 
                    (formiga.stInicial.tft * (1 + formiga.stPercParametros.tft / 100))); // COMANDO 4
            
            formiga.stAtual[i].ctu = this.aleatorio((formiga.stInicial.ctu * (1 - formiga.stPercParametros.ctu / 1000)), 
                    (formiga.stInicial.ctu * (1 + formiga.stPercParametros.ctu / 100))); // COMANDO 5
            
            formiga.stAtual[i].sm = this.aleatorio((formiga.stInicial.sm * (1 - formiga.stPercParametros.sm / 1000)), 
                    (formiga.stInicial.sm * (1 + formiga.stPercParametros.sm / 100))); // COMANDO 6
            
            formiga.stAtual[i].vcmc = formiga.calculaVcmc(formiga.stFixo.k, formiga.stAtual[i].sh, formiga.stAtual[i].sm, 
                                                          formiga.stFixo.x, formiga.stAtual[i].kft, formiga.stAtual[i].tft);
            
            formiga.stAtual[i].vcmcLim = formiga.calculaVcmcLim(formiga.stFixo.k, formiga.stAtual[i].sh, formiga.stAtual[i].sm, 
                                                                formiga.stFixo.x, formiga.stAtual[i].kft);
            
            formiga.stAtual[i].vcmXp = formiga.calculaVcmXp(formiga.stFixo.k, formiga.stFixo.x, formiga.stAtual[i].tft);
            
            formiga.stAtual[i].kpVcmc = formiga.calculaCustoTotalKp(formiga.stAtual[i].sh, formiga.stAtual[i].cm, 
                                                                    formiga.stAtual[i].kft, formiga.stAtual[i].tft, 
                                                                    formiga.stAtual[i].ctu, formiga.stAtual[i].sm, 
                                                                    formiga.stAtual[i].vcmc);
        } // FIM DO LAÇO FOR "i até k"
            nomeArquivo = "melhorsolucao.txt";
        try {
            fw = new FileWriter(nomeArquivo, true);
            escrever = new BufferedWriter(fw);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro na hora de criar o arquivo !", "Erro", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(ex);
        }
        this.qtdDeIteracoes = 1;
        while (this.qtdDeIteracoes < this.condicaoDeParada) {
            this.ordenacaoBubbleSortKpVcmc(formiga.stAtual);
            for (i = 0; i < k; i++) {
                formiga.stAtual[i].pesoW = this.calculaPesoW(i);
            }
            totalPesos = this.somatorioDosPesos();
            for (i = 0; i < k; i++) {
                formiga.stAtual[i].probabilidade = this.calculaProbabilidade(formiga.stAtual[i].pesoW, totalPesos);
            }
            for (i = 0; i < m; i++) {
                escolhaSoulcaoProbabilidade = this.aleatorio_01();
                indiceSolucaoEscolhida = this.roleta(escolhaSoulcaoProbabilidade);

                formiga.formiga[i].sh = this.gaussian(formiga.stAtual[indiceSolucaoEscolhida].sh,
                        formiga.stAtual[indiceSolucaoEscolhida].pesoW,
                        "Sh", indiceSolucaoEscolhida);
                if (formiga.formiga[i].sh < formiga.stMinimoPermitido.sh) {
                    formiga.formiga[i].sh = formiga.stMinimoPermitido.sh; // COMANDO 1
                }
                formiga.formiga[i].cm = this.gaussian(formiga.stAtual[indiceSolucaoEscolhida].cm,
                        formiga.stAtual[indiceSolucaoEscolhida].pesoW,
                        "Cm", indiceSolucaoEscolhida);
                if (formiga.formiga[i].cm < formiga.stMinimoPermitido.cm) {
                    formiga.formiga[i].cm = formiga.stMinimoPermitido.cm; // COMANDO 2
                }
                formiga.formiga[i].ctu = this.gaussian(formiga.stAtual[indiceSolucaoEscolhida].ctu,
                        formiga.stAtual[indiceSolucaoEscolhida].pesoW,
                        "Ctu", indiceSolucaoEscolhida);
                if (formiga.formiga[i].ctu < formiga.stMinimoPermitido.ctu) {
                    formiga.formiga[i].ctu = formiga.stMinimoPermitido.ctu; // COMANDO 3
                }
                formiga.formiga[i].kft = this.gaussian(formiga.stAtual[indiceSolucaoEscolhida].kft,
                        formiga.stAtual[indiceSolucaoEscolhida].pesoW,
                        "Kft", indiceSolucaoEscolhida);
                if (formiga.formiga[i].kft < formiga.stMinimoPermitido.kft) {
                    formiga.formiga[i].kft = formiga.stMinimoPermitido.kft; // COMANDO 4
                }
                formiga.formiga[i].sm = this.gaussian(formiga.stAtual[indiceSolucaoEscolhida].sm,
                        formiga.stAtual[indiceSolucaoEscolhida].pesoW,
                        "Sm", indiceSolucaoEscolhida);
                if (formiga.formiga[i].sm < formiga.stMinimoPermitido.sm) {
                    formiga.formiga[i].sm = formiga.stMinimoPermitido.sm; // COMANDO 5
                }
                formiga.formiga[i].tft = this.gaussian(formiga.stAtual[indiceSolucaoEscolhida].tft,
                        formiga.stAtual[indiceSolucaoEscolhida].pesoW,
                        "Tft", indiceSolucaoEscolhida);
                if (formiga.formiga[i].tft < formiga.stMinimoPermitido.tft) {
                    formiga.formiga[i].tft = formiga.stMinimoPermitido.tft; // COMANDO 6
                }
                formiga.formiga[i].vcmc = formiga.calculaVcmc(formiga.stFixo.k, formiga.formiga[i].sh,
                        formiga.formiga[i].sm, formiga.stFixo.x,
                        formiga.formiga[i].kft, formiga.formiga[i].tft);

                formiga.formiga[i].vcmcLim = formiga.calculaVcmcLim(formiga.stFixo.k, formiga.formiga[i].sh,
                        formiga.formiga[i].sm, formiga.stFixo.x,
                        formiga.formiga[i].kft);

                formiga.stAtual[i].vcmXp = formiga.calculaVcmXp(formiga.stFixo.k, formiga.stFixo.x,
                        formiga.formiga[i].tft);

                formiga.formiga[i].kpVcmc = formiga.calculaCustoTotalKp(formiga.formiga[i].sh, formiga.formiga[i].cm,
                        formiga.formiga[i].kft, formiga.formiga[i].tft,
                        formiga.formiga[i].ctu, formiga.formiga[i].sm,
                        formiga.formiga[i].vcmc);
            } // FIM DO LAÇO FOR "i TO m"
            this.ordenacaoBubbleSortEstrutura(formiga.formiga);
            for (i = 0; i < k; i++) {
                auxiliar[i] = formiga.stAtual[i];
            }
            for (i = 0; i < k; i++) {
                auxiliar[k + i + 1] = formiga.formiga[i];
            }
            this.ordenacaoBubbleSortEstrutura(auxiliar);
            for (i = 0; i < k; i++) {
                formiga.stAtual[i] = auxiliar[i];
            }
            this.qtdDeIteracoes++;
        } // FIM DO LAÇO WHILE
        this.ordenacaoBubbleSortKpVcmc(formiga.stAtual);
        formiga.stMelhor = formiga.stAtual[0];
        String resultadoKpVcmc = Double.toString(formiga.stAtual[0].kpVcmc);
        escrever.write("Final " + resultadoKpVcmc);
        escrever.newLine();
        horaFinal = Calendar.getInstance().getTimeInMillis();
        horaFinal /= 1000;
        // diferenca = horaInicial - horaFinal;
        escrever.newLine();
        escrever.write("Tempo");
        escrever.newLine();
        escrever.write("Inicio = " /* + horaInicial */ + " Final = " + horaFinal);
        double variacao = 0; // frmPrincipal.calcularVariacao(stMelhor.KpVcmc, stInicial.KpVcmc, Color.Black);
        escrever.newLine();
        escrever.write("Inicio = " /* + horaInicial */ + " Final = " + horaFinal + " Tempo = " /* + diferenca */ + 
                       " Variação = " + variacao);
        escrever.newLine();
        escrever.write("Parâmetros do ACOr");
        escrever.newLine();
        escrever.write("q = " + this.q);
        escrever.newLine();
        escrever.write("chi = " + this.chi);
        escrever.newLine();
        escrever.write("critério de parada = " + this.condicaoDeParada);
        escrever.newLine();
        escrever.write("k = " + (++k));
        escrever.newLine();
        escrever.write("Nº de formigas = " + (++m));
        escrever.close();
        fw.close();
    }
    
    /**
     * ORDENAÇÃO POR MÉTODO BOLHA DE UMA ESTRUTURA KpVcmc
     * 
     * @param estrutura - PASSA UMA ESTRUTURA DE ESTADO
     * @return A ESTRUTURA ORDENADA
     */
    public Estado[] ordenacaoBubbleSortKpVcmc(Estado[] estrutura) {
        Estado stAux;
        for (int i = 0; i < k; i++)
            for (int j = 0; j < (k - (i + 1)); j++) 
                if (estrutura[j].kpVcmc > estrutura[j + 1].kpVcmc) {
                    stAux = estrutura[j];
                    estrutura[j] =  estrutura[j + 1];
                    estrutura[j + 1] = stAux;
                }
        
        return estrutura;
    }
    
    /**
     * ORDENAÇÃO POR MÉTODO BOLHA DA ESTRUTURA
     * 
     * @param estrutura - PASSA A ESTRUTURA
     * @return A ESTRUTURA ORDENADA
     */
    public Estado[] ordenacaoBubbleSortEstrutura(Estado[] estrutura) {
        Estado stAux;
        int kaux = (estrutura.length - 1);
        for (int i = 0; i < kaux; i++)
            for (int j = 0; j < (kaux - (i + 1)); j++)
                if (estrutura[j].kpVcmc > estrutura[j + 1].kpVcmc) {
                    stAux = estrutura[j];
                    estrutura[j] = estrutura[j + 1];
                    estrutura[j + 1] = stAux;
                }
        
        return estrutura;
    }
    
    /**
     * CALCULA O DESVIO DE MANEIRA PADRONIZADA
     * 
     * @param valorVariavel - VALOR DA VARIÁVEL PASSADA
     * @param nomeVariavel - NOME DA VARIÁVEL
     * 
     * @return O DESVIO
     */
    public double calculaDesvioPadrao(double valorVariavel, String nomeVariavel) {
        double somatorioVariavel = 0;
        switch (nomeVariavel) {
            case "Sh":
                for (int i = 0; i < k; i++)
                    somatorioVariavel = somatorioVariavel + Math.abs((formiga.stAtual[i].sh - valorVariavel) / (k + 1));
            break;
            case "Cm":
                for (int i = 0; i < k; i++)
                    somatorioVariavel = somatorioVariavel + Math.abs((formiga.stAtual[i].cm - valorVariavel) / (k + 1));
            break;
            case "Kft":
                for (int i = 0; i < k; i++)
                    somatorioVariavel = somatorioVariavel + Math.abs((formiga.stAtual[i].kft - valorVariavel) / (k + 1));
            break;
            case "Tft":
                for (int i = 0; i < k; i++)
                    somatorioVariavel = somatorioVariavel + Math.abs((formiga.stAtual[i].tft - valorVariavel) / (k + 1));
            break;
            case "Ctu":
                for (int i = 0; i < k; i++)
                    somatorioVariavel = somatorioVariavel + Math.abs((formiga.stAtual[i].ctu - valorVariavel) / (k + 1));
            break;
            case "Sm":
                for (int i = 0; i < k; i++)
                    somatorioVariavel = somatorioVariavel + Math.abs((formiga.stAtual[i].sm - valorVariavel) / (k + 1));
            break;
            default:
                JOptionPane.showMessageDialog(null, "Erro", "Erro no parâmetro média", JOptionPane.ERROR_MESSAGE);
        } // FIM DO SWITCH
        
        return chi * somatorioVariavel;
    } 
    
    /**
     * CÁLCULO GAUSSIANO
     * 
     * @param x - COEFICIENTE DE TAYLOR
     * @param peso - PESO
     * @param gaussianaNomeVariavel - NOME DA VARIÁVEL
     * @param indice - ÍNDICE
     * @return O CÁLCULO GAUSSIANO
     */
    public double gaussian(double x, double peso, String gaussianaNomeVariavel, int indice) {
        double aux, aux2, desvioPadrao, media, gaussian;
        double pesoSolucao = formiga.stAtual[indice].pesoW;
        media = 0; // somatorioTotalVariavel(gaussianaNomeVariavel)
        media = media / (k + 1);
        desvioPadrao = this.calculaDesvioPadrao(formiga.x, gaussianaNomeVariavel);
        aux = 1 / (desvioPadrao * Math.sqrt(2 * Math.PI));
        aux2 = (Math.pow((formiga.x - media), 2) / (2 * Math.pow(desvioPadrao, 2)));
        gaussian = pesoSolucao * aux * Math.pow(Math.E, -aux);
        gaussian = formiga.x - (gaussian * desvioPadrao);
        
        return gaussian;
    }
    
    /**
     * SOMATÓRIO TOTAL DA VARIÁVEL
     * 
     * @param nomeVariavel - NOME DA VARIÁVEL
     * @return A SOMA TOTAL
     */
    public double somatorioTotalVariavel(String nomeVariavel) {
        double soma = 0;
        switch (nomeVariavel) {
            case "Sh":
                for (int i = 0; i < k; i++)
                    soma += formiga.stAtual[i].sh;
                break;
            case "Cm" :
                for (int i = 0; i < k; i++)
                    soma += formiga.stAtual[i].cm;
                break;
            case "Kft":
                for (int i = 0; i < k; i++)
                    soma += formiga.stAtual[i].kft;
                break;
            case "Tft":
                for (int i = 0; i < k; i++)
                    soma += formiga.stAtual[i].tft;
                break;
            case "Ctu":
                for (int i = 0; i < k; i++)
                    soma += formiga.stAtual[i].ctu;
                break;

            case "Sm":
                for (int i = 0; i < k; i++)
                    soma += formiga.stAtual[i].sm;
                break;

            default:
                JOptionPane.showMessageDialog(null, "Erro", "Erro no parâmetro", JOptionPane.ERROR_MESSAGE);
        } // FIM DO SWITCH
        
        return 0;
    }
    
    /**
     * GERA UM NÚMERO ALEATÓRIO
     * 
     * @param a - DE "a"
     * @param b - ATÉ "b"
     * @return O NÚMERO ALEATÓRIO GERADO
     */
    public double aleatorio(double a, double b) {
        double aleatorio;
        double x = Math.round((b - a + 1 * random.nextDouble()) + a);
        while ((x < a) || (x > b))
            x = Math.round((b - a + 1 * random.nextDouble()) + a);
        
        return aleatorio = x;
    }
    
    /**
     * GERA UM NÚMERO ALEATÓRIO
     * 
     * @return UM NÚMERO ALEATÓRIO NO INTERVALO ENTRE 0 E 1
     */
    public double aleatorio_01() {
        return Math.random();
    }
    
}