import java.util.Scanner;
public class MunicipalWasteCollection {

    void calculateWasteCollection( double point1waste, double point2waste) {
        double totalWaste = point1waste + point2waste;
        System.out.println("Total Waste Collected: " + totalWaste + " kg");
        
    }

    public static void main(String[] args) {

        Scanner ad = new Scanner(System.in);
        System.out.println("Municipal Waste Collection System");
        System.out.println("--------------------------------------------------");
        System.out.println();

        int vehicleNo = 2145;
        double wasteCollected = 108.0;
        int collectionPoints = 73;
        char vehicleStatus = 'F'; // F for Full, E for Empty

        System.out.println("Vehicle Number: " + vehicleNo);
        System.out.println("Waste Collected: " + wasteCollected + " kg");
        System.out.println("Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
        System.out.println("--------------------------------------------------");
        System.out.println();

        System.out.print("Enter the amount of waste collected (in kg): ");
        wasteCollected = ad.nextDouble(); // in kg

            if (wasteCollected > 100) {
                System.out.println("Collection Target Achived");
            } else {
                System.out.println("More Waste Collection Required");
            }
            System.out.println("--------------------------------------------------");
            System.out.println();


        System.out.print("Enter the amount of waste collected at point 1 (in kg): ");
        double waste1 = ad.nextDouble();

        System.out.print("Enter the amount of waste collected at point 2 (in kg): ");
        double waste2 = ad.nextDouble();

        MunicipalWasteCollection obj = new MunicipalWasteCollection();
        obj.calculateWasteCollection(waste1, waste2);

        ad.close();

}
}