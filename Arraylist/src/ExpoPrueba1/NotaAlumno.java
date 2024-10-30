package ExpoPrueba1;
public class NotaAlumno {
    private String nombre;
    private int codigo;
    private double prom;

    public NotaAlumno(String nombre, int codigo, double prom) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.prom = prom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }
    
}
