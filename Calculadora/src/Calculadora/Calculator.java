

package Calculadora;

import java.util.TimerTask;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculator extends javax.swing.JFrame {
    ClasseCalculadora calc = new ClasseCalculadora();
    int R = 255;
    int G = 0;
    int B = 0;
    int controlador = 0;
    
    public void set(){
        if(calc.op == " "){
            display1.setText(" ");
        }else{
            display1.setText(calc.num1 + " " + calc.op + " " + calc.num2);
        }
        display2.setText(calc.resultado());
    }
    
    public Calculator() {
        initComponents();
        
        Thread t = new Thread(new Runnable(){
            @Override
            public void run(){
                while(true){
                    if(controlador == 0){
                        alterarcor(R,G,B);
                        R--;
                        G++;
                        if(G==255){
                            controlador++;
                        }
                    }else{
                        if(controlador == 1){
                            alterarcor(R,G,B);
                            G--;
                            B++;
                            if(B==255){
                            controlador++;
                            }
                        }else{
                            alterarcor(R,G,B);
                            B--;
                            R++;
                            if(R==255){
                            controlador=0;
                            }
                        }
                    }
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });/////PARA DESATIVAR A FUNÇÃO RGB COMETE ESSA THREAD
        t.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display1 = new javax.swing.JLabel();
        display2 = new javax.swing.JLabel();
        div = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        CE = new javax.swing.JButton();
        C = new javax.swing.JButton();
        fat = new javax.swing.JButton();
        nove = new javax.swing.JButton();
        oito = new javax.swing.JButton();
        sete = new javax.swing.JButton();
        quatro = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        um = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        dois = new javax.swing.JButton();
        vir = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        adi = new javax.swing.JButton();
        igu = new javax.swing.JButton();
        plus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(470, 465));

        display1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        display1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        display2.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        display2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        display2.setText("0.0");

        div.setBackground(new java.awt.Color(0, 0, 0));
        div.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        div.setForeground(new java.awt.Color(255, 255, 255));
        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        mul.setBackground(new java.awt.Color(0, 0, 0));
        mul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mul.setForeground(new java.awt.Color(255, 255, 255));
        mul.setText("x");
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });

        sub.setBackground(new java.awt.Color(0, 0, 0));
        sub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sub.setForeground(new java.awt.Color(255, 255, 255));
        sub.setText("-");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        CE.setBackground(new java.awt.Color(0, 0, 0));
        CE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CE.setForeground(new java.awt.Color(255, 255, 255));
        CE.setText("CE");
        CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEActionPerformed(evt);
            }
        });

        C.setBackground(new java.awt.Color(0, 0, 0));
        C.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C.setForeground(new java.awt.Color(255, 255, 255));
        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        fat.setBackground(new java.awt.Color(0, 0, 0));
        fat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fat.setForeground(new java.awt.Color(255, 255, 255));
        fat.setText("^");
        fat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatActionPerformed(evt);
            }
        });

        nove.setBackground(new java.awt.Color(0, 0, 0));
        nove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nove.setForeground(new java.awt.Color(255, 255, 255));
        nove.setText("9");
        nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noveActionPerformed(evt);
            }
        });

        oito.setBackground(new java.awt.Color(0, 0, 0));
        oito.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        oito.setForeground(new java.awt.Color(255, 255, 255));
        oito.setText("8");
        oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoActionPerformed(evt);
            }
        });

        sete.setBackground(new java.awt.Color(0, 0, 0));
        sete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sete.setForeground(new java.awt.Color(255, 255, 255));
        sete.setText("7");
        sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteActionPerformed(evt);
            }
        });

        quatro.setBackground(new java.awt.Color(0, 0, 0));
        quatro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        quatro.setForeground(new java.awt.Color(255, 255, 255));
        quatro.setText("4");
        quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroActionPerformed(evt);
            }
        });

        seis.setBackground(new java.awt.Color(0, 0, 0));
        seis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seis.setForeground(new java.awt.Color(255, 255, 255));
        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        cinco.setBackground(new java.awt.Color(0, 0, 0));
        cinco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cinco.setForeground(new java.awt.Color(255, 255, 255));
        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        um.setBackground(new java.awt.Color(0, 0, 0));
        um.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        um.setForeground(new java.awt.Color(255, 255, 255));
        um.setText("1");
        um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umActionPerformed(evt);
            }
        });

        tres.setBackground(new java.awt.Color(0, 0, 0));
        tres.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tres.setForeground(new java.awt.Color(255, 255, 255));
        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        dois.setBackground(new java.awt.Color(0, 0, 0));
        dois.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dois.setForeground(new java.awt.Color(255, 255, 255));
        dois.setText("2");
        dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisActionPerformed(evt);
            }
        });

        vir.setBackground(new java.awt.Color(0, 0, 0));
        vir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vir.setForeground(new java.awt.Color(255, 255, 255));
        vir.setText(",");
        vir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                virActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(0, 0, 0));
        zero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        zero.setForeground(new java.awt.Color(255, 255, 255));
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        adi.setBackground(new java.awt.Color(0, 0, 0));
        adi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adi.setForeground(new java.awt.Color(255, 255, 255));
        adi.setText("+");
        adi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adiActionPerformed(evt);
            }
        });

        igu.setBackground(new java.awt.Color(0, 0, 0));
        igu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        igu.setForeground(new java.awt.Color(255, 255, 255));
        igu.setText("=");
        igu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iguActionPerformed(evt);
            }
        });

        plus.setBackground(new java.awt.Color(0, 0, 0));
        plus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        plus.setForeground(new java.awt.Color(255, 255, 255));
        plus.setText("±");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fat, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(div, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sete, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oito, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nove, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(display2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(igu, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dois, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adi, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fat, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nove, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oito, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dois, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(igu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
        // TODO add your handling code here:
        calc.receberop("*");
        set();
    }//GEN-LAST:event_mulActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        // TODO add your handling code here:
        calc.recebernum('3');
        set();
    }//GEN-LAST:event_tresActionPerformed

    private void quatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroActionPerformed
        // TODO add your handling code here:
        calc.recebernum('4');
        set();
    }//GEN-LAST:event_quatroActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
        calc.zerar();
        set();
    }//GEN-LAST:event_CActionPerformed

    private void umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umActionPerformed
            // TODO add your handling code here:
        calc.recebernum('1');
        set();
    }//GEN-LAST:event_umActionPerformed

    private void doisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisActionPerformed
        // TODO add your handling code here:
        calc.recebernum('2');
        set();
    }//GEN-LAST:event_doisActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        // TODO add your handling code here:
        calc.recebernum('5');
        set();
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        // TODO add your handling code here:
        calc.recebernum('6');
        set();
    }//GEN-LAST:event_seisActionPerformed

    private void seteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteActionPerformed
        // TODO add your handling code here:
        calc.recebernum('7');
        set();
    }//GEN-LAST:event_seteActionPerformed

    private void oitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoActionPerformed
        // TODO add your handling code here:
        calc.recebernum('8');
        set();
    }//GEN-LAST:event_oitoActionPerformed

    private void noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveActionPerformed
        // TODO add your handling code here:
        calc.recebernum('9');
        set();
    }//GEN-LAST:event_noveActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        // TODO add your handling code here:
        calc.recebernum('0');
        set();
    }//GEN-LAST:event_zeroActionPerformed

    private void adiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adiActionPerformed
        // TODO add your handling code here:
        calc.receberop("+");
        set();
    }//GEN-LAST:event_adiActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        // TODO add your handling code here:
        calc.receberop("-");
        set();
    }//GEN-LAST:event_subActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        // TODO add your handling code here:
        calc.receberop("/");
        set();
    }//GEN-LAST:event_divActionPerformed

    private void fatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatActionPerformed
        // TODO add your handling code here:
        calc.receberop("^");
        set();
    }//GEN-LAST:event_fatActionPerformed

    private void iguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iguActionPerformed
        // TODO add your handling code here:
        calc.igual();
        set();
    }//GEN-LAST:event_iguActionPerformed

    private void CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEActionPerformed
        // TODO add your handling code here:
        calc.ce();
        set();
    }//GEN-LAST:event_CEActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        calc.negativar();
        set();
        // TODO add your handling code here:
    }//GEN-LAST:event_plusActionPerformed

    private void virActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_virActionPerformed
        // TODO add your handling code here:
        calc.virgula();
        set();
    }//GEN-LAST:event_virActionPerformed
    void alterarcor(int r, int g, int b){
        um.setForeground(new java.awt.Color(r,g,b));
        dois.setForeground(new java.awt.Color(r,g,b));
        tres.setForeground(new java.awt.Color(r,g,b));
        quatro.setForeground(new java.awt.Color(r,g,b));
        cinco.setForeground(new java.awt.Color(r,g,b));
        seis.setForeground(new java.awt.Color(r,g,b));
        sete.setForeground(new java.awt.Color(r,g,b));
        oito.setForeground(new java.awt.Color(r,g,b));
        nove.setForeground(new java.awt.Color(r,g,b));
        zero.setForeground(new java.awt.Color(r,g,b));
        plus.setForeground(new java.awt.Color(r,g,b));
        mul.setForeground(new java.awt.Color(r,g,b));
        igu.setForeground(new java.awt.Color(r,g,b));
        sub.setForeground(new java.awt.Color(r,g,b));
        div.setForeground(new java.awt.Color(r,g,b));
        fat.setForeground(new java.awt.Color(r,g,b));
        C.setForeground(new java.awt.Color(r,g,b));
        CE.setForeground(new java.awt.Color(r,g,b));
        vir.setForeground(new java.awt.Color(r,g,b));
        adi.setForeground(new java.awt.Color(r,g,b));
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C;
    private javax.swing.JButton CE;
    private javax.swing.JButton adi;
    private javax.swing.JButton cinco;
    private javax.swing.JLabel display1;
    private javax.swing.JLabel display2;
    private javax.swing.JButton div;
    private javax.swing.JButton dois;
    private javax.swing.JButton fat;
    private javax.swing.JButton igu;
    private javax.swing.JButton mul;
    private javax.swing.JButton nove;
    private javax.swing.JButton oito;
    private javax.swing.JButton plus;
    private javax.swing.JButton quatro;
    private javax.swing.JButton seis;
    private javax.swing.JButton sete;
    private javax.swing.JButton sub;
    private javax.swing.JButton tres;
    private javax.swing.JButton um;
    private javax.swing.JButton vir;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables

}
