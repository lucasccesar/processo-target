import java.util.Scanner;
import java.util.Random;

public class Main{

    public static void main(String[] args){
        /* questao1();
        questao2();
        questao3();
        questao4(); */
        questao5();
    }

    public static void questao1(){ // Primeira Questão

        System.out.println("Questão 1");

        Scanner scan = new Scanner(System.in);
        
        int fibonacci1 = 0;
        int fibonacci2 = 1;
        int currentFibonacci = fibonacci1 + fibonacci2;

        System.out.println("Informe um número: ");
        int userNum = scan.nextInt();

        while(currentFibonacci < userNum){

            fibonacci1 = fibonacci2;
            fibonacci2 = currentFibonacci;
            currentFibonacci = fibonacci1 + fibonacci2;

        }
        
        if(currentFibonacci == userNum || userNum == 0){

            System.out.println("Número pertence a sequencia de fibonacci");

        } else{

            System.out.println("Número não pertence a sequencia de fibonacci");

        }

        scan.close();

    }

    public static void questao2(){ // Segunda Questão

        System.out.println("Questão 2");

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String text = scan.nextLine();

        text = text.toLowerCase();


        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == 'a') {

                count++;

            }

        }

        if (count > 0) {

            System.out.printf("O texto tem %d letras A", count);

        } else {

            System.out.println("O texto não tem letra A");

        }

        scan.close();

    }

    public static void questao3(){ // Terceira Questão

        //Resposta: 77

        System.out.println("Questão 3");

        int indice = 12;
        int soma = 0;
        int k = 1;

        while(k < indice){
            k += 1;
            soma += k;
        }

        System.out.println(soma);

    }

    public static void questao4(){

        //(Não entendi se era pra fazer programando ou só dizer a resposta)

        // a) 9 (numeros ímpar)
        // b) 128 (potencias de 2)
        // c) 49 (quadrados perfeito)
        // d) 100 (quadrados perfeitos dos numeros par)
        // e) 13 (soma dos dois anteriores)
        // f) 200 (numeros que quando escrito começam com d)

        // a)
        System.out.println("letra A");
        for(int i = 1; i<=9; i+=2){

            System.out.println(i);

        }

        // b)
        System.out.println("\nletra B");
        for(int i = 1; i<=7; i++){

            System.out.println(Math.pow(2, i));

        }

        // c)
        System.out.println("\nletra C");
        for(int i = 0; i<=7; i++){

            System.out.println(Math.pow(i, 2));

        }

        // d)
        System.out.println("\nletra D");
        for(int i = 2; i<=10; i+=2){

            System.out.println(Math.pow(i, 2));

        }

        // e)
        System.out.println("\nletra E");

        int j = 1;
        int k = 1;
        int l = j+k;

        System.out.println(j);

        for(int i = 1; i<7; i++){

            j = k;
            k = l;
            l = j+k;

            System.out.println(j);

        }

        // f) Dois, Dez, Doze, Dezesseis, Dezessete, Dezoito, Dezenove, Duzentos
        // teria uma array com o nome dos numeros e verificaria se a primeira letra é d
        System.out.println("\nletra E");
        System.out.println(200);

    }

    public static void questao5(){

        // 1) liga o primeiro interruptor por tempo suficiente até a lâmpada esquentar
        // 2) desliga o primeiro interruptor, liga o segundo e vai até a primeira sala
        // 3) se a lampada estiver acesa, o segundo interruptor acende a lampada da primeira sala.
        // se estiver apagada mas quente, então o primeiro interruptor acende a lampada da primeira sala.
        // se não estiver nem acesa e nem quente, então o terceiro interruptor acende a lâmpada da primeira sala
        // 4) sabendo qual interruptor acende a luz da primeira sala, desliga o interruptor que estava ligado, e liga um interruptor diferente do que acende a primeira sala
        // 5) vai até a segunda sala, se a lâmpada estiver acesa é o interruptor que está ligado que acende a lâmpada da segunda sala 
        // e o interruptor que sobrou acende a luz da terceira sala.
        // se não estiver acesa, é o interruptor que sobrou que acende a lampada da segunda sala e o que está ligado acende a lâmpada da terceira sala
    }
}