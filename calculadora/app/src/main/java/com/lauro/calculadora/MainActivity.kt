package com.lauro.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var conteudo: String = ""
    var resultado: Float = 0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonClear.setOnClickListener {
            conteudo = ""
            viewAnswer.setText(conteudo)
        }
        buttonIgual.setOnClickListener {
            var pronto = separa(conteudo)
            if(pronto[2] == "0"){
                conteudo = "Indeterminado"
                viewAnswer.setText(conteudo)
            }
            else {
                conteudo = operacao(pronto).toString()
                viewAnswer.setText(conteudo)
            }
        }
        buttonAdicao.setOnClickListener {
            conteudo += " + "
            viewAnswer.setText(conteudo)
        }
        buttonSubtracao.setOnClickListener {
            conteudo += " - "
            viewAnswer.setText(conteudo)
        }
        buttonMultiplicacao.setOnClickListener {
            conteudo += " x "
            viewAnswer.setText(conteudo)
        }
        buttonDivisao.setOnClickListener {
            conteudo += " / "
            viewAnswer.setText(conteudo)
        }
        button1.setOnClickListener {
            conteudo += "1"
            viewAnswer.setText(conteudo)
        }
        button2.setOnClickListener {
            conteudo += "2"
            viewAnswer.setText(conteudo)
        }
        button3.setOnClickListener {
            conteudo += "3"
            viewAnswer.setText(conteudo)
        }
        button4.setOnClickListener {
            conteudo += "4"
            viewAnswer.setText(conteudo)
        }
        button5.setOnClickListener {
            conteudo += "5"
            viewAnswer.setText(conteudo)
        }
        button6.setOnClickListener {
            conteudo += "6"
            viewAnswer.setText(conteudo)
        }
        button7.setOnClickListener {
            conteudo += "7"
            viewAnswer.setText(conteudo)
        }
        button8.setOnClickListener {
            conteudo += "8"
            viewAnswer.setText(conteudo)
        }
        button9.setOnClickListener {
            conteudo += "9"
            viewAnswer.setText(conteudo)
        }
        button0.setOnClickListener {
            conteudo += "0"
            viewAnswer.setText(conteudo)
        }

    }
    fun separa(a: String): List<String> {
        var separado = a.split(" ")
        return separado
    }

    fun operacao(separado: List<String>): Float {
        var resultado: Float = 0f
        when (separado[1]) {
            "+" -> resultado = separado[0].toFloat() + separado[2].toFloat()
            "-" -> resultado = separado[0].toFloat() - separado[2].toFloat()
            "x" -> resultado = separado[0].toFloat() * separado[2].toFloat()
            "/" -> resultado = separado[0].toFloat() / separado[2].toFloat()
        }
        return resultado
    }
}

