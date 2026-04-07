
import java.util.Random;
import java.util.Scanner;
//testando github
public class Celulares {

    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);

        BateriaCelular celu1 = new BateriaCelular();

        System.out.println("Sua bateria atual é: " + celu1.getNivel());
        celu1.status(celu1.getNivel());
        System.out.println("---------------------------");

        celu1.escolha();

    }
}
