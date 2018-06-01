package br.com;

public class LivroDeLivraria {

    private String titulo;
    private String autor;
    private String editora;
    private String idioma;
    //
    private double valor;
    private double codigoBarra;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(double codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

}
