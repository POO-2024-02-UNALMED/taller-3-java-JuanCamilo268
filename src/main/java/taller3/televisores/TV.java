package taller3.televisores;

public class TV {

    private static int numTV;
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        numTV += 1;
    }

    public void setMarca(Marca Nmarca) {
        marca = Nmarca;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setCanal(int Ncanal) {
        if ((Ncanal >= 1) && (Ncanal <= 120)) {
            canal = Ncanal;
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setVolumen(int Nvolumen) {
        if ((Nvolumen >= 0) && (Nvolumen <= 7)) {
            volumen = Nvolumen;
        }
    }

    public int getVolumen() {
        return volumen;
    }

    public void setPrecio(int Nprecio) {
        precio = Nprecio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setControl(Control Ncontrol) {
        control = Ncontrol;
    }

    public Control getControl() {
        return control;
    }

    public void turnOn() {
        if (!estado) {
            estado = true;
        }
    }

    public void turnOff() {
        if (estado) {
            estado = false;
        }
    }

    public boolean getEstado() {
        return estado;
    }

    public void canalUp() {
        if (estado) {
            if (canal < 120) {
                canal += 1;
            }
        }
    }

    public void canalDown() {
        if (estado) {
            if (canal > 1) {
                canal -= 1;
            }
        }
    }

    public void volumenUp() {
        if (estado) {
            if (volumen < 7) {
                volumen += 1;
            }
        }
    }

    public void volumenDown() {
        if (estado) {
            if (volumen > 0) {
                volumen -= 1;
            }
        }
    }
    public static void setNumTV(int n) {
        numTV = n;
    }
    public static int getNumTV() {
        return numTV;
    }
}
