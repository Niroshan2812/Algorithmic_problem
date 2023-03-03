/*proublem 
 * You work for a logistics company and are responsible for optimizing the delivery routes for a fleet of trucks. 
 * You have a list of customers with their addresses and the number of packages that need to be delivered to each address. 
 * Your task is to create an algorithm that will determine the most efficient route for the trucks to deliver all the packages while minimizing travel time and distance.

Assume that the trucks can carry a fixed number of packages and have a limited range (i.e., they can only travel a certain distance before needing to refuel). 
The algorithm should also take into account traffic conditions and road closures to optimize the route.

Your task is to create a Python program that takes in a list of customer addresses and the number of packages to be delivered to each address, and outputs the optimal route for the trucks to deliver all the packages.
 */
/*
 * Solution  ---- 
 * rEQUIREMENT - 
 *          sCOPE - Optimize the delivery routes for a feet of trucks, 
 *                  Taking number of pakage ti be deliver,
 *                  The distance the truck can travel 
 *                  Close rode/ detarmine the traffic
 * 
 *         Inputs - 
 *                  List of customer address,
 *                  the number of pakages need to be delivery 
 *                  Infromation about the closed and traffic rodes. 
 *         
 *  What are the maximum capacity each truck can carry -- How many truck we needed?
 * Calculate the distancce between each address - (Can be use api for detarmine the distance )
 * 
 * Optimize route ?? --- 
 *      What is the most efficient route?
 *          -   Minimise the distance traveld
 *          -   Minimise the number of truck need to be used 
 * 
 * 
 * 
 */



import java.util.HashMap;
import java.util.Map;
    
public class prm1 {
    
    private Map<String, Integer> addresses; // stores customer addresses and number of packages
    
    public prm1() {
            addresses = new HashMap<>();
    }
    
    public void addAddress(String address, int numPackages) {
            addresses.put(address, numPackages);
    }
    
    public void optimizeRoute() {
          
            // TODO: Implement sorting algorithm to optimize delivery route
    
           
            // TODO: Implement dynamic programming algorithm to optimize delivery route based on truck range and traffic conditions
        }
    
    public void outputRoute() {
           
            // TODO: Implement output mechanism (e.g., text file or graphical interface) to display optimized delivery route
        }
    
    public static void main(String[] args) {
            prm1 optimizer = new prm1();
    
            // Step 1: Input Data
            optimizer.addAddress("123 Main St.", 5);
            optimizer.addAddress("456 Elm St.", 3);
            optimizer.addAddress("789 Oak St.", 2);
    
            optimizer.optimizeRoute();
            optimizer.outputRoute();
    }
}
    







  

