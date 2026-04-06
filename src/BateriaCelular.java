
import java.util.Random;
import java.util.Scanner;

public class BateriaCelular {

    Random ran = new Random();
    Scanner scan = new Scanner(System.in);

    private int nivel = ran.nextInt(101);
    private int bateriaVariavel;
    private int escolha;

    public void carregar(int nivel) {
        bateriaVariavel = ran.nextInt(101);
        nivel += bateriaVariavel;

        if (nivel > 100) {
            nivel = 100;
        }
        setNivel(nivel);
        System.out.println("Carregou: " + bateriaVariavel);
        System.out.println("A bateria atual é: " + nivel);

    }

    public void usar(int nivel) {
        bateriaVariavel = ran.nextInt(101);
        nivel -= bateriaVariavel;

        if (nivel < 0) {
            nivel = 0;
        }
        setNivel(nivel);
        System.out.println("Descarregou: " + bateriaVariavel);
        System.out.println("A bateria atual é: " + nivel);
    }

    public void status(int nivel) {

        if (nivel >= 0 && nivel <= 20) {
            System.out.println("Bateria fraca!");
        } else if (nivel > 20 && nivel <= 70) {
            System.out.println("Bateria média!");
        } else if (nivel > 70 && nivel <= 100) {
            System.out.println("Bateria alta!");
        }
    }

    public void escolha() {

        do {
            System.out.println("Gostaria de: \n1-Carregar \n2-Usar");
            setEscolha(scan.nextInt());
            switch (getEscolha()) {
                case 1:
                    carregar(getNivel());
                    status(getNivel());
                    break;
                case 2:
                    usar(getNivel());
                    status(getNivel());
                    break;

            }
        } while (getEscolha() == 1 || getEscolha() == 2);
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 0 && nivel <= 100) {
            this.nivel = nivel;
        } else {
            System.out.println("Carga inválida");
        }
    }

    public int getBateriaVariavel() {
        return bateriaVariavel;
    }

    public void setBateriaVariavel(int bateriaVariavel) {
        this.bateriaVariavel = bateriaVariavel;
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

}
