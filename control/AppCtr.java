/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modele.Liste_membres;
import vue.MenuPrincipale;

/**
 *
 * @author 0924345
 */
public class AppCtr {
     private static Liste_membres liste_membres;
    public static void main(String [] args){

           new MenuPrincipale().setVisible(true);
    }
        
}
