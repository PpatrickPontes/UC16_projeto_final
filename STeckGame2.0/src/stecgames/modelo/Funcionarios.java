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
public class Funcionarios {
    
//Atributos da classe
private int matricula;
private String nome;
private String cpf;
private String rg;
private String sexo;
private String estCivil;
private String numCtps;
private String serieCtps;
private String dataExpedicao;
private String nomePai;
private String nomeMae ;
private String email;
private String telCel;
private String telRecados;
private String nomeRespRecados;
private String qtdFilhos;
private String rua;
private String numero; 
private String cep;
private String municipio;
private String complemento; 
private String uf;
private String nomeBanco ;
private String agencia;
private String conta; 
private String digito ;
private String opcao;
private String tipoConta;
private String setor;
private String cargo;
private String dataAdmicao;
private float valorSalario;
private String horasTrabalho;
private String status;
private String nacionalidade;
private String dtNascimento;
private String bairro;
private String pracaBanco;
private String pis;

    public Funcionarios() {
    }

    public Funcionarios(int matricula, String nome, String cpf, String rg, String sexo, String estCivil, String numCtps, String serieCtps, String dataExpedicao, String nomePai, String nomeMae, String email, String telCel, String telRecados, String nomeRespRecados, String qtdFilhos, String rua, String numero, String cep, String municipio, String complemento, String uf, String nomeBanco, String agencia, String conta, String digito, String opcao, String tipoConta, String setor, String cargo, String dataAdmicao, float valorSalario, String horasTrabalho, String status, String nacionalidade, String dtNascimento, String bairro, String pracaBanco, String pis) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.estCivil = estCivil;
        this.numCtps = numCtps;
        this.serieCtps = serieCtps;
        this.dataExpedicao = dataExpedicao;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.email = email;
        this.telCel = telCel;
        this.telRecados = telRecados;
        this.nomeRespRecados = nomeRespRecados;
        this.qtdFilhos = qtdFilhos;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.municipio = municipio;
        this.complemento = complemento;
        this.uf = uf;
        this.nomeBanco = nomeBanco;
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.opcao = opcao;
        this.tipoConta = tipoConta;
        this.setor = setor;
        this.cargo = cargo;
        this.dataAdmicao = dataAdmicao;
        this.valorSalario = valorSalario;
        this.horasTrabalho = horasTrabalho;
        this.status = status;
        this.nacionalidade = nacionalidade;
        this.dtNascimento = dtNascimento;
        this.bairro = bairro;
        this.pracaBanco = pracaBanco;
        this.pis = pis;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public String getNumCtps() {
        return numCtps;
    }

    public void setNumCtps(String numCtps) {
        this.numCtps = numCtps;
    }

    public String getSerieCtps() {
        return serieCtps;
    }

    public void setSerieCtps(String serieCtps) {
        this.serieCtps = serieCtps;
    }

    public String getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(String dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelCel() {
        return telCel;
    }

    public void setTelCel(String telCel) {
        this.telCel = telCel;
    }

    public String getTelRecados() {
        return telRecados;
    }

    public void setTelRecados(String telRecados) {
        this.telRecados = telRecados;
    }

    public String getNomeRespRecados() {
        return nomeRespRecados;
    }

    public void setNomeRespRecados(String nomeRespRecados) {
        this.nomeRespRecados = nomeRespRecados;
    }

    public String getQtdFilhos() {
        return qtdFilhos;
    }

    public void setQtdFilhos(String qtdFilhos) {
        this.qtdFilhos = qtdFilhos;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
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

    public String getDataAdmicao() {
        return dataAdmicao;
    }

    public void setDataAdmicao(String dataAdmicao) {
        this.dataAdmicao = dataAdmicao;
    }

    public float getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(float valorSalario) {
        this.valorSalario = valorSalario;
    }

    public String getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(String horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getPracaBanco() {
        return pracaBanco;
    }

    public void setPracaBanco(String pracaBanco) {
        this.pracaBanco = pracaBanco;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

   
}
