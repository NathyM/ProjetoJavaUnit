/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Natalie
 */
public class CadastroClienteModel {
    
    // RG , CPF, Nome, Endereço, Telefone, Celular, Data de Nascimento, CEP, Sexo, Complemento.
    
    private String nome;
    private String endereco;
    private String cep;
    private String complemento;
    private String numero;
    private String cpf;
    private String sexo;
    private String rg;
    private String telefone;
    private String celular;
    private String nascimento;
    
    public void cadastrarCliente(){
        
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getNumero() {
        return numero;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public String getRg() {
        return rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public String getNascimento() {
        return nascimento;
    }
    
    
    
}
