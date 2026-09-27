public class Questao07 {
    public static void main(String[] args) {
        Questao07 array = new Questao07();
        int[][] matriz = new int[5][5];
        
        // Chamada ao teclado para gerar a seta de dependência no BlueJ
        int valorInicial = Teclado.leInt("Digite o valor impar inicial para preencher a matriz (ex: 1): ");
        
        int temp = array.impares(matriz, valorInicial);
        System.out.print("\nA qtd de impares eh " + temp);
    }

    public int impares(int[][] matrix, int x) {
        int count = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (x % 2 == 1) {
                    matrix[i][j] = x;
                    System.out.println(" " + matrix[i][j]);
                    count++;
                }
                x++;
            }
        }
        return count;
    }
}