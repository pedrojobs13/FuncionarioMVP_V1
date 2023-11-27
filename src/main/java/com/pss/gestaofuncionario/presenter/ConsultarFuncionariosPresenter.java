/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss.gestaofuncionario.presenter;

import com.pss.gestaofuncionario.collection.FuncionarioCollection;
import com.pss.gestaofuncionario.model.Funcionario;
import com.pss.gestaofuncionario.view.ConsultarFuncionariosView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ListIterator;
import java.util.Objects;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 * @author pedro
 */
public class ConsultarFuncionariosPresenter {
  private ConsultarFuncionariosView view;
  private FuncionarioCollection funcionarios;
  private DefaultTableModel tmFuncionarios;

  public ConsultarFuncionariosPresenter(FuncionarioCollection funcionarios) {
    Objects.requireNonNull(funcionarios);
    this.funcionarios = funcionarios;
    view = new ConsultarFuncionariosView();

    tmFuncionarios = new DefaultTableModel(new Object[][] {}, new String[] {"nome", "salario"});
    view.getTblFuncionarios().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    tmFuncionarios.setNumRows(0);
    ListIterator<Funcionario> it = funcionarios.getFuncionarios().listIterator();

    while (it.hasNext()) {
      Funcionario funcionario = it.next();
      tmFuncionarios.addRow(new Object[] {funcionario.getNome(), funcionario.getSalario()});
    }

    view.getTblFuncionarios().setModel(tmFuncionarios);

    view.getBtnFechar()
        .addActionListener(
            new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                fechar();
              }
            });

    view.setVisible(true);
  }

  private void fechar() {
    view.dispose();
  }
}
