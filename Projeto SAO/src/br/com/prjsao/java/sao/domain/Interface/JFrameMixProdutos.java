package br.com.cidacastello.java.sao.domain.Interface;

import br.com.cidacastello.java.sao.backup.Ant;
import br.com.cidacastello.java.sao.domain.model.Maquina;
import br.com.cidacastello.java.sao.domain.model.Operacao;
import br.com.cidacastello.java.sao.domain.model.Peca;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JTextField;

/**
 *
 * @author Cida
 */
public class JFrameMixProdutos extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMixProdutos
     */
    private Maquina[] maquina = new Maquina[10];
    private final Peca[] peca = new Peca[6];
    private final Operacao[] operacao = new Operacao[70];

    public JFrameMixProdutos() {
        initComponents();
    }

    public JFrameMixProdutos(Maquina[] m) {
        this.maquina = m;
        initComponents();
        carregarDadosTransportados();

    }

    private void carregarDadosIniciais() {

        DecimalFormat df = new DecimalFormat("0.00");

        for (int i = 0; i < peca.length; i++) {
            peca[i] = new Peca();
            peca[i].setDescricao("PExtra_" + i + 1);
        }

        peca[0].setQuantidade(45);
        peca[0].setMargemContribuicao(8.50);
        peca[0].setPrazoEntrega(10);
        txtQtdeProd1.setText(Integer.toString(peca[0].getQuantidade()));
        txtP1MC.setText(Double.toString(peca[0].getMargemContribuicao()));
        txtP1PE.setText(Integer.toString(peca[0].getPrazoEntrega()));

        peca[1].setQuantidade(8);
        peca[1].setMargemContribuicao(12.00);
        peca[1].setPrazoEntrega(80);
        txtQtdeProd2.setText(Integer.toString(peca[1].getQuantidade()));
        txtP2MC.setText(Double.toString(peca[1].getMargemContribuicao()));
        txtP2PE.setText(Integer.toString(peca[1].getPrazoEntrega()));

        peca[2].setQuantidade(34);
        peca[2].setMargemContribuicao(10.38);
        peca[2].setPrazoEntrega(10);
        txtQtdeProd3.setText(Integer.toString(peca[2].getQuantidade()));
        txtP3MC.setText(Double.toString(peca[2].getMargemContribuicao()));
        txtP3PE.setText(Integer.toString(peca[2].getPrazoEntrega()));

        peca[3].setQuantidade(45);
        peca[3].setMargemContribuicao(7.25);
        peca[3].setPrazoEntrega(5);
        txtQtdeProd4.setText(Integer.toString(peca[3].getQuantidade()));
        txtP4MC.setText(Double.toString(peca[3].getMargemContribuicao()));
        txtP4PE.setText(Integer.toString(peca[3].getPrazoEntrega()));

        peca[4].setQuantidade(88);
        peca[4].setMargemContribuicao(6.30);
        peca[4].setPrazoEntrega(3);
        txtQtdeProd5.setText(Integer.toString(peca[4].getQuantidade()));
        txtP5MC.setText(Double.toString(peca[4].getMargemContribuicao()));
        txtP5PE.setText(Integer.toString(peca[4].getPrazoEntrega()));

        peca[5].setQuantidade(6);
        peca[5].setMargemContribuicao(5.00);
        peca[5].setPrazoEntrega(2);
        txtQtdeProd6.setText(Integer.toString(peca[5].getQuantidade()));
        txtP6MC.setText(Double.toString(peca[5].getMargemContribuicao()));
        txtP6PE.setText(Integer.toString(peca[5].getPrazoEntrega()));

        for (int i = 0; i < operacao.length; i++) {
            operacao[i] = new Operacao();
            // operacao[i] = null;
        }

        int codPeca = 1;
        int codMaquina = 1;
        String texto;
        for (int i = 0; i < 9; i++) {
            operacao[i].setDescricao(texto = "PE" + codPeca + "M" + codMaquina);
            operacao[i].setPeca(peca[0]);
            operacao[i].setMaquina(maquina[i]);

            operacao[i + 10].setDescricao(texto = "PE" + (codPeca + 1) + "M" + (codMaquina + 1));
            operacao[i + 10].setPeca(peca[1]);
            operacao[i].setMaquina(maquina[i]);

            operacao[i + 20].setDescricao(texto = "PE" + (codPeca + 2) + "M" + (codMaquina + 2));
            operacao[i + 20].setPeca(peca[2]);
            operacao[i].setMaquina(maquina[i]);

            operacao[i + 30].setDescricao(texto = "PE" + (codPeca + 3) + "M" + (codMaquina + 3));
            operacao[i + 30].setPeca(peca[3]);
            operacao[i].setMaquina(maquina[i]);

            operacao[i + 40].setDescricao(texto = "PE" + (codPeca + 4) + "M" + (codMaquina + 4));
            operacao[i + 40].setPeca(peca[4]);
            operacao[i].setMaquina(maquina[i]);

            operacao[i + 50].setDescricao(texto = "PE" + (codPeca + 5) + "M" + (codMaquina + 5));
            operacao[i + 50].setPeca(peca[5]);
            operacao[i].setMaquina(maquina[i]);
        }

        //set tempo de ocupação nas máquinas por operação
        //peça 1
        operacao[1].setTempoOcupacaoMaquinaPeca(5.3);
        txtP1M2.setText(Double.toString(operacao[1].getTempoOcupacaoMaquinaPeca()));

        operacao[2].setTempoOcupacaoMaquinaPeca(2.8);
        txtP1M3.setText(Double.toString(operacao[2].getTempoOcupacaoMaquinaPeca()));

        operacao[4].setTempoOcupacaoMaquinaPeca(9.7);
        txtP1M5.setText(Double.toString(operacao[4].getTempoOcupacaoMaquinaPeca()));

        //peça 2
        operacao[13].setTempoOcupacaoMaquinaPeca(3.8);
        txtP2M4.setText(Double.toString(operacao[13].getTempoOcupacaoMaquinaPeca()));

        operacao[14].setTempoOcupacaoMaquinaPeca(1.5);
        txtP2M5.setText(Double.toString(operacao[14].getTempoOcupacaoMaquinaPeca()));

        operacao[16].setTempoOcupacaoMaquinaPeca(6.8);
        txtP2M7.setText(Double.toString(operacao[16].getTempoOcupacaoMaquinaPeca()));

        //peça 3
        operacao[22].setTempoOcupacaoMaquinaPeca(7.1);
        txtP3M3.setText(Double.toString(operacao[22].getTempoOcupacaoMaquinaPeca()));

        operacao[23].setTempoOcupacaoMaquinaPeca(9.3);
        txtP3M4.setText(Double.toString(operacao[23].getTempoOcupacaoMaquinaPeca()));

        operacao[27].setTempoOcupacaoMaquinaPeca(10.6);
        txtP3M8.setText(Double.toString(operacao[27].getTempoOcupacaoMaquinaPeca()));

        operacao[28].setTempoOcupacaoMaquinaPeca(11.3);
        txtP3M9.setText(Double.toString(operacao[28].getTempoOcupacaoMaquinaPeca()));

        //peça 4
        operacao[30].setTempoOcupacaoMaquinaPeca(5.3);
        txtP4M1.setText(Double.toString(operacao[30].getTempoOcupacaoMaquinaPeca()));

        operacao[31].setTempoOcupacaoMaquinaPeca(2.8);
        txtP4M2.setText(Double.toString(operacao[31].getTempoOcupacaoMaquinaPeca()));

        operacao[33].setTempoOcupacaoMaquinaPeca(9.7);
        txtP4M4.setText(Double.toString(operacao[33].getTempoOcupacaoMaquinaPeca()));

        //peça 5
        operacao[42].setTempoOcupacaoMaquinaPeca(3.8);
        txtP5M3.setText(Double.toString(operacao[42].getTempoOcupacaoMaquinaPeca()));

        operacao[43].setTempoOcupacaoMaquinaPeca(1.5);
        txtP5M4.setText(Double.toString(operacao[43].getTempoOcupacaoMaquinaPeca()));

        operacao[45].setTempoOcupacaoMaquinaPeca(6.8);
        txtP5M6.setText(Double.toString(operacao[45].getTempoOcupacaoMaquinaPeca()));

        //peça 6
        operacao[51].setTempoOcupacaoMaquinaPeca(7.1);
        txtP6M2.setText(Double.toString(operacao[51].getTempoOcupacaoMaquinaPeca()));

        operacao[52].setTempoOcupacaoMaquinaPeca(9.3);
        txtP6M3.setText(Double.toString(operacao[52].getTempoOcupacaoMaquinaPeca()));

        operacao[56].setTempoOcupacaoMaquinaPeca(10.6);
        txtP6M7.setText(Double.toString(operacao[56].getTempoOcupacaoMaquinaPeca()));

        operacao[57].setTempoOcupacaoMaquinaPeca(11.3);
        txtP6M8.setText(Double.toString(operacao[57].getTempoOcupacaoMaquinaPeca()));

    }

    private void carregarDadosTransportados() {

        DecimalFormat df = new DecimalFormat("0.00");
       
        txtM1.setText(df.format(this.maquina[0].getOciosidade_gargalo()).replace(",", "."));
        this.setColorJText(txtM1, this.maquina[0].getOciosidade_gargalo());

        txtM2.setText(df.format(this.maquina[1].getOciosidade_gargalo()).replace(",", "."));
        this.setColorJText(txtM2, this.maquina[1].getOciosidade_gargalo());

        txtM3.setText(df.format(this.maquina[2].getOciosidade_gargalo()).replace(",", "."));
        this.setColorJText(txtM3, this.maquina[2].getOciosidade_gargalo());

        txtM4.setText(df.format(this.maquina[3].getOciosidade_gargalo()).replace(",", "."));
        this.setColorJText(txtM4, this.maquina[3].getOciosidade_gargalo());

        txtM5.setText(df.format(this.maquina[4].getOciosidade_gargalo()).replace(",", "."));
        this.setColorJText(txtM5, this.maquina[4].getOciosidade_gargalo());

        txtM6.setText(df.format(this.maquina[5].getOciosidade_gargalo()).replace(",", "."));
        this.setColorJText(txtM6, this.maquina[5].getOciosidade_gargalo());

        txtM7.setText(df.format(this.maquina[6].getOciosidade_gargalo()).replace(",", "."));
        this.setColorJText(txtM7, this.maquina[6].getOciosidade_gargalo());

        txtM8.setText(df.format(this.maquina[7].getOciosidade_gargalo()).replace(",", "."));
        this.setColorJText(txtM8, this.maquina[7].getOciosidade_gargalo());

        txtM9.setText(df.format(this.maquina[8].getOciosidade_gargalo()).replace(",", "."));
        this.setColorJText(txtM9, this.maquina[8].getOciosidade_gargalo());

        txtM10.setText(df.format(this.maquina[9].getOciosidade_gargalo()).replace(",", "."));
        this.setColorJText(txtM10, this.maquina[9].getOciosidade_gargalo());




    }

    private void setColorJText(JTextField text, double valor) {
        if (valor <= 0) {
            text.setBackground(Color.red);
            text.setForeground(Color.white);
        } else {
            text.setBackground(Color.green);
            text.setForeground(Color.black);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMix = new javax.swing.JPanel();
        jPanelMaqPeca = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtQtdeProd1 = new javax.swing.JTextField();
        txtQtdeProd2 = new javax.swing.JTextField();
        txtQtdeProd3 = new javax.swing.JTextField();
        txtQtdeProd4 = new javax.swing.JTextField();
        txtQtdeProd5 = new javax.swing.JTextField();
        txtQtdeProd6 = new javax.swing.JTextField();
        txtP1M1 = new javax.swing.JTextField();
        txtP1M2 = new javax.swing.JTextField();
        txtP1M3 = new javax.swing.JTextField();
        txtP1M4 = new javax.swing.JTextField();
        txtP1M5 = new javax.swing.JTextField();
        txtP1M6 = new javax.swing.JTextField();
        txtP1M7 = new javax.swing.JTextField();
        txtP1M8 = new javax.swing.JTextField();
        txtP1M9 = new javax.swing.JTextField();
        txtP1M10 = new javax.swing.JTextField();
        txtP2M1 = new javax.swing.JTextField();
        txtP2M2 = new javax.swing.JTextField();
        txtP2M3 = new javax.swing.JTextField();
        txtP2M4 = new javax.swing.JTextField();
        txtP2M5 = new javax.swing.JTextField();
        txtP2M6 = new javax.swing.JTextField();
        txtP2M7 = new javax.swing.JTextField();
        txtP2M8 = new javax.swing.JTextField();
        txtP2M9 = new javax.swing.JTextField();
        txtP2M10 = new javax.swing.JTextField();
        txtP3M1 = new javax.swing.JTextField();
        txtP3M2 = new javax.swing.JTextField();
        txtP3M3 = new javax.swing.JTextField();
        txtP3M4 = new javax.swing.JTextField();
        txtP3M5 = new javax.swing.JTextField();
        txtP3M6 = new javax.swing.JTextField();
        txtP3M7 = new javax.swing.JTextField();
        txtP3M8 = new javax.swing.JTextField();
        txtP3M9 = new javax.swing.JTextField();
        txtP3M10 = new javax.swing.JTextField();
        txtP4M1 = new javax.swing.JTextField();
        txtP4M2 = new javax.swing.JTextField();
        txtP4M3 = new javax.swing.JTextField();
        txtP4M4 = new javax.swing.JTextField();
        txtP4M5 = new javax.swing.JTextField();
        txtP4M6 = new javax.swing.JTextField();
        txtP4M7 = new javax.swing.JTextField();
        txtP4M8 = new javax.swing.JTextField();
        txtP4M9 = new javax.swing.JTextField();
        txtP4M10 = new javax.swing.JTextField();
        txtP5M1 = new javax.swing.JTextField();
        txtP5M2 = new javax.swing.JTextField();
        txtP5M3 = new javax.swing.JTextField();
        txtP5M4 = new javax.swing.JTextField();
        txtP5M5 = new javax.swing.JTextField();
        txtP5M6 = new javax.swing.JTextField();
        txtP5M7 = new javax.swing.JTextField();
        txtP5M8 = new javax.swing.JTextField();
        txtP5M9 = new javax.swing.JTextField();
        txtP5M10 = new javax.swing.JTextField();
        txtP6M1 = new javax.swing.JTextField();
        txtP6M2 = new javax.swing.JTextField();
        txtP6M3 = new javax.swing.JTextField();
        txtP6M4 = new javax.swing.JTextField();
        txtP6M5 = new javax.swing.JTextField();
        txtP6M6 = new javax.swing.JTextField();
        txtP6M7 = new javax.swing.JTextField();
        txtP6M8 = new javax.swing.JTextField();
        txtP6M9 = new javax.swing.JTextField();
        txtP6M10 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtP1MC = new javax.swing.JTextField();
        txtP1PE = new javax.swing.JTextField();
        txtP2MC = new javax.swing.JTextField();
        txtP2PE = new javax.swing.JTextField();
        txtP3MC = new javax.swing.JTextField();
        txtP3PE = new javax.swing.JTextField();
        txtP4MC = new javax.swing.JTextField();
        txtP4PE = new javax.swing.JTextField();
        txtP5MC = new javax.swing.JTextField();
        txtP5PE = new javax.swing.JTextField();
        txtP6MC = new javax.swing.JTextField();
        txtP6PE = new javax.swing.JTextField();
        jPanelDadosMaquina = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtM1 = new javax.swing.JTextField();
        txtM2 = new javax.swing.JTextField();
        txtM3 = new javax.swing.JTextField();
        txtM4 = new javax.swing.JTextField();
        txtM5 = new javax.swing.JTextField();
        txtM6 = new javax.swing.JTextField();
        txtM7 = new javax.swing.JTextField();
        txtM8 = new javax.swing.JTextField();
        txtM9 = new javax.swing.JTextField();
        txtM10 = new javax.swing.JTextField();
        jPanelMC = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTempOcupM1 = new javax.swing.JTextField();
        txtTempOcupM2 = new javax.swing.JTextField();
        txtTempOcupM3 = new javax.swing.JTextField();
        txtTempOcupM4 = new javax.swing.JTextField();
        txtTempOcupM5 = new javax.swing.JTextField();
        txtTempOcupM6 = new javax.swing.JTextField();
        txtTempOcupM7 = new javax.swing.JTextField();
        txtTempOcupM8 = new javax.swing.JTextField();
        txtTempOcupM9 = new javax.swing.JTextField();
        txtTempOcupM10 = new javax.swing.JTextField();
        txtOcioM10 = new javax.swing.JTextField();
        txtOcioM9 = new javax.swing.JTextField();
        txtOcioM8 = new javax.swing.JTextField();
        txtOcioM7 = new javax.swing.JTextField();
        txtOcioM6 = new javax.swing.JTextField();
        txtOcioM5 = new javax.swing.JTextField();
        txtOcioM4 = new javax.swing.JTextField();
        txtOcioM3 = new javax.swing.JTextField();
        txtOcioM2 = new javax.swing.JTextField();
        txtOcioM1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtM11 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtM12 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtM13 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtM14 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtM15 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtM16 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtM17 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtM18 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtM19 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtM20 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txtM31 = new javax.swing.JTextField();
        txtM32 = new javax.swing.JTextField();
        txtM33 = new javax.swing.JTextField();
        txtM34 = new javax.swing.JTextField();
        txtM35 = new javax.swing.JTextField();
        txtM36 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        txtM37 = new javax.swing.JTextField();
        jPanelPE = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        txtTempOcupM11 = new javax.swing.JTextField();
        txtTempOcupM12 = new javax.swing.JTextField();
        txtTempOcupM13 = new javax.swing.JTextField();
        txtTempOcupM14 = new javax.swing.JTextField();
        txtTempOcupM15 = new javax.swing.JTextField();
        txtTempOcupM16 = new javax.swing.JTextField();
        txtTempOcupM17 = new javax.swing.JTextField();
        txtTempOcupM18 = new javax.swing.JTextField();
        txtTempOcupM19 = new javax.swing.JTextField();
        txtTempOcupM20 = new javax.swing.JTextField();
        txtOcioM11 = new javax.swing.JTextField();
        txtOcioM12 = new javax.swing.JTextField();
        txtOcioM13 = new javax.swing.JTextField();
        txtOcioM14 = new javax.swing.JTextField();
        txtOcioM15 = new javax.swing.JTextField();
        txtOcioM16 = new javax.swing.JTextField();
        txtOcioM17 = new javax.swing.JTextField();
        txtOcioM18 = new javax.swing.JTextField();
        txtOcioM19 = new javax.swing.JTextField();
        txtOcioM20 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtM21 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtM22 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txtM23 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtM24 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtM25 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtM26 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txtM27 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtM28 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txtM29 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txtM30 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        txtM38 = new javax.swing.JTextField();
        txtM39 = new javax.swing.JTextField();
        txtM40 = new javax.swing.JTextField();
        txtM41 = new javax.swing.JTextField();
        txtM42 = new javax.swing.JTextField();
        txtM43 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        txtM44 = new javax.swing.JTextField();
        jPanelButtons = new javax.swing.JPanel();
        btnCarregarValoresIniciais = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SAO - Otimização da Produção - Mix de Produtos");

        jPanelMix.setPreferredSize(new java.awt.Dimension(1245, 700));

        jPanelMaqPeca.setBorder(javax.swing.BorderFactory.createTitledBorder("Tempo de Ocupação das Máquinas por Produto - [minutos]"));
        jPanelMaqPeca.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Prod. Extra-1");
        jPanelMaqPeca.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel9.setText("Prod. Extra-2");
        jPanelMaqPeca.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel10.setText("Prod. Extra-3");
        jPanelMaqPeca.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel11.setText("Prod. Extra-4");
        jPanelMaqPeca.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel12.setText("Prod. Extra-5");
        jPanelMaqPeca.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel13.setText("Prod. Extra-6");
        jPanelMaqPeca.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("<html>z<sub>ex</sub></html>");
        jLabel21.setOpaque(true);
        jPanelMaqPeca.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 18, 50, 30));

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("M1");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel22.setOpaque(true);
        jPanelMaqPeca.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 40, -1));

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("M2");
        jLabel23.setOpaque(true);
        jPanelMaqPeca.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 30, 40, -1));

        jLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("M3");
        jLabel24.setOpaque(true);
        jPanelMaqPeca.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 30, 40, -1));

        jLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("M4");
        jLabel25.setOpaque(true);
        jPanelMaqPeca.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 30, 40, -1));

        jLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("M5");
        jLabel26.setOpaque(true);
        jPanelMaqPeca.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 30, 40, -1));

        jLabel27.setBackground(new java.awt.Color(204, 204, 204));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("M6");
        jLabel27.setOpaque(true);
        jPanelMaqPeca.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 40, -1));

        jLabel28.setBackground(new java.awt.Color(204, 204, 204));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("M7");
        jLabel28.setOpaque(true);
        jPanelMaqPeca.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 30, 40, -1));

        jLabel29.setBackground(new java.awt.Color(204, 204, 204));
        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("M8");
        jLabel29.setOpaque(true);
        jPanelMaqPeca.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 30, 40, -1));

        jLabel30.setBackground(new java.awt.Color(204, 204, 204));
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("M9");
        jLabel30.setOpaque(true);
        jPanelMaqPeca.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 30, 40, -1));

        jLabel31.setBackground(new java.awt.Color(204, 204, 204));
        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("<html>Prazo<br>Entrega</html>");
        jLabel31.setOpaque(true);
        jPanelMaqPeca.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 70, -1));

        txtQtdeProd1.setBackground(new java.awt.Color(255, 255, 0));
        txtQtdeProd1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtQtdeProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 50, 30));

        txtQtdeProd2.setBackground(new java.awt.Color(255, 255, 0));
        txtQtdeProd2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtQtdeProd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 50, 30));

        txtQtdeProd3.setBackground(new java.awt.Color(255, 255, 0));
        txtQtdeProd3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtQtdeProd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 50, 30));

        txtQtdeProd4.setBackground(new java.awt.Color(255, 255, 0));
        txtQtdeProd4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtQtdeProd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 50, 30));

        txtQtdeProd5.setBackground(new java.awt.Color(255, 255, 0));
        txtQtdeProd5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtQtdeProd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 50, 30));

        txtQtdeProd6.setBackground(new java.awt.Color(255, 255, 0));
        txtQtdeProd6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtQtdeProd6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 50, 30));

        txtP1M1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP1M1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 50, 30));

        txtP1M2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP1M2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 50, 46, 30));

        txtP1M3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP1M3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 50, 46, 30));

        txtP1M4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP1M4, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 50, 46, 30));

        txtP1M5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP1M5, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 50, 46, 30));

        txtP1M6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP1M6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 46, 30));

        txtP1M7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP1M7, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 50, 46, 30));

        txtP1M8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP1M8, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 50, 46, 30));

        txtP1M9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP1M9, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 50, 46, 30));

        txtP1M10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP1M10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 50, 30));

        txtP2M1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP2M1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 50, 30));

        txtP2M2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP2M2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 90, 50, 30));

        txtP2M3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP2M3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 90, 50, 30));

        txtP2M4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP2M4, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 90, 50, 30));

        txtP2M5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP2M5, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 90, 50, 30));

        txtP2M6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP2M6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 50, 30));

        txtP2M7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP2M7, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 90, 50, 30));

        txtP2M8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP2M8, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 90, 50, 30));

        txtP2M9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP2M9, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 90, 50, 30));

        txtP2M10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP2M10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 50, 30));

        txtP3M1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP3M1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 50, 30));

        txtP3M2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP3M2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 130, 50, 30));

        txtP3M3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP3M3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 130, 50, 30));

        txtP3M4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP3M4, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 130, 50, 30));

        txtP3M5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP3M5, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 130, 50, 30));

        txtP3M6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP3M6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 50, 30));

        txtP3M7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP3M7, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 130, 50, 30));

        txtP3M8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP3M8, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 130, 50, 30));

        txtP3M9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP3M9, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 130, 50, 30));

        txtP3M10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP3M10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 50, 30));

        txtP4M1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP4M1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 50, 30));

        txtP4M2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP4M2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 170, 50, 30));

        txtP4M3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP4M3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 170, 50, 30));

        txtP4M4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP4M4, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 170, 50, 30));

        txtP4M5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP4M5, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 170, 50, 30));

        txtP4M6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP4M6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 50, 30));

        txtP4M7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP4M7, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 170, 50, 30));

        txtP4M8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP4M8, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 170, 50, 30));

        txtP4M9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP4M9, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 170, 50, 30));

        txtP4M10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP4M10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 50, 30));

        txtP5M1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP5M1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 50, 30));

        txtP5M2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP5M2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 210, 50, 30));

        txtP5M3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP5M3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 210, 50, 30));

        txtP5M4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP5M4, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 210, 50, 30));

        txtP5M5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP5M5, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 210, 50, 30));

        txtP5M6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP5M6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 50, 30));

        txtP5M7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP5M7, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 210, 50, 30));

        txtP5M8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP5M8, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 210, 50, 30));

        txtP5M9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP5M9, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 210, 50, 30));

        txtP5M10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP5M10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 50, 30));

        txtP6M1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP6M1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 50, 30));

        txtP6M2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP6M2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 250, 50, 30));

        txtP6M3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP6M3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 250, 50, 30));

        txtP6M4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP6M4, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 250, 50, 30));

        txtP6M5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP6M5, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 250, 50, 30));

        txtP6M6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP6M6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 50, 30));

        txtP6M7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP6M7, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 250, 50, 30));

        txtP6M8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP6M8, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 250, 50, 30));

        txtP6M9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP6M9, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 250, 50, 30));

        txtP6M10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP6M10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 50, 30));

        jLabel32.setBackground(new java.awt.Color(204, 204, 204));
        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("M10");
        jLabel32.setOpaque(true);
        jPanelMaqPeca.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 40, -1));

        jLabel33.setBackground(new java.awt.Color(204, 204, 204));
        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("<html>Margem<br>Contrib.</html>");
        jLabel33.setOpaque(true);
        jPanelMaqPeca.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 70, -1));

        txtP1MC.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP1MC, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 50, 30));

        txtP1PE.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP1PE, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 50, 30));

        txtP2MC.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP2MC, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 50, 30));

        txtP2PE.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP2PE, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 50, 30));

        txtP3MC.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP3MC, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 50, 30));

        txtP3PE.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP3PE, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 50, 30));

        txtP4MC.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP4MC, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 50, 30));

        txtP4PE.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP4PE, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 50, 30));

        txtP5MC.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP5MC, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 50, 30));

        txtP5PE.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP5PE, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 50, 30));

        txtP6MC.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP6MC, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 50, 30));

        txtP6PE.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMaqPeca.add(txtP6PE, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 50, 30));

        jPanelDadosMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Status das Máquinas atualizado - Ociosidade/Gargalo"));
        jPanelDadosMaquina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("<html> Tempo Total Prod.<br> Disponível [tpt] </html>");
        jPanelDadosMaquina.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 40, 124, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("M1");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);
        jPanelDadosMaquina.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 40, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("M2");
        jLabel5.setOpaque(true);
        jPanelDadosMaquina.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 20, 40, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("M10");
        jLabel6.setOpaque(true);
        jPanelDadosMaquina.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 40, -1));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("M3");
        jLabel14.setOpaque(true);
        jPanelDadosMaquina.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 20, 40, -1));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("M4");
        jLabel15.setOpaque(true);
        jPanelDadosMaquina.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 20, 40, -1));

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("M5");
        jLabel16.setOpaque(true);
        jPanelDadosMaquina.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 20, 40, -1));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("M6");
        jLabel17.setOpaque(true);
        jPanelDadosMaquina.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 40, -1));

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("M7");
        jLabel18.setOpaque(true);
        jPanelDadosMaquina.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 20, 40, -1));

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("M8");
        jLabel19.setOpaque(true);
        jPanelDadosMaquina.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 20, 40, -1));

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("M9");
        jLabel20.setOpaque(true);
        jPanelDadosMaquina.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 20, 40, -1));

        txtM1.setEditable(false);
        txtM1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtM1.setName("txtM1"); // NOI18N
        jPanelDadosMaquina.add(txtM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 50, 30));

        txtM2.setEditable(false);
        txtM2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtM2.setName("txtM2"); // NOI18N
        jPanelDadosMaquina.add(txtM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 40, 50, 30));

        txtM3.setEditable(false);
        txtM3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtM3.setName("txtM3"); // NOI18N
        jPanelDadosMaquina.add(txtM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 40, 50, 30));

        txtM4.setEditable(false);
        txtM4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtM4.setName("txtM4"); // NOI18N
        jPanelDadosMaquina.add(txtM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 40, 50, 30));

        txtM5.setEditable(false);
        txtM5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtM5.setName("txtM5"); // NOI18N
        jPanelDadosMaquina.add(txtM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 40, 50, 30));

        txtM6.setEditable(false);
        txtM6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtM6.setName("txtM6"); // NOI18N
        jPanelDadosMaquina.add(txtM6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 50, 30));

        txtM7.setEditable(false);
        txtM7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtM7.setName("txtM7"); // NOI18N
        jPanelDadosMaquina.add(txtM7, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 40, 50, 30));

        txtM8.setEditable(false);
        txtM8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtM8.setName("txtM8"); // NOI18N
        jPanelDadosMaquina.add(txtM8, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 40, 50, 30));

        txtM9.setEditable(false);
        txtM9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtM9.setName("txtM9"); // NOI18N
        jPanelDadosMaquina.add(txtM9, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 40, 50, 30));

        txtM10.setEditable(false);
        txtM10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtM10.setName("txtM10"); // NOI18N
        jPanelDadosMaquina.add(txtM10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 50, 30));

        jPanelMC.setBorder(javax.swing.BorderFactory.createTitledBorder("Produção utilizando Margem de Contribuição"));
        jPanelMC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Tempo Ocupação [min.]");
        jPanelMC.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, -1));

        txtTempOcupM1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtTempOcupM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 50, 30));

        txtTempOcupM2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtTempOcupM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 70, 50, 30));

        txtTempOcupM3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtTempOcupM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 70, 50, 30));

        txtTempOcupM4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtTempOcupM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 70, 50, 30));

        txtTempOcupM5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtTempOcupM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 70, 50, 30));

        txtTempOcupM6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtTempOcupM6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 50, 30));

        txtTempOcupM7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtTempOcupM7, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 70, 50, 30));

        txtTempOcupM8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtTempOcupM8, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 70, 50, 30));

        txtTempOcupM9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtTempOcupM9, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 70, 50, 30));

        txtTempOcupM10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtTempOcupM10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 50, 30));

        txtOcioM10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtOcioM10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 50, 30));

        txtOcioM9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtOcioM9, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 100, 50, 30));

        txtOcioM8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtOcioM8, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 100, 50, 30));

        txtOcioM7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtOcioM7, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 100, 50, 30));

        txtOcioM6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtOcioM6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 50, 30));

        txtOcioM5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtOcioM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 100, 50, 30));

        txtOcioM4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtOcioM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 100, 50, 30));

        txtOcioM3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtOcioM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 100, 50, 30));

        txtOcioM2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtOcioM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 100, 50, 30));

        txtOcioM1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtOcioM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 50, 30));

        jLabel3.setText("Ociosidade/Gargalo [min.]");
        jPanelMC.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel7.setText("<html> Tempo Total Prod.<br> Disponível [tpt] </html>");
        jPanelMC.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 40, 124, -1));

        jLabel34.setBackground(new java.awt.Color(204, 204, 204));
        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("M1");
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel34.setOpaque(true);
        jPanelMC.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 40, -1));

        txtM11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtM11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 50, 30));

        jLabel35.setBackground(new java.awt.Color(204, 204, 204));
        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("M2");
        jLabel35.setOpaque(true);
        jPanelMC.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 20, 40, -1));

        txtM12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtM12, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 40, 50, 30));

        jLabel36.setBackground(new java.awt.Color(204, 204, 204));
        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("M3");
        jLabel36.setOpaque(true);
        jPanelMC.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 20, 40, -1));

        txtM13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtM13, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 40, 50, 30));

        jLabel37.setBackground(new java.awt.Color(204, 204, 204));
        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("M4");
        jLabel37.setOpaque(true);
        jPanelMC.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 20, 40, -1));

        txtM14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtM14, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 40, 50, 30));

        jLabel38.setBackground(new java.awt.Color(204, 204, 204));
        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("M5");
        jLabel38.setOpaque(true);
        jPanelMC.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 20, 40, -1));

        txtM15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtM15, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 40, 50, 30));

        jLabel39.setBackground(new java.awt.Color(204, 204, 204));
        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("M6");
        jLabel39.setOpaque(true);
        jPanelMC.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 40, -1));

        txtM16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtM16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 50, 30));

        jLabel40.setBackground(new java.awt.Color(204, 204, 204));
        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("M7");
        jLabel40.setOpaque(true);
        jPanelMC.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 20, 40, -1));

        txtM17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtM17, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 40, 50, 30));

        jLabel41.setBackground(new java.awt.Color(204, 204, 204));
        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("M8");
        jLabel41.setOpaque(true);
        jPanelMC.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 20, 40, -1));

        txtM18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtM18, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 40, 50, 30));

        jLabel42.setBackground(new java.awt.Color(204, 204, 204));
        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("M9");
        jLabel42.setOpaque(true);
        jPanelMC.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 20, 40, -1));

        txtM19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtM19, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 40, 50, 30));

        jLabel43.setBackground(new java.awt.Color(204, 204, 204));
        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("M10");
        jLabel43.setOpaque(true);
        jPanelMC.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 40, -1));

        txtM20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelMC.add(txtM20, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 50, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setText("Prod. Extra-1");
        jPanel1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel58.setText("Prod. Extra-2");
        jPanel1.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel59.setText("Prod. Extra-3");
        jPanel1.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel62.setText("Prod. Extra-6");
        jPanel1.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel60.setText("Prod. Extra-4");
        jPanel1.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel61.setText("Prod. Extra-5");
        jPanel1.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        txtM31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM31.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtM31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 35, 50, 30));

        txtM32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM32.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtM32, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 35, 50, 30));

        txtM33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM33.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtM33, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 35, 50, 30));

        txtM34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM34.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtM34, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 35, 50, 30));

        txtM35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM35.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtM35, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 35, 50, 30));

        txtM36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM36.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtM36, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 35, 50, 30));

        jLabel63.setText("Total Margem Contribuição - R$");
        jPanel1.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtM37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM37.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtM37, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 170, 30));

        jPanelMC.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 495, 110));

        jPanelPE.setBorder(javax.swing.BorderFactory.createTitledBorder("Produção utilizando Margem de Contribuição"));
        jPanelPE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setText("Tempo Ocupação [min.]");
        jPanelPE.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, -1));

        txtTempOcupM11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtTempOcupM11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 50, 30));

        txtTempOcupM12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtTempOcupM12, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 70, 50, 30));

        txtTempOcupM13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtTempOcupM13, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 70, 50, 30));

        txtTempOcupM14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtTempOcupM14, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 70, 50, 30));

        txtTempOcupM15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtTempOcupM15, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 70, 50, 30));

        txtTempOcupM16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtTempOcupM16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 50, 30));

        txtTempOcupM17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtTempOcupM17, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 70, 50, 30));

        txtTempOcupM18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtTempOcupM18, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 70, 50, 30));

        txtTempOcupM19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtTempOcupM19, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 70, 50, 30));

        txtTempOcupM20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTempOcupM20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtTempOcupM20, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 50, 30));

        txtOcioM11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtOcioM11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 50, 30));

        txtOcioM12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtOcioM12, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 100, 50, 30));

        txtOcioM13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtOcioM13, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 100, 50, 30));

        txtOcioM14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtOcioM14, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 100, 50, 30));

        txtOcioM15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtOcioM15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 50, 30));

        txtOcioM16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtOcioM16, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 100, 50, 30));

        txtOcioM17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtOcioM17, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 100, 50, 30));

        txtOcioM18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtOcioM18, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 100, 50, 30));

        txtOcioM19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtOcioM19, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 100, 50, 30));

        txtOcioM20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOcioM20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtOcioM20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 50, 30));

        jLabel45.setText("Ociosidade/Gargalo [min.]");
        jPanelPE.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel46.setText("<html> Tempo Total Prod.<br> Disponível [tpt] </html>");
        jPanelPE.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 40, 124, -1));

        jLabel47.setBackground(new java.awt.Color(204, 204, 204));
        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("M1");
        jLabel47.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel47.setOpaque(true);
        jPanelPE.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 40, -1));

        txtM21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtM21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 50, 30));

        jLabel48.setBackground(new java.awt.Color(204, 204, 204));
        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("M2");
        jLabel48.setOpaque(true);
        jPanelPE.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 20, 40, -1));

        txtM22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtM22, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 40, 50, 30));

        jLabel49.setBackground(new java.awt.Color(204, 204, 204));
        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("M3");
        jLabel49.setOpaque(true);
        jPanelPE.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 20, 40, -1));

        txtM23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtM23, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 40, 50, 30));

        jLabel50.setBackground(new java.awt.Color(204, 204, 204));
        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("M4");
        jLabel50.setOpaque(true);
        jPanelPE.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 20, 40, -1));

        txtM24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtM24, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 40, 50, 30));

        jLabel51.setBackground(new java.awt.Color(204, 204, 204));
        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("M5");
        jLabel51.setOpaque(true);
        jPanelPE.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 20, 40, -1));

        txtM25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtM25, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 40, 50, 30));

        jLabel52.setBackground(new java.awt.Color(204, 204, 204));
        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("M6");
        jLabel52.setOpaque(true);
        jPanelPE.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 40, -1));

        txtM26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtM26, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 50, 30));

        jLabel53.setBackground(new java.awt.Color(204, 204, 204));
        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("M7");
        jLabel53.setOpaque(true);
        jPanelPE.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 20, 40, -1));

        txtM27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtM27, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 40, 50, 30));

        jLabel54.setBackground(new java.awt.Color(204, 204, 204));
        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("M8");
        jLabel54.setOpaque(true);
        jPanelPE.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 20, 40, -1));

        txtM28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM28.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtM28, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 40, 50, 30));

        jLabel55.setBackground(new java.awt.Color(204, 204, 204));
        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("M9");
        jLabel55.setOpaque(true);
        jPanelPE.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 20, 40, -1));

        txtM29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM29.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtM29, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 40, 50, 30));

        jLabel56.setBackground(new java.awt.Color(204, 204, 204));
        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("M10");
        jLabel56.setOpaque(true);
        jPanelPE.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 40, -1));

        txtM30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM30.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanelPE.add(txtM30, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 50, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel64.setText("Prod. Extra-1");
        jPanel2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel65.setText("Prod. Extra-2");
        jPanel2.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel66.setText("Prod. Extra-3");
        jPanel2.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel67.setText("Prod. Extra-6");
        jPanel2.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel68.setText("Prod. Extra-4");
        jPanel2.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel69.setText("Prod. Extra-5");
        jPanel2.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        txtM38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM38.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(txtM38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 35, 50, 30));

        txtM39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM39.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(txtM39, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 35, 50, 30));

        txtM40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM40.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(txtM40, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 35, 50, 30));

        txtM41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM41.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(txtM41, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 35, 50, 30));

        txtM42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM42.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(txtM42, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 35, 50, 30));

        txtM43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM43.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(txtM43, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 35, 50, 30));

        jLabel70.setText("Total Margem Contribuição - R$");
        jPanel2.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtM44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtM44.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(txtM44, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 170, 30));

        jPanelPE.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 495, 110));

        jPanelButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCarregarValoresIniciais.setText("Carregar Valores Inicias");
        btnCarregarValoresIniciais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarValoresIniciaisActionPerformed(evt);
            }
        });
        jPanelButtons.add(btnCarregarValoresIniciais, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 190, -1));

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        jPanelButtons.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 190, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanelButtons.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 190, -1));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanelButtons.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 190, -1));

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanelButtons.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 190, -1));

        javax.swing.GroupLayout jPanelMixLayout = new javax.swing.GroupLayout(jPanelMix);
        jPanelMix.setLayout(jPanelMixLayout);
        jPanelMixLayout.setHorizontalGroup(
            jPanelMixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMixLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMixLayout.createSequentialGroup()
                        .addGroup(jPanelMixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelMaqPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelDadosMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelMixLayout.createSequentialGroup()
                        .addGroup(jPanelMixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelMC, javax.swing.GroupLayout.PREFERRED_SIZE, 1225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelPE, javax.swing.GroupLayout.PREFERRED_SIZE, 1225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelMixLayout.setVerticalGroup(
            jPanelMixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMixLayout.createSequentialGroup()
                .addGroup(jPanelMixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelMixLayout.createSequentialGroup()
                        .addComponent(jPanelMaqPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelDadosMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMixLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMC, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPE, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMix, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarregarValoresIniciaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarValoresIniciaisActionPerformed
        carregarDadosIniciais();

    }//GEN-LAST:event_btnCarregarValoresIniciaisActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        carregarValoresAtuais();  
        
        //passar informações para as formigas, ou seja,
        //passar os valores que estão nos vetores: maquina, peçca, operacao
        Ant ant = new Ant(peca, maquina, operacao);
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

    
     
    private void carregarValoresAtuais() {

     //status das máquinas não alteram neste momento, porque vem do form anterior

        //quantidade        
        this.validarEntradaQtdePeca(txtQtdeProd1, 0);
        this.validarEntradaQtdePeca(txtQtdeProd2, 1);
        this.validarEntradaQtdePeca(txtQtdeProd3, 2);
        this.validarEntradaQtdePeca(txtQtdeProd4, 3);
        this.validarEntradaQtdePeca(txtQtdeProd5, 4);
        this.validarEntradaQtdePeca(txtQtdeProd6, 5);

        //tempos das operações
          //atualiza vetor de operações
        this.carregarEntradaTempos(txtP1M1, 0);
        this.carregarEntradaTempos(txtP1M2, 1);
        this.carregarEntradaTempos(txtP1M3, 2);
        this.carregarEntradaTempos(txtP1M4, 3);
        this.carregarEntradaTempos(txtP1M5, 4);
        this.carregarEntradaTempos(txtP1M6, 5);
        this.carregarEntradaTempos(txtP1M7, 6);
        this.carregarEntradaTempos(txtP1M8, 7);
        this.carregarEntradaTempos(txtP1M9, 8);
        this.carregarEntradaTempos(txtP1M10, 9);

        this.carregarEntradaTempos(txtP2M1, 10);
        this.carregarEntradaTempos(txtP2M2, 11);
        this.carregarEntradaTempos(txtP2M3, 12);
        this.carregarEntradaTempos(txtP2M4, 13);
        this.carregarEntradaTempos(txtP2M5, 14);
        this.carregarEntradaTempos(txtP2M6, 15);
        this.carregarEntradaTempos(txtP2M7, 16);
        this.carregarEntradaTempos(txtP2M8, 17);
        this.carregarEntradaTempos(txtP2M9, 18);
        this.carregarEntradaTempos(txtP2M10, 19);

        this.carregarEntradaTempos(txtP3M1, 0 + 20);
        this.carregarEntradaTempos(txtP3M2, 1 + 20);
        this.carregarEntradaTempos(txtP3M3, 2 + 20);
        this.carregarEntradaTempos(txtP3M4, 3 + 20);
        this.carregarEntradaTempos(txtP3M5, 4 + 20);
        this.carregarEntradaTempos(txtP3M6, 5 + 20);
        this.carregarEntradaTempos(txtP3M7, 6 + 20);
        this.carregarEntradaTempos(txtP3M8, 7 + 20);
        this.carregarEntradaTempos(txtP3M9, 8 + 20);
        this.carregarEntradaTempos(txtP3M10, 9 + 20);

        this.carregarEntradaTempos(txtP4M1, 30);
        this.carregarEntradaTempos(txtP4M2, 31);
        this.carregarEntradaTempos(txtP4M3, 32);
        this.carregarEntradaTempos(txtP4M4, 33);
        this.carregarEntradaTempos(txtP4M5, 34);
        this.carregarEntradaTempos(txtP4M6, 35);
        this.carregarEntradaTempos(txtP4M7, 36);
        this.carregarEntradaTempos(txtP4M8, 37);
        this.carregarEntradaTempos(txtP4M9, 38);
        this.carregarEntradaTempos(txtP4M10, 39);

        this.carregarEntradaTempos(txtP5M1, 40);
        this.carregarEntradaTempos(txtP5M2, 41);
        this.carregarEntradaTempos(txtP5M3, 42);
        this.carregarEntradaTempos(txtP5M4, 43);
        this.carregarEntradaTempos(txtP5M5, 44);
        this.carregarEntradaTempos(txtP5M6, 45);
        this.carregarEntradaTempos(txtP5M7, 46);
        this.carregarEntradaTempos(txtP5M8, 47);
        this.carregarEntradaTempos(txtP5M9, 48);
        this.carregarEntradaTempos(txtP5M10, 49);

        this.carregarEntradaTempos(txtP6M1, 50);
        this.carregarEntradaTempos(txtP6M2, 51);
        this.carregarEntradaTempos(txtP6M3, 52);
        this.carregarEntradaTempos(txtP6M4, 53);
        this.carregarEntradaTempos(txtP6M5, 54);
        this.carregarEntradaTempos(txtP6M6, 55);
        this.carregarEntradaTempos(txtP6M7, 56);
        this.carregarEntradaTempos(txtP6M8, 57);
        this.carregarEntradaTempos(txtP6M9, 58);
        this.carregarEntradaTempos(txtP6M10, 59);
        
      
        

    }

    private void carregarEntradaTempos(JTextField text, int indice) {
        if (!text.getText().isEmpty() && text.getText().trim().length() > 0) {
            operacao[indice].setTempoOcupacaoMaquinaPeca(Double.parseDouble(text.getText()));
        } else {
            operacao[indice].setTempoOcupacaoMaquinaPeca(0);
        }
    }

    private void validarEntradaQtdePeca(JTextField text, int indice) {
        if (!text.getText().isEmpty() && text.getText().trim().length() > 0) {
            peca[indice].setQuantidade(Integer.parseInt(text.getText()));
        } else {
            peca[indice].setQuantidade(0);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameMixProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMixProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMixProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMixProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMixProdutos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCarregarValoresIniciais;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelDadosMaquina;
    private javax.swing.JPanel jPanelMC;
    private javax.swing.JPanel jPanelMaqPeca;
    private javax.swing.JPanel jPanelMix;
    private javax.swing.JPanel jPanelPE;
    private javax.swing.JTextField txtM1;
    private javax.swing.JTextField txtM10;
    private javax.swing.JTextField txtM11;
    private javax.swing.JTextField txtM12;
    private javax.swing.JTextField txtM13;
    private javax.swing.JTextField txtM14;
    private javax.swing.JTextField txtM15;
    private javax.swing.JTextField txtM16;
    private javax.swing.JTextField txtM17;
    private javax.swing.JTextField txtM18;
    private javax.swing.JTextField txtM19;
    private javax.swing.JTextField txtM2;
    private javax.swing.JTextField txtM20;
    private javax.swing.JTextField txtM21;
    private javax.swing.JTextField txtM22;
    private javax.swing.JTextField txtM23;
    private javax.swing.JTextField txtM24;
    private javax.swing.JTextField txtM25;
    private javax.swing.JTextField txtM26;
    private javax.swing.JTextField txtM27;
    private javax.swing.JTextField txtM28;
    private javax.swing.JTextField txtM29;
    private javax.swing.JTextField txtM3;
    private javax.swing.JTextField txtM30;
    private javax.swing.JTextField txtM31;
    private javax.swing.JTextField txtM32;
    private javax.swing.JTextField txtM33;
    private javax.swing.JTextField txtM34;
    private javax.swing.JTextField txtM35;
    private javax.swing.JTextField txtM36;
    private javax.swing.JTextField txtM37;
    private javax.swing.JTextField txtM38;
    private javax.swing.JTextField txtM39;
    private javax.swing.JTextField txtM4;
    private javax.swing.JTextField txtM40;
    private javax.swing.JTextField txtM41;
    private javax.swing.JTextField txtM42;
    private javax.swing.JTextField txtM43;
    private javax.swing.JTextField txtM44;
    private javax.swing.JTextField txtM5;
    private javax.swing.JTextField txtM6;
    private javax.swing.JTextField txtM7;
    private javax.swing.JTextField txtM8;
    private javax.swing.JTextField txtM9;
    private javax.swing.JTextField txtOcioM1;
    private javax.swing.JTextField txtOcioM10;
    private javax.swing.JTextField txtOcioM11;
    private javax.swing.JTextField txtOcioM12;
    private javax.swing.JTextField txtOcioM13;
    private javax.swing.JTextField txtOcioM14;
    private javax.swing.JTextField txtOcioM15;
    private javax.swing.JTextField txtOcioM16;
    private javax.swing.JTextField txtOcioM17;
    private javax.swing.JTextField txtOcioM18;
    private javax.swing.JTextField txtOcioM19;
    private javax.swing.JTextField txtOcioM2;
    private javax.swing.JTextField txtOcioM20;
    private javax.swing.JTextField txtOcioM3;
    private javax.swing.JTextField txtOcioM4;
    private javax.swing.JTextField txtOcioM5;
    private javax.swing.JTextField txtOcioM6;
    private javax.swing.JTextField txtOcioM7;
    private javax.swing.JTextField txtOcioM8;
    private javax.swing.JTextField txtOcioM9;
    private javax.swing.JTextField txtP1M1;
    private javax.swing.JTextField txtP1M10;
    private javax.swing.JTextField txtP1M2;
    private javax.swing.JTextField txtP1M3;
    private javax.swing.JTextField txtP1M4;
    private javax.swing.JTextField txtP1M5;
    private javax.swing.JTextField txtP1M6;
    private javax.swing.JTextField txtP1M7;
    private javax.swing.JTextField txtP1M8;
    private javax.swing.JTextField txtP1M9;
    private javax.swing.JTextField txtP1MC;
    private javax.swing.JTextField txtP1PE;
    private javax.swing.JTextField txtP2M1;
    private javax.swing.JTextField txtP2M10;
    private javax.swing.JTextField txtP2M2;
    private javax.swing.JTextField txtP2M3;
    private javax.swing.JTextField txtP2M4;
    private javax.swing.JTextField txtP2M5;
    private javax.swing.JTextField txtP2M6;
    private javax.swing.JTextField txtP2M7;
    private javax.swing.JTextField txtP2M8;
    private javax.swing.JTextField txtP2M9;
    private javax.swing.JTextField txtP2MC;
    private javax.swing.JTextField txtP2PE;
    private javax.swing.JTextField txtP3M1;
    private javax.swing.JTextField txtP3M10;
    private javax.swing.JTextField txtP3M2;
    private javax.swing.JTextField txtP3M3;
    private javax.swing.JTextField txtP3M4;
    private javax.swing.JTextField txtP3M5;
    private javax.swing.JTextField txtP3M6;
    private javax.swing.JTextField txtP3M7;
    private javax.swing.JTextField txtP3M8;
    private javax.swing.JTextField txtP3M9;
    private javax.swing.JTextField txtP3MC;
    private javax.swing.JTextField txtP3PE;
    private javax.swing.JTextField txtP4M1;
    private javax.swing.JTextField txtP4M10;
    private javax.swing.JTextField txtP4M2;
    private javax.swing.JTextField txtP4M3;
    private javax.swing.JTextField txtP4M4;
    private javax.swing.JTextField txtP4M5;
    private javax.swing.JTextField txtP4M6;
    private javax.swing.JTextField txtP4M7;
    private javax.swing.JTextField txtP4M8;
    private javax.swing.JTextField txtP4M9;
    private javax.swing.JTextField txtP4MC;
    private javax.swing.JTextField txtP4PE;
    private javax.swing.JTextField txtP5M1;
    private javax.swing.JTextField txtP5M10;
    private javax.swing.JTextField txtP5M2;
    private javax.swing.JTextField txtP5M3;
    private javax.swing.JTextField txtP5M4;
    private javax.swing.JTextField txtP5M5;
    private javax.swing.JTextField txtP5M6;
    private javax.swing.JTextField txtP5M7;
    private javax.swing.JTextField txtP5M8;
    private javax.swing.JTextField txtP5M9;
    private javax.swing.JTextField txtP5MC;
    private javax.swing.JTextField txtP5PE;
    private javax.swing.JTextField txtP6M1;
    private javax.swing.JTextField txtP6M10;
    private javax.swing.JTextField txtP6M2;
    private javax.swing.JTextField txtP6M3;
    private javax.swing.JTextField txtP6M4;
    private javax.swing.JTextField txtP6M5;
    private javax.swing.JTextField txtP6M6;
    private javax.swing.JTextField txtP6M7;
    private javax.swing.JTextField txtP6M8;
    private javax.swing.JTextField txtP6M9;
    private javax.swing.JTextField txtP6MC;
    private javax.swing.JTextField txtP6PE;
    private javax.swing.JTextField txtQtdeProd1;
    private javax.swing.JTextField txtQtdeProd2;
    private javax.swing.JTextField txtQtdeProd3;
    private javax.swing.JTextField txtQtdeProd4;
    private javax.swing.JTextField txtQtdeProd5;
    private javax.swing.JTextField txtQtdeProd6;
    private javax.swing.JTextField txtTempOcupM1;
    private javax.swing.JTextField txtTempOcupM10;
    private javax.swing.JTextField txtTempOcupM11;
    private javax.swing.JTextField txtTempOcupM12;
    private javax.swing.JTextField txtTempOcupM13;
    private javax.swing.JTextField txtTempOcupM14;
    private javax.swing.JTextField txtTempOcupM15;
    private javax.swing.JTextField txtTempOcupM16;
    private javax.swing.JTextField txtTempOcupM17;
    private javax.swing.JTextField txtTempOcupM18;
    private javax.swing.JTextField txtTempOcupM19;
    private javax.swing.JTextField txtTempOcupM2;
    private javax.swing.JTextField txtTempOcupM20;
    private javax.swing.JTextField txtTempOcupM3;
    private javax.swing.JTextField txtTempOcupM4;
    private javax.swing.JTextField txtTempOcupM5;
    private javax.swing.JTextField txtTempOcupM6;
    private javax.swing.JTextField txtTempOcupM7;
    private javax.swing.JTextField txtTempOcupM8;
    private javax.swing.JTextField txtTempOcupM9;
    // End of variables declaration//GEN-END:variables
}
