import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o dia da semana exemplo: 1 (para o domingo)");
        String dia = ler.nextLine();

        switch (dia) {
            case "1":
                System.out.println("Domingo");
                break;
            case "2":
                System.out.println("Segunda");
                break;
            case "3":
                System.out.println("Terça");
                break;
            case "4":
                System.out.println("Quarta");
                break;
            case "5":
                System.out.println("Quinta");
                break;
            case "6":
                System.out.println("Sexta");
                break;
            case "7":
                System.out.println("Sabado");
                break;
                default:
                    System.out.println("Dia invalido digite de 1 ate 7");

        }



    }
}