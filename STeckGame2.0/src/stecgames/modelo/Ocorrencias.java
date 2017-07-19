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
public class Ocorrencias {
    
    private int id_ocorrencias;
    private String matricula;
    private String nome;
    private String setor;
    private String cargo;
    private String data;
    private String hora;
    private String obs;
    private String motivo;

    public Ocorrencias() {
    }

    public Ocorrencias(int id_ocorrencias, String matricula, String nome, String setor, String cargo, String data, String hora, String obs, String motivo) {
        this.id_ocorrencias = id_ocorrencias;
        this.matricula = matricula;
        this.nome = nome;
        this.setor = setor;
        this.cargo = cargo;
        this.data = data;
        this.hora = hora;
        this.obs = obs;
        this.motivo = motivo;
    }

    public int getId_ocorrencias() {
        return id_ocorrencias;
    }

    public void setId_ocorrencias(int id_ocorrencias) {
        this.id_ocorrencias = id_ocorrencias;
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

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

   
}
