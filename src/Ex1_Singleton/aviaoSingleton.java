package Ex1_Singleton;

public class aviaoSingleton {

    private static aviaoSingleton objAviao = new aviaoSingleton();
    private String cor = "Branco";
    private int qtdRodas = 3;
    private String marca = "GOL";

    public aviaoSingleton() {
        this.cor = cor;
        this.qtdRodas = qtdRodas;
        this.marca = marca;
    }

    private String getCor() {
        return cor;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public String getMarca() {
        return marca;
    }

    public static void detalhesDoAviao() {
        System.out.println("Cor do avião: " + objAviao.getCor());
        System.out.println("Rodas: " + objAviao.getQtdRodas());
        System.out.println("Marca: " + objAviao.getMarca());
    }

    public static aviaoSingleton getInstance() {
        return objAviao;
    }

}
