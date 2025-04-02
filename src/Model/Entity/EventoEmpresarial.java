package Model.Entity;

import Model.Enum.CodigoVestimenta;

public class EventoEmpresarial extends Evento {
    private Postre postre;
    private String nombreEmpresa;
    private String tematicaColores;
    private CodigoVestimenta codigoVestimenta;

    public Postre getPostre() {
        return postre;
    }

    public void setPostre(Postre postre) {
        this.postre = postre;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTematicaColores() {
        return tematicaColores;
    }

    public void setTematicaColores(String tematicaColores) {
        this.tematicaColores = tematicaColores;
    }

    public CodigoVestimenta getCodigoVestimenta() {
        return codigoVestimenta;
    }

    public void setCodigoVestimenta(CodigoVestimenta codigoVestimenta) {
        this.codigoVestimenta = codigoVestimenta;
    }
}
