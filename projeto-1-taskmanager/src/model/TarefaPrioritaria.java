/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author REBECA
 */
public class TarefaPrioritaria extends Tarefa {
    private String prioridade;
    
    public TarefaPrioritaria(
            int id,
            String titulo,
            String descricao,
            String prioridade
    ){
        
        super(id, titulo, descricao);
        this.prioridade = prioridade;
        

    }   
    
    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

}
