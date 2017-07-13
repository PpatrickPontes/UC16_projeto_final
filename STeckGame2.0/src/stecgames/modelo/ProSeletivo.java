/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.modelo;

import java.sql.Date;

/**
 *
 * @author FAMILIA
 */
public class ProSeletivo {
 
    //Atributos da classe
    private int codigo;
    private Date dt_realizacao;
    private int qnt_vagas;
    private Date dt_inicio;
    private Date dt_termino;
    private String responsavel;
    private int prioridade;
    private String tipo_demanda;
    private String regime_trabalho;
    private String area;
    private String classe_funcional;
    private String requisitos;
    private Date dt_solicitacao_vaga;
    private String processos_seletivoscol;

    //Construtor sem parametro
    public ProSeletivo() {
    }

    //Construtor com parametros, exceto codigo
    public ProSeletivo(Date dt_realizacao, int qnt_vagas, Date dt_inicio, Date dt_termino, String responsavel, int prioridade, String tipo_demanda, String regime_trabalho, String area, String classe_funcional, String requisitos, Date dt_solicitacao_vaga, String processos_seletivoscol) {
        this.dt_realizacao = dt_realizacao;
        this.qnt_vagas = qnt_vagas;
        this.dt_inicio = dt_inicio;
        this.dt_termino = dt_termino;
        this.responsavel = responsavel;
        this.prioridade = prioridade;
        this.tipo_demanda = tipo_demanda;
        this.regime_trabalho = regime_trabalho;
        this.area = area;
        this.classe_funcional = classe_funcional;
        this.requisitos = requisitos;
        this.dt_solicitacao_vaga = dt_solicitacao_vaga;
        this.processos_seletivoscol = processos_seletivoscol;
    }

    
    
    //Encapsulamento
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the dt_realizacao
     */
    public Date getDt_realizacao() {
        return dt_realizacao;
    }

    /**
     * @param dt_realizacao the dt_realizacao to set
     */
    public void setDt_realizacao(Date dt_realizacao) {
        this.dt_realizacao = dt_realizacao;
    }

    /**
     * @return the qnt_vagas
     */
    public int getQnt_vagas() {
        return qnt_vagas;
    }

    /**
     * @param qnt_vagas the qnt_vagas to set
     */
    public void setQnt_vagas(int qnt_vagas) {
        this.qnt_vagas = qnt_vagas;
    }

    /**
     * @return the dt_inicio
     */
    public Date getDt_inicio() {
        return dt_inicio;
    }

    /**
     * @param dt_inicio the dt_inicio to set
     */
    public void setDt_inicio(Date dt_inicio) {
        this.dt_inicio = dt_inicio;
    }

    /**
     * @return the dt_termino
     */
    public Date getDt_termino() {
        return dt_termino;
    }

    /**
     * @param dt_termino the dt_termino to set
     */
    public void setDt_termino(Date dt_termino) {
        this.dt_termino = dt_termino;
    }

    /**
     * @return the responsavel
     */
    public String getResponsavel() {
        return responsavel;
    }

    /**
     * @param responsavel the responsavel to set
     */
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    /**
     * @return the prioridade
     */
    public int getPrioridade() {
        return prioridade;
    }

    /**
     * @param prioridade the prioridade to set
     */
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    /**
     * @return the tipo_demanda
     */
    public String getTipo_demanda() {
        return tipo_demanda;
    }

    /**
     * @param tipo_demanda the tipo_demanda to set
     */
    public void setTipo_demanda(String tipo_demanda) {
        this.tipo_demanda = tipo_demanda;
    }

    /**
     * @return the regime_trabalho
     */
    public String getRegime_trabalho() {
        return regime_trabalho;
    }

    /**
     * @param regime_trabalho the regime_trabalho to set
     */
    public void setRegime_trabalho(String regime_trabalho) {
        this.regime_trabalho = regime_trabalho;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the classe_funcional
     */
    public String getClasse_funcional() {
        return classe_funcional;
    }

    /**
     * @param classe_funcional the classe_funcional to set
     */
    public void setClasse_funcional(String classe_funcional) {
        this.classe_funcional = classe_funcional;
    }

    /**
     * @return the requisitos
     */
    public String getRequisitos() {
        return requisitos;
    }

    /**
     * @param requisitos the requisitos to set
     */
    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    /**
     * @return the dt_solicitacao_vaga
     */
    public Date getDt_solicitacao_vaga() {
        return dt_solicitacao_vaga;
    }

    /**
     * @param dt_solicitacao_vaga the dt_solicitacao_vaga to set
     */
    public void setDt_solicitacao_vaga(Date dt_solicitacao_vaga) {
        this.dt_solicitacao_vaga = dt_solicitacao_vaga;
    }

    /**
     * @return the processos_seletivoscol
     */
    public String getProcessos_seletivoscol() {
        return processos_seletivoscol;
    }

    /**
     * @param processos_seletivoscol the processos_seletivoscol to set
     */
    public void setProcessos_seletivoscol(String processos_seletivoscol) {
        this.processos_seletivoscol = processos_seletivoscol;
    }
    
}
