
public class Main {
    public static void main(String[] args){
        var numeroIf=3;

        if (numeroIf>0){
            System.out.println("el numero es positivo");
        } else if (numeroIf==0) {
            System.out.println("el numero es 0");
        } else {
            System.out.println("el numero es negativo");
        }

        System.out.println("......................");

        int numeroWhile = 0;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile = (numeroWhile+1);
        }

        System.out.println("......................");

        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile++;
        } while (numeroWhile<3);

        System.out.println("......................");

        for(int numeroFor=0; numeroFor<= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("......................");

        var estacion = "verano";

        switch (estacion){
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano" :
                System.out.println("Es verano");
                break;
            default:
                System.out.println("No es una estación");
        }

    }
}