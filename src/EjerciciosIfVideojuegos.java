public class EjerciciosIfVideojuegos {


    public static <string> void main(String[] args) {


        // ==============================

        // EJERCICIO 1 – Vida del personaje (Minecraft)

        // ==============================

        // Declara una variable con la vida de un jugador (entero entre 0 y 100).

        // Usa if/else para imprimir:

        //   Vida > 70 → "Tu personaje está fuerte 💪"

        //   Vida entre 30 y 70 → "Tu personaje está herido 😢"

        //   Vida < 30 → "Tu personaje está en peligro ⚠️"


        // ==============================

        // EJERCICIO 2 – Elección de ataque (Pokémon)

        // ==============================

        // Declara una variable con el tipo de ataque: "fuego", "agua" o "planta".

        // Con if/else if/else imprime:

        //   Si es fuego → "¡Es super eficaz contra planta!"

        //   Si es agua → "¡Es super eficaz contra fuego!"

        //   Si es planta → "¡Es super eficaz contra agua!"

        //   Otro caso → "Tipo de ataque no reconocido"


        // ==============================

        // EJERCICIO 3 – Tienda de objetos (Fortnite)

        // ==============================

        // Declara una variable con el número de V-Bucks.

        // Con if imprime qué puede comprar el jugador:

        //   Si tiene 2000 o más → "Puedes comprar una skin legendaria"

        //   Si tiene 1200 o más → "Puedes comprar una skin épica"

        //   Si tiene 800 o más → "Puedes comprar una skin rara"

        //   Si tiene menos de 800 → "No tienes suficientes V-Bucks"


        // ==============================

        // EJERCICIO 4 – Clasificación de rango (League of Legends)

        // ==============================

        // Declara una variable con los puntos de ranking.

        // Con if imprime el rango:

        //   0–999   → "Bronce"

        //   1000–1999 → "Plata"

        //   2000–2999 → "Oro"

        //   3000 o más → "Platino"


        // ==============================

        // EJERCICIO 5 – Evento especial (Minecraft)

        // ==============================

        // Declara una variable "hora" (entero de 0 a 23).

        // Con if imprime:

        //   Entre 6 y 11 → "Es de mañana, los aldeanos están activos ☀️"

        //   Entre 12 y 18 → "Es de tarde, hora de explorar 🔍"

        //   Entre 19 y 23 → "Es de noche, cuidado con los mobs 🌙"

        //   Entre 0 y 5 → "Madrugada, mejor dormir 😴"


        // ==============================

        // EJERCICIO 6 – Reto final: Sistema de logros (multijuego)

        // ==============================

        // Declara tres variables:

        //   - kills (número de enemigos derrotados)

        //   - muertes (veces que ha muerto el jugador)

        //   - tiempo (minutos jugados)

        //

        // Crea condiciones con if para asignar logros:

        //   - Si kills >= 10 → "Logro: Cazador experto 🏹"

        //   - Si muertes == 0 → "Logro: Intocable 👑"

        //   - Si tiempo > 60 → "Logro: Maratón gamer ⏱️"

        //   - Si kills < muertes → "Logro: Necesita entrenar 🐣"

        //

        // Extensión opcional:

        //   - Combina condiciones con && y || para logros más complejos.

        //   - Ejemplo: (kills > 20 && muertes < 5) → "Logro: PRO absoluto 🔥"


        //ejercicio 1

        long vidausuario = 56;


        System system = null;
        system.out.println("\nEjercicio1");
        if (vidausuario > 80) system.out.println("Tu Personaje esta Fuerte\n");
        else if (vidausuario < 30) {
            system.out.println("Tu Personaje esta Debil\n");
        }
        if (vidausuario >= 31 & vidausuario <= 79) {
            system.out.println("Tu personaje esta Herido\n");
        }

        //ejercicio 2
        Object string;
        String tipopoke = "fuego";
system.out.println("Ejercicio 2");
        if (tipopoke.equals("fuego")) {
            system.out.println("¡Es Super Eficiente Contra Planta!\n");
        } else if (tipopoke.equals("agua")) {
            system.out.println("¡Es Super Eficiente Contra Fuego!\n");
        }
        if (tipopoke.equals("Planta")) {
            system.out.print("¡Es Super Eficiente Contra Agua\n!");
        }
            //ejercicio 3

            long tiene = 640 ;
system.out.println("Ejercicio3");
            if (tiene >= 2000) system.out.println("Puedes Comprar una Skin Legendaria ");
            else if (tiene >= 1999) system.out.println("Puedes Comprar una Skin Epica ");
            if (tiene >= 800) system.out.println("Puedes Comprar una Skin Rara");
            else if (tiene < 800) system.out.println("Estas es Limpio papi!!");

       //Ejercicio 4
       double  puntos = 1000;
system.out.println("\nEjercicio 4");
       if (puntos >=0 & puntos <=999) system.out.println("Bronce");
       else if (puntos >=1000 & puntos <=1999) system.out.println("Plata");
       if (puntos >=2000 & puntos<=2999) system.out.println("Oro");
       else if (puntos >=3000);

       //ejercicio 5
        long hora= 2;
system.out.println("\nEjercicio 5 ");
        if ( hora >=6 & hora <=11) system.out.println("Es de Mañana, Los Aldeanos estan Activos");
        else if (hora >=12 & hora <=18) {system.out.println("Es de Tarde, Hora de Explorar");}
        if  (hora >=19 & hora <=23) system.out.println("Es de Noche, Cuidado con los Mobs ");
        else if (hora >=0 & hora <=5) {system.out.println("Es de Madrugada, Lo mejor es Descansar");}

        //Ejercicio 6
        long kills = 30;
        long muertes = 1;
        double tiempo=80;
        system.out.println("\nEjercicio 6");

        if (kills >=10) system.out.println("Logro:Cazador Experto");
        if (muertes ==0) system.out.println("Logro Intocable");
        if ( tiempo >60) system.out.println("Logro:Maraton Gamer");
        if (kills < muertes ) {system.out.println("Logro:Necesitas Entrenar");}

        //Extra
        if (kills >20 & muertes<5) system.out.println("Logro:Rey Gamer");
        if (kills >25 & tiempo>70 ) {system.out.println("Logro: Muerte Andante");}
    }
}