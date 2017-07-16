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
    private String matricula;
    private String nome;   
    private String data;
    private String hora_entrada;
    private String saida_almoco;
    private String retorn_almoco;
    private String hora_saida;
    private String horasTrabDia;

    public RegistroPonto() {
    }

    public RegistroPonto(int id, String matricula, String nome, String data, String hora_entrada, String saida_almoco, String retorn_almoco, String hora_saida, String horasTrabDia) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.data = data;
        this.hora_entrada = hora_entrada;
        this.saida_almoco = saida_almoco;
        this.retorn_almoco = retorn_almoco;
        this.hora_saida = hora_saida;
        this.horasTrabDia = horasTrabDia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getSaida_almoco() {
        return saida_almoco;
    }

    public void setSaida_almoco(String saida_almoco) {
        this.saida_almoco = saida_almoco;
    }

    public String getRetorn_almoco() {
        return retorn_almoco;
    }

    public void setRetorn_almoco(String retorn_almoco) {
        this.retorn_almoco = retorn_almoco;
    }

    public String getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(String hora_saida) {
        this.hora_saida = hora_saida;
    }

    public String getHorasTrabDia() {
        return horasTrabDia;
    }

    public void setHorasTrabDia(String horasTrabDia) {
        this.horasTrabDia = horasTrabDia;
    }

    
}
