/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pss.gestaousuarios.view;

import com.pss.gestaousuarios.dao.UsuarioDao;
import com.pss.gestaousuarios.presenter.ConsultarFuncionariosPresenter;
import com.pss.gestaousuarios.presenter.IncluirUsuarioPresenter;

/**
 *
 * @author pedro
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalView
     */

    private UsuarioDao usuarioDao;
    public PrincipalView(UsuarioDao usuarioDao) {
        initComponents();
        this.usuarioDao = usuarioDao;
        this.setLocationRelativeTo(this.getParent());
        this.setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mbPrincipal = new javax.swing.JMenu();
        btnAdicionar = new javax.swing.JMenuItem();
        btnConsultar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestao Funcionarios");

        mbPrincipal.setText("Opções");

        btnAdicionar.setText("Adicionar Usuario");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        mbPrincipal.add(btnAdicionar);

        btnConsultar.setText("Consultar Usuario");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        mbPrincipal.add(btnConsultar);

        jMenuBar1.add(mbPrincipal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {
        IncluirUsuarioPresenter presenter = new IncluirUsuarioPresenter(usuarioDao);
    }
                                            

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {
        new ConsultarFuncionariosPresenter(usuarioDao);
    }                                            

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAdicionar;
    private javax.swing.JMenuItem btnConsultar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mbPrincipal;
    // End of variables declaration//GEN-END:variables
}
