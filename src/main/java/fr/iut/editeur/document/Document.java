package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Ajoute du texte à la fin du document
     * @param texte texte à ajouter
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Remplace le texte entre les positions debut et fin par le texte remplacement
     * @param debut position de début
     * @param fin position de fin
     * @param remplacement texte de remplacement
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

/**
     * Met en majuscule le texte entre les positions debut et fin
     * @param debut position de début
     * @param fin position de fin
     */
    public void majuscules(int debut, int fin) {
        remplacer(debut, fin, texte.substring(debut, fin + 1).toUpperCase());
    }

    /**
     * Efface le texte entre les positions debut et fin
     * @param debut position de début
     * @param fin position de fin
     */
    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    /**
     * Efface tout le texte
     */
    public void clear() {
        texte = "";
    }
    

    @Override
    public String toString() {
        return this.texte;
    }
}
