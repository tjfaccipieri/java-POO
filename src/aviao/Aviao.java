package aviao;
//Crie uma classe avião e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto avião, defina as instancias deste
//objeto e apresente as informações deste objeto no console.
public class Aviao {

    private int motores;
//    false = motor helice
//    true = motor jato
    private boolean tipoMotor;
    private String tipoTransporte;
    private String fabricante;
    private String companhia;
    private String cor;
    private int capacidade;
    private int classes;
    private int saidaEmergencia;
    private boolean temLanchinho;

    public Aviao(int motores, boolean tipoMotor, String tipoTransporte, String fabricante, String companhia, String cor, int capacidade, int classes, int saidaEmergencia, boolean temLanchinho) {

        if(tipoTransporte == "carga") {
            classes = 0;
            temLanchinho = false;
        }

        this.motores = motores;
        this.tipoMotor = tipoMotor;
        this.tipoTransporte = tipoTransporte;
        this.fabricante = fabricante;
        this.companhia = companhia;
        this.cor = cor;
        this.capacidade = capacidade;
        this.classes = classes;
        this.saidaEmergencia = saidaEmergencia;
        this.temLanchinho = temLanchinho;
    }

    public Aviao() {}

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public boolean isTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(boolean tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    public int getSaidaEmergencia() {
        return saidaEmergencia;
    }

    public void setSaidaEmergencia(int saidaEmergencia) {
        this.saidaEmergencia = saidaEmergencia;
    }

    public boolean isTemLanchinho() {
        return temLanchinho;
    }

    public void setTemLanchinho(boolean temLanchinho) {
        this.temLanchinho = temLanchinho;
    }
}
