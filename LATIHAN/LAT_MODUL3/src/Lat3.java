import java.util.Scanner;
public class Lat3 {
    public static void main(String[] args) throws Exception {
        Scanner inputbang = new Scanner(System.in);
        System.out.println("Masukan kalimat: ");
        String kalimat = inputbang.nextLine().toLowerCase();

        int jumlahvokal = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            char c = kalimat.charAt(i);
            if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
                jumlahvokal++;
            }
        }

        switch (jumlahvokal % 2) {
            case 0:
                System.out.println("Jumlah huruf vocal ganjil");
                break;
            case 1:
                System.out.println("Jumlah huruf vocal genap");
                break;
        }

        char [] kalimatArray = new char [kalimat.length()];
        int index = 0;
        for (int i = kalimat.length() - 1; i >= 0; i--) {
            kalimatArray[index] = kalimat.charAt(i);
            index++;
        }

        for (char karakter : kalimatArray) {
            System.out.print(karakter);
        }
    
        inputbang.close();

    }
}
