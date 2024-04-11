import javax.swing.*;

public class Main {
    public static void main(String[] args){
         String marca = "Tesla\nCarro elétrico";
        System.out.println(marca);
        JOptionPane.showMessageDialog(null, "CPF: \n 546.597.148-70");

        String churros = "Chocolate";
        String churros2 = new String ("chocolate");

        if (churros.equalsIgnoreCase(churros2))
            System.out.println("Churros iguais");
        else
            System.out.println("Churros diferentes");


    }
}