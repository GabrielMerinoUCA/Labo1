package Model.Entity;

import Model.Enum.ModalidadRegalo;

public class Cumpleaniero {
    private String nombre;
    private Integer edad;
    private String colorFavorito;
    private ModalidadRegalo modalidadRegalo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getColorFavorito() {
        return colorFavorito;
    }

    public void setColorFavorito(String colorFavorito) {
        this.colorFavorito = colorFavorito;
    }

    public ModalidadRegalo getModalidadRegalo() {
        return modalidadRegalo;
    }

    public void setModalidadRegalo(ModalidadRegalo modalidadRegalo) {
        this.modalidadRegalo = modalidadRegalo;
    }
}
