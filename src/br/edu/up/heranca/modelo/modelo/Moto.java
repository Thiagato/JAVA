package br.edu.up.heranca.modelo.modelo;

public class Moto extends Veiculo{
    private Double cilindrara;

    private  Integer bauCarga;

    public Moto(String marca, String modelo, Double cilindrara, Integer bauCarga) {
        super(marca, modelo);
        this.cilindrara = cilindrara;
        this.bauCarga = bauCarga;
    }

    public Double getCilindrara() {
        return cilindrara;
    }

    public void setCilindrara(Double cilindrara) {
        this.cilindrara = cilindrara;
    }

    public Integer getBauCarga() {
        return bauCarga;
    }

    public void setBauCarga(Integer bauCarga) {
        this.bauCarga = bauCarga;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrara=" + cilindrara +
                ", bauCarga=" + bauCarga +
                '}';
    }
}
