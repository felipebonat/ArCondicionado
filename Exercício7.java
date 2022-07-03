package exercicio;

import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //pedindo para o usuario digitar a quantidade de números a ser digitado.
        System.out.print("Digite a quantidade de número a ser digitado: ");
        int tamanho = entrada.nextInt();

        //declarando um vetor do tipo inteiro com tamanho informado pelo usuario
        int[] vetor = new int[tamanho];

        float media = 0.0f;
        int contadorM = 0;
        int soma = 0;

        for(int i = 0; i < tamanho ; i++){
            //recebe os valores inteiros informados pelo usuario
            System.out.print("Digite um número inteiro e positivo: ");
            int numero = entrada.nextInt();

            //verifica se o número digitado é >= 0
            if(numero >= 0) {
                vetor[i] = numero;
                if(vetor[i] % 3 == 0){
                    soma = soma + vetor[i];
                    //linha de baixo é a mesma coisa que "contadorM++"
                    contadorM = contadorM + 1;
                }
            }
        }
        media = ((float) soma) / contadorM;
        System.out.print("O valor da média é: " + media);

    }
}
