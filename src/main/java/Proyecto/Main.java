package Proyecto;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //variables
        String name,cellPhone,age;
        //datos
        name=data("Ingresa nombre de usuario:");
        //datos del numero celular y verificacion si el valor es numerico
        do {
            cellPhone=data("Ingresa numero de celular:");
        }while (!isNumeric(cellPhone));
        //datos de la edad y verificacion si el valor es numerico
        do {
            age=data("Ingresa edad:");
        }while (!isNumeric(age));
        //publicar datos solicitados
        System.out.println("Bienvenido señor "+name+", " +
                "es un placer para nosotros contar con una persona de "+age+" años.\n" +
                "Próximamente nos comunicaremos con usted al numero "+cellPhone+". \n" +
                "Feliz día");
    }
    //función de publicación y obtención de datos
    public static String data(String message){
        Scanner scan=new Scanner(System.in);
        System.out.println(message);
        String value=scan.nextLine();
        return (value);
    }
    //función de verificacion si el valor es numerico o no
    public static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            System.out.println("El valor tiene que ser numerico:");
            return false;
        }
    }
}
