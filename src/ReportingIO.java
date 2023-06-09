import java.util.Scanner;

public class ReportingIO {
    public static void main(String[] args) {

        /**
         * The following codes take up the input values from the user and store these values in the
         * District ArrayList to organise them for further use. The output is a neat, readable
         * list which can be easily understood. The values that are taken are related to the incidents
         * and the district information.
         */
        Scanner inputVal1 = new Scanner(System.in);
        System.out.println("Enter the value of the goods stolen");
        double Value1 = inputVal1.nextDouble();

        Scanner inputPostcode1 = new Scanner(System.in);
        System.out.println("Enter the postcode");
        String Postcode1 = inputPostcode1.next();

        Scanner inputMonth1 = new Scanner(System.in);
        System.out.println("Enter the month of the incident");
        int Month1 = inputMonth1.nextInt();

        Scanner inputYear1 = new Scanner(System.in);
        System.out.println("Enter the year of the incident");
        int Year1 = inputYear1.nextInt();

        Scanner LocalDistrict1 = new Scanner(System.in);
        System.out.println("Enter the district name");
        String District1 = LocalDistrict1.next();

        Incident i = new Incident(Value1, Postcode1, Month1, Year1);

        District district = new District(District1, new Incident(Value1, Postcode1, Month1, Year1));

        district.addToDistrict(i);


        Scanner inputVal4 = new Scanner(System.in);
        System.out.println("Enter the value of the goods stolen");
        double Value4 = inputVal4.nextDouble();

        Scanner inputPostcode4 = new Scanner(System.in);
        System.out.println("Enter the postcode");
        String Postcode4 = inputPostcode4.next();

        Scanner inputMonth4 = new Scanner(System.in);
        System.out.println("Enter the month of the incident");
        int Month4 = inputMonth4.nextInt();

        Scanner inputYear4 = new Scanner(System.in);
        System.out.println("Enter the year of the incident");
        int Year4 = inputYear4.nextInt();


        Incident i4 = new Incident(Value4, Postcode4, Month4, Year4);


        district.addToDistrict(i4);


        Scanner inputVal2 = new Scanner(System.in);
        System.out.println("Enter the value of the goods stolen");
        double Value2 = inputVal2.nextDouble();

        Scanner inputPostcode2 = new Scanner(System.in);
        System.out.println("Enter the postcode");
        String Postcode2 = inputPostcode2.next();

        Scanner inputMonth2 = new Scanner(System.in);
        System.out.println("Enter the month of the incident");
        int Month2 = inputMonth2.nextInt();

        Scanner inputYear2 = new Scanner(System.in);
        System.out.println("Enter the year of the incident");
        int Year2 = inputYear2.nextInt();

        Scanner LocalDistrict2 = new Scanner(System.in);
        System.out.println("Enter the district name");
        String District2 = LocalDistrict2.next();

        Incident i1 = new Incident(Value2, Postcode2, Month2, Year2);

        District district1 = new District(District2, new Incident(Value2, Postcode2, Month2, Year2));

        district1.addToDistrict(i1);


        Scanner inputVal3 = new Scanner(System.in);
        System.out.println("Enter the value of the goods stolen");
        double Value3 = inputVal3.nextDouble();

        Scanner inputPostcode3 = new Scanner(System.in);
        System.out.println("Enter the postcode");
        String Postcode3 = inputPostcode3.next();

        Scanner inputMonth3 = new Scanner(System.in);
        System.out.println("Enter the month of the incident");
        int Month3 = inputMonth3.nextInt();

        Scanner inputYear3 = new Scanner(System.in);
        System.out.println("Enter the year of the incident");
        int Year3 = inputYear3.nextInt();

        Scanner LocalDistrict3 = new Scanner(System.in);
        System.out.println("Enter the district name");
        String District3 = LocalDistrict3.next();

        Incident i2 = new Incident(Value3, Postcode3, Month3, Year3);

        District district2 = new District(District3, new Incident(Value3, Postcode3, Month3, Year3));

        district2.addToDistrict(i2);


        System.out.println(district);
        System.out.println(district1);
        System.out.println(district2);

        /**
         *
         * The following is a menu printed on the console where the user can select an option which is a
         * feature, and apply it to the provided data, or simply quit to terminate the program.
         * Here, methods, mainly from the Reporting class, are returned.
         *
         *
         */
        String input;
        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("Crime Reporting System Menu");
            System.out.println("1. Output district with largest average value incident for\n" +
                    "a given year");
            System.out.println("2. Output highest incident ever reported");
            System.out.println("3. Output all incidents with value\n" +
                    "greater than a given amount");
            System.out.println("4. Quit");

            System.out.print("Please enter either 1 to 4: ");
            input = (scanner.nextLine());
            if (input.equals("1")) {
                System.out.println(Reporting.highestValueinYear());
            } else if (input.equals("2")) {
                System.out.println(Reporting.largestValueRecorded());
            } else if (input.equals("3")) {
                System.out.println(Reporting.greaterthanValue());
            }


        }
        while(!input.equals("4"));
    }


}