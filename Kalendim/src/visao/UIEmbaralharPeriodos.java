/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import servicos.TurmaServicos;
import servicos.ServicoFactory;
import modelo.Aluno;
import modelo.Horario;
import modelo.Materia;
import modelo.Professor;
import modelo.Turma;
import modelo.Validar;
import servicos.AlunoServicos;
import servicos.HorarioServicos;
import servicos.MateriaServicos;
import servicos.ProfessorServicos;

/**
 *
 * @author admin
 */
public class UIEmbaralharPeriodos extends javax.swing.JFrame {

    /**
     * Creates new form UIConfigTurma
     */
    public UIEmbaralharPeriodos(java.awt.Frame parent, boolean modal) {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jlEmbaralhador = new javax.swing.JLabel();

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Periodos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLayeredPane3.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("Embaralhar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlEmbaralhador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlEmbaralhador.setText("embaralhar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlEmbaralhador, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jlEmbaralhador, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        deletar();
        cadastrarPeriodos();
    }//GEN-LAST:event_jButton1ActionPerformed

    ArrayList<Materia> materia = new ArrayList<>();
    ArrayList<Turma> turma = new ArrayList<>();

    public void deletar() {
        try {

            HorarioServicos m = ServicoFactory.getHorario();

            m.deletar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Erro! " + e.getMessage(),
                    "erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    private void pegarIdMateria() {
        try {
            ArrayList<Materia> mate = new ArrayList<>();
            MateriaServicos ss = ServicoFactory.getMateria();

            mate = ss.buscarMaterias(",m.nome as nomemateria from professor as p inner join materia as m on "
                    + "m.idprofessor = p.idprofessor");

            DefaultListModel dlm = new DefaultListModel();
            for (int i = 0; i < mate.size(); i++) {
                materia.add(mate.get(i));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao preencher lista de turmas! " + e.getMessage());
        }
    }

    private void pegarIdTurma() {
        try {
            ArrayList<Turma> mate = new ArrayList<>();
            TurmaServicos ss = ServicoFactory.getTurma();

            mate = ss.buscarTurmas("turma");
            if (mate == null) {
                throw new Exception("Não á turmas cadastradas!");
            }
            DefaultListModel dlm = new DefaultListModel();
            for (int i = 0; i < mate.size(); i++) {
                turma.add(mate.get(i));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao preencher lista de turmas! " + e.getMessage());
        }
    }

    public void cadastrarPeriodos() {
        try {
            Horario horario = new Horario();
            HorarioServicos h = ServicoFactory.getHorario();

            Random rambom = new Random();

            pegarIdMateria();
            pegarIdTurma();

            for (int i = 0; i < turma.size(); i++) {

                horario.setTurma(turma.get(i));

                for (int ii = 0; ii < 5; ii++) {

                    horario.setDia(ii);

                    for (int iii = 0; iii < 6; iii++) {

                        horario.setNumeroPeriodo(ii);
                        
                        Collections.shuffle(materia);

                        if (materia.size() > ii) {
                            horario.setMateria(materia.get(ii));
                        } else {
                            horario.setMateria(materia.get(rambom.nextInt(materia.size())));
                        }

                        h.cadastrar(horario);
                    }
                }
            }
            jlEmbaralhador.setText("Horários criados com sucesso");
            jlEmbaralhador.setForeground(Color.green);
    }
    catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                "Erro ao preencher lista de turmas! " + e.getMessage());
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
            java.util.logging.Logger.getLogger(UIEmbaralharPeriodos.class







.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        















} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIEmbaralharPeriodos.class







.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        















} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIEmbaralharPeriodos.class







.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        















} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIEmbaralharPeriodos.class







.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UIEmbaralharPeriodos dialog = new UIEmbaralharPeriodos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.setVisible(true);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlEmbaralhador;
    // End of variables declaration//GEN-END:variables
}