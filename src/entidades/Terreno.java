package entidades;

public class Terreno {
    private int id;
    private int posX;
    private int posY;
    private  String nombre;
    private  boolean esInicio;
    private  boolean esFinal;
    private  String direccionImagen;


    public Terreno(int id, int posX, int posY, String nombre, boolean esInicio, boolean esFinal, String direccionImagen) {
        this.id = id;
        this.posX = posX;
        this.posY = posY;
        this.nombre = nombre;
        this.esInicio = esInicio;
        this.esFinal = esFinal;
        this.direccionImagen = direccionImagen;
    }

    public Terreno() {
        this.id = 0;
        this.posX = 0;
        this.posY = 0;
        this.nombre = new String();
        this.esInicio = false;
        this.esFinal = false;
        this.direccionImagen = new String();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsInicio() {
        return esInicio;
    }

    public void setEsInicio(boolean esInicio) {
        this.esInicio = esInicio;
    }

    public boolean isEsFinal() {
        return esFinal;
    }

    public void setEsFinal(boolean esFinal) {
        this.esFinal = esFinal;
    }

    public String getDireccionImagen() {
        return direccionImagen;
    }

    public void setDireccionImagen(String direccionImagen) {
        this.direccionImagen = direccionImagen;
    }

}
