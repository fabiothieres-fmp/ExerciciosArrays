public class Questao04 {
    public static void main(String[] args) {
        Questao04 arrays = new Questao04();
        int[] notas = new int[3];
        float temp = arrays.digitaNota(notas);
        
        System.out.printf("A media eh %.2f\n", temp);
    }

    public float digitaNota(int[] vet) {
        int soma = 0;
        int count = 0;
        
        for (int i = 0; i < vet.length; i++) {
            do {
                vet[i] = Teclado.leInt("Digite uma nota: ");
                if (vet[i] < 0 || vet[i] > 10) {
                    System.out.println("Nota invalida!!");
                }
            } while (vet[i] < 0 || vet[i] > 10);
            
            soma = soma + vet[i];
            count++;
        }
        return (float) soma / count;
    }
}