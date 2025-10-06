import java.util.Scanner;

public class arañatarea2 {
    public static <string> void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System system = null;


        System.out.print("Como quieres llamar a tu Araña:");
        String nombre = lector.nextLine();

        //datos
        double metroscaminados = 0;
        int insectoscomidos = 0;
        int metrostrepados = 0;
        int metrosenelaire=0;



        //capitulo 1
        System.out.print("\uD83C\uDF3F Capítulo 1: El Despertar \nINICIO:te despiertas sobre una hoja húmeda en\n " +
                "medio del parque . El sol se filtra entre las ramas.\n Sientes hambre y curiosidad. ");


        System.out.println("\n¿Qué decides hacer? ");
        System.out.print("\nEmpezar a caminar:");
        String empezarcaminar = lector.nextLine();
//1
        if (empezarcaminar.equals("si")) { {empezarcaminar += 3;}
            System.out.println("\nEncuentras una ventana abierta." +
                    "\nVes al fondo un aula en donde puedes" +
                    "\nencontrar tu próxima comida. ");
            System.out.println("\n¿Qué decides hacer? ");

            System.out.println("\n1-Entras en busca de comida?");
            System.out.println("2-Sigues caminando y te diriges a un árbol cercano?");
            System.out.println("Cual prefieres?\n   ¿1? o ¿2?");
            String pregunta1_X = lector.nextLine();


//1.1
            if (pregunta1_X.equals("1")) {
                {{metrostrepados += 2;} {metroscaminados += 2;}
                    System.out.print("\nEntras por la ventana y Subes al Techo," +
                            " \nesperas a tu Próxima presa,en la espera ves a " +
                            "\nuna hormiga en el suelo,tejes una telaraña para bajar, " +
                            "\npero mientras bajas una brisa te golpea Fuertemente");

                    //pregunta de 1.1
                    System.out.println("\n¿Qué decides hacer? ");
                    System.out.println("\n1-Saltas a una silla cercana?");
                    System.out.println("2-Te aferras a tu telaraña, tratando de no caerte?");
                    System.out.println("Cual prefieres?\n   ¿1? o ¿2?");
                    String pregunta1_1_X = lector.nextLine();


//1.1.1
                    if (pregunta1_1_X.equals("1")) {
                        //pregunta de 1.1.1
                        {metrosenelaire += 3;} {metroscaminados+=3;}
                        System.out.println(" \nAl saltar a la silla has perdido a la hormiga, " +
                                "\nDeseas volver al techo para explorar y encontrar comida," +
                                " \npero algo te dice que permanezcas junto a la silla  ");
                        System.out.println("\n¿Qué decides hacer? ");
                        System.out.println("\n1-Subes de nuevo al techo  ?");
                        System.out.println("2-Permaneces Abajo?");
                        System.out.println("Cual prefieres?\n   ¿1? o ¿2?");
                        String pregunta1_1_1_X = lector.nextLine();


                        //1.1.1.1
                        if (pregunta1_1_1_X.equals("1")) {
                            {metrostrepados += 2;}{metrosenelaire+=3;}
                            System.out.println("Al tratar de subir por tu misma telaraña, " +
                                    "\nla brisa te golpea y caes dentro de un bolso, " +
                                    "\nel bolso se empieza a mover a otro lugar al tratar " +
                                    "\nde salir de bolso encuentras una rotura del bolso . ");


                            //pregunta de 1.1.1.1
                            System.out.println("\n¿Qué decides hacer? ");
                            System.out.println("\n1-Sales por ahí?");
                            System.out.println("2-Esperas tu muerte?");
                            System.out.println("Cual prefieres?\n   ¿1? o ¿2?");
                            String pregunta1_1_1_1_X = lector.nextLine();


                            //1.1.1.1.1(final)
                            if (pregunta1_1_1_1_X.equals("1")) { {metrosenelaire +=1; metrostrepados+=2;}
                                System.out.println("Al salir del Bolso trepas el pantalon del dueño " +
                                        "\nte ha visto y te ha tirado de su pantalon " +
                                        "\nvas cayendo en el aire y al tocar el piso el dueño" +
                                        "\nte piso..!!");
                            }

//1.1.1.1.2(final)
                            else if (pregunta1_1_1_1_X.equals("2")) {
                                {metrostrepados += 2;}{insectoscomidos+=2;}
                                System.out.println(".....Oh! El bolso ha dejado moverse, y encuentras 2 insectos " +
                                        "\nlos comes y sales del bolso al salir encuentras un hueco en la pared " +
                                        "\nHas decidido vivir en ese lugar, alimentándote de los insectos" +
                                        "\nque se encuentran a tu alrededor.");
                            }


                        }//1.1.1.2 FINAL
                        else if (pregunta1_1_1_X.equals("2")) {
                            {metrostrepados +=3;} {insectoscomidos+=3;}
                            System.out.println("\nVes a lo lejos como la hormiga se va alejando," +
                                    "\nbajas rapidamente para perseguirla en el intento de" +
                                    "\nbajar de la silla eres interceptada por un profesor" +
                                    "\n el cual te toma fotos y te toma como mascota.");
                        }


//1.1.2(final)

                    } else if (pregunta1_1_X.equals("2")) {
                        {metrosenelaire+= 2;}
                        System.out.println("\nPor quedarte aferrada caes " +
                                "\ny mueres en una tragica caida.");
                    }

                }
            } else if (pregunta1_X.equals("2")) {
                {metrostrepados+= 8;} {metroscaminados+= 8;}
                System.out.print("\nAl subir no encuentras nada" +
                        "\ninteresante y decides bajar ." +
                        "\nEncuentras un bolso olvidado," +
                        " \ntal vez haya comida o algun depredador. "); //pregunta de 1.2
                System.out.println("\n¿Qué decides hacer? ");
                System.out.println("\n1-Ignoras el bolso?");
                System.out.println("2-Entras al bolso?");
                System.out.println("Cual prefieres?\n   ¿1? o ¿2?");
                String pregunta1_2_X = lector.nextLine();
//1.2.1(final)

                if (pregunta1_2_X.equals("1")) {{ metroscaminados+=2;}
                    System.out.println("\nSigues caminando por el piso " +
                            "\ny eres pisado por un niño que esta jugando en el parque.");
                }
//1.2.2(final)
                else if (pregunta1_2_X.equals("2")) {{insectoscomidos +=1; metrostrepados+= 3; }
                    System.out.println("\nEn el bolso te encuentras con un insecto,\n" +
                            "lo devoras rapidamente, al salir del bolso \n" +
                            "decides trepar un arbol, al subir te encuentras con\n" +
                            "otra araña y ella te Come");
                }
            }
        }


        system.out.println("\nEstadisiticas");

        system.out.println("Tu Nombre:"+nombre);
        system.out.println("Final:");
        system.out.println("Metros Caminados:" +  metroscaminados);
        system.out.println("Insectos Comidos:" + insectoscomidos );
        system.out.println("Metros Trepados:" + metrostrepados );
        system.out.println("Metros en el Aire:" + metrosenelaire);






    }
}

