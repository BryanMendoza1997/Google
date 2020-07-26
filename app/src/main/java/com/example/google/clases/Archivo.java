package com.example.google.clases;

public class Archivo {

    private  int imagentexto;
    private int imagentrespuntos;
    private int imagencuerpo;
    private int imagenlogo;
    private  String titulo;
    private  String textofinal;

    public Archivo(int imagentexto, int imagentrespuntos, int imagencuerpo, int imagenlogo, String titulo, String textofinal) {
        this.imagentexto = imagentexto;
        this.imagentrespuntos = imagentrespuntos;
        this.imagencuerpo = imagencuerpo;
        this.imagenlogo = imagenlogo;
        this.titulo = titulo;
        this.textofinal = textofinal;
    }


    public int getImagentexto() {
        return imagentexto;
    }

    public void setImagentexto(int imagentexto) {
        this.imagentexto = imagentexto;
    }

    public int getImagentrespuntos() {
        return imagentrespuntos;
    }

    public void setImagentrespuntos(int imagentrespuntos) {
        this.imagentrespuntos = imagentrespuntos;
    }

    public int getImagencuerpo() {
        return imagencuerpo;
    }

    public void setImagencuerpo(int imagencuerpo) {
        this.imagencuerpo = imagencuerpo;
    }

    public int getImagenlogo() {
        return imagenlogo;
    }

    public void setImagenlogo(int imagenlogo) {
        this.imagenlogo = imagenlogo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTextofinal() {
        return textofinal;
    }

    public void setTextofinal(String textofinal) {
        this.textofinal = textofinal;
    }


}
