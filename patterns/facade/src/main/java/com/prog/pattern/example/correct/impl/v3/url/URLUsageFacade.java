package com.prog.pattern.example.correct.impl.v3.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLUsageFacade {

    public static void main(String[] args) throws IOException {

        URL url = new URL("http", "www.pluralsight.com", 80, "/author/bryan-hansen");

        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
    }
}
