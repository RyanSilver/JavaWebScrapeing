/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author silverr
 */
public class javaWebScraper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Webpuller test = new Webpuller();
        String t = "http://shadowrun.itemcards.com/artists";
        test.docPull(t);
    }
    
    
}
