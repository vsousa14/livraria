/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vasco
 */
public class livro {
    private String Nome,ISBN,Categoria,Autor;
    private int Quantidade;
    private Double Preco;
    
    public livro(String Nome, String ISBN, String Categoria, String Autor, int Quantidade, Double Preco){
    this.Nome = Nome;
    this.ISBN = ISBN;
    this.Categoria = Categoria;
    this.Autor = Autor;
    this.Quantidade = Quantidade;
    this.Preco = Preco;
    }
    
       // NOME ===============================================
    
     public String getNome() {
        return Nome;
        }
        
        
        public void setNome(String nome){
        this.Nome = nome;
        }
        
        // ISBN ===============================================
        
         public String getISBN() {
        return ISBN;
        }
        
        
        public void setISBN(String ISBN){
        this.ISBN = ISBN;
        }
        
        // CATEGORIA ===============================================
        
        public String getCategoria() {
        return Categoria;
        }
        
        
        public void setCategoria(String Categoria){
        this.Categoria = Categoria;
        }
        
        // AUTOR ===============================================    
        
        public String getAutor() {
        return Autor;
        }
        
        
        public void setAutor(String Autor){
        this.Autor = Autor;
        }
        
        // QUANTIDADE =============================================== 
        
        public int getQuantidade() {
        return Quantidade;
        }
        
        
        public void setQuantidade(int Quantidade){
        this.Quantidade = Quantidade;
        }
        
        // PREÇO =============================================== 
        
        public Double getPreco() {
        return Preco;
        }
        
        
        public void setPreco(Double preco){
        this.Preco = preco;
        }
        
}
