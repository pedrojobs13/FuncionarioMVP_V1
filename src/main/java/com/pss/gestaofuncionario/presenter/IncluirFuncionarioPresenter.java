/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss.gestaofuncionario.presenter;

import com.pss.gestaofuncionario.collection.FuncionarioCollection;
import com.pss.gestaofuncionario.model.Funcionario;
import com.pss.gestaofuncionario.state.CrudState;
import com.pss.gestaofuncionario.state.InclusaoUsuariosState;
import com.pss.gestaofuncionario.view.IncluirFuncionarioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author pedro
 */
public class IncluirFuncionarioPresenter {

  private IncluirFuncionarioView view;
  private FuncionarioCollection funcionarios;
  private CrudState state;

  public IncluirFuncionarioPresenter(FuncionarioCollection funcionarios) {
    this.funcionarios = funcionarios;
    view = new IncluirFuncionarioView();

    view.getBtnFechar()
        .addActionListener(
            new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                fechar();
              }
            });

    view.getBtnSalvar()
        .addActionListener(
            new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                salvar();
              }
            });

    view.setVisible(true);
  }

  private void fechar() {
    view.dispose();
  }

  private void salvar(){
    String nome = view.getTxtNome().getText();
    String salario = view.getTxtSalario().getText();

    Funcionario funcionario = new Funcionario(nome, salario);
    funcionarios.add(funcionario);

    new ConsultarFuncionariosPresenter(funcionarios);

    fechar();
  }


  public IncluirFuncionarioView getView() {
    return view;
  }

  public CrudState getState() {
    return state;
  }

  public void setState(CrudState state) {
    this.state = state;
  }
  public void mostrarUsuarios(){
    new ConsultarFuncionariosPresenter(funcionarios);
  }

}
