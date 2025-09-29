package prog.test.pkg1;

/**
 *
 * @author RC_Student_lab
 */
public class ProgTest1 {
    
    public static void main(String[] args) {
        // Stadium names
        String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"};
        
        // Batsmen names
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};
        
        // Two-dimensional array storing runs scored
        // Rows: Stadiums, Columns: Batsmen
        int[][] runs = {
            {5000, 3800, 4200},  // Kingsmead
            {3500, 3700, 3900},  // St Georges
            {6200, 5000, 5200}   // Wanderers
        };
        
        // Display header
        System.out.println("=================================================");
        System.out.println("       BATSMEN RUNS SCORED REPORT");
        System.out.println("=================================================\n");
        
        // Display runs for each batsman at each stadium
        System.out.println("RUNS SCORED BY BATSMEN AT EACH STADIUM:");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < stadiums.length; i++) {
            System.out.println("\n" + stadiums[i] + ":");
            for (int j = 0; j < batsmen.length; j++) {
                System.out.println("  " + batsmen[j] + ": " + runs[i][j] + " runs");
            }
        }
        
        // Calculate total runs for each batsman
        System.out.println("\n=================================================");
        System.out.println("TOTAL RUNS SCORED BY EACH BATSMAN:");
        System.out.println("-------------------------------------------------");
        int[] batsmanTotals = new int[batsmen.length];
        for (int j = 0; j < batsmen.length; j++) {
            int total = 0;
            for (int i = 0; i < stadiums.length; i++) {
                total += runs[i][j];
            }
            batsmanTotals[j] = total;
            System.out.println(batsmen[j] + ": " + total + " runs");
        }
        
        // Find highest runs scored per stadium
        System.out.println("\n=================================================");
        System.out.println("HIGHEST RUNS SCORED PER STADIUM:");
        System.out.println("-------------------------------------------------");
        
        int overallMaxRuns = 0;
        String stadiumWithMostRuns = "";
        int stadiumMaxTotal = 0;
        
        for (int i = 0; i < stadiums.length; i++) {
            int maxRuns = runs[i][0];
            String topBatsman = batsmen[0];
            int stadiumTotal = 0;
            
            // Find highest individual score and calculate stadium total
            for (int j = 0; j < batsmen.length; j++) {
                stadiumTotal += runs[i][j];
                if (runs[i][j] > maxRuns) {
                    maxRuns = runs[i][j];
                    topBatsman = batsmen[j];
                }
            }
            
            System.out.println(stadiums[i] + ": " + topBatsman + " with " + maxRuns + " runs");
            System.out.println("  (Total runs at this stadium: " + stadiumTotal + ")");
            
            // Track stadium with most total runs
            if (stadiumTotal > stadiumMaxTotal) {
                stadiumMaxTotal = stadiumTotal;
                stadiumWithMostRuns = stadiums[i];
            }
        }
        
        // Display stadium with most runs scored
        System.out.println("\n=================================================");
        System.out.println("STADIUM WITH MOST RUNS SCORED:");
        System.out.println("-------------------------------------------------");
        System.out.println(stadiumWithMostRuns + " with " + stadiumMaxTotal + " total runs");
        System.out.println("=================================================");
    }
}