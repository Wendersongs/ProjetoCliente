/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

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
    
    public Double CalcularCaucao(String tipoVeiculo, double quantidadeDias){
        double valorDiaria = 0;
        double recebeCaucao=0;
        
      if(categoriaVeiculo == "Economico")
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
    
    public ContratoLocacao(String id , String idCliente , String idVeiculo ,String categoriaVeiculo , String nomeFuncionario , Integer diasDeLocacao , String valorCaucao){
        
        this.id=id;
        this.idCliente=idCliente;
        this.idVeiculo=idVeiculo;
        this.categoriaVeiculo=categoriaVeiculo;
        this.nomeFuncionario=nomeFuncionario;
        this.diasDeLocacao=diasDeLocacao;
    }
    
    
    

    
    @Override
    public String desmontarObjeto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void montarObjeto(String stringDados) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
  
}
