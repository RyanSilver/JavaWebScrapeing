/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.jsoup.*;
import org.jsoup.nodes.*;
/**
 *
 * @author wschottl
 */
public class Webpuller {
    
    public void docPull(String s){
        try{
            Document doc = Jsoup.connect(s).get();
            String title = doc.title();
            System.out.println(title);
        }
        catch(Exception ex){
            
        }
    }
    
    
}
