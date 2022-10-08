import javax.swing.*;

//Fazer a divisão de 2 valores inteiros
public class App {
    public static void main(String[] args) {
        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{   
                float resultado = dividir(Float.parseFloat(a), Float.parseFloat(b));
                System.out.println("Resultado: " + resultado);
                break;
            }catch(NumberFormatException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "entrada inválida, informe um número inteiro");
            }catch(ArithmeticException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossível dividir por 0");           
            }
        }while(true);

        System.out.println("O código continua");

    }

    public static float dividir(Float a, Float b) {
        return a / b;
    }
}
