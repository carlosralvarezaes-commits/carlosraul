import java.util.Scanner;

public class Aventura_Aranha {
    public static <string> void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System system = null;


        System.out.print("Como quieres llamar a tu Araña:");
        String nombre = lector.nextLine();

        //datos
        double metroscaminados=0;
        int insectoscomidos=0;
        int metrostrepados=0;
        string tipodefinal;

        //capitulo 1
        System.out.print("\uD83C\uDF3F Capítulo 1: El Despertar \n" +
                "\n" +
                "INICIO:te despiertas sobre una hoja húmeda en\n " +
                "medio del parque . El sol se filtra entre las ramas.\n " +
                "Sientes hambre y curiosidad. ");
        System.out.println("\n¿Qué decides hacer? ");


        System.out.print("\nEmpezar a caminar:");
        String empezarcaminar = lector.nextLine();





        if (empezarcaminar.equals("si") ) { metroscaminados +=10; }
        {System.out.println("\nEncuentras una ventana abierta." +
                    "\nVes al fondo un aula en donde puedes" +
                    "\nencontrar tu próxima comida. ");


            System.out.print("\nEntras en busca de comida:");
            String entrasenbusca11 = lector.nextLine();
            System.out.print("Sigues caminando y te diriges a un árbol cercano:");
            String siguescaminandoARBOL12 = lector.nextLine();

            if (entrasenbusca11.equals("si") && siguescaminandoARBOL12.equals("no")) {{ metrostrepados +=10; }
                System.out.println("\nSubes al Techo y esperas a tu Próxima presa,\n" +
                        "en la espera ves a una hormiga en el suelo," +
                        " \ntejes una telaraña para bajar," +
                        " \npero mientras bajas una brisa " +
                        "\nte golpea Fuertemente   ");
            }
            if (entrasenbusca11.equals("no") && siguescaminandoARBOL12.equals("si")) {{ metroscaminados +=10; }
                System.out.println("\nAl subir no encuentras nada interesante \ny decides bajar." +
                        "Encuentras un bolso olvidado," +
                        "\ntal vez haya comida o algun depredador.");




                System.out.print("\nignoras el bolso:");
                String ignoraselbolso = lector.nextLine();
                System.out.print("Entras en el Bolso:");
                String entrasenelbolso = lector.nextLine();
                {if (ignoraselbolso.equals("si") && entrasenelbolso.equals("no")){ metroscaminados +=2; }
                    System.out.println("\nSigues caminando por el piso y eres pisado por un niño " +
                            "\nque esta jugando en el parque..Final Patio de Juegos");

                if (ignoraselbolso.equals("no") && entrasenelbolso.equals("si")){ insectoscomidos +=1; }
                        System.out.println("\n.Al entrar te encuentras con un insecto y lo " +
                                "\ndevoras rapidamente tambien encuentras gigantescos libros de Ciencias," +
                                "\nen eso algo choca con el bolso y te cae un libro encima..Final Cientifico");
                }


            }


            if (entrasenbusca11.equals("si") && siguescaminandoARBOL12.equals("no")) {
                System.out.print("\nSaltas a una silla cercana:");
                String saltasunasillacercana = lector.nextLine();
                System.out.print("Te aferras a tu telaraña, tratando de no caerte:");
                String teaferrasatutelaraña = lector.nextLine();

                if (saltasunasillacercana.equals("si") && teaferrasatutelaraña.equals("no")) {
                    { metroscaminados +=1; }
                    System.out.println("\nAl saltar a la silla has perdido a la hormiga," +
                            " \nDeseas volver al techo para explorar \ny encontrar comida," +
                            " pero algo te dice que permanezcas\n junto a la silla  ");
                }

                if (saltasunasillacercana.equals("no") && teaferrasatutelaraña.equals("si")) {
                    System.out.println("\n Por quedarte aferrada caes " +
                            "\ny mueres en una tragica caida..Final Tragico");}


                if (saltasunasillacercana.equals("si") && teaferrasatutelaraña.equals("no")){
                    System.out.print("\nSubes de nuevo al techo:");
                    String subesdenuevotecho = lector.nextLine();
                    System.out.print("Permaneces Abajo:");
                    String permanecesabajo = lector.nextLine();
                    if (subesdenuevotecho.equals("si") && permanecesabajo.equals("no")){{ metrostrepados +=5; }
                        System.out.println("\nAl tratar de subir por tu misma telaraña," +
                                "\nla brisa te golpea y caes dentro de un bolso, " +
                                "\nel bolso se empieza a mover a otro lugar al " +
                                "\ntratar de salir de bolso encuentras " +
                                "\nuna rotura del bolso . ");
                    if (subesdenuevotecho.equals("no") && permanecesabajo.equals("si")){ metrostrepados +=5; }{ metroscaminados +=2; }
                         System.out.println("\nVes a lo lejos como la hormiga se va alejando," +
                                    "\nbajas rapidamente para perseguirla en el intento de " +
                                    "\nbajar de la silla eres interceptada por un profesor," +
                                    "\nel cual te toma fotos y te toma \ncomo mascota..Final Un profesor Feliz ");


                    }


                    if (subesdenuevotecho.equals("si") && permanecesabajo.equals("no")) {
                        System.out.print("\nSales por ahí?:");
                        String salesporahi = lector.nextLine();
                        System.out.print("Esperas tu muerte?: ");
                        String esperastumuerte = lector.nextLine();
                        if (salesporahi.equals("si") && esperastumuerte.equals("no"))
                            System.out.println("\nAl salir del Bolso el dueño te ha visto" +
                                    "\n y te ha pisado." +
                                    "\nFinal:Muerte Contundente ");if (salesporahi.equals("no") && esperastumuerte.equals("si"))
                                System.out.println("\n .....Oh! El bolso ha dejado moverse ," +
                                        "\nsales de el y encuentras un hueco en la pared." +
                                        "\nHas decidido tomar ese lugar como un hogar," +
                                        "\nalimentándote de los insectos que se encuentran a" +
                                        "\ntu alrededor.Final Una Casa Acogedora  ");







}}}}}}
