package HerancaJava;

public class Veiculo {
    private String cor;
    private String modelo;
    private String qtdPortas;
    private String potenciaMotor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(String qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public String getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(String potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public String toString(){
        return "\nCor: " + getCor() +
                "\nModelo: " + getModelo() +
                "\nQuantidade de portas: " + getQtdPortas() +
                "\nPotencia do motor: " + getPotenciaMotor();
    }
}
