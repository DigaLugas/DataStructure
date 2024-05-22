import java.util.Stack;

public class BinaryConvertor {
    private Stack<Integer> binaryStack = new Stack<>();
    private Stack<String> decimalStack = new Stack<>();
    public int BinaryToDecimal(String binary) {
        int total = 0;
        char[] binaryChars = binary.toCharArray();
        

        for (char bit : binaryChars) {
            binaryStack.push(Character.getNumericValue(bit));
        }

        
        int power = 0;
        while (!binaryStack.isEmpty()) {
            total += binaryStack.pop() * Math.pow(2, power);
            power++;
        }
        
        return total;
    }

    public String DecimalToBinary(String decimal) {
        try {
            int decimalInt = Integer.parseInt(decimal); 
            StringBuilder binarioBuilder = new StringBuilder();
            
            while (decimalInt > 0) {
                int resto = decimalInt % 2;
                decimalStack.push(Integer.toString(resto));
                decimalInt /= 2;
            }
            
            while (!decimalStack.isEmpty()) {
                binarioBuilder.append(decimalStack.pop());
            }
            
            return binarioBuilder.toString();
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida." + e.getMessage());
            return "";
        }
    }
}
