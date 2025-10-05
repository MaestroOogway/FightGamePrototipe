package Engine;

import Combos.*;
import Characters.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class FightEngine {

    private Scanner scanner = new Scanner(System.in);

    public FightEngine() {
        List<CreateVariant> variants = new ArrayList<>();
        variants.add(new Tank());
        variants.add(new Assasin());

        // Generar los luchadores de cada variante
        for (CreateVariant variant : variants) {
            variant.CreateVariant();
        }

        // Mostrar menú de personajes
        System.out.println("Menu de personajes:");
        int index = 1;
        List<Luchador> allLuchadores = new ArrayList<>();
        for (CreateVariant variant : variants) {
            for (Luchador luchador : variant.getListaluchador()) {
                System.out.println(index + "- " + luchador.getClass().getSimpleName() +
								   "Clase: " + luchador.name +
                                   " [Health: " + luchador.health + 
                                   ", Armor: " + luchador.armor +
                                   ", Power: " + luchador.power + 
                                   ", Energy: " + luchador.mana + 
                                   ", Atack: " + luchador.atack + "]");
                allLuchadores.add(luchador);
                index++;
            }
        }

        // Selección de luchador
        Luchador player1 = null;
        while (player1 == null) {
            System.out.print("Selecciona tu luchador: ");
            int choice = scanner.nextInt();
            if (choice >= 1 && choice <= allLuchadores.size()) {
                player1 = allLuchadores.get(choice - 1);
            } else {
                System.out.println("Opción inválida, intenta de nuevo.");
            }
        }

        EstadoBajo estadoBajo = new EstadoBajo();

        // Loop de acciones
        boolean jugando = true;
        while (jugando) {
            System.out.println("\nIngresa tu accion: ");
            System.out.println("1-Golpe 2-Patada 3-Salto 4-Golpe Bajo 5-Patada Baja 6-Lanzar Poder");
            System.out.println("21-Combo1 123-Combo2 0-Salir");
            int accion = scanner.nextInt();

            switch (accion) {
                case 0 -> jugando = false;
                case 1 -> System.out.println(player1.golpear());
                case 2 -> System.out.println(player1.patear());
                case 3 -> System.out.println(player1.saltar());
                case 4 -> System.out.println(estadoBajo.golpear());
                case 5 -> System.out.println(estadoBajo.patear());
                case 6 -> System.out.println(player1.LanzarPoder());
                case 21 -> MakeCombo.IsEligible(player1);
                case 123 -> MakeCombo.IsEligible2(player1);
                default -> System.out.println("Opción inválida, intenta de nuevo.");
            }
        }

        System.out.println("FIN DEL JUEGO.");
    }
}
