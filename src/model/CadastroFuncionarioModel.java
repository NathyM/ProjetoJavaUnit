/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.sql.*;
import java.beans.Statement;

/**
 *
 * @author Natalie
 */
public class CadastroFuncionarioModel {
    
    private int matricula;
    private String nome;
    private String endereço;
    private String nascimento;
    private String numero;
    private String cep;
    private String complemento;
    private char sexo;
    private String rg;
    private String cpf;
    private String celular;
    private String telefone;

    public CadastroFuncionarioModel(String nome, String nascimento, String numero, String cep, char sexo, String rg, String cpf, String celular, String telefone) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.numero = numero;
        this.cep = cep;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
        this.celular = celular;
        this.telefone = telefone;
        

    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public char getSexo() {
        return sexo;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCelular() {
        return celular;
    }

    public String getTelefone() {
        return telefone;
    }
    
    
    
    
    
}
