/**
 * This is a class to represent the Incident Object which are the burglary incidents that have taken place.
 * This class contains methods which are related to getting and setting the field values along with a constructor.
 *
 * @author Areesh Imran
 *
 */
public class Incident {

    private static double value;
    private String postcode;
    private int month;
    private int year;

    /**
     *
     *  This is a constructor which defines all the field values in the Incident class.
      * @param value is the worth of the goods that were stolen during the incident.
     * @param postcode is the postal code of the area where the incident took place.
     * @param month is the month in which the incident occurred.
     * @param year is the year in which the incident occurred.
     */
    public Incident(double value, String postcode, int month, int year)
    {
        Incident.value = value;
        this.postcode = postcode;
        this.month = month;
        this.year = year;
    }

    /**
     * This is the method to get the value of good stolen from the constructor
     * @return type is double since the value can have decimal numbers.
     */

    public static double getValue() {
        return value;
    }

    public String getPostcode() {
        return postcode;
    }

    public int getMonth() {

        return month;
    }

    public int getYear() {

        return year;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /**
     *
     * @return This method returns the output readable and understandable to the human eyes.
     */
    @Override
    public String toString() {
        return "Incident{" +
                "value=" + value +
                ", postcode='" + postcode + '\'' +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
