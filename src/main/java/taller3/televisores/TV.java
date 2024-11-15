package taller3.televisores;

public class TV {

    private static int numTV;
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;

    public TV (Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        numTV += 1;
    }
    public void setMarca(Marca Nmarca){
        marca = Nmarca;
    }
    public Marca getMarca(){
        return marca;
    }
    public void setCanal(int Ncanal){
        canal = Ncanal;
    }
    public int getCanal(){
        return canal;
    }
    public void setVolumen(int Nvolumen){
        volumen = Nvolumen;
    }
    public int getVolumen() {
        return volumen;
    }
    public void setPrecio(int Nprecio){
        precio = Nprecio;
    }
    public int getPrecio(){
        return precio;
    }
    public void setControl(Control Ncontrol){
        control = Ncontrol;
    }
    public Control getcontrol(){
        return control;
    }
    public void turnOn() {
        if (!estado){
            estado = true;
        }
    }
    public void turnOff() {
        if (estado){
            estado = false;
        }
    }
    public boolean getEstado() {
        return estado;
    }
}
