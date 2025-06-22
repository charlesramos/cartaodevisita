import java.util.Scanner;

public class programa_02 {

public static void main(String args[]) {

Scanner scnEntrada = new Scanner(System.in);
System.out.println("Ola meu amigo, qual o seu nome?");
String nome = scnEntrada.next();
System.out.println("Qual a sua idade?");
int intIdade = scnEntrada.nextInt();
int intDias = intIdade * 365;
System.out.println("Olá, "+nome+" Voce ja viveu aproximadamente "+intDias+" dias.");

}
}