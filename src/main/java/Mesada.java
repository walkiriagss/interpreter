public class Mesada {

    public static String formula = "salarioMae + salarioPai * 0.05 ";

    public static double calcularMesada(double salarioMae, double salarioPai) {
        String expressao;
        expressao = formula.replace("salarioMae", Double.toString(salarioMae));
        expressao = expressao.replace("salarioPai", Double.toString(salarioPai));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
