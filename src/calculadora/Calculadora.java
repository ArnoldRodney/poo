package calculadora;

import java.awt.Color;

/**
 * @author Arnold
 */
public class Calculadora extends javax.swing.JFrame {
    
    private double n1;
    private double n2;
    private String operacion;

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
      
        initComponents();
        trns();
        this.getContentPane().setBackground(Color.white);
        jPanel1.setBackground(Color.white);

        this.setTitle("Calculadora");
        this.setLocationRelativeTo(null);
        
    }
   
    
    public void trns(){
      
        
        //raiz
        RAIZ.setOpaque(false);
        RAIZ.setContentAreaFilled(false);
        RAIZ.setBorderPainted(false);
        
        //mas
        ADICION.setOpaque(false);
        ADICION.setContentAreaFilled(false);
        ADICION.setBorderPainted(false);
        //menos
        SUSTRACCION.setOpaque(false);
        SUSTRACCION.setContentAreaFilled(false);
        SUSTRACCION.setBorderPainted(false);
        //multiplicacion
        MULTIPLICACION.setOpaque(false);
        MULTIPLICACION.setContentAreaFilled(false);
        MULTIPLICACION.setBorderPainted(false);
        //division
        DIVISION.setOpaque(false);
        DIVISION.setContentAreaFilled(false);
        DIVISION.setBorderPainted(false);
        //porcentaje
        PORCENTAJE.setOpaque(false);
        PORCENTAJE.setContentAreaFilled(false);
        PORCENTAJE.setBorderPainted(false);
        //borrart
        BORRAR.setOpaque(false);
        BORRAR.setContentAreaFilled(false);
        BORRAR.setBorderPainted(false);
        //borrar
        BORRARTODO.setOpaque(false);
        BORRARTODO.setContentAreaFilled(false);
        BORRARTODO.setBorderPainted(false);
        //1
        UNO.setOpaque(false);
        UNO.setContentAreaFilled(false);
        UNO.setBorderPainted(false);
        //2
        DOS.setOpaque(false);
        DOS.setContentAreaFilled(false);
        DOS.setBorderPainted(false);
        //3
        TRES.setOpaque(false);
        TRES.setContentAreaFilled(false);
        TRES.setBorderPainted(false);
        //4
        CUATRO.setOpaque(false);
        CUATRO.setContentAreaFilled(false);
        CUATRO.setBorderPainted(false);
         //5
        CINCO.setOpaque(false);
        CINCO.setContentAreaFilled(false);
        CINCO.setBorderPainted(false);
        //6
        SEIS.setOpaque(false);
        SEIS.setContentAreaFilled(false);
        SEIS.setBorderPainted(false);
        //7
        SIETE.setOpaque(false);
        SIETE.setContentAreaFilled(false);
        SIETE.setBorderPainted(false);
        //8
        OCHO.setOpaque(false);
        OCHO.setContentAreaFilled(false);
        OCHO.setBorderPainted(false);//6
        SEIS.setOpaque(false);
        SEIS.setContentAreaFilled(false);
        SEIS.setBorderPainted(false);
        //7
        SIETE.setOpaque(false);
        SIETE.setContentAreaFilled(false);
        SIETE.setBorderPainted(false);
        //8
        OCHO.setOpaque(false);
        OCHO.setContentAreaFilled(false);
        OCHO.setBorderPainted(false);
        //9
        NUEVE.setOpaque(false);
        NUEVE.setContentAreaFilled(false);
        NUEVE.setBorderPainted(false);
       //0
        CERO.setOpaque(false);
        CERO.setContentAreaFilled(false);
        CERO.setBorderPainted(false);
        //.
        PUNTO.setOpaque(false);
        PUNTO.setContentAreaFilled(false);
        PUNTO.setBorderPainted(false);
        //etrada
        entrada.setOpaque(false);
        entrada.setBorder(null);
        //igual
        IGUAL.setOpaque(false);
        IGUAL.setContentAreaFilled(false);
        IGUAL.setBorderPainted(false);
        //jLabel1
       ;
        
        
        
        
    }
    public void entrada_datos(String texto){
        
        entrada.setText(entrada.getText()+ texto);
    }
    public void SELECIONARO(String operacion){
        
        n1= Double.parseDouble(entrada.getText());
        entrada.setText(" ");
        this.operacion= operacion;
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTextField1 = new javax.swing.JTextField();
        BORRARTODO = new javax.swing.JButton();
        BORRAR = new javax.swing.JButton();
        DIVISION = new javax.swing.JButton();
        MULTIPLICACION = new javax.swing.JButton();
        SUSTRACCION = new javax.swing.JButton();
        RAIZ = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        NUEVE = new javax.swing.JButton();
        OCHO = new javax.swing.JButton();
        SIETE = new javax.swing.JButton();
        CINCO = new javax.swing.JButton();
        CUATRO = new javax.swing.JButton();
        DOS = new javax.swing.JButton();
        SEIS = new javax.swing.JButton();
        CERO = new javax.swing.JButton();
        PUNTO = new javax.swing.JButton();
        TRES = new javax.swing.JButton();
        UNO = new javax.swing.JButton();
        IGUAL = new javax.swing.JButton();
        ADICION = new javax.swing.JButton();
        entrada = new javax.swing.JTextField();
        PORCENTAJE = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        BORRARTODO.setBackground(java.awt.Color.black);
        BORRARTODO.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        BORRARTODO.setForeground(new java.awt.Color(255, 102, 51));
        BORRARTODO.setText("????");
        BORRARTODO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BORRARTODOActionPerformed(evt);
            }
        });

        BORRAR.setBackground(java.awt.Color.black);
        BORRAR.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BORRAR.setForeground(new java.awt.Color(255, 102, 51));
        BORRAR.setText("C");
        BORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BORRARActionPerformed(evt);
            }
        });

        DIVISION.setBackground(java.awt.Color.black);
        DIVISION.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DIVISION.setForeground(new java.awt.Color(255, 102, 51));
        DIVISION.setText("???");
        DIVISION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIVISIONActionPerformed(evt);
            }
        });

        MULTIPLICACION.setBackground(java.awt.Color.black);
        MULTIPLICACION.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MULTIPLICACION.setForeground(new java.awt.Color(255, 102, 51));
        MULTIPLICACION.setText("???");
        MULTIPLICACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MULTIPLICACIONActionPerformed(evt);
            }
        });

        SUSTRACCION.setBackground(java.awt.Color.black);
        SUSTRACCION.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SUSTRACCION.setForeground(new java.awt.Color(255, 102, 51));
        SUSTRACCION.setText("???");
        SUSTRACCION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUSTRACCIONActionPerformed(evt);
            }
        });

        RAIZ.setBackground(java.awt.Color.black);
        RAIZ.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        RAIZ.setForeground(new java.awt.Color(255, 102, 51));
        RAIZ.setText("??? ");
        RAIZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAIZActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        NUEVE.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        NUEVE.setText("9");
        NUEVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEVEActionPerformed(evt);
            }
        });

        OCHO.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        OCHO.setText("8");
        OCHO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OCHOActionPerformed(evt);
            }
        });

        SIETE.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        SIETE.setText("7");
        SIETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIETEActionPerformed(evt);
            }
        });

        CINCO.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        CINCO.setText("5");
        CINCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CINCOActionPerformed(evt);
            }
        });

        CUATRO.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        CUATRO.setText("4");
        CUATRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUATROActionPerformed(evt);
            }
        });

        DOS.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        DOS.setText("2");
        DOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOSActionPerformed(evt);
            }
        });

        SEIS.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        SEIS.setText("6");
        SEIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEISActionPerformed(evt);
            }
        });

        CERO.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        CERO.setText("0");
        CERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEROActionPerformed(evt);
            }
        });

        PUNTO.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        PUNTO.setText(".");
        PUNTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PUNTOActionPerformed(evt);
            }
        });

        TRES.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        TRES.setText("3");
        TRES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRESActionPerformed(evt);
            }
        });

        UNO.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        UNO.setText("1");
        UNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNOActionPerformed(evt);
            }
        });

        IGUAL.setBackground(java.awt.Color.black);
        IGUAL.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        IGUAL.setForeground(new java.awt.Color(255, 102, 51));
        IGUAL.setText("=");
        IGUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IGUALActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UNO, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(IGUAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PUNTO, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OCHO, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NUEVE, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NUEVE, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OCHO, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(IGUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PUNTO, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        ADICION.setBackground(java.awt.Color.black);
        ADICION.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ADICION.setForeground(new java.awt.Color(255, 102, 51));
        ADICION.setText("???");
        ADICION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADICIONActionPerformed(evt);
            }
        });

        entrada.setEditable(false);
        entrada.setBackground(java.awt.Color.white);
        entrada.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        entrada.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        entrada.setToolTipText("");
        entrada.setDisabledTextColor(java.awt.Color.black);
        entrada.setSelectedTextColor(java.awt.Color.black);
        entrada.setSelectionColor(java.awt.Color.black);
        entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaActionPerformed(evt);
            }
        });

        PORCENTAJE.setBackground(java.awt.Color.black);
        PORCENTAJE.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PORCENTAJE.setForeground(new java.awt.Color(255, 102, 51));
        PORCENTAJE.setText("%");
        PORCENTAJE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PORCENTAJEActionPerformed(evt);
            }
        });

        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("__________________________________");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SUSTRACCION, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(MULTIPLICACION, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ADICION, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RAIZ, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BORRARTODO, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PORCENTAJE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DIVISION, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(entrada, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(DIVISION, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BORRARTODO, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PORCENTAJE, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MULTIPLICACION, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(ADICION, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(SUSTRACCION, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RAIZ, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DIVISIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIVISIONActionPerformed
        // TODO add your handling code here:
        SELECIONARO("/");
    }//GEN-LAST:event_DIVISIONActionPerformed

    private void MULTIPLICACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MULTIPLICACIONActionPerformed
        // TODO add your handling code here:
        SELECIONARO("*");
    }//GEN-LAST:event_MULTIPLICACIONActionPerformed

    private void entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_entradaActionPerformed

    private void UNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UNOActionPerformed
        // TODO add your handling code here:
        entrada_datos("1");
    }//GEN-LAST:event_UNOActionPerformed

    private void DOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOSActionPerformed
        // TODO add your handling code here:
        entrada_datos("2");
    }//GEN-LAST:event_DOSActionPerformed

    private void TRESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRESActionPerformed
        // TODO add your handling code here:
        entrada_datos("3");
    }//GEN-LAST:event_TRESActionPerformed

    private void CEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEROActionPerformed
        // TODO add your handling code here:
        entrada_datos("0");
    }//GEN-LAST:event_CEROActionPerformed

    private void CUATROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUATROActionPerformed
        // TODO add your handling code here:
        entrada_datos("4");
    }//GEN-LAST:event_CUATROActionPerformed

    private void CINCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CINCOActionPerformed
        // TODO add your handling code here:
        entrada_datos("5");
    }//GEN-LAST:event_CINCOActionPerformed

    private void SEISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEISActionPerformed
        // TODO add your handling code here:
        entrada_datos("6");
    }//GEN-LAST:event_SEISActionPerformed

    private void SIETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIETEActionPerformed
        // TODO add your handling code here:
        entrada_datos("7");
    }//GEN-LAST:event_SIETEActionPerformed

    private void OCHOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OCHOActionPerformed
        // TODO add your handling code here:
        entrada_datos("8");
    }//GEN-LAST:event_OCHOActionPerformed

    private void NUEVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEVEActionPerformed
        // TODO add your handling code here:
        entrada_datos("9");
    }//GEN-LAST:event_NUEVEActionPerformed

    private void PUNTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PUNTOActionPerformed
        // TODO add your handling code here:
        entrada_datos(".");
        

    }//GEN-LAST:event_PUNTOActionPerformed

    private void RAIZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAIZActionPerformed
        // TODO add your handling code here:
        
        n1= Double.parseDouble(entrada.getText());
        n1=Math.sqrt(n1);
        entrada.setText(sincero(n1));
        
    }//GEN-LAST:event_RAIZActionPerformed

    private void ADICIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADICIONActionPerformed
        // TODO add your handling code here:
        
        
        SELECIONARO("+");
        
                
    }//GEN-LAST:event_ADICIONActionPerformed

    private void BORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BORRARActionPerformed
        // TODO add your handling code here:
        String Texto=entrada.getText().substring(0,entrada.getText().length()-1);
        entrada.setText(Texto);

    
        
    }//GEN-LAST:event_BORRARActionPerformed

    private void BORRARTODOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BORRARTODOActionPerformed
        // TODO add your handling code here:
        entrada.setText("");
        n1=0;
        n2=0;
        operacion=" ";
       
        
    }//GEN-LAST:event_BORRARTODOActionPerformed

    private void SUSTRACCIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUSTRACCIONActionPerformed
        // TODO add your handling code here:
        SELECIONARO("-");
       
    }//GEN-LAST:event_SUSTRACCIONActionPerformed

    private void PORCENTAJEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PORCENTAJEActionPerformed
        // TODO add your handling code here:
        n1= Double.parseDouble(entrada.getText());
        n1=n1/100;
        entrada.setText(sincero(n1));
        
    }//GEN-LAST:event_PORCENTAJEActionPerformed
   public String sincero(double resultado){
       
       String retorno = " ";
       retorno=Double.toString(resultado);
       
       if(resultado%1==0){
           retorno=retorno.substring(0,retorno.length()-2);
       }
       else {
           
       }
       return retorno;
   }
    
    private void IGUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IGUALActionPerformed
        // TODO add your handling code here:
        
        n2=Double.parseDouble(entrada.getText());
        
        switch(operacion){
            
            case "+":
            n2+=n1;
            entrada.setText(sincero(n2));
            break;
            case "-":
            n1-=n2;
            
            entrada.setText(sincero(n1));
            break;
            case "*":
            n2*=n1;
            
            entrada.setText(sincero(n2));
            break;
            case "/":
            n1/=n2;
            entrada.setText(sincero(n1));
            break;
            default :
                 entrada.setText(sincero(n1));
        }
    }//GEN-LAST:event_IGUALActionPerformed
  
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADICION;
    private javax.swing.JButton BORRAR;
    private javax.swing.JButton BORRARTODO;
    private javax.swing.JButton CERO;
    private javax.swing.JButton CINCO;
    private javax.swing.JButton CUATRO;
    private javax.swing.JButton DIVISION;
    private javax.swing.JButton DOS;
    private javax.swing.JButton IGUAL;
    private javax.swing.JButton MULTIPLICACION;
    private javax.swing.JButton NUEVE;
    private javax.swing.JButton OCHO;
    private javax.swing.JButton PORCENTAJE;
    private javax.swing.JButton PUNTO;
    private javax.swing.JButton RAIZ;
    private javax.swing.JButton SEIS;
    private javax.swing.JButton SIETE;
    private javax.swing.JButton SUSTRACCION;
    private javax.swing.JButton TRES;
    private javax.swing.JButton UNO;
    private javax.swing.JTextField entrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
