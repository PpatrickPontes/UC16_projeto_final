/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.modelo;

/**
 *
 * @author Sosciopata
 */
public class RegistroPonto {
    private int id;
    private String nome;
    private String opcao;
    private String data;
    private String hora;

    public RegistroPonto() {
    }

    public RegistroPonto(int id, String nome, String opcao, String data, String hora) {
        this.id = id;
        this.nome = nome;
        this.opcao = opcao;
        this.data = data;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOpcao() {
        return opcao;
    }

    public void setOpção(String opção) {
        this.opcao = opção;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
            
    
}
