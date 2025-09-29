package prog.test.pkg1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */

// ICricket Interface
interface ICricket {
    String getBatsman();
    String getStadium();
    int getRunsScored();
}

// Abstract Cricket Class
abstract class Cricket implements ICricket {
    protected String batsmanName;
    protected String stadiumName;
    protected int totalRuns;
    
    // Abstract method to be implemented by subclass
    public abstract void printReport();
}

// CricketRunsScored Subclass
class CricketRunsScored extends Cricket {
    
    // Constructor
    public CricketRunsScored(String batsmanName, String stadiumName, int totalRuns) {
        this.batsmanName = batsmanName;
        this.stadiumName = stadiumName;
        this.totalRuns = totalRuns;
    }
    
    // Implement ICricket interface methods
    @Override
    public String getBatsman() {
        return batsmanName;
    }
    
    @Override
    public String getStadium() {
        return stadiumName;
    }
    
    @Override
    public int getRunsScored() {
        return totalRuns;
    }
    
    // Implement printReport method
    @Override
    public void printReport() {
        System.out.println("\n========== Cricket Runs Report ==========");
        System.out.println("Batsman Name: " + getBatsman());
        System.out.println("Stadium Name: " + getStadium());
        System.out.println("Total Runs Scored: " + getRunsScored());
        System.out.println("=========================================\n");
    }
}

// Main class
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Cricket Runs Tracking System ===\n");
        
        // Get batsman's name
        System.out.print("Enter Batsman's Name: ");
        String batsmanName = scanner.nextLine();
        
        // Get stadium name
        System.out.print("Enter Stadium Name: ");
        String stadiumName = scanner.nextLine();
        
        // Get total runs scored
        System.out.print("Enter Total Runs Scored: ");
        int runsScored = scanner.nextInt();
        
        // Instantiate CricketRunsScored class
        CricketRunsScored cricketRecord = new CricketRunsScored(batsmanName, stadiumName, runsScored);
        
        // Print the report
        cricketRecord.printReport();
        
        scanner.close();
    }
}