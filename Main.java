import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // DIET (percent)
        boolean herbivore = true;
        String consumes = "herbs, climbers, vines, flowers, fruits, and grass";
        int feedingTime = 75;


        //HABITAT
        String continent = "Africa";
        String biomes = "savannas, grasslands, and woodlands";


        // TOTAL NUMBERS
        int totalPopulation = 140000;
        int speciesAmount = 4;
        int africanCountriesExtinctIn = 7;


        //POPULATIONS
        int northernPopulation = 7037;
        int reticulatedPopulation = 20901;
        int southernPopulation = 68837;
        int masaiPopulation = 43926;


        //PRIOR POPULATION
        int popIn1980s = 155000;
        int popIn2016 = 100000;
        int popIn2026 = totalPopulation;


        //PROGRAM START
        System.out.println("Welcome! Please type in a number to learn more about the following topics: ");
        System.out.println("1. Endangered Status\n2. Anatomical Facts\n3. Fun Facts\n4. Scientific Names\n" +
                "5. Projected Population Growth\n6. Projected Population Decline\n7. Diet\n8. Habitat");


        Scanner scanner= new Scanner(System.in);
        String response = scanner.nextLine();


        switch (response){
            case "1":
                endangeredStatus();
                break;
            case "2":
                anatomicalFacts();
                break;
            case "3":
                funFacts();
                break;
            case "4":
                scientificNames();
                break;
            case "5":
                System.out.println("How many years ahead would you like to calculate for?");
                response = scanner.nextLine();
                int years = Integer.parseInt(response);
                calculateGrowth(popIn2026, years);
                break;
            case "6":
                calculateDecline(popIn1980s, popIn2026);
                break;
            case "7":
                System.out.println("This method has not been implemented yet. Sorry!");
                break;
            case "8":
                System.out.println("This method has not been implemented yet. Sorry!");
                break;
            default:
                System.out.println("Please enter a valid number 1-8.");
                break;
        }




    }


    //Katelyn’s Methods
    public static void funFacts(){
        boolean matriarchal = true;
        int avgLifeSpan = 13;
        double recordSpeed = 34.7;
        String eyeballSize = "golf balls";


        System.out.println("Did you know that it is " + matriarchal + " that giraffes are matriarchal?");
        System.out.println("Their average life span is " + avgLifeSpan + " years!");
        System.out.println("The fastest recorded speed of giraffes is " + recordSpeed + " miles per hour. Pretty fast, right?");
        System.out.println("You will never believe this, but giraffes have eyeballs the size of " + eyeballSize + "!");
    }


    public static void scientificNames(){


        String northernScientificName = "Giraffa camelopardalis";
        String southernScientificName = "Giraffa giraffa";
        String masaiScientificName = "Giraffa tippelskirchi";
        String reticulatediScientificName = "Giraffa reticulata";


        System.out.println("Here are the scientific names of these giraffes!");
        System.out.printf("Northern giraffes: %s%nSouthern giraffes: %s%nMasai giraffes: %s%nReticulated giraffes: %s", northernScientificName, southernScientificName, masaiScientificName,reticulatediScientificName);
    }


    //Noah’s Methods


    //calculates projected population growth
    //It won't grow 2100 for EVERY species, but it's a general estimate
    public static void calculateGrowth(int currentPop, int years){
        int projectedPop = currentPop + (2100 * years);
        System.out.println("In " + years + " years, the projected population grows to: " + projectedPop);
    }


    //calculates decline by creating local variable(s)
    public static void calculateDecline(int pastPop, int currentPop){
        int loss = pastPop - currentPop;
        double percentLoss = ((double) loss / pastPop) * 100; System.out.println("\n--- Population Decline ---");
        System.out.println("Population drop since 1980s: " + loss + " giraffes.");
        System.out.printf("Percentage Decline: %.2f%% decrease%n", percentLoss);
    }


    //Jeffrey's Methods


    /**
     * Displays the endangered status of various giraffe types.
     *
     * @author Jeffrey Silvas jeffreysilvas09@gmail.com
     * **/
    static void endangeredStatus() {
        //STATUS
        String northernStatus = "Critically Endangered";
        String reticulatedStatus = "Endangered";
        String southernStatus = "Vulnerable";
        String masaiStatus = "Endangered";


        System.out.printf("The endangered statuses of giraffes are as follows:%n" +
                "Northern Giraffe status: %s%n" +
                "Southern Giraffe status: %s%n" +
                "Reticulated Giraffe status: %s%n" +
                "Masai Giraffe status: %s%n", northernStatus, southernStatus, reticulatedStatus, masaiStatus);
    }


    /**
     * Displays anatomical facts about various types of giraffe.
     *
     * @author Jeffrey Silvas jeffreysilvas09@gmail.com
     * **/
    static void anatomicalFacts() {
        // ANATOMICAL FACTS (meters)
        double largestPossibleNeckLength = 1.8;
        double largestPossibleLegLength = 1.8;
        double largestPossibleFemaleHeight = 4.2672;
        double largestPossibleMaleHeight = 5.4864;
        double heartSize = 0.6096;


        System.out.printf("Here are some anatomical facts!%n" +
                "Largest possible neck length: %fm%n" +
                "Largest possible leg length: %fm%n" +
                "Largest possible male height: %fm%n" +
                "Largest possible female height: %fm%n" +
                "Heart size: %fm%n", largestPossibleNeckLength, largestPossibleLegLength, largestPossibleMaleHeight, largestPossibleFemaleHeight, heartSize);
    }
}
