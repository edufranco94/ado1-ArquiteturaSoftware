package Ex5_FactoryMethod;

public class TanqueFactory {
    public static Tanque criarTanque(int opcaoMenu) {
        if (opcaoMenu == 1) {
            return new TanqueMegatron();
        } else if (opcaoMenu == 2) {
            return new TanquePrime();
        } else if (opcaoMenu == 3) {
            return new TanqueTracker();
        } else if (opcaoMenu == 4){
            return new TanqueCrazy();
        } else {
            throw new IllegalArgumentException("Tanque não existe, PROGRAMA ENCERRADO.");
        }
    }
}
