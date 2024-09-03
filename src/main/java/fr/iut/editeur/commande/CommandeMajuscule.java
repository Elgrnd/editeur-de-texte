package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscule extends CommandeDocument {

    public CommandeMajuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if (parameters.length < 3) {
            System.err.println("Format attendu : majuscules;debut;fin");
            return;
        }
        int debut = Integer.parseInt(parameters[0]);
        int fin = Integer.parseInt(parameters[1]);
        document.majuscules(debut, fin);
    }
}
