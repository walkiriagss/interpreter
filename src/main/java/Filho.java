public class Filho {
    private double salarioMae;
    private double salarioPai ;

    public double getSalarioMae() {
        return salarioMae;
    }

    public void setSalarioMae(double salarioMae) {
        this.salarioMae = salarioMae;
    }

    public double getSalarioPai() {
        return salarioPai;
    }

    public void setSalarioPai(double salarioPai) {
        this.salarioPai = salarioPai;
    }

    public double calcularMesada() {
        return Mesada.calcularMesada(this.salarioMae, this.salarioPai);
    }

}
