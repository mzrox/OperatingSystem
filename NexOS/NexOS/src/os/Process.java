/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package os;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/****
 * @author mztah
****/
public class Process {
    public int id;
    public String name;
    public int burstTime;
    public int arrivalTime;
    public String priority;
    public int memorySize;
    public int completionTime;
    public int turnAroundTime;
    public int waitingTime;
    public int responseTime;
    public String status;
    
    private static Set<Integer> usedIds = new HashSet<>();
    private static final int MAX_ID = 9999; // Maximum 4-digit number
    public void setStatus(String b){
        status = b;
    }
    public int setProcess(String n, int at, int bt, int p, int ms){
        id = generateUniqueFourDigitId();
        name = n;
        burstTime = bt;
        arrivalTime = at;
        priority = "Medium";
        memorySize = ms; 
        status = "Ready";
        return id;
    }
    public void setProcess(String n, int at, int bt){
        id = generateUniqueFourDigitId();
        name = n;
        burstTime = bt;
        arrivalTime = at;
        priority = "Medium"; 
        status = "Ready";
//        return id;
    }
    private int generateUniqueFourDigitId() {
    Random random = new Random();
    int newId;

    // Generate a new unique 4-digit ID
    do {
        newId = random.nextInt(MAX_ID) + 1000; // Generate a random number between 1000 and 9999
    } while (usedIds.contains(newId));

    // Add the new ID to the set of used IDs
    usedIds.add(newId);

    return newId;
    }

    
}
