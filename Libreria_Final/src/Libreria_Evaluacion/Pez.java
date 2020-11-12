package Libreria_Evaluacion;

public class Pez {
    String tipo_pez;
    int por_nacimiento;

    public Pez(String tipo_pez, int por_nacimiento) {
        this.tipo_pez = tipo_pez;
        this.por_nacimiento = por_nacimiento;
    }

    public Pez() {

    }

    public String getTipo_pez() {
        return tipo_pez;
    }

    public void setTipo_pez(String tipo_pez) {
        this.tipo_pez = tipo_pez;
    }

    public int getPor_nacimiento() {
        return por_nacimiento;
    }

    public void setPor_nacimiento(int por_nacimiento) {
        this.por_nacimiento = por_nacimiento;
    }

    public double peses_anio() {
        double nacimiento = (double) this.por_nacimiento;
        double muertos = 0.0;
        double viviendo = 0.0;
        muertos = nacimiento * 0.10;
        return viviendo;


    }

}
