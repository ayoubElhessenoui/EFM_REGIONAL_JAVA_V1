public class ProduitEnSolde extends Produit{
    private int remise;

    public ProduitEnSolde(int code, double prixOrigine,int remise) throws Exception {
        super(code, prixOrigine);
        setRemise(remise);
    }

    public int getRemise() {
        return remise;
    }

    public void setRemise(int remise) throws Exception{
        if(this.remise>0 && this.remise<=90)
            this.remise = remise;
        else throw new Exception("invalide remise");
    }

    @Override
    public double prixProduit() {
        return super.getPrixOrigine() - (super.getPrixOrigine() * remise/100);
    }

    @Override
    public String toString() {
        return super.toString()+";"+remise ;
    }
}
