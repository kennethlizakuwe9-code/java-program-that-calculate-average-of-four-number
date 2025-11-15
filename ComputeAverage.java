*Author KENNETH BLESSINGS LIZAKUWE
 * NCE/SCI/148/23
 * 
 * Asimple program that compute Average of four numbers
 * comment of the code are in chichewa
 */
import java.util.Scanner; //scanner ali mmu bandulo ya java.util

public class ComputeAverage {
    public static void main(String[] args) {
        // kupanga chipangizo chopangira scan
        Scanner input = new Scanner(System.in);

        // Kumuwuza Ogwiritsa ntchito program kuti alowetse manambala anayi
        System.out.println("Enter four numbers");
        
        System.out.println("number1: ");
        double number1 = input.nextDouble();
        
        System.out.println("number2: ");
        double number2 = input.nextDouble();

        System.out.println("number3: ");
        double number3 = input.nextDouble();

        System.out.println("number4: ");
        double number4 = input.nextDouble();

        // kuwerengera Average ya manambala anayi
        double average = (number1 + number2 + number3 + number4) / 4;

        // kupereka zotsatila
        System.out.println("Average yamanambala anu omwe mwalowetsa ndi " + average);
    }
}