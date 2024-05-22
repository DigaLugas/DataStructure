import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        BinaryConvertor bc = new BinaryConvertor();
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Binario para Decimal");
        System.out.println("2 - Decimal para Binario");
        System.out.println("3 - Sair");
        int option = input.nextInt();
        input.nextLine(); 

        switch (option) {
            case 1:
                System.out.println("Entre o número em binario:");
                String binary = input.nextLine();
                System.out.println(bc.BinaryToDecimal(binary));
                break;
            case 2:
                System.out.println("Entre o número em Decimal:");
                String decimal = input.nextLine();
               System.out.println(bc.DecimalToBinary(decimal));
                break;
            case 3:
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        input.close();
    }
}
