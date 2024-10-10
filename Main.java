import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        /* questao1(); */
        questao2();
    }

    public static void questao1(){ // Primeira Questão

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

}