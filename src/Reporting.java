import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reporting {

    /**
     * ArrayLists are created and initialised since they will be used for methods ahead of the code.
     */
    static List<District> IncidentDistricts = new ArrayList<>();
    static List<Incident> Incidents = new ArrayList<>();

    /**
     *
     * @return This format is easily readable and understandable for anyone viewing the code.
     */
    @Override
    public String toString() {
        return "Reporting{" +
                "IncidentDistricts=" + IncidentDistricts +
                ", Incidents=" + Incidents +
                '}';
    }

    /**
     *
     * @return This method results in a district which has the largest average value
     * for the year which is provided by a user.
     *
     */
    public static District highestValueinYear() {
        double highest = Double.MIN_VALUE;
        int o;
        for (o = 0; o < IncidentDistricts.toArray().length; o++) {
            if (highest < IncidentDistricts.get(o).averageValue())
                highest = IncidentDistricts.get(o).averageValue();
            }
        return IncidentDistricts.get(o);
    }

    /**
     *
     * @return This method returns an Incident where the value of stolen goods is the highest.
     * The feature MIN_VALUE sets the element highestval to 0 so that it is easy to use for comparison
     */
    public static double largestValueRecorded() {
        double highestval = Double.MIN_VALUE;
        int w;
        for (w = 0; w < Incidents.toArray().length; w++) {
            if (highestval < Incidents.get(w).getValue())
                highestval = Incidents.get(w).getValue();
        }
        return highestval;
    }

    /**
     *
     * @return This method lists all the existing incidents which have a value greater
     *      * than the value provided by the user.
     */
    public static Object greaterthanValue() {
        int y;
        List<Object> resultIncidents = new ArrayList<>();
        Scanner usermoneyValue = new Scanner(System.in);
        System.out.println("Enter value");
        double searchmoneyValue = usermoneyValue.nextDouble();
        for (y = 0; y < Incidents.toArray().length; y++) {
            if (searchmoneyValue < Incidents.get(y).getValue())
                resultIncidents.add(Incidents.get(y));

            {
                y++;
            }
        }

        return resultIncidents;
    }




}

