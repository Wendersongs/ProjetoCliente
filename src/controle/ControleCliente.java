package controle;
import comunicacao.ClienteTCP;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelos.Dados;
public class ControleCliente {

    private static ControleCliente objCtrl;
    private ClienteTCP ligacaoCliente = null;

    private ControleCliente() throws IOException {
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
    
    
    public String receberDadosPersistencia(Object objeto, int operacao) throws Exception {
        
        try {
            Dados dado = (Dados) objeto;
           String msg = "ClientesJuridicos#2#vaisifude";
            ligacaoCliente.enviarMensagem(msg);
            String msgRecebido = ligacaoCliente.receberMensagem();
            System.out.println(msg);
            return msg;
        } catch (Exception erro) {
            throw erro;
        }
       
    }
    
    public static ControleCliente getInstance() throws IOException{
        if(objCtrl == null){
            objCtrl = new ControleCliente();
        }
        return objCtrl;
    }

}
