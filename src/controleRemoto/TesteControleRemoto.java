package controleRemoto;

public class TesteControleRemoto {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();

        System.out.println("Chamando carro: " + controle.mover("Carro"));
        System.out.println("Chamando avião: " + controle.mover("Avião", true));
        System.out.println("Chamando barco: " + controle.mover("batata", false, true));
    }
}
