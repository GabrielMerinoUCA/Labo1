package Model.Entity;

// Quisas requiera DTO
public class EventoCumpleanios extends Evento{
    private Cumpleaniero cumpleaniero;

    public Cumpleaniero getCumpleaniero() {
        return cumpleaniero;
    }

    public void setCumpleaniero(Cumpleaniero cumpleaniero) {
        this.cumpleaniero = cumpleaniero;
    }
}
