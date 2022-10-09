// Criar objetos da classe "Carro" usando métodos get/set
// Passar uma mensagem do cálculo total para encher o tanque
package ObjetosJava;

public class Carro {
    private String cor;
    private String modelo;
    private double capacidadeTanque;
    private double TanqueAtual;
    private double PrecoCombustivel;

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

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getTanqueAtual() {
        return TanqueAtual;
    }

    public void setTanqueAtual(double tanqueAtual) {
        this.TanqueAtual = tanqueAtual;
    }
    public double getPrecoCombustivel() {
        return PrecoCombustivel;
    }

    public void setPrecoCombustivel(double precoCombustivel) {
        PrecoCombustivel = precoCombustivel;
    }

    public void EncherTanque(){
        double calcTotal = capacidadeTanque - TanqueAtual;
        double calcRestante = calcTotal * getPrecoCombustivel();

        System.out.print("Quantidade restante para encher o tanque: " + calcTotal + " litros" + " e valor total: $ " + calcRestante);
    }

    public String toString(){
        return "\nCor: " + getCor() +
                "\nModelo: " + getModelo() +
                "\nTanque atual: " + getTanqueAtual() + " litros" +
                "\nCapacidade máxima do tanque: " + getCapacidadeTanque() + " litros" +
                "\nPreço do combustível: $ " + getPrecoCombustivel();
    }
}
