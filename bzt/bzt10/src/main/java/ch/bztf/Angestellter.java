package ch.bztf;

public class Angestellter extends Mitarbeiter {
    private boolean schulleitung;

    public Angestellter(String nachname, int personalNummer) {
        super(nachname, personalNummer);
    }

    public double kantineKonsum(int anzahl) {
        if (anzahl < 4) {
            anzahl = 4;
        }
        return anzahl * MINPREIS;
    }

    public Angestellter(String nachname) {
        super(nachname);
    }

    public boolean isSchulleitung() {
        return this.schulleitung;
    }

    public void setSchulleitung(boolean schulleitung) {
        this.schulleitung = schulleitung;
    }

    public String vorstellen() {
        if (this.isSchulleitung()) {
            return super.vorstellen() + " Ich bin Schulleitungsmitglied.";
        }
        return super.vorstellen() + " Ich bin einfacher Angestellter.";
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tSchulleitungsmitglied: " + (isSchulleitung() ? "Ja" : "Nein");
    }

    @Override
    public int inKantine() {
        return (int)(Math.random() * 10);
    }

    @Override
    public String bewertung() {
        if (inKantine() > 5) {
            if ((int) (Math.random() * 10) >= 5) {
                return "War akzeptabel";
            } else {
                return "Hat Verbesserungspotential";
            }
        } else {
            return "War nicht in Mensa!";
        }
    }
}
