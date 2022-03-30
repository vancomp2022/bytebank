fun main(args: Array<String>) {

    println("Bem vindo ao Bytebank")
    val titular: String = "Alex"
    val numeroConta: Int = 1000
    var saldo: Double = 0.0
    saldo = 100.0 + 2.0
    saldo += 200
    saldo -= 1000

    println("titular $titular")
    println("numero da Conta $numeroConta")
    println("saldo da conta $saldo")

    if(saldo > 0.0){
        println("conta eh positiva")
    } else if (saldo == 0.0) {
        println("conta eh neutra")
    } else {
        println("conta eh negativa")
    }

    when {
        saldo > 0.0 -> println("conta eh positiva")
        saldo == 0.0 -> println("conta eh neutra")
        else -> println("conta eh negativa")
    }
}