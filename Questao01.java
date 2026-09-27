public class Questao01 {
    public static void main(String[] args) {
        // Criar o array e atribuir-lhe valores a partir de uma lista
        int[] a = {507, 15, 147, 2194, 300, 27, 888, -110, 0, 675}; // length 10
        
        int i = 2;
        System.out.println("indice " + i + " Contem o elemento " + a[i]);
        
        System.out.println("Terceiro Elemento do array a eh " + a[2]);
        System.out.println("Primeiro Elemento do array eh " + a[1]);
        System.out.println("E qual é o Elemento zero do array ?? " + a[0]);
        
        // Substituindo o valor da posicao 1 do array a pelo teclado
        a[1] = Teclado.leInt("Informe um Numero inteiro: ");
        
        System.out.println("Agora o Elemento 1 é o que vc digitou. É igual a " + a[1]);
    }
}