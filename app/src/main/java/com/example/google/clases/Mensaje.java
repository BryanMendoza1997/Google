package com.example.google.clases;

public class Mensaje {


    int etiqueta;
    int perfil;
    int destacado;
    String titulo;
    String subtitulo;
    String cuerpo;
    String hora;

    public Mensaje(int etiqueta, int perfil, int destacado, String titulo, String subtitulo, String cuerpo, String hora) {
        this.etiqueta = etiqueta;
        this.perfil = perfil;
        this.destacado = destacado;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.cuerpo = cuerpo;
        this.hora = hora;
    }

    public int getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(int etiqueta) {
        this.etiqueta = etiqueta;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public int getDestacado() {
        return destacado;
    }

    public void setDestacado(int destacado) {
        this.destacado = destacado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }


}
