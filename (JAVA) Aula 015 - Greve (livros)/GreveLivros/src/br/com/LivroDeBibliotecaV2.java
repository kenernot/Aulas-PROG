package br.com;

import java.util.Date;

public class LivroDeBibliotecaV2 extends Livro {

    private String ISBN;
    private int exemplares;
    private String assunto;
    private String publicadora;
    private Date dataPublicacao;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getPublicadora() {
        return publicadora;
    }

    public void setPublicadora(String publicadora) {
        this.publicadora = publicadora;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public int getExemplares() {
        return exemplares;
    }

    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }
}
