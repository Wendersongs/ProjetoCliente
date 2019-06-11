
package modelos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author WENDERSON_S
 */
public class TableModelPJ extends AbstractTableModel{
   private ArrayList<ClientesJuridicos> listaClientesJuridicos; 
    private String[] colunas;
    
     public TableModelPJ(ArrayList<ClientesJuridicos> clientes) {
         super();
         listaClientesJuridicos = clientes;
         colunas = new String[] {"id","cnpj"};
         
         
        
        
          
    }  

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
