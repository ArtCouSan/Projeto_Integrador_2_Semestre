package br.com.Grupo07.construtor.produto;

/**
 * Classe Marca do produto.
 *
 * @author Grupo 07
 */
public class Marca {
   
    private int ID_Marca;
    private String Marca; 

    // Get e Set do id de marca.
    public int getID_Marca() {
        return ID_Marca;
    }
    public void setID_Marca(int ID_Marca) {
        this.ID_Marca = ID_Marca;
    }

    // Get e Set da marca do produto.
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    
}
