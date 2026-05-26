package br.ufpb.dcx.angelica;

import java.util.Objects;

//atributos
public class Livro {
    private String titulo;
    private String autor;
    private int quantPaginas;
    private double preco;

    //construtores
    public Livro(String titulo, String autor, int quantPaginas, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.quantPaginas = quantPaginas;
        this.preco = preco;
    }

    //get e set
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo= titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getQuantPaginas(){
        return quantPaginas;
    }
    public void setQuantPaginas(int quantPaginas){
        this.quantPaginas = quantPaginas;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    @Override
    public String toString(){
        return "O livro do titulo: " +titulo+  "do autor"  +autor+ ",  que contem " +quantPaginas+   "paginas, do preço R$"+preco ;
    }
    @Override
    public boolean equals (Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Livro outro = (Livro) obj;
        return titulo.equals(outro.titulo) && autor.equals(outro.autor);

    }
    @Override
    public int hashCode(){
        return Objects.hash(titulo, autor);
    }


}
