import java.util.Objects;

public class Produit {

    private int code;
    private double prixOrigine;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrixOrigine() {
        return prixOrigine;
    }

    public void setPrixOrigine(double prixOrigine) {
        this.prixOrigine = prixOrigine;
    }

    public Produit(int code, double prixOrigine) {
        this.code = code;
        this.prixOrigine = prixOrigine;
    }

    @Override
    public String toString() {
        return this.code+";"+this.prixOrigine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return code == produit.code ;
    }

    public double prixProduit() {
        return prixOrigine;
    }

}
