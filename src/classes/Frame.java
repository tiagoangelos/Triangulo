package classes;

import javax.swing.JOptionPane;

public class Frame extends javax.swing.JFrame {
    
    public Frame() {
        initComponents(); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTextA = new javax.swing.JLabel();
        lblTextB = new javax.swing.JLabel();
        lblTextC = new javax.swing.JLabel();
        sliderA = new javax.swing.JSlider();
        sliderB = new javax.swing.JSlider();
        sliderC = new javax.swing.JSlider();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        btnVerify = new javax.swing.JButton();
        btnCleanAll = new javax.swing.JButton();
        lblDialog = new javax.swing.JLabel();
        penelResult = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        lblTypeTriangle = new javax.swing.JLabel();
        menuMain = new javax.swing.JMenuBar();
        menuAbout = new javax.swing.JMenu();
        menuHelp = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Triangulo - Qual Tipo?");
        setResizable(false);

        lblTextA.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        lblTextA.setText("Segmento (A)");

        lblTextB.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        lblTextB.setText("Segmento (B)");

        lblTextC.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        lblTextC.setText("Segmento (C)");

        sliderA.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        sliderA.setMaximum(20);
        sliderA.setPaintLabels(true);
        sliderA.setValue(0);
        sliderA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderAStateChanged(evt);
            }
        });

        sliderB.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        sliderB.setMaximum(20);
        sliderB.setPaintLabels(true);
        sliderB.setValue(0);
        sliderB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBStateChanged(evt);
            }
        });

        sliderC.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        sliderC.setMaximum(20);
        sliderC.setPaintLabels(true);
        sliderC.setValue(0);
        sliderC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderCStateChanged(evt);
            }
        });

        lblA.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        lblA.setText("0");

        lblB.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        lblB.setText("0");

        lblC.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        lblC.setText("0");

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/triangulo-230x230.png"))); // NOI18N

        btnVerify.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVerify.setForeground(new java.awt.Color(0, 51, 255));
        btnVerify.setText("Verificar Tipo");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });

        btnCleanAll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCleanAll.setForeground(new java.awt.Color(255, 51, 51));
        btnCleanAll.setText("Limpar Tudo");
        btnCleanAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanAllActionPerformed(evt);
            }
        });

        lblDialog.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        lblDialog.setForeground(new java.awt.Color(0, 51, 255));
        lblDialog.setText("Informe Valores de A, B, e C:");

        lblStatus.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(0, 51, 255));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("Forma?");

        lblTypeTriangle.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        lblTypeTriangle.setForeground(new java.awt.Color(255, 51, 51));
        lblTypeTriangle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTypeTriangle.setText("Tipo de Triângulo");

        javax.swing.GroupLayout penelResultLayout = new javax.swing.GroupLayout(penelResult);
        penelResult.setLayout(penelResultLayout);
        penelResultLayout.setHorizontalGroup(
            penelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penelResultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(penelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTypeTriangle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        penelResultLayout.setVerticalGroup(
            penelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penelResultLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblStatus)
                .addGap(26, 26, 26)
                .addComponent(lblTypeTriangle)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        menuAbout.setText("Sobre");
        menuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAboutMouseClicked(evt);
            }
        });
        menuMain.add(menuAbout);

        menuHelp.setText("Ajuda");
        menuHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHelpMouseClicked(evt);
            }
        });
        menuMain.add(menuHelp);

        menuExit.setText("Sair");
        menuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuExitMouseClicked(evt);
            }
        });
        menuMain.add(menuExit);

        setJMenuBar(menuMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTextC)
                                    .addComponent(lblTextB)
                                    .addComponent(lblTextA))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sliderA, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblA))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sliderB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblB))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sliderC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblC))))
                            .addComponent(lblDialog)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCleanAll, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(lblIcon))
                    .addComponent(penelResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDialog)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblA)
                            .addComponent(sliderA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTextA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sliderB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblB)
                            .addComponent(lblTextB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTextC))
                                .addComponent(lblC))
                            .addComponent(sliderC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(btnVerify)
                        .addGap(18, 18, 18)
                        .addComponent(btnCleanAll)
                        .addGap(26, 26, 26)))
                .addComponent(penelResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAboutMouseClicked
        JOptionPane.showMessageDialog(null,
                "Sobre\n\n"
              + "Essa aplicação tem por objetivo resolver exercicios\n"
              + "sobre Tipos de triângulos e suas Possiveis formações."
              , "Sobre", JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_menuAboutMouseClicked

    private void menuHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHelpMouseClicked
        JOptionPane.showMessageDialog(null,
                "Ajuda\n\n"
              + "Para Usar é bem simples basta apenas informar os valores\n"
              + "dos segmentos de A, B, e C. após isso clique em\n"
              + "'Verificar Tipo'."
              , "Ajuda", JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_menuHelpMouseClicked

    private void menuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuExitMouseClicked

    private void sliderAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderAStateChanged
        lblA.setText(Integer.toString(sliderA.getValue()));
    }//GEN-LAST:event_sliderAStateChanged

    private void sliderBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBStateChanged
        lblB.setText(Integer.toString(sliderB.getValue()));
    }//GEN-LAST:event_sliderBStateChanged

    private void sliderCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderCStateChanged
        lblC.setText(Integer.toString(sliderC.getValue()));
    }//GEN-LAST:event_sliderCStateChanged
    
    private boolean verifyValues(int a, int b, int c){
        if(a == 0 && b == 0 && c == 0){
           JOptionPane.showMessageDialog(null, "Por favor, informe os valores de A, B e C!"); 
           return false;
        }else{
           return true;
        }
    }
    
    private void formTriangle(int a, int b, int c){
        if(a < b+c && b < a+c && c < a+b){
            lblStatus.setText("Forma um Triângulo!");
            
            if(a == b && b == c){
                lblTypeTriangle.setText("Equilátero"); 
            }else if(a != b && b != c && a != c){
                lblTypeTriangle.setText("Escaleno"); 
            }else {
                lblTypeTriangle.setText("Isóceles");
            }
        }else{
            lblStatus.setText("Não forma um triângulo!");
            lblTypeTriangle.setText("-----------");
        }
    }
    
    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
        int a = sliderA.getValue();
        int b = sliderB.getValue();
        int c = sliderC.getValue();
        
        boolean vef = verifyValues(a, b, c);
        
        if(vef == true){
            formTriangle(a, b, c);
        }
    }//GEN-LAST:event_btnVerifyActionPerformed

    private void btnCleanAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanAllActionPerformed
        sliderA.setValue(0);
        sliderB.setValue(0);
        sliderC.setValue(0);
        
        lblA.setText("0");
        lblB.setText("0");
        lblC.setText("0");
        
        lblStatus.setText("Forma?");
        lblTypeTriangle.setText("Tipo de Triângulo");
    }//GEN-LAST:event_btnCleanAllActionPerformed
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCleanAll;
    private javax.swing.JButton btnVerify;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblDialog;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTextA;
    private javax.swing.JLabel lblTextB;
    private javax.swing.JLabel lblTextC;
    private javax.swing.JLabel lblTypeTriangle;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenu menuExit;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuBar menuMain;
    private javax.swing.JPanel penelResult;
    private javax.swing.JSlider sliderA;
    private javax.swing.JSlider sliderB;
    private javax.swing.JSlider sliderC;
    // End of variables declaration//GEN-END:variables
}