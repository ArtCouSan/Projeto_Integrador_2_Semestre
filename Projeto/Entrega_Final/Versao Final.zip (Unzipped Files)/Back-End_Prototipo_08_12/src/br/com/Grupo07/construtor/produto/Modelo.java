
package br.com.Grupo07.construtor.produto;

/**
 * Classe modelo do produto.
 *
 * @author Grupo 07
 */
public class Modelo {
    
    private int ID_Modelo;
    private String Modelo;

    // Get e Set do id do modelo.
    public int getID_Modelo() {
        return ID_Modelo;
    }
    public void setID_Modelo(int ID_Modelo) {
        this.ID_Modelo = ID_Modelo;
    }

    // Get e Set do modelo do produto.
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }   
    
}
