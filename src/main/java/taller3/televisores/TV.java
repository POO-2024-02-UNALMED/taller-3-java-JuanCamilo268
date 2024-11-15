package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;

    public TV (Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
    }
    public void setMarca(Marca Nmarca){
        this.marca = Nmarca;
    }
    public Marca getMarca(){
        Marca n = this.marca;
        return n;
    }
    public void setCanal(int Ncanal){
        this.canal = Ncanal;
    }
    public int getCanal(){
        int n = this.canal;
        return n;
    }
    public void setVolumen(int Nvolumen){
        this.volumen = Nvolumen;
    }
    public int getVolumen() {
        int n = this.volumen;
        return n;
    }
    public void setPrecio(int Nprecio){
        this.precio = Nprecio;
    }
    public int getPrecio(){
        int n = this.precio;
        return n;
    }
    public void setControl(Control Ncontrol){
        this.control = Ncontrol;
    }
    public Control getcontrol(){
        Control n = this.control;
        return n;
    }
}
