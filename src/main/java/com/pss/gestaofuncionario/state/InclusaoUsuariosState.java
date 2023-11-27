/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss.gestaofuncionario.state;

import com.pss.gestaofuncionario.presenter.IncluirFuncionarioPresenter;

/**
 *
 * @author pedro
 */
public class InclusaoUsuariosState extends CrudState {
  public InclusaoUsuariosState(IncluirFuncionarioPresenter presenter){
    super(presenter);
  }

  @Override
  public void mostrarUsuarios(){
    incluirPresenter.mostrarUsuarios();
  }
}

