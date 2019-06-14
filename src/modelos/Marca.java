/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Objects;

/**
 *
 * @author Kevin
 */
public abstract class Marca {
    
    protected String nomeDaMarca;
    protected String enderecoAnexoMarca;
    protected String id;

    /**
     * @return the nomeDaMarca
     */
    public String getNomeDaMarca() {
        return nomeDaMarca;
    }

    /**
     * @param nomeDaMarca the nomeDaMarca to set
     */
    public void setNomeDaMarca(String nomeDaMarca) {
        this.nomeDaMarca = nomeDaMarca;
    }

    /**
     * @return the enderecoAnexoMarca
     */
    public String getEnderecoAnexoMarca() {
        return enderecoAnexoMarca;
    }

    /**
     * @param enderecoAnexoMarca the enderecoAnexoMarca to set
     */
    public void setEnderecoAnexoMarca(String enderecoAnexoMarca) {
        this.enderecoAnexoMarca = enderecoAnexoMarca;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Marca other = (Marca) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
