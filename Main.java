import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        questao1();
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

}