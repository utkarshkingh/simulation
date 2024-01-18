package faps;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;


public class main {
    public static void main(String args[]) {
         
         try {
             ObjectMapper om = new ObjectMapper();
             root order = om.readValue("src\\main\\resources\\sequences.json", root.class);
             System.out.println(order);
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
}


