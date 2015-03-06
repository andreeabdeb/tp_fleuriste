/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 0924345
 */
public class Liste_membres {

    static ArrayList<Membre> liste = new ArrayList<Membre>();

    public Liste_membres() {
    }

    public static void ajouterMembres(Membre m) {
        liste.add(m);
    }

    public static ArrayList getListeMembres() {
        return liste;
    }

    public static void afficherMembres() {

        Iterator iterator = liste.iterator();

        while (iterator.hasNext()) {
            System.out.println((Membre) iterator.next());
        }
    }

}
