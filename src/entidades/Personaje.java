package entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Personaje {
    private int posicionX;
    private int posicionY;
    private HashMap<String, Double> costosTerrenos;
    private String direccionImagen;
    private String nombre;

    public Personaje() {
        this.posicionX = 0;
        this.posicionY = 0;
        this.direccionImagen = new String();
        this.nombre =new String();
        this.costosTerrenos = new HashMap<>();
    }

    public Personaje(int posicionX, int posicionY, String direccionImagen, String nombre) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.costosTerrenos = new HashMap<>();
        this.direccionImagen = direccionImagen;
        this.nombre = nombre;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public HashMap<String, Double> getCostosTerrenos() {
        return costosTerrenos;
    }

    public void setCostosTerrenos(HashMap<String, Double> costosTerrenos) {
        this.costosTerrenos = costosTerrenos;
    }

    public String getDireccionImagen() {
        return direccionImagen;
    }

    public void setDireccionImagen(String direccionImagen) {
        this.direccionImagen = direccionImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCosto(String nombreTerreno, Double costo) {
        this.costosTerrenos.put(nombreTerreno, costo);
    }

    public Double obtenerCosto(String nombreTerreno) {
        return this.costosTerrenos.get(nombreTerreno);
    }
}
