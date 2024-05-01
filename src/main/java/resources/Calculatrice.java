package main.java.resources;

public class Calculatrice {
    public double calculer(char operator, double num1, double num2) {
        double resultat = 0;

        switch (operator) {
            case '+':
                resultat = num1 + num2;
                break;
            case '-':
                resultat = num1 - num2;
                break;
            case '*':
                resultat = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultat = num1 / num2;
                } else {
                    throw new IllegalArgumentException("Division par zéro impossible");
                }
                break;
            default:
                throw new IllegalArgumentException("Opérateur invalide");
        }

        return resultat;
    }
}
