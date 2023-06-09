import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * This class contain methods related to the district where the incidents took place
 * and it will help us understand the incidents even more since this class contains
 * methods for returning the highest value, average values and district information
 */
public class District {
    /**
     * ArrayList is created to store all the incidents from the Incident.java class
     * The field LocalDistrict is created to store the name of the district where the incidents
     * may have occurred.
     */
    private static String LocalDistrict;
    static List<Incident> BurglaryIncidents = new ArrayList<>();

    public District(String localDistrict, Incident incident) {
        LocalDistrict = localDistrict;
    }

    /**
     *
     * @return Provides the data in readable format for human eyes.
     */
    @Override
    public String toString() {
        return "District{" +
                "LocalDistrict='" + LocalDistrict + '\'' +
                ", BurglaryIncidents=" + BurglaryIncidents +
                '}';
    }


    public static String getLocalDistrict() {
        return LocalDistrict;
    }


    public Boolean addToDistrict(Incident i){
        return BurglaryIncidents.add(i);
    }

    /**
     *
     * @return Provides the incident with the highest value of the goods stolen in the given district.
     * User input is also required so that the user can search the district related information.
     * An index i is used for iteration and there is a highest value stored to compare the elements in
     * the ArrayList.
     */
    public static Incident highestValue() {

        Scanner DistrictName = new Scanner(System.in);
        System.out.println("Enter District Name");
        String inputDistrict = DistrictName.next();

        double highest = Double.MIN_VALUE;
        int i;
        for (i = 0; i < BurglaryIncidents.toArray().length; i++) {
            if (highest < BurglaryIncidents.get(i).getValue() && getLocalDistrict() == inputDistrict)
                highest = BurglaryIncidents.get(i).getValue();
            }
        return BurglaryIncidents.get(i);
    }

    /**
     *
     * @return Provides the average incident value which is noted in the district in a user input year.
     * The variable k is used for iteration and the sum and average are the key fields to output the average.
     */
    public static double averageValue() {
        double sum = 0;
        double average = 0;

        Scanner inputYear = new Scanner(System.in);
        System.out.println("Enter Year");
        int yearValue = inputYear.nextInt();

        Scanner DistrictName = new Scanner(System.in);
        System.out.println("Enter District Name");
        String inputDistrict = DistrictName.next();

        int k;
        for (k = 0; k < BurglaryIncidents.toArray().length; k++) {
            if (BurglaryIncidents.get(k).getYear() == yearValue && getLocalDistrict() == inputDistrict)
            {sum = sum + BurglaryIncidents.get(k).getValue();
            average = sum / BurglaryIncidents.toArray().length;}
        }

        return average;

    }

    /**
     *
     * @return Provides a list of all incidents recorded in the district which have a value which is larger than
     * the user input value.
     * Variable q is used for iteration and the object outputIncidents returned
     */
    public static Incident greaterValue() {

        Scanner DistrictName = new Scanner(System.in);
        System.out.println("Enter District Name");
        String inputDistrict = DistrictName.next();

        int q;
        Incident outputIncidents = BurglaryIncidents.get(0);
        Scanner userValue = new Scanner(System.in);
        System.out.println("Enter value");
        double searchValue = userValue.nextDouble();
        for (q = 0; q < BurglaryIncidents.toArray().length; q++) {
            if (searchValue < BurglaryIncidents.get(q).getValue() && getLocalDistrict() == inputDistrict)
                outputIncidents = BurglaryIncidents.get(q);
            {
                q++;
            }
        }

        return outputIncidents;

    }

}














