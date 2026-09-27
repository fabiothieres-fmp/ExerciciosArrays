public class Questao08 {
    public static void main(String[] args) {
        Questao08 array = new Questao08();
        int[][] matriz = new int[2][2];
        double temp = array.calculaMedia(matriz);
        
        System.out.print("\nA media eh " + temp);
    }

    public double calculaMedia(int[][] matrix) {
        int count = 0;
        double soma = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Teclado.leInt("Digite um numero: ");
                soma = soma + matrix[i][j];
                count++;
            }
        }
        return soma / count;
    }
}