package com.pss.gestaofuncionario.state;

import com.pss.gestaofuncionario.presenter.IncluirFuncionarioPresenter;

public class MostrarUsuarioState extends CrudState {

  public MostrarUsuarioState(IncluirFuncionarioPresenter incluirPresenter){
    super(incluirPresenter);
  }

  @Override
  public void salvar(){
    incluirPresenter.setState(new InclusaoUsuariosState(incluirPresenter));
  }



}
