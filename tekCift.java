import java.util.Scanner;
public class tekCift{
    public static void main(String[] args){
        int sayi = 0;
        Scanner gir = new Scanner(System.in);
        System.out.println("sayi gir: ");
        sayi = gir.nextInt();
        if(sayi %2 == 0){
            System.out.println("cift sayi")
        }
        else{
            System.out.println("tek sayi");
        }
    }
}
