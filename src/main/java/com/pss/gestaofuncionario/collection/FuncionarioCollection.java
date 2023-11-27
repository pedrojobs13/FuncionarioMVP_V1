/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss.gestaofuncionario.collection;

import com.pss.gestaofuncionario.model.Funcionario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author pedro
 */
public class FuncionarioCollection {

private List<Funcionario> funcionarios;    
    
    public FuncionarioCollection(){
        funcionarios = new ArrayList<>();
    }
    
    public void add(Funcionario funcionario){
        if(funcionarios.contains(funcionario)){
            throw new RuntimeException("Funcionario já existe");
        }
        if(funcionario != null){
            funcionarios.add(funcionario);
        }else{
            throw new RuntimeException("Forneça um funcionario válido");
        }
        
    }
    
    public List<Funcionario> getFuncionarios(){
        return Collections.unmodifiableList(funcionarios);
    }
}
