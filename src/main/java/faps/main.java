package faps;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import faps.machines;
import faps.Sequence;
import faps.Root;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;



public class main {
    public static void main(String args[]) {

        

        @Path("/makespan") 
        class MakespanResource {

        String jsonData = readJsonFile("src\\main\\resources\\sequences.json");
        Root root = deserializeJson(jsonData);


        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public String getMakespan() {
        
        int makespanMachine1 = MakespanCalculator.calculateMakespan(Root.root, "machine_1");
        int makespanMachine2 = MakespanCalculator.calculateMakespan(Root.root, "machine_2");

        return "{\"makespanMachine1\": " + makespanMachine1 + ", \"makespanMachine2\": " + makespanMachine2 + "}";
    }
}

         
         
         }

         
     }
            

     



