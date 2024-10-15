import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Perro 1
        System.out.println("Datos del Perro 1");
        System.out.print("Cual es el nombre de tu perro?: ");
        String nombre1 = scanner.next();
        System.out.print("Cual es su raza? ");
        String raza1 = scanner.next();
        System.out.print("Cuantos años tiene tu perro? ");
        int edad1 = scanner.nextInt();
        System.out.print("Tiene un tamaño chico/mediano/grande ?");
        String tamano1 = scanner.next();
        System.out.print("Cuanto pesa en kg?");
        double peso1 = scanner.nextDouble();
        System.out.print("Cual es su genero? F/M ");
        String genero1 = scanner.next();
        System.out.println("Cual es la comida que come el perro?");
        String tipoComida1 = scanner.next();
        System.out.println("Cuantos gramos consume al dia?");
        double gramos1 = scanner.nextDouble();

        Perro perro1 = new Perro(nombre1, raza1, edad1, tamano1, peso1, genero1);

        //Perro 2
        System.out.println("Datos del Perro 2");
        System.out.print("Cual es el nombre de tu perro?: ");
        String nombre2 = scanner.next();
        System.out.print("Cual es su raza? ");
        String raza2 = scanner.next();
        System.out.print("Cuantos años tiene tu perro? ");
        int edad2 = scanner.nextInt();
        System.out.print("Tiene un tamaño chico/mediano/grande ?");
        String tamano2 = scanner.next();
        System.out.print("Cuanto pesa en kg?");
        double peso2 = scanner.nextDouble();
        System.out.print("Cual es su genero? F/M ");
        String genero2 = scanner.next();
        System.out.println("Cual es la comida que come el perro?");
        String tipoComida2 = scanner.next();
        System.out.println("Cuantos gramos consume al dia?");
        double gramos2 = scanner.nextDouble();

        Perro perro2 = new Perro(nombre2, raza2, edad2, tamano2, peso2, genero2);

        System.out.println("Perro 1: " + perro1.toString());
        System.out.println("Perro 2: " + perro2.toString());


        System.out.println("El perro 1 ladra?");
        System.out.println(" 1- Si / 2- No");
        int answ1 = scanner.nextInt();
        if(answ1 == 1){
            System.out.println(perro1.ladrar());
            perro1.comer(tipoComida1,gramos1);
        }
        else {
            perro1.comer(tipoComida1,gramos1);
        }

        System.out.println("El perro 2 ladra?");
        System.out.println(" 1- Si / 2- No");
        int answ2 = scanner.nextInt();
        if(answ2 == 1){
            System.out.println(perro2.ladrar());
            perro2.comer(tipoComida2,gramos2);
        }
        else {
            perro2.comer(tipoComida2,gramos2);
        }



    }
}