class CiudadTemperatura {

    private String nombre;
    private double temperatura;

    public CiudadTemperatura(String nombre, double temperatura) {
        this.nombre = nombre;
        this.temperatura = temperatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}