/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.CadastroClienteModel;

/**
 *
 * @author Natalie
 */
public class CadastroClienteControl {
    
    private CadastroClienteModel ccm;
    private String nome;
    private String endereco;
    private String nascimento;
    private String numero;
    private String cep;
    private String complemento;
    private String sexo;
    private String rg;
    private String cpf;
    private String celular;
    private String telefone;

    public CadastroClienteControl() {
    }
    public void setNome(String nome) {
    if (nome.isEmpty()) throw new IllegalArgumentException("Campo vazio");
    else this.nome = nome;
    }

    public void setEndereco(String endereco) {
        if (endereco.isEmpty()) throw new IllegalArgumentException("Campo vazio");
        else this.endereco = endereco;
    }

    public void setNumero(String numero) {
        if (numero.isEmpty()) throw new IllegalArgumentException("Campo vazio");
        else {
        Short.parseShort(numero);
        this.numero = numero;
        }
    }

    public void setNascimento(String nascimento) {
        if (nascimento.isEmpty()) throw new IllegalArgumentException("Campo vazio");
        else {
        Long.parseLong(nascimento);
        this.nascimento = nascimento;
        }
    }
    
    public void setCep(String cep) {
        if (cep.isEmpty()) throw new IllegalArgumentException("Campo vazio");
        else {
        Integer.parseInt(cep);
        this.cep = cep;
        }
    }
    public void setSexo(String sexo) {
        if (sexo.isBlank()) throw new IllegalArgumentException("Campo vazio");
        else this.sexo = sexo;
    }

    public void setRg(String rg) {
        if (rg.isEmpty()) throw new IllegalArgumentException("Campo vazio");
        else {
         //noinspection ResultOfMethodCallIgnored - testando se foram inseridos apenas números
        Integer.parseInt(rg);
        this.rg = rg;
        }
     }

    public void setCpf(String cpf) {
        if (cpf.isEmpty()) throw new IllegalArgumentException("Campo vazio");
        else {
         //noinspection ResultOfMethodCallIgnored - testando se foram inseridos apenas números
         Long.parseLong(cpf);
         this.cpf = cpf;
        }
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCelular(String celular) {
        if (celular.isEmpty()) throw new IllegalArgumentException("Campo vazio");
        else {
        //noinspection ResultOfMethodCallIgnored - testando se foram inseridos apenas números
        Short.parseShort(celular);
        this.celular = celular;
        }
    }    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
}
