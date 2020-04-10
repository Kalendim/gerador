
package visao;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Turma;
import modelo.Turma;
import modelo.Validar;
import servicos.TurmaServicos;
import servicos.ServicoFactory;


public class UICadTurma extends javax.swing.JInternalFrame {
    /**
     * Creates new form UICadPessoa
     */
    public UICadTurma() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEnsino = new javax.swing.ButtonGroup();
        bgTurno = new javax.swing.ButtonGroup();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jrbFundamental = new javax.swing.JRadioButton();
        jtAnoLetivo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtDataDeInicio = new javax.swing.JTextField();
        jtNumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jbCadastrar1 = new javax.swing.JButton();
        jrbMedio = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jrbManha = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jrbTarde = new javax.swing.JRadioButton();
        jrbNoite = new javax.swing.JRadioButton();
        jtNumeroDePeriodos = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        JLNumeroErro = new javax.swing.JLabel();
        jlAnoErro = new javax.swing.JLabel();
        jlDIErro = new javax.swing.JLabel();
        jlNPErro = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jrbFundamental1 = new javax.swing.JRadioButton();
        jtClasseSocial1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtNascimento1 = new javax.swing.JTextField();
        jtNome1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtNascionalidade1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jbCadastrar2 = new javax.swing.JButton();
        jrbMedio1 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Turma");
        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(0, 0));

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de turma"));

        bgEnsino.add(jrbFundamental);
        jrbFundamental.setText("Fundamental");
        jrbFundamental.setActionCommand("fundamental");
        jrbFundamental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFundamentalActionPerformed(evt);
            }
        });
        jrbFundamental.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrbFundamentalKeyPressed(evt);
            }
        });

        jtAnoLetivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtAnoLetivoFocusLost(evt);
            }
        });
        jtAnoLetivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtAnoLetivoKeyPressed(evt);
            }
        });

        jLabel7.setText("Ano letivo");

        jLabel3.setText("Data de inicio:");

        jtDataDeInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtDataDeInicioFocusLost(evt);
            }
        });

        jtNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNumeroFocusLost(evt);
            }
        });
        jtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNumeroActionPerformed(evt);
            }
        });
        jtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNumeroKeyPressed(evt);
            }
        });

        jLabel1.setText("Numero Da Sala:");

        jLabel10.setText("Ensino:");

        jbCadastrar1.setText("Cadastrar");
        jbCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrar1ActionPerformed(evt);
            }
        });

        bgEnsino.add(jrbMedio);
        jrbMedio.setText("Médio");
        jrbMedio.setActionCommand("medio");
        jrbMedio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrbMedioKeyPressed(evt);
            }
        });

        jLabel4.setText("Ex: 10/10/2010");

        bgTurno.add(jrbManha);
        jrbManha.setText("Manhã");
        jrbManha.setActionCommand("Manhã");
        jrbManha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbManhaActionPerformed(evt);
            }
        });
        jrbManha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrbManhaKeyPressed(evt);
            }
        });

        jLabel13.setText("Turno:");

        bgTurno.add(jrbTarde);
        jrbTarde.setText("Tarde");
        jrbTarde.setActionCommand("Tarde");
        jrbTarde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrbTardeKeyPressed(evt);
            }
        });

        bgTurno.add(jrbNoite);
        jrbNoite.setText("Noite");
        jrbNoite.setActionCommand("Noite");
        jrbNoite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrbNoiteKeyPressed(evt);
            }
        });

        jtNumeroDePeriodos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNumeroDePeriodosFocusLost(evt);
            }
        });
        jtNumeroDePeriodos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNumeroDePeriodosKeyPressed(evt);
            }
        });

        jLabel14.setText("Numero de periodos");

        jLayeredPane3.setLayer(jrbFundamental, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jtAnoLetivo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jtDataDeInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jtNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jbCadastrar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jrbMedio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jrbManha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jrbTarde, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jrbNoite, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jtNumeroDePeriodos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(JLNumeroErro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jlAnoErro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jlDIErro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jlNPErro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtNumero))
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtDataDeInicio))
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtAnoLetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtNumeroDePeriodos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNumeroErro)
                            .addComponent(jlAnoErro)
                            .addComponent(jlDIErro)
                            .addComponent(jlNPErro)))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbManha)
                                    .addComponent(jrbNoite)
                                    .addComponent(jrbTarde)))
                            .addComponent(jbCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbMedio)
                                    .addComponent(jrbFundamental)))
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel4)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLNumeroErro))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jrbFundamental))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbMedio)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtAnoLetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAnoErro))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtDataDeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDIErro))
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jrbManha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbTarde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbNoite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtNumeroDePeriodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNPErro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jbCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setTitle("Cadastro de Turma");
        jInternalFrame1.setMaximumSize(new java.awt.Dimension(0, 0));
        jInternalFrame1.setMinimumSize(new java.awt.Dimension(0, 0));

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de turma"));

        bgEnsino.add(jrbFundamental1);
        jrbFundamental1.setText("Fundamental");
        jrbFundamental1.setActionCommand("pobre");
        jrbFundamental1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFundamental1ActionPerformed(evt);
            }
        });
        jrbFundamental1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrbFundamental1KeyPressed(evt);
            }
        });

        jtClasseSocial1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtClasseSocial1FocusLost(evt);
            }
        });
        jtClasseSocial1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtClasseSocial1KeyPressed(evt);
            }
        });

        jLabel8.setText("Ano letivo");

        jLabel5.setText("Data de inicio:");

        jtNome1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNome1FocusLost(evt);
            }
        });
        jtNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNome1ActionPerformed(evt);
            }
        });
        jtNome1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNome1KeyPressed(evt);
            }
        });

        jLabel6.setText("Numero:");

        jLabel9.setText("Ano:");

        jtNascionalidade1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNascionalidade1FocusLost(evt);
            }
        });
        jtNascionalidade1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNascionalidade1KeyPressed(evt);
            }
        });

        jLabel11.setText("Ensino:");

        jbCadastrar2.setText("Cadastrar");
        jbCadastrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrar2ActionPerformed(evt);
            }
        });

        bgEnsino.add(jrbMedio1);
        jrbMedio1.setText("Médio");
        jrbMedio1.setActionCommand("rico");
        jrbMedio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrbMedio1KeyPressed(evt);
            }
        });

        jLabel12.setText("Ex: 10/10/2010");

        jLayeredPane4.setLayer(jrbFundamental1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtClasseSocial1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtNascimento1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtNome1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtNascionalidade1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jbCadastrar2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jrbMedio1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtClasseSocial1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbCadastrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbMedio1)
                            .addComponent(jrbFundamental1)))
                    .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane4Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtNascionalidade1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane4Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtNascimento1)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jrbFundamental1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbMedio1)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtClasseSocial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNascionalidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jtNascimento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCadastrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane3)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 199, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 199, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNumeroKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNumeroKeyPressed

    private void jtNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNumeroFocusLost
        // TODO add your handling code here:
         if(!Validar.validarNumero(jtNumero.getText())){
           jtNumero.setBorder(BorderFactory.createLineBorder(Color.red));
            JLNumeroErro.setIcon(
            new ImageIcon(
            getClass().getResource("/imagens/error.png")));
        }else{
            jtNumero.setBorder(BorderFactory.createLineBorder(Color.green));
            JLNumeroErro.setIcon(
            new ImageIcon(
            getClass().getResource("/imagens/ok.png")));
        }          
    }//GEN-LAST:event_jtNumeroFocusLost

    private void jtAnoLetivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAnoLetivoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAnoLetivoKeyPressed

    private void jtAnoLetivoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtAnoLetivoFocusLost
        // TODO add your handling code here:
         if(!Validar.validarNumero(jtAnoLetivo.getText())){
           jtAnoLetivo.setBorder(BorderFactory.createLineBorder(Color.red));
            jlAnoErro.setIcon(
            new ImageIcon(
            getClass().getResource("/imagens/error.png")));
        }else{
            jtAnoLetivo.setBorder(BorderFactory.createLineBorder(Color.green));
            jlAnoErro.setIcon(
            new ImageIcon(
            getClass().getResource("/imagens/ok.png")));
        }          
    }//GEN-LAST:event_jtAnoLetivoFocusLost

    private void jbCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrar1ActionPerformed
        // TODO add your handling code here:
        cadastrar();
    }//GEN-LAST:event_jbCadastrar1ActionPerformed

    private void jrbMedioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrbMedioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbMedioKeyPressed

    private void jrbFundamentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFundamentalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbFundamentalActionPerformed

    private void jrbFundamentalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrbFundamentalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbFundamentalKeyPressed

    private void jtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNumeroActionPerformed

    private void jrbFundamental1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFundamental1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbFundamental1ActionPerformed

    private void jrbFundamental1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrbFundamental1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbFundamental1KeyPressed

    private void jtClasseSocial1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtClasseSocial1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtClasseSocial1FocusLost

    private void jtClasseSocial1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtClasseSocial1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtClasseSocial1KeyPressed

    private void jtNome1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNome1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNome1FocusLost

    private void jtNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNome1ActionPerformed

    private void jtNome1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNome1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNome1KeyPressed

    private void jtNascionalidade1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNascionalidade1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNascionalidade1FocusLost

    private void jtNascionalidade1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNascionalidade1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNascionalidade1KeyPressed

    private void jbCadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCadastrar2ActionPerformed

    private void jrbMedio1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrbMedio1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbMedio1KeyPressed

    private void jrbManhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrbManhaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbManhaKeyPressed

    private void jrbManhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbManhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbManhaActionPerformed

    private void jrbNoiteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrbNoiteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbNoiteKeyPressed

    private void jrbTardeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrbTardeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbTardeKeyPressed

    private void jtNumeroDePeriodosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNumeroDePeriodosFocusLost
        // TODO add your handling code here:
            if(!Validar.validarNumero(jtNumeroDePeriodos.getText())){
            jtNumeroDePeriodos.setBorder(BorderFactory.createLineBorder(Color.red));
            jlNPErro.setIcon(
                new ImageIcon(
                    getClass().getResource("/imagens/error.png")));
        }else{
            jtNumeroDePeriodos.setBorder(BorderFactory.createLineBorder(Color.green));
            jlNPErro.setIcon(
                new ImageIcon(
                    getClass().getResource("/imagens/ok.png")));
        }
    }//GEN-LAST:event_jtNumeroDePeriodosFocusLost

    private void jtNumeroDePeriodosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNumeroDePeriodosKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jtNumeroDePeriodosKeyPressed

    private void jtDataDeInicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDataDeInicioFocusLost
  
            if(!Validar.validarData(jtDataDeInicio.getText())){
            jtDataDeInicio.setBorder(BorderFactory.createLineBorder(Color.red));
            jlDIErro.setIcon(
                new ImageIcon(
                    getClass().getResource("/imagens/error.png")));
        }else{
            jtDataDeInicio.setBorder(BorderFactory.createLineBorder(Color.green));
            jlDIErro.setIcon(
                new ImageIcon(
                    getClass().getResource("/imagens/ok.png")));
        }
    }//GEN-LAST:event_jtDataDeInicioFocusLost
    public void cadastrar(){
        try {
         
        Turma Turma = new Turma();
        
        if (Validar.validarNumero(jtNumero.getText())) {
                Turma.setNumero(Integer.parseInt(jtNumero.getText()));
            } else {
                throw new NumberFormatException("Digite o numero da turma!");
            }
        
        if (jrbFundamental.isSelected() || jrbMedio.isSelected()) {
                    Turma.setEnsino(bgEnsino.getSelection().getActionCommand());
            } else {
                throw new Exception("Selecione o ensino!");
            }
        
        if (Validar.validarNumero(jtAnoLetivo.getText())) {
                Turma.setAnoLetivo(jtAnoLetivo.getText());
            } else {
                throw new NumberFormatException("Digite o ano letivo!");
            }
            
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try {
                LocalDate d = LocalDate.parse(jtDataDeInicio.getText(), formatador);
                d.format(formatador);
                Turma.setDataDeInicio(d);
            } catch (Exception e) {
                throw new Exception("Selecione a data de inicio da turma! " + e.getMessage());
            }
            
        if (jrbManha.isSelected() || jrbTarde.isSelected() || jrbNoite.isSelected()) {
                    Turma.setTurno(bgTurno.getSelection().getActionCommand());
            } else {
                throw new Exception("Selecione o turno!");
            }
        
        if (Validar.validarNumero(jtNumeroDePeriodos.getText())) {
                Turma.setPeridos(Integer.parseInt(jtNumeroDePeriodos.getText()));
            } else {
                throw new NumberFormatException("Digite o Numero de periodos!");
            }

       TurmaServicos c = ServicoFactory.getTurma();
        
        c.cadastrar(Turma);
        
        JOptionPane.showMessageDialog(
                    rootPane, 
                    "Turma cadastrada com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Erro! "+e.getMessage(),
                    "erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLNumeroErro;
    private javax.swing.ButtonGroup bgEnsino;
    private javax.swing.ButtonGroup bgTurno;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton jbCadastrar1;
    private javax.swing.JButton jbCadastrar2;
    private javax.swing.JLabel jlAnoErro;
    private javax.swing.JLabel jlDIErro;
    private javax.swing.JLabel jlNPErro;
    private javax.swing.JRadioButton jrbFundamental;
    private javax.swing.JRadioButton jrbFundamental1;
    private javax.swing.JRadioButton jrbManha;
    private javax.swing.JRadioButton jrbMedio;
    private javax.swing.JRadioButton jrbMedio1;
    private javax.swing.JRadioButton jrbNoite;
    private javax.swing.JRadioButton jrbTarde;
    private javax.swing.JTextField jtAnoLetivo;
    private javax.swing.JTextField jtClasseSocial1;
    private javax.swing.JTextField jtDataDeInicio;
    private javax.swing.JTextField jtNascimento1;
    private javax.swing.JTextField jtNascionalidade1;
    private javax.swing.JTextField jtNome1;
    private javax.swing.JTextField jtNumero;
    private javax.swing.JTextField jtNumeroDePeriodos;
    // End of variables declaration//GEN-END:variables
}
