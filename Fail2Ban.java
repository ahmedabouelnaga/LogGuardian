import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Map;
import java.io.IOException;
import java.io.FileWriter;

public class Fail2Ban{
    public static void main(String[] args){
        Hashtable<String, Integer> ipAdresses = new Hashtable<String, Integer>();
        try{
            File openLogs = new File("logs_processed.txt");
            Scanner readFile = new Scanner(openLogs);
            while(readFile.hasNextLine()){
                String[] line = readFile.nextLine().split(" ");
                if(line[5].equals("Invalid")){
                    if (ipAdresses.containsKey(line[9])) {
                        ipAdresses.put(line[9], ipAdresses.get(line[9]) + 1);
                    } else
                    ipAdresses.put(line[9], 1);
                }
            }
            readFile.close();
        } catch(FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        try{
            FileWriter writeLog = new FileWriter("output.txt");
            for (Map.Entry<String, Integer> entry : ipAdresses.entrySet()){
                if(entry.getValue() > 3)
                writeLog.write(entry.getKey() + "\n");
            }
            writeLog.close();
        }catch(IOException e){
            System.out.println("An Error has occured....");
        }
    }
}