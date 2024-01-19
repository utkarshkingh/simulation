package faps;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import faps.Sequence;
import faps.Root;

public class MakespanCalculator {

    public static void main(String[] args) {
        try {
            String jsonData = readJsonFile("src\\main\\resources\\sequences.json");
            Root root = deserializeJson(jsonData);

            
            int makespanMachine1 = calculateMakespan(root, "machine_1");
            int makespanMachine2 = calculateMakespan(root, "machine_2");

            System.out.println("Makespan for Machine 1: " + makespanMachine1);
            System.out.println("Makespan for Machine 2: " + makespanMachine2);

        } catch (IOException e) {
            
            e.printStackTrace();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }

    private static String readJsonFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    private static Root deserializeJson(String jsonData) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonData, Root.class);
    }

    private static int calculateMakespan(Root root, String machine) {
        int totalMakespan = 0;
    
        for (faps.Sequence sequence : root.getSequences()) {
            List<String> machineTasks = "machine_1".equals(machine) ? sequence.getMachine_1() : sequence.getMachine_2();
           
        }
    
        return totalMakespan;
    }
}
