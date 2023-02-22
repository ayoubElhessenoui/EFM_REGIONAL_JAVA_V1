import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Boutique {
    ArrayList<Produit> produit;

    public int indicDe(int code){
        int var = -1;
        for(Produit p:produit){
            if(p.getCode() == code)
                var = produit.indexOf(p);
        }
        return var;
    }

    public void ajouter(Produit p) throws Exception{
        if(produit.contains(p))
            throw new Exception("le produit déja existe à la boutique");
        else
            produit.add(p);
    }

    public boolean supprimer(int code){
        boolean var = false;
        for (Produit p:produit){
            if (p.getCode() == code)
                var = true;
                produit.remove(p);
        }
        return var;
    }

    public boolean supprimer(Produit p){
        if (produit.contains(p)) {
            produit.remove(p);
            return true;
        }else
            return false;
    }

    public int nombreProduitsEnSolde(){
        return produit.size();
    }

    public void enregistrer(String chemin)throws Exception{
        File file = new File(chemin);
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        for(Produit p:produit){
            pw.println(p);
        }
        pw.close();
    }
}
