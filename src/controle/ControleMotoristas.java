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
import modelos.Motoristas;
import modelos.Dados;

/**
 *
 * @author Kevin
 */
public class ControleMotoristas {
    
    private static ControleMotoristas objCtrl;
    private ClienteTCP ligacaoCliente = null;
    private Object CharSource;
  

    private ControleMotoristas() throws IOException {
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
    
        public ArrayList<Motoristas> recuperar(String fr) throws Exception {
        try {
            ArrayList<Motoristas> pilhaDeClientes = new ArrayList<>();
            Reader targetReader = new StringReader(fr);
            BufferedReader br = new BufferedReader(targetReader);
            String linha = "";
            
            linha=br.readLine();
            while((linha=br.readLine())!=null){
                Motoristas objetoClientes = new Motoristas();  
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
           String msg = "Motoristas#2#recebido";
            ligacaoCliente.enviarMensagem(msg);
            String msgRecebido = ligacaoCliente.receberMensagem();
            System.out.println(msgRecebido);
            return msgRecebido;
        } catch (Exception erro) {
            throw erro;
        }
       
    }
    
    
    
    public static ControleMotoristas getInstance() throws IOException{
        if(objCtrl == null){
            objCtrl = new ControleMotoristas();
        }
        return objCtrl;
    }
}
