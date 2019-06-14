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
import javax.swing.JOptionPane;
import modelos.ContratoVenda;
import modelos.Dados;

/**
 *
 * @author Kevin
 */
public class ControleContratoVenda {
    
    private static ControleContratoVenda objCtrl;
    private ClienteTCP ligacaoCliente = null;
    private Object CharSource;
  

    private ControleContratoVenda() throws IOException {
        ligacaoCliente = new ClienteTCP("127.0.0.1", 7777);
    }

    public void incluirDadosPersistencia(Object objeto, int operacao) throws Exception {
        try {
            String msg = objeto.getClass().getSimpleName() + "#" + operacao + "#";
            Dados dado = (Dados) objeto;
            msg += dado.desmontarObjeto();
            JOptionPane.showMessageDialog(null, msg);
            ligacaoCliente.enviarMensagem(msg);
            String msgRecebido = ligacaoCliente.receberMensagem();
            System.out.println(msgRecebido);
        } catch (Exception erro) {
            throw erro;
        }
    }
    
        public ArrayList<ContratoVenda> recuperar(String fr) throws Exception {
        try {
            ArrayList<ContratoVenda> pilhaDeClientes = new ArrayList<>();
            Reader targetReader = new StringReader(fr);
            BufferedReader br = new BufferedReader(targetReader);
            String linha = "";
            
            linha=br.readLine();
            while((linha=br.readLine())!=null){
                ContratoVenda objetoClientes = new ContratoVenda();  
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
           String msg = "ContratoVenda#2#recebido";
            ligacaoCliente.enviarMensagem(msg);
            String msgRecebido = ligacaoCliente.receberMensagem();
            System.out.println(msgRecebido);
            return msgRecebido;
        } catch (Exception erro) {
            throw erro;
        }
       
    }
    
    
    
    public static ControleContratoVenda getInstance() throws IOException{
        if(objCtrl == null){
            objCtrl = new ControleContratoVenda();
        }
        return objCtrl;
    }
}
