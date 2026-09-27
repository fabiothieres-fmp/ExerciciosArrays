public class Questao03 {
    public static void main(String[] args) {
        Questao03 arrays = new Questao03();
        double[] notas = new double[3];
        double temp = arrays.digitaNota(notas);
        
        System.out.print("A media eh " + temp);
    }

    public double digitaNota(double[] vet) {
        double soma = 0;
        int count = 0;
        
        for (int i = 0; i < vet.length; i++) {
            do {
                vet[i] = Teclado.leDouble("Digite uma nota: ");
                if (vet[i] < 0.0 || vet[i] > 10.0) {
                    System.out.println("Nota inválida!!");
                }
            } while (vet[i] < 0.0 || vet[i] > 10.0);
            
            soma = soma + vet[i];
            count++;
        }
        return soma / count;
    }
}