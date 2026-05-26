package br.ufpb.dcx.angelica;

public class Biblioteca {
    public static void main (String [] args){

        Livro livro1 = new Livro("Verity", "Colleen Hoover", 320, 62.76);
        Livro livro2 = new Livro("Pecadora", "Nána Pauvoli", 384, 32.90);

        System.out.println(livro1);
        System.out.println(livro2);
        System.out.println(livro1.getTitulo());
        livro1.setPreco(76.90);
        System.out.println(livro1.getPreco());
        System.out.println(livro1.equals(livro2));
    }
}
