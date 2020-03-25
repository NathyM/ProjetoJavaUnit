/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.CadastroClienteControl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import view.Cliente;

/**
 *
 * @author Natalie
 */
public class CadastroCliente extends AbstractTableModel{
    
    CadastroClienteControl ccc;
    CadastroClienteModel ccm;
    
    private List<CadastroClienteModel> dados = new ArrayList<>();
    private String[] colunas = {"Nome", "CPF","RG", "Sexo", "Data de nascimento", "Endereço", "Número", "Complemento", "Telefone", "Celular"};

    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }
    
    
    
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
       return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case 0:
                return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).getCpf();
            case 2:
                return dados.get(linha).getRg();
            case 3:
                return dados.get(linha).getSexo();
            case 4:
                return dados.get(linha).getNascimento();
            case 5:
                return dados.get(linha).getEndereco();
            case 6:
                return dados.get(linha).getNumero();
            case 7:
                return dados.get(linha).getComplemento();
            case 8:
                return dados.get(linha).getTelefone();
            case 9:
                return dados.get(linha).getCelular();
            
        }
        return null;
        
    }

    public void addRow(CadastroClienteModel c){
        this.dados.add(c);
        
    }
}
