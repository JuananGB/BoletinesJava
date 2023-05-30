
package mipaquete;


public class Consumo {
    


    private double km;
    private double litros;
    private double vMed;
    private double pGas;

    public Consumo() {
        this.km = 0;
        this.litros = 0;
        this.vMed = 0;
        this.pGas = 0;
    }

    public Consumo(double km, double litros, double vMed, double pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }

    public double getTempo() {
        return km / vMed;
    }

    public double consumoMedio() {
        return litros * 100 / km;
    }

    public double consumoEuros() {
        return pGas * litros * 100 / km;
    }

    public void setKms(double km) {
        this.km = km;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public void setvMed(double vMed) {
        this.vMed = vMed;
    }

    public void setPGas(double pGas) {
        this.pGas = pGas;
    }
}
