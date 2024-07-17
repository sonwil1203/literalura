package com.literalura.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "libros")

public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(unique = true)
    private String titulo;
    @ManyToOne
    private Autor autor;
    private String idioma;
    private Integer download_count;

    public Libro() {
    }

    public Libro(DatosLibros datosLibros) {
        this.titulo = datosLibros.titulo();
        this.idioma = datosLibros.idiomas().get(0);
        this.download_count = datosLibros.numeroDeDescargas();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIdiomas() {
        return idioma;
    }

    public void setIdiomas(String idioma) {
        this.idioma = idioma;
    }

    public Integer getDownload_count() {
        return download_count;
    }

    public void setDownload_count(Integer download_count) {
        this.download_count = download_count;
    }

   /* @Override
    public String toString() {
        return "Libro=" + titulo +
                ", Autor='" + autor+ '\'' +
                ", Idioma=" + idioma +
                ", Descargas=" + download_count;
    }*/
   @Override
   public String toString() {
       return  "************LIBRO***********\n"+
               " Titulo: " + titulo +"\n"+
               " Autor: " + autor +"\n"+
               " Idioma: " + idioma +"\n"+
               " Numero de descargas: " + download_count +"\n"+
               "***************************\n";
   }


}
