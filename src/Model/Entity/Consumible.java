package Model.Entity;


import Model.Enum.TipoConsumible;

public abstract class Consumible {
    protected String nombreAlimento;
    protected String descripcion;
    protected TipoConsumible tipoConsumible;

    public String getNombreAlimento() {
        return nombreAlimento;
    }

    public void setNombreAlimento(String nombreAlimento) {
        this.nombreAlimento = nombreAlimento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoConsumible getTipoConsumible() {
        return tipoConsumible;
    }

    public void setTipoConsumible(TipoConsumible tipoConsumible) {
        this.tipoConsumible = tipoConsumible;
    }
}
