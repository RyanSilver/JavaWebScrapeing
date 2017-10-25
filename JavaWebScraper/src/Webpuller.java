/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.helper.*;
import org.jsoup.internal.*;
import org.jsoup.parser.*;
import org.jsoup.safety.*;
import org.jsoup.select.*;
/**
 *
 * @author wschottl
 */
public class Webpuller {
    
    public void docPull(String s){
        try{
            Document doc = Jsoup.connect(s).get();
            Element content = doc.getElementById("content");
            Elements links = content.getElementsByTag("li");
            for (Element link : links) {
            String title = link.data();
            System.out.println(title);
            }
        }//try
        catch(Exception ex){
            
        }//catch
    }//docpull
    
    
}
