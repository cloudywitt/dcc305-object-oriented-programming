package Aula03.Exercise05;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = e1;

        if (e1 == e2) {
            System.out.println("They're equal.");
        } else {
            System.out.println("They're different.");
        }

        // no if do exercício anterior, o que estava sendo comparado em questão era o endereço de memória guardado nas
        // respectivas variáveis, e não, efetivamente, o objeto em si (seus atributos e métodos).
    }
}
