/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss.gestaofuncionario.state;

import com.pss.gestaofuncionario.presenter.IncluirFuncionarioPresenter;
import com.pss.gestaofuncionario.view.IncluirFuncionarioView;

/**
 * @author pedro
 */
public abstract class CrudState {
  protected IncluirFuncionarioView incluirView;
  protected IncluirFuncionarioPresenter incluirPresenter;

  public CrudState(IncluirFuncionarioPresenter incluirPresenter) {
    this.incluirPresenter = incluirPresenter;
    this.incluirView = this.incluirPresenter.getView();
  }

  public void mostrarUsuarios() {
    throw new RuntimeException("Não é possível mostrar funcionarios");
  }

  public void salvar() {
    throw new RuntimeException("Não é possível salvar funcionarios");
  }

}
