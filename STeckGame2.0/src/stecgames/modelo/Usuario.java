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
public class Usuario {
    
    private int codigo;
    private String login;
    private String senha;
    private int matricula;
    private String nome;
    private String cargo;
    private String departamento;
    private String status;
    private int qtdTentativas;

    public Usuario(int codigo, String login, String senha, int matricula, String nome, String cargo, String departamento, String status, int qtdTentativas) {
        this.codigo = codigo;
        this.login = login;
        this.senha = senha;
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.departamento = departamento;
        this.status = status;
        this.qtdTentativas = qtdTentativas;
    }
    
    public Usuario() {
    }

    
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQtdTentativas() {
        return qtdTentativas;
    }

    public void setQtdTentativas(int qtdTentativas) {
        this.qtdTentativas = qtdTentativas;
    }
   
}
