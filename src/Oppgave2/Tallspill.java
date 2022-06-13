package Oppgave2;

import javax.swing.*;

class Tallspill {

    public int nyttTall() {
        int tilfeldigTall = (int) (Math.random() * 201);
        return tilfeldigTall;
    }

    public void visMelding(String melding) {
        JOptionPane.showMessageDialog(null, melding);
    }

    private void forLite(int tall) {
        visMelding(tall + " er for lite! Prøv igjen!");
    }

    private void forStort(int tall) {
        visMelding(tall + " er for stort! Prøv igjen!");
    }

    public void avsluttRunde(int antall, int gjetning) {
        visMelding(gjetning+" er riktig! \n Du gjettet riktig på "+antall+" forsøk.");
    }

    public void kjørSpill() {
        int tall = nyttTall();
        int teller = 0;
        String forsøkInput;
        int forsøk = 0;

        while (forsøk != tall) {
            forsøkInput = JOptionPane.showInputDialog("Jeg tenker på et tall mellom 0 og 200 \n Prøv å gjette på tallet:");
            try {
                forsøk = Integer.parseInt(forsøkInput);
            }
            catch (Exception e) {
                visMelding("Du må gjette ett heltall mellom 0 og 200.");
                forsøkInput = JOptionPane.showInputDialog("Jeg tenker på et tall mellom 0 og 200 \n Prøv å gjette på tallet:");
                forsøk = Integer.parseInt(forsøkInput);
            }
            if(forsøk > tall) {
                forStort(forsøk);
            }
            if(forsøk < tall) {
                forLite(forsøk);
            }
            teller++;
            if(forsøk == tall) {
                avsluttRunde(teller, forsøk);
            }
        }
    }

}
