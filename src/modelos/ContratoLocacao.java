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

    private int diasDeLocacao;
    private double valorCaucao;
    private String categoriaVeiculo;

    
    
    
    public ContratoLocacao(){
        
        this.id="";
        this.idCliente="";
        this.idVeiculo="";
        this.categoriaVeiculo="";
        this.nomeFuncionario="";
        this.diasDeLocacao=0;
        this.valorCaucao=0;
        
        
        
    }
    
    public double CalcularCaucao(){
        
        String recebeCaucao="";
        
        if(categoriaVeiculo == "Economico")
       recebeCaucao = Integer.toString(diasDeLocacao * 66) ;
               
       if (categoriaVeiculo == "Economico com Ar")
           recebeCaucao = Integer.toString(diasDeLocacao * 69);
       
       if (categoriaVeiculo == "Intermediario")
           recebeCaucao = Integer.toString(diasDeLocacao *81);
       
       if (categoriaVeiculo =="SUV")
           recebeCaucao = Integer.toString(diasDeLocacao * 113);
       
       if (categoriaVeiculo=="4x4 Especial")
           recebeCaucao = Integer.toString(diasDeLocacao*322);
        
        return recebeCaucao;
    }
    
    public ContratoLocacao(String id , String idCliente , String idVeiculo ,String categoriaVeiculo , String nomeFuncionario , String diasDeLocacao , String valorCaucao){
        
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
    public String getValorCaucao() {
        return valorCaucao;
    }

    /**
     * @param valorCaucao the valorCaucao to set
     */
    public void setValorCaucao(String valorCaucao) {
        this.valorCaucao = valorCaucao;
    }
    
  
}
