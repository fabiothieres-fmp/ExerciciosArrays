public class Questao06 {
    public static void main(String[] args) {
        int[][] matriz = new int[6][4];
        double[][] notas = new double[5][5];
        char[][] letras = new char[3][3];
        
        // Chamada ao teclado para gerar a seta de dependência no BlueJ
        matriz[0][0] = Teclado.leInt("Informe um valor para a posicao [0][0] da matriz: ");
        
        System.out.println("Matrizes instanciadas com sucesso.");
    }
}