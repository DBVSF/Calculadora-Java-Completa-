
package CC;

import CC.operacaobasica.OperacaoBasica;
import CC.operacoesAvancadas.OperacoesAvancadas;
import com.sun.glass.events.KeyEvent;
import static java.awt.Toolkit.getDefaultToolkit;
import java.util.LinkedList;
import java.util.List;

public class CalculadoraCientifica extends javax.swing.JFrame {
    
    
    
    
    
    public CalculadoraCientifica() {
        
        initComponents();
        this.historico = new LinkedList();
        
        valorTela.setText(" ");
        lbMetrosResposta.setText(" ");
        lbMilhasResposta.setText(" ");
        lbCentimetrosResposta.setText(" ");
        
    }

    OperacaoBasica op = new OperacaoBasica();
    OperacoesAvancadas opv = new OperacoesAvancadas();
    
    
    
    private List<String> historico;
    double  num1, num2,peso,altura,quilometro,valor1;
    String operacao;
    String setarValores;
    String resultado;
    int contador = 0;
    double numeroAlternativo;
    //String tela;
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cpTexto = new javax.swing.JTextField();
        btnApagar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnRaizQuadrada = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnBinario = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnSoma = new javax.swing.JButton();
        btnHexadecimal = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btnPi = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnOctal = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        valorTela = new javax.swing.JLabel();
        btnCelcius = new javax.swing.JButton();
        btnFahrenheit = new javax.swing.JButton();
        cpPeso = new javax.swing.JTextField();
        cpAltura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCalculoImc = new javax.swing.JButton();
        lbResultadoLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cpQuilometro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        labelQuilometro = new javax.swing.JLabel();
        lbMetros = new javax.swing.JLabel();
        btnCalculoDistancia = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lbMilhas = new javax.swing.JLabel();
        lbCentimetros = new javax.swing.JLabel();
        lbMetrosResposta = new javax.swing.JLabel();
        lbMilhasResposta = new javax.swing.JLabel();
        lbCentimetrosResposta = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        list1 = new java.awt.List();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Darlan Bueno");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        cpTexto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cpTexto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cpTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpTextoActionPerformed(evt);
            }
        });
        cpTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpTextoKeyTyped(evt);
            }
        });

        btnApagar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnApagar.setText("◄ ");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("C");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnRaizQuadrada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRaizQuadrada.setText("√");
        btnRaizQuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizQuadradaActionPerformed(evt);
            }
        });

        btnMultiplicar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMultiplicar.setText("*");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("y^x");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnBinario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBinario.setText("Bin");
        btnBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinarioActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnSoma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSoma.setText("+");
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });

        btnHexadecimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHexadecimal.setText("Hex");
        btnHexadecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexadecimalActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnSubtracao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSubtracao.setText("-");
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });

        btnPi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPi.setText("Pi");
        btnPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnDividir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDividir.setText("/");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnOctal.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        btnOctal.setText("Octal");
        btnOctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOctalActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPonto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPonto.setText(".");
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton24.setText("±");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton25.setText("=");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        valorTela.setText("v1");

        btnCelcius.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCelcius.setText("C°");
        btnCelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelciusActionPerformed(evt);
            }
        });

        btnFahrenheit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFahrenheit.setText("°F");
        btnFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFahrenheitActionPerformed(evt);
            }
        });

        cpPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpPesoActionPerformed(evt);
            }
        });

        cpAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpAlturaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IMC");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Peso");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Altura");

        btnCalculoImc.setText("Calcular");
        btnCalculoImc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculoImcActionPerformed(evt);
            }
        });

        lbResultadoLabel.setText("Resultado");

        jLabel4.setText("(Insira os valores referentes à peso e altura nas caixas) ");

        cpQuilometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpQuilometroActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("CONVERSOR DE DISTANCIA");

        labelQuilometro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelQuilometro.setText("Quilometro");

        lbMetros.setText("Metros:");

        btnCalculoDistancia.setText("Calcular");
        btnCalculoDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculoDistanciaActionPerformed(evt);
            }
        });

        jLabel8.setText("(Insira os valores referentes à quilometro na caixa) ");

        lbMilhas.setText("Milhas:");

        lbCentimetros.setText("Centimetros:");

        lbMetrosResposta.setText("(resposta)");

        lbMilhasResposta.setText("(resposta)");

        lbCentimetrosResposta.setText("(resposta)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Histórico da calculadora");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CC/img/61570889_2316160948598641_4600114981394972672_n.jpg"))); // NOI18N

        jLabel7.setText("Calculadora Darlan Bueno Siqueira");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cpTexto)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHexadecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRaizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))
                            .addComponent(valorTela, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOctal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnCalculoImc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbResultadoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel4)))
                                    .addComponent(cpQuilometro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbMetros)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbMetrosResposta))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbMilhas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbMilhasResposta))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cpPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(62, 62, 62)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cpAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbCentimetros)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbCentimetrosResposta))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelQuilometro)
                                            .addGap(88, 88, 88)
                                            .addComponent(btnCalculoDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel5)))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(210, 210, 210))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(124, 124, 124))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valorTela)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(9, 9, 9)))
                        .addComponent(cpTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRaizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBinario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHexadecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnOctal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpAltura))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalculoImc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbResultadoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(labelQuilometro)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpQuilometro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalculoDistancia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMetros)
                            .addComponent(lbMetrosResposta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMilhas)
                            .addComponent(lbMilhasResposta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCentimetros)
                            .addComponent(lbCentimetrosResposta))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
      
            
           
        
        cpTexto.setText("0");
        /***
         * converte o segundo numero(b) clicado ao pressionar em "="
         */
        num2 = Double.parseDouble(cpTexto.getText());
        if (operacao == "+") {
            cpTexto.setText(String.valueOf(op.somar(num1, num2)));    
            resultado= String.valueOf(op.somar(num1, num2));
        }if (operacao == "-") {
            cpTexto.setText(String.valueOf(op.subtrair(num1, num2))); 
             resultado= String.valueOf(op.subtrair(num1, num2));
        }if (operacao == "*") {
           cpTexto.setText(String.valueOf(op.multiplicar(num1, num2)));
            resultado= String.valueOf(op.multiplicar(num1, num2));
        }if (operacao == "/") {
            cpTexto.setText(String.valueOf(op.dividir(num1, num2)));
             resultado= String.valueOf(op.dividir(num1, num2));
        }if (operacao == "^") {
            cpTexto.setText(String.valueOf(opv.potencia(num1, num2))); 
             resultado= String.valueOf(opv.potencia(num1, num2));
        }
        
        
        
        
        
        
        
        
        cpTexto.setText(resultado);
        
         //anotar cada calculo 
        contador ++;
        if (contador == 1) {
            
           valorTela.setText( + num1 + " " + operacao + " "  + num2);
           contador = 0;
            
        }
        
       
        
       String tela = num1 + " " + operacao + " " + " " + num2 + " " + " = " + resultado;
       list1.add(tela);
       
       
        
        
        
        
    }//GEN-LAST:event_jButton25ActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
       
        
        
        setarValores=cpTexto.getText();
        
        //apaga apenas um numero (sendo maior q zero)
                   
            
        
            
        
        if (setarValores.length()>0 ) {

            // apaga o .0 que fica depois do resultado 
            
             if (".".equals(setarValores.substring(setarValores.length()-2, setarValores.length()-1))) {
                setarValores = setarValores.substring(0, setarValores.length()-2);
            }
             else{
                 setarValores = setarValores.substring(0, setarValores.length()-1);
            }
            cpTexto.setText(setarValores);
            
            
            //mantem o numero 0 visivel depois de apagar todos os numeros da tela
            if (setarValores.length()==0) {
                cpTexto.setText("0");
            }
        } else {
            cpTexto.setText("0");
        }
       
        
    }//GEN-LAST:event_btnApagarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cpTexto.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        num1 = Double.parseDouble(cpTexto.getText());
        cpTexto.setText("");
        operacao = "*";
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
    cpTexto.setText(cpTexto.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        cpTexto.setText(cpTexto.getText() + "1");
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       cpTexto.setText(cpTexto.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        cpTexto.setText(cpTexto.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       cpTexto.setText(cpTexto.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
       cpTexto.setText(cpTexto.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       cpTexto.setText(cpTexto.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        cpTexto.setText(cpTexto.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        cpTexto.setText(cpTexto.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        cpTexto.setText(cpTexto.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        cpTexto.setText(cpTexto.getText() + ".");
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtracaoActionPerformed
       
        num1 = Double.parseDouble(cpTexto.getText());
        cpTexto.setText("");
        operacao = "-";
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        
        
        /***
         * o valor 'num1' recebe o valor digitado no campo de numeros
         * convertento ele para double, jÃ¡ que esta em string
         */
        num1 = Double.parseDouble(cpTexto.getText());
        //ao apertar em +, apaga o valor 'a' da caixa de texto
        cpTexto.setText("");
        operacao = "+";
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        
        num1 = Double.parseDouble(cpTexto.getText());
        cpTexto.setText("");
        operacao = "/";
    }//GEN-LAST:event_btnDividirActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        num1 = Double.parseDouble(cpTexto.getText());
        cpTexto.setText("");
        operacao = "^";
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnRaizQuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizQuadradaActionPerformed
            
        
            operacao = "√";
            
            num1 = Double.parseDouble(String.valueOf(cpTexto.getText()));
            numeroAlternativo = num1;
            num1 = Math.sqrt(num1);
            cpTexto.setText(String.valueOf(num1));
        
            resultado   = String.valueOf(Math.sqrt(num1));
        
            contador ++;
            if (contador == 1) {
            
            valorTela.setText( + numeroAlternativo + " " + operacao + " "  + num1);
            contador = 0;
            }
            list1.add(resultado);
            
        
    }//GEN-LAST:event_btnRaizQuadradaActionPerformed

    private void btnBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinarioActionPerformed
                

         int a = Integer.parseInt(cpTexto.getText()); //bina
        cpTexto.setText(Integer.toString(a,2));
        
        
        
    }//GEN-LAST:event_btnBinarioActionPerformed

    private void btnHexadecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexadecimalActionPerformed
        
        int a = Integer.parseInt(cpTexto.getText()); //hexa
        cpTexto.setText(Integer.toString(a,16));
        
        
    }//GEN-LAST:event_btnHexadecimalActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        
        num1 = Double.parseDouble(String.valueOf(cpTexto.getText()));
        num1 = num1 * (-1);
        cpTexto.setText(String.valueOf(num1));
        
        
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void btnPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiActionPerformed
            
        num1 = (3.14159265359);
        cpTexto.setText(String.valueOf(num1));
        
    }//GEN-LAST:event_btnPiActionPerformed

    private void btnOctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOctalActionPerformed
        
        int a = Integer.parseInt(cpTexto.getText()); //octal
        cpTexto.setText(Integer.toString(a,8));
        
    }//GEN-LAST:event_btnOctalActionPerformed

    private void btnCelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelciusActionPerformed
       
            operacao = "C";
            
            num1 = Double.parseDouble(String.valueOf(cpTexto.getText()));
            numeroAlternativo = num1;
            num1 = opv.celcius(num1);
            cpTexto.setText(String.valueOf(num1));
        
            resultado   = String.valueOf(opv.celcius(num1));
        
            contador ++;
            if (contador == 1) {
            
            valorTela.setText( + numeroAlternativo + " " + "Celsius" + " "  + num1 + "Fahrenheit");
            contador = 0;
            
            }
            
            String tela =  numeroAlternativo + " " + "Celsius" + " "  + num1 + "Fahrenheit";
            list1.add(tela);
        
    }//GEN-LAST:event_btnCelciusActionPerformed

    private void btnFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFahrenheitActionPerformed
        
            operacao = "F";
            
            num1 = Double.parseDouble(String.valueOf(cpTexto.getText()));
            numeroAlternativo = num1;
            num1 = opv.celcius(num1);
            cpTexto.setText(String.valueOf(num1));
        
            resultado   = String.valueOf(opv.fahrenheit(num1));
        
            contador ++;
            if (contador == 1) {
            
            valorTela.setText( + numeroAlternativo + " " + "Fahrenheit" + " "  + num1 + "Celsius");
            contador = 0;
            
            }
            
            String tela =  numeroAlternativo + " " + "Fahrenheit" + " "  + num1 + "Celsius";
            list1.add(tela);
            
    }//GEN-LAST:event_btnFahrenheitActionPerformed

    private void cpTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpTextoKeyTyped
        /***
         * evita o usuario de digitar qualquer coisa na tela 
         * 
         */
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c == KeyEvent.VK_BACKSPACE)|| (c == KeyEvent.VK_DELETE))){
           getDefaultToolkit().beep();
           evt.consume();
        }
    }//GEN-LAST:event_cpTextoKeyTyped

    private void cpPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpPesoActionPerformed

    private void cpAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpAlturaActionPerformed

    private void cpTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpTextoActionPerformed

    private void btnCalculoImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculoImcActionPerformed
      
        
       peso = Double.parseDouble(String.valueOf(cpPeso.getText()));
       altura = Double.parseDouble(String.valueOf(cpAltura.getText()));
       
      
      
      if(opv.IMC(altura, peso) <= 18.5){
        resultado = String.valueOf(opv.IMC(altura, peso));
        lbResultadoLabel.setText(resultado + " Você esta abaixo do peso."); 
        
    }else if (opv.IMC(altura, peso) >18.5 & opv.IMC(altura, peso)<24.9){
            resultado = String.valueOf(opv.IMC(altura, peso));
            lbResultadoLabel.setText(resultado +" Seu peso está normal.");
        }else if (opv.IMC(altura, peso) >25 & opv.IMC(altura, peso) <29.9){
            resultado = String.valueOf(opv.IMC(altura, peso));
            lbResultadoLabel.setText(resultado + " Você está acima do peso.");
        }else if (opv.IMC(altura, peso) >30 & opv.IMC(altura, peso) <34.9){
            resultado = String.valueOf(opv.IMC(altura, peso));
            lbResultadoLabel.setText(resultado +" Você está com obesidade grau 1");
        }else if (opv.IMC(altura, peso) >35 & opv.IMC(altura, peso) <39.9){
            resultado = String.valueOf(opv.IMC(altura, peso));
            lbResultadoLabel.setText(resultado +", você está com obesidade grau 2");
        }else if (opv.IMC(altura, peso) >50){
            resultado = String.valueOf(opv.IMC(altura, peso));
            lbResultadoLabel.setText(resultado +", você está com obesidade grau 3");
        }
        
      
       
    }//GEN-LAST:event_btnCalculoImcActionPerformed

    private void cpQuilometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpQuilometroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpQuilometroActionPerformed

    private void btnCalculoDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculoDistanciaActionPerformed
       
        quilometro = Double.parseDouble(String.valueOf(cpQuilometro.getText()));
        
            //metros
            resultado = String.valueOf(opv.distanciaMetro(quilometro));
            lbMetrosResposta.setText(resultado);
            //milhas
            resultado = String.valueOf(opv.distanciaMilha(quilometro));
            lbMilhasResposta.setText(resultado);    
            //centimetros
            resultado = String.valueOf(opv.distanciaCentimetros(quilometro));
            lbCentimetrosResposta.setText(resultado);
        
    }//GEN-LAST:event_btnCalculoDistanciaActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraCientifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraCientifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraCientifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraCientifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraCientifica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnBinario;
    private javax.swing.JButton btnCalculoDistancia;
    private javax.swing.JButton btnCalculoImc;
    private javax.swing.JButton btnCelcius;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnFahrenheit;
    private javax.swing.JButton btnHexadecimal;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnOctal;
    private javax.swing.JButton btnPi;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnRaizQuadrada;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JTextField cpAltura;
    private javax.swing.JTextField cpPeso;
    private javax.swing.JTextField cpQuilometro;
    private javax.swing.JTextField cpTexto;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelQuilometro;
    private javax.swing.JLabel lbCentimetros;
    private javax.swing.JLabel lbCentimetrosResposta;
    private javax.swing.JLabel lbMetros;
    private javax.swing.JLabel lbMetrosResposta;
    private javax.swing.JLabel lbMilhas;
    private javax.swing.JLabel lbMilhasResposta;
    private javax.swing.JLabel lbResultadoLabel;
    private java.awt.List list1;
    private javax.swing.JLabel valorTela;
    // End of variables declaration//GEN-END:variables
}
