package arrays;

public class SomaDeVetores {
    public static void main(String[] args) {

        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}
