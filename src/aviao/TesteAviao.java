package aviao;

public class TesteAviao {
    public static void main(String[] args) {
        Aviao novoAviao = new Aviao(2,false,"carga","boeing","Gol","branco",6000,2,4,true);

        System.out.println("Quantidade de motores: " + novoAviao.getMotores());
        System.out.println("Tipo de transporte: " + novoAviao.getTipoTransporte());
        System.out.println("Cor do avião: " + novoAviao.getCor());
        System.out.println("Quantidade de classes do voo: " + novoAviao.getClasses());

        if(novoAviao.isTemLanchinho() == false) {
            System.out.println("Tem lanchinho?: não, não tem lanchinho" );
        } else {
            System.out.println("Tem lanchinho?: sim, temos lanchinho" );
        }

    }
}
