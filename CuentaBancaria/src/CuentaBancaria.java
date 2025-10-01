//La cuenta de una persona tiene guardado el saldo.
//Cuando creo una nueva cuenta este saldo comienza en 0.
//Desde un menú el usuario podrá depositar una cantidad de dinero y retirar dinero de la cuenta.
//El banco no permite que la cuenta baje de 0€.
//El banco también ha de mostrar desde el menú la información de la cuenta.

public class CuentaBancaria {
//     Atributos (siempre privados)

    private double saldo = 0.0;

//    Getters y Setters (clic derech > Generate > getters)

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



//    Constructores

    public CuentaBancaria(double saldo, double moneyToAdd, double moneyToTake) {
        this.saldo = 0;
    }

//    Funciones

//La cuenta de una persona tiene guardado el saldo.
//Cuando creo una nueva cuenta este saldo comienza en 0.
//Desde un menú el usuario podrá depositar una cantidad de dinero y retirar dinero de la cuenta.
//El banco no permite que la cuenta baje de 0€.

    public double takeMoney(double money) {
        if(this.saldo - money > 0){
            this.saldo = this.saldo - money;
            return this.saldo;
        }else{
            return -1;
        }
    }

    public double addMoney(double money) {
        this.saldo = this.saldo + money;
        return this.saldo;
    }
}
//El banco también ha de mostrar desde el menú la información de la cuenta.
