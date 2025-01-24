
package co.edu.eci.arep.webServer;

import java.net.MalformedURLException;
import java.net.URL;

public class URLParser {

    public static void main(String[] args) throws MalformedURLException{
        URL site = new URL("https://ldbn.is.escuelaing.edu.co:8765/index.html?v=45&ty=67#eventos");
        
        System.out.println("Protocol: " + site.getProtocol());
        System.out.println("Authority: " + site.getAuthority());

        System.out.println("Host: " + site.getHost());
        System.out.println("Port: " + site.getPort());
        System.out.println("Path: " + site.getPath());
        System.out.println("Query: " + site.getQuery());
        System.out.println("File: " + site.getFile());
        System.out.println("Ref: " + site.getRef());

    }
}
