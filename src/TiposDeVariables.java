public class TiposDeVariables {

    public static void main(String[] args) {

        // ==============================
        // Introducción
        // ==============================
        // Este fichero Java contiene VARIOS ejercicios básicos.
        // Para cada ejercicio, tenéis que hacer lo que indica.
        // Conforme vayáis haciendo ejercicios, cada vez que lo ejecutéis
        // ejecutará de nuevo todos los anteriores, pero está correcto (no borréis
        // los ejercicios ya hechos).

        // ==============================
        // EJERCICIO 1 – Ficha de personaje (Minecraft)
        // ==============================
        // Crea variables con el nombre del jugador, nivel, vida (double)
        // y si tiene armadura (boolean). Imprímelas como si fuese una ficha del jugador.


        // ==============================
        // EJERCICIO 2 – Batalla rápida (Pokémon)
        // ==============================
        // Declara dos variables con el ataque de Pikachu y la defensa de Charmander.
        // Calcula el daño causado (ataque – defensa).
        // Imprime el resultado: "Pikachu hace X puntos de daño a Charmander" - X es el valor real del daño.


        // ==============================
        // EJERCICIO 3 – Monedas y compras (Fortnite)
        // ==============================
        // Declara una variable con el número de V-Bucks que tiene un jugador.
        // Resta el precio de una skin (ej: 1200).
        // Imprime el resultado: "Después de comprar la skin, te quedan X V-Bucks".


        // ==============================
        // EJERCICIO 4 – Velocidad de campeón (League of Legends)
        // ==============================
        // Declara una variable con la velocidad base de un campeón
        // y otra con un buff de velocidad.
        // Calcula la velocidad final sumando ambos valores.
        // Imprime el resultado: "La velocidad final de Jinx es X".


        // ==============================
        // EJERCICIO 5 – Conversor de monedas de juego
        // ==============================
        // Declara una cantidad de monedas de Minecraft.
        // Convierte a su equivalente en V-Bucks y en RP de LoL
        // usando tasas de cambio inventadas (ej: 1 moneda MC = 5 V-Bucks = 2 RP).
        // Imprime el resultado en formato claro.


        // ==============================
        // EJERCICIO 6 – Clasificación de jugador (Fortnite / LoL)
        // ==============================
        // ESTE EJERCICIO INCLUYE SENTENCIAS DE CONTROL. No pertenece a tipos de variables.
        // Si te aburres, investiga cómo se haría y entiéndelo.
        //
        // Declara variables con el número de kills, muertes y asistencias de una partida.
        // Calcula el KDA = (kills + asistencias) / muertes.
        // Según el resultado:
        //   KDA ≥ 5        → "Jugador PRO"
        //   KDA entre 3–5  → "Jugador BUENO"
        //   KDA entre 1–3  → "Jugador NORMAL"
        //   KDA < 1        → "Jugador NOOB"
        //
        // OPCIONAL: muestra también el tier en el que quedaría (Bronce, Plata, Oro, Platino…).


        //ejercicio 1
        String nombredeljugador = "andres";
        long nivel = 27;
        double vida = 20;
        boolean con_Armadura = true;

        System system = null;
        system.out.println("\nEjercicio 1 \nla ficha del jugador es:"
                + nombredeljugador +
                " nivelxp:" + nivel + " vida:" + vida
                + "\nTiene armadura?:" + con_Armadura);


//ejercicio2
        double ataquedepikachu = 45.0;
        double defensadecharmander = 35.0;
        double resultado = ataquedepikachu - defensadecharmander;
        long vidadecharmander = 50;
        double resultado2 = vidadecharmander - resultado;

        system.out.println("\nEjercicio 2 \nAtaque de pikachu = " + ataquedepikachu + "  vida de charmander =  "
                + vidadecharmander);
        system.out.println("defensa de charmander= " + defensadecharmander);
        system.out.println("resultado del ataque=" + resultado);
        system.out.println("vida restante =" + resultado2);

//ejercicio 3
        long tiene = 3000;
        long precioskin = 1200;
        long resultadoskin = tiene - precioskin;

        system.out.println("\n Ejericio 3 \nLa cuenta tiene= " + tiene + "\nLe quedo= " + resultadoskin);


//ejercicio 4
        long velocidadbaseJinx = 50;
        long buffBotasdoradas = 30;
        long resulatadobuffeo = velocidadbaseJinx + buffBotasdoradas;

        system.out.println("\nEjercicio 4 \nLa Velocidad Final de Jinx= " + resulatadobuffeo);


//ejercicio 5


        double tazaminecraft = 8;
        double tazaVpucks = 2;
        double tazaRP = 3;

        double resultadodeMNaVpucks = tazaminecraft * tazaVpucks;
        double resultadodeMNaRP = tazaminecraft * tazaRP;
        double resultadodevpucksarp = tazaVpucks * tazaRP;

        system.out.println("\nEjercicio 5 \nResultado de la taza de monedas de minecraft a V-pucks es = " + resultadodeMNaVpucks);
        system.out.println("resultado de la taza de monedas de minecraft a RP es = " + resultadodeMNaRP);
        system.out.println("resultado de la taza de V-pucks a RP es = " + resultadodevpucksarp);

//ejercicio 6
        double kills = 2;
        double assists = 3;
        double muertes = 01;

        double calculoKDA= ((kills + assists) /muertes);
        system.out.println("\nEjercicio 6 \nresultado de KDA es= " + calculoKDA);
        if (calculoKDA >= 12) system.out.println("Jugador PRO");
        if (calculoKDA <= 3) system.out.println("Jugador noob");
        if  (calculoKDA >=8 & calculoKDA<=11) system.out.println("Jugador Promedio");
        if (calculoKDA >=4 & calculoKDA<6)  system.out.println("Jugador Decente");

        //Completacion de Ejercicio 6
        double resultadoKDA= calculoKDA;

        if (resultadoKDA >=4 & resultadoKDA <=6) system.out.println("Jugador Gana 100!");
        else if (resultadoKDA <=3) {system.out.println("Jugador Gana 50!");}
        if (resultadoKDA >=8 & resultadoKDA <=11) system.out.println("Jugador Gana 250 ");
        else if (resultadoKDA >=12) {system.out.println("Jugador Gana 350 ");;

        }
//segun el resultado del KDA me saque una cantidad de puntos en especifico ahora necesitaria,
//para ello necesito un calculo que haga que <=3 KDA me de 50 pts y eso pase a mis datos para que despues el sistem.out
//lo imprima

        double puntos=50;
        if (calculoKDA <=3 ){puntos=50;}
        else if (calculoKDA >=4 & calculoKDA<=6) {puntos=100;}
        if (calculoKDA >=8 & calculoKDA<=11) {puntos= 250;}
        else if (calculoKDA >=12) {puntos= 350;}

        if (puntos >=151 & puntos <=350) system.out.println("Estas en Plata");
        else if (puntos <=150) system.out.println("Estas en Bronce");
        if (puntos >=351 & puntos <=500 ) system.out.println("Estas en Oro");
        else if (puntos >=501) system.out.println("Estas en Platino");



    }
}
