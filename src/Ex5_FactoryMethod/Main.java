package Ex5_FactoryMethod;

import java.util.Scanner;

public class Main {

   static Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        int numeroTanque = menu();
    }

    public static int menu() {
        int numeroTanque;
        do {
            System.out.println("Escolha uma dos números abaixos e seleciona seu Canhão:");
            System.out.println("1) Megatron");
            System.out.println("2) Prime");
            System.out.println("3) Tracker");
            System.out.println("4) CrazyCannon");
            System.out.println("5) Finalizar programa");
            numeroTanque = sc.nextInt();

            //Se algum valor digitado não for o que o programa espera, irá cair nessa laço:
            while (numeroTanque < 1 || numeroTanque > 5) {
                System.err.println("Valor inválido: insira valores entre 1 e 5");
                numeroTanque = sc.nextInt();
            }
            
            System.out.println("");
            
            Tanque tanque = TanqueFactory.criarTanque(numeroTanque);
            tanque.setCores(CoresRGB.blue, CoresRGB.green);
            tanque.adPosicaox(5);
            tanque.adPosicaoy(5);
            tanque.caracteristicasTanque();
            tanque.atirar();
                       
            System.out.println("");
        
        } while (numeroTanque != 5);
        
        return numeroTanque;
    }
    
    
}
