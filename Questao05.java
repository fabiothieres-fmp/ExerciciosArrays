public class Questao05 {
    public static void main(String[] args) {
        int[][] mat = {
            {13, 45, 12, 19},
            {67, -5, 88, 37},
            {11, 43, 13, 0},
            {64, 52, 29, 18},
            {71, 14, 19, 62}
        };
        
        System.out.println("Valor em mat[1][1]: " + mat[1][1]);
        System.out.println("Total de linhas: " + mat.length);
        
        // Chamada ao teclado para gerar a seta de dependência no BlueJ
        Teclado.leInt("Digite 1 para finalizar a visualizacao da matriz: ");
    }
}