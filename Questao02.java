public class Questao02 {
    public static void main(String[] args) {
        int[] vet = new int[15];
        double[] medias = new double[20];
        
        // Chamada ao teclado para gerar a seta de dependência no BlueJ
        medias[0] = Teclado.leDouble("Informe a primeira media para a Questao 2: ");
        
        System.out.println("Tamanho do vetor vet: " + vet.length);
        System.out.println("Ultimo elemento do array vet: " + vet[14]);
    }
}