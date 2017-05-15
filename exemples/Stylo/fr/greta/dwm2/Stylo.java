/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package fr.greta.dwm2;

/**
 *
 * @author lauhub
 */
public class Stylo{
    public void ecrire(String msg){
        System.out.println("__" + msg + "__");
    }
    
    public void ecrire(){
        ecrire("");
    }
    public static void main(String[] args)
    {
        Stylo stylo = new StyloRouge();
        stylo.ecrire("Bonjour");
        
        stylo = new StyloBleu();
        stylo.ecrire("En Bleu");
        
        stylo = new StyloVert();
        stylo.ecrire("En Vert");
    }
}
