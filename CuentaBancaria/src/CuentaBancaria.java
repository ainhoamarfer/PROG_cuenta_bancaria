//La cuenta de una persona tiene guardado el saldo.
//Cuando creo una nueva cuenta este saldo comienza en 0.
//Desde un menú el usuario podrá depositar una cantidad de dinero y retirar dinero de la cuenta.
//El banco no permite que la cuenta baje de 0€.
//El banco también ha de mostrar desde el menú la información de la cuenta.

public class CuentaBancaria {
//     Atributos (siempre privados)

    private double saldo = 0.0;
    private double money;

//    Getters y Setters (clic derech > Generate > getters)

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

//    Constructores

    public CuentaBancaria(double saldo, double money) {
        this.saldo = saldo;
        this.money = money;
    }


//    Funciones

//La cuenta de una persona tiene guardado el saldo.
//Cuando creo una nueva cuenta este saldo comienza en 0.
//Desde un menú el usuario podrá depositar una cantidad de dinero y retirar dinero de la cuenta.
//El banco no permite que la cuenta baje de 0€.

    public double takeMoney() {
        if (saldo != 0.0) {
            return this.money = this.saldo - this.money;
        } else {
            System.out.println("Saldo insuficiente");
        }
        return saldo;
    }

    public double addMoney() {
        return this.saldo = this.saldo + this.money;
    }
}
//El banco también ha de mostrar desde el menú la información de la cuenta.
