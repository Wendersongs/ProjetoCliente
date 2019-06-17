/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import static java.util.Arrays.equals;

/**
 *
 * @author Kevin
 */
public class ContratoLocacao extends Contrato implements Dados {

    private Integer diasDeLocacao;
    private Double valorCaucao;
    private String categoriaVeiculo;
    
    
    
    
    public ContratoLocacao(){
        
        this.id="";
        this.idCliente="";
        this.idVeiculo="";
        this.categoriaVeiculo="";
        this.nomeFuncionario="";
        this.diasDeLocacao=0;
        this.valorCaucao=0.0;
        
        
        
        
    }
    
    public Double CalcularCaucao(String categoria, int quantidadeDias){
        categoriaVeiculo=categoria;
        double valorDiaria = 0;
        double recebeCaucao=0;
        
      if(categoriaVeiculo.equals ("Economico"))
       valorDiaria=66 ;
               
      if (categoriaVeiculo == "Economico com Ar")
           valorDiaria = 69;
       
      if (categoriaVeiculo == "Intermediario")
           valorDiaria=81;
       
      if (categoriaVeiculo =="SUV")
           valorDiaria=113;
       
      if (categoriaVeiculo=="4x4 Especial")
           valorDiaria=322;
        recebeCaucao = valorDiaria*quantidadeDias;
        return recebeCaucao;
    }
    
    public ContratoLocacao(String id , String idCliente , String idVeiculo ,String categoriaVeiculo , String nomeFuncionario , Integer diasDeLocacao , Double valorCaucao ){
        
        this.id=id;
        this.idCliente=idCliente;
        this.idVeiculo=idVeiculo;
        this.categoriaVeiculo=categoriaVeiculo;
        this.nomeFuncionario=nomeFuncionario;
        this.diasDeLocacao=diasDeLocacao;
        this.valorCaucao=valorCaucao;
       
    }
    
    
    

    
    @Override
    public String desmontarObjeto() {

        return this.id+";"+this.idCliente+";"+this.idVeiculo+";"+this.categoriaVeiculo+";"+this.nomeFuncionario+";"+this.diasDeLocacao+";"+this.valorCaucao;
    }

    @Override
    public void montarObjeto(String stringDados) throws Exception {
        
         try {
            String vetorString[] = stringDados.split(";");
            this.id=vetorString[0];
            this.idCliente=vetorString[1];
            this.idVeiculo=vetorString[2];
            this.categoriaVeiculo=vetorString[3];
            this.nomeFuncionario=vetorString[4];
            this.diasDeLocacao=Integer.parseInt(vetorString[5]);
            this.valorCaucao=Double.parseDouble(vetorString[6]);
            

        } catch (Exception e) {
            throw new Exception("Erro no metodo montarObjeto do Cliente");
        }

    }

    /**
     * @return the diasDeLocacao
     */
    public int getDiasDeLocacao() {
        return diasDeLocacao;
    }

    /**
     * @param diasDeLocacao the diasDeLocacao to set
     */
    public void setDiasDeLocacao(int diasDeLocacao) {
        this.diasDeLocacao = diasDeLocacao;
    }

    /**
     * @return the valorCaucao
     */
    public Double getValorCaucao() {
        return valorCaucao;
    }

    /**
     * @param valorCaucao the valorCaucao to set
     */
    public void setValorCaucao(Double valorCaucao) {
        this.valorCaucao = valorCaucao;
    }

    /**
     * @return the estado
     */
  
    
  
}
