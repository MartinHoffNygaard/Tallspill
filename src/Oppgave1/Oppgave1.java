package Oppgave1;

import javax.swing.*;

public class Oppgave1 {

    public static void main(String[] args) {
        String nedreGrenseInput = JOptionPane.showInputDialog("Skriv inn nedre grensen for summen:");
        String øvreGrenseInput = JOptionPane.showInputDialog("Skriv inn den øvre grensen for summen:");
        int øvreGrense = 0;
        int nedreGrense = 0;
        int sum = 0;
        int teller = 0;

        try {
            nedreGrense = Integer.parseInt(nedreGrenseInput);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Skriv inn ett heltall som nedre grense.");
        }
        try {
            øvreGrense = Integer.parseInt(øvreGrenseInput);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Skriv inn ett heltall som øvre grense.");
        }

        if (øvreGrense <= nedreGrense) {
            øvreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn en øvre grense som er større enn nedre grense:"));
        }

        for (int i = nedreGrense; i <= øvreGrense; i++) {
            sum += i;
            System.out.print(i);
            teller++;
            if(teller % 10 == 0) {
                System.out.print("\n");
            }
            if(i < øvreGrense) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = "+sum);
    }
}
