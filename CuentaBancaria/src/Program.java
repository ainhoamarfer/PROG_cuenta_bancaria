import java.util.Scanner;

public class Program {

    final static int OP_INGRESA =1, RETIRA = 2, SALDO = 3, SALIR = 4;

    public static void main(String[] args) {
        //El banco también ha de mostrar desde el menú la información de la cuenta.

        CuentaBancaria cb = new CuentaBancaria();

        while(true){
            System.out.println("¡Hola! Tienes " + double saldo + " euros en tu saldo, que quieres hacer?);
            System.out.println("\t1.Ingresa");
            System.out.println("\t2.Retira");
            System.out.println("\t3.Saldo");
            System.out.println("\t4.Salir");

            Scanner sc = new Scanner(System.in);
            int userOption = sc.nextInt();
            double saldo = 0;

            if(userOption == OP_INGRESA){
                System.out.println("Introduce el dinero a ingresar");
                double money = sc.nextDouble();
                saldo = cb.addMoney(money);
            }

            if(userOption == RETIRA){
                System.out.println("Introduce el dinero a ingresar");
                double money = sc.nextDouble();
                saldo = cb.takeMoney(money);
                if(saldo == -1){
                    System.out.println("Saldo insuficiente");
                }
            }

            if(userOption == SALDO){
                saldo = cb.getSaldo();
            }
            if(userOption == SALIR){
                System.out.println("Adios");
                break;
            }
            System.out.println("El saldo actual es: " + saldo);
        }
    }
}
