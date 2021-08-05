package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData{
    fun getLocalData(): Conta {
        val cliente = Cliente("Yohan")
        val cartao = Cartao("41151543")
        return Conta(
            "515550-7"
            , "6514-5"
            , "R$402.534,12"
            , "R$500.000,00"
            , cliente
            , cartao
        );
    }
}