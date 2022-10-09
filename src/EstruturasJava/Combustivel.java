// Definir 1 método para calcular o valor total para encher o tanque, deve receber parâmetro "Valor da Gasolina"
// Fazer 2 sobrecargas do construtor
// Criar métodos específicos para fornecer e receber os valores dos atributos (get/set)
package EstruturasJava;

public class Combustivel {
    private double valorGasolina;
    private double valorTotal;
    private double capacidadeTanque;
    private double calculo;

    public double getValorGasolina() {
        return valorGasolina;
    }

    public void setValorGasolina(double valorGasolina) {
        this.valorGasolina = valorGasolina;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }

    //Construtor       //Parâmetro
    public Combustivel(double valorGasolina, double valorTotal){

    }
}
