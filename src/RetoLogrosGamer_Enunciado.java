import static java.lang.Math.max; public class RetoLogrosGamer_Enunciado {


    public static void main(String[] args) {


        // ============================================================

        // RETO FINAL – Mini sistema de logros (multijuego)

        // ============================================================

        // OBJETIVO:

        // Implementa un sistema que, a partir de estadísticas de una partida,

        // calcule y muestre los LOGROS desbloqueados por el jugador.

        //

        // ------------------------------------------------------------

        // 1) DECLARA ESTAS VARIABLES DE ENTRADA (asigna valores fijos para probar):

        //    - String juego: "Fortnite", "LoL", "Minecraft", "Pokemon"

        //    - int kills

        //    - int muertes

        //    - int asistencias

        //    - int tiempoMin: minutos jugados

        //    - int objetivos: (torres destruidas, bosses, capturas, construcciones…)

        //    - boolean desconexion: true si el jugador se desconectó en mitad

        //    - int dañoHecho

        //    - int dañoRecibido

        //    - int oro: moneda conseguida

        //

        // ------------------------------------------------------------

        // 2) NORMAS GENERALES (usa if / else if / else y condiciones compuestas):

        //    - Si desconexion es true y tiempoMin < 5 → imprimir:

        //         "Logro NEGATIVO: Rage Quit 😠"

        //      IMPORTANTE: si ocurre esto, NO concedas otros logros de "PRO"

        //      en la misma partida (prioridad negativa).

        //

        //    - Calcula KDA = (kills + asistencias) / max(1, muertes)

        //      (evita división por 0 usando Math.max).

        //

        //    - Clasificación por KDA (elige SOLO UNA, la primera que cumpla):

        //        KDA ≥ 5          → "Jugador PRO"

        //        3 ≤ KDA < 5      → "Jugador BUENO"

        //        1 ≤ KDA < 3      → "Jugador NORMAL"

        //        KDA < 1          → "Jugador NOOB"

        //

        //    - Logros básicos independientes (pueden acumularse):

        //        kills >= 10                    → "Logro: Cazador experto 🏹"

        //        muertes == 0 && kills >= 5     → "Logro: Intocable 👑"

        //        tiempoMin > 60                 → "Logro: Maratón gamer ⏱️"

        //        dañoHecho > dañoRecibido*2     → "Logro: Dominio total 💥"

        //        objetivos >= 3                 → "Logro: Objetivos de mapa 🎯"

        //

        // ------------------------------------------------------------

        // 3) REGLAS ESPECÍFICAS POR JUEGO (selecciona por valor de 'juego'):

        //    - Fortnite:

        //        si kills >= 15 && muertes <= 2 → "Victoria agresiva (Fortnite) 🔫"

        //        si oro >= 2000                 → "Ahorrista de V-Bucks (Fortnite) 💰"

        //

        //    - LoL:

        //        si objetivos >= 2 && asistencias >= 10 → "Shotcaller (LoL) 🗣️"

        //        si dañoHecho >= 30000 && muertes <= 3  → "Carry principal (LoL) 🛡️"

        //

        //    - Minecraft:

        //        si tiempoMin >= 45 && dañoRecibido == 0 → "Superviviente pacífico (MC) 🌿"

        //        si objetivos >= 5                        → "Constructor incansable (MC) 🧱"

        //

        //    - Pokemon:

        //        si kills >= 6 && dañoRecibido <= 1000 → "Entrenador maestro (PKMN) 🧢"

        //        si asistencias >= 3                   → "Apoyo del equipo (PKMN) 🤝"

        //

        // ------------------------------------------------------------

        // 4) PRIORIDADES Y EXCLUSIONES (orden y anidación de if):

        //    - Si se activa "Rage Quit 😠", NO mostrar "Jugador PRO".

        //    - Si muertes == 0 && kills == 0 && asistencias == 0 && tiempoMin < 2:

        //        imprimir "Partida inválida: AFK" y NO mostrar más logros.

        //

        // ------------------------------------------------------------

        // 5) SALIDA (impresiones sugeridas):

        //    - Resumen de entrada (todas las estadísticas)

        //    - KDA calculado

        //    - Rango por KDA (solo uno)

        //    - Lista de logros desbloqueados (varios posibles)

        //    - Mensajes de exclusión si corresponde (p. ej., Rage Quit / AFK)

        //

        // ------------------------------------------------------------

        // 6) PRUEBAS RÁPIDAS (cambia las variables y ejecuta varias veces):

        //    CASO A: LoL, kills=12, muertes=2, asist=15, tiempo=38, obj=3, desc=false, dañoH=32000, dañoR=9000, oro=1500

        //    CASO B: Fortnite, kills=16, muertes=2, asist=3, tiempo=25, obj=1, desc=false, dañoH=18000, dañoR=6000, oro=2300

        //    CASO C: Minecraft, kills=0, muertes=0, asist=0, tiempo=1, obj=0, desc=false, dañoH=0, dañoR=0, oro=0

        //    CASO D: Pokemon, kills=7, muertes=0, asist=4, tiempo=50, obj=2, desc=false, dañoH=5000, dañoR=800, oro=800

        //    CASO E: (cualquier juego), desconexion=true, tiempoMin=3

        //

        // ------------------------------------------------------------

        // 7) EXTENSIONES OPCIONALES (sube dificultad):

        //    - Suma un "score" total: +10 por logro normal, +20 por logros PRO.

        //    - Si score ≥ 40 y no hubo Rage Quit → "MVP de la jornada 🏆".

        //    - Si dañoRecibido == 0 y tiempoMin ≥ 30 → "Perfect Defense 🧱".

        //    - Si (juego == "LoL" || juego == "Fortnite") && (kills + asistencias) ≥ 25 → "Impacto masivo 🌪️".

        //    - Prioriza validaciones: AFK y Rage Quit antes que el resto.

        //    - Usa if anidados para practicar flujo de decisión.

        //

        // ------------------------------------------------------------

        // PISTAS TÉCNICAS:

        //    - Usa double para KDA (decimales).

        //    - Usa Math.max(1, muertes) para evitar dividir por cero.

        //    - Estructura tu código por bloques: validaciones iniciales → KDA → logros básicos → logros por juego → extras.

        //

        // ------------------------------------------------------------

        // IMPLEMENTACIÓN:

        //  - Escribe debajo tu solución con muchos if/else if/else.

        //  - No uses arrays ni bucles (opcional), céntrate en condiciones.

        //  - Ejecuta varias veces cambiando los valores de entrada.


        // ======= TU CÓDIGO AQUÍ =======
        Object string;
        string = "Fornite";

        double kills = 2;
        double assists = 3;
        double muertes = 1;
        int tiempo = 1;
        int danhohecho=220;
        int danhorecibido = 50;
        boolean desconexion = false;
        int monedas=40 ;
        int mision = 4;
        System system = null;
        double logros= 0;
        double score= logros;


        boolean bad = desconexion == true && (tiempo <5);
        double calculoKDA= ((kills + assists) /muertes);


        if (bad = true) system.out.println("Rage Quit");


        if (calculoKDA >= 5 && !bad) system.out.println("Jugador PRO");
        if (calculoKDA <= 1 && !bad) system.out.println("Jugador noob");
        if  (calculoKDA >=3 & calculoKDA<=4 && !bad) system.out.println("Jugador Promedio");

        if (calculoKDA >=2 & calculoKDA<3 && !bad)  system.out.println("Jugador Decente");


        if (calculoKDA >= 10 && !bad) system.out.println("Logro: Cazador Experto");
        if (muertes ==0 & kills >=5 && !bad) system.out.println("Logro: Intocable");
        if (tiempo >60 && !bad) system.out.println("Logro: Maratón Gamer");
        if (danhohecho > danhorecibido && !bad) system.out.println("Logro: Dominio Total");
        if (mision>=3 && !bad)system.out.println("Logro: Maestro de las Misiones");

        if (kills >=15 & muertes <=2 && !bad) system.out.println("Victoria Agresiva");
        if (monedas >=2000 && !bad) system.out.println("Ahorrista de V-Bucks");


        system.out.println("\n\nEstadisiticas:"+"\nkills: "+kills+ "\nAsistencias: " +assists+ "\nMuertes: "+muertes+
                "\nDaño Hecho: " +danhohecho+"\nDaño Recibido: " + danhorecibido + "\nMisiones Completadas: "+mision);

        if (calculoKDA <=3 ){score = 50;};
         if (calculoKDA >=4 & calculoKDA<=6) {score = 50;}; 
        if (calculoKDA >=8 & calculoKDA<=11){score = 50;};
         if (calculoKDA >=12) {score = 50;};

       if (muertes == 0 && kills == 0 && assists == 0 && tiempo < 2) system.out.println("Partida Invalida:AFK");
       if ( danhorecibido == 0 & tiempo >= 30) system.out.println("Perfect Defense");
       if (string== "Fortnite" & kills + assists >= 25 ) system.out.println("Impacto masivo");







    }
}