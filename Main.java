/**---------------------------------------------------------------
Group Member Names: Jeffrey, Katelyn, Kevin, Noah
---------------------------------------------------------------**/

import java.util.scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome! Please type in a number to learn more about the following topics: ");
        System.out.println("1. Endangered Status\n2. Anatomical Facts\3.. Fun Facts\n4. Scientific Names\n5. Projected Population Growth\n6. Projected Population Decline\n7. Diet\n8. Habitat");
        /**switch (userSelection){
            case 1:
                //call method
                Break;
                Case 2:
                //call method
                Break;
                Case 3:
                //call method
                break**/
        }
        public static void funFacts(){
            boolean matriarchal = true;
            int avgLifeSpan = 13;
            double recordSpeed = 34.7;
            String eyeballSize = "golf balls";

            System.out.println("Did you know that it is" + " " + matriarchal + " " + "that giraffes are matriarchal?");
            System.out.println("Their average life span is" + " " + avgLifeSpan + " " + "years!");
            System.out.println("The fastest recorded speed of giraffes is" + " " + recordSpeed + " " + "miles per hour. Pretty fast right?");
            System.out.println("You will never believe this, but giraffes have eyeballs the size of" + " " + eyeballSize + "!");
        }

        Public static void scientificNames(){

            String northernScientificName = "Giraffa camelopardalis";
            String southernScientificName = "Giraffa giraffa";
            String masaiScientificName = "Giraffa tippelskirchi";
            String reticulatediScientificName = "Giraffa reticulata";

            System.out.println("Here are the scientific names of these giraffes!");
            System.out.printf("Northern giraffes: %s%nSouthern giraffes: %s%nMasai giraffes: %s%nReticulated giraffes: %s", northernScientificName, southernScientificName, masaiScientificName,reticulatediScientificName);
        }
    }

