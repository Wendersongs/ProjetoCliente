/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import comunicacao.ClienteTCP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import modelos.ClientesFisicos;
import modelos.ClientesFisicos;
import modelos.Dados;

/**
 *
 * @author Kevin
 */
public class ControleClienteFisico {
    
     private static ControleClienteFisico objCtrl;
    private ClienteTCP ligacaoCliente = null;
    private Object CharSource;
  

    private ControleClienteFisico() throws IOException {
        ligacaoCliente = new ClienteTCP("127.0.0.1", 7777);
    }
    
    
    
    
           public ArrayList<ClientesFisicos> recuperar(String fr) throws Exception {
        try {
            ArrayList<ClientesFisicos> pilhaDeClientes = new ArrayList<>();
            Reader targetReader = new StringReader(fr);
            BufferedReader br = new BufferedReader(targetReader);
            String linha = "";
            
            linha=br.readLine();
            while((linha=br.readLine())!=null){
                ClientesFisicos objetoClientes = new ClientesFisicos();  
                objetoClientes.montarObjeto(linha);
                pilhaDeClientes.add(objetoClientes);
            }
            targetReader.close();
            br.close();
            return pilhaDeClientes;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    public String receberDadosPersistencia(Object objeto, int operacao) throws Exception {
        
        try {
            Dados dado = (Dados) objeto;
           String msg = "ClientesFisicos#2#";
            ligacaoCliente.enviarMensagem(msg);
            String msgRecebido = ligacaoCliente.receberMensagem();
            System.out.println(msgRecebido);
            return msgRecebido;
        } catch (Exception erro) {
            throw erro;
        }
       
    }
    
    
    
    public static ControleClienteFisico getInstance() throws IOException{
        if(objCtrl == null){
            objCtrl = new ControleClienteFisico();
        }
        return objCtrl;
    }
}
