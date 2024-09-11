package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    @Test
    public void testAjouter() {
        Document document = new Document();
        document.ajouter("Hello");
        assertEquals("Hello", document.getTexte());
        document.ajouter(" World");
        assertEquals("Hello World", document.getTexte());
    }

    @Test
    public void testRemplacer() {
        Document document = new Document();
        document.ajouter("Hello World");
        document.remplacer(0, 4, "Hi");
        assertEquals("Hi World", document.getTexte());
    }

    @Test
    public void testMajuscules() {
        Document document = new Document();
        document.ajouter("Hello World");
        document.majuscules(0, 4);
        assertEquals("HELLO World", document.getTexte());
    }

    @Test
    public void testEffacer() {
        Document document = new Document();
        document.ajouter("Hello World");
        document.effacer(0, 4);
        assertEquals(" World", document.getTexte());
    }

    @Test
    public void testClear() {
        Document document = new Document();
        document.ajouter("Hello World");
        document.clear();
        assertEquals("", document.getTexte());
    }

}
