package com.example.calculatorkotlin


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.calculatorkotlin.R

class MainActivity : AppCompatActivity() {

    private var firstInput: Double = 0.0;
    private var secondInput: Double = 0.0;
    private var res: String = "";
    private var operations: Operations? = null;
    private var equalIsClicked: Boolean = false;

    private var textView: TextView? = null;
    private var buttonOne: Button? = null
    private var buttonTwo: Button? = null
    private var buttonThree: Button? = null
    private var buttonFour: Button? = null
    private var buttonFive: Button? = null
    private var buttonSix: Button? = null
    private var buttonSeven: Button? = null
    private var buttonEight: Button? = null
    private var buttonNine: Button? = null
    private var buttonZero: Button? = null
    private var buttonDot: Button? = null

    private var buttonRoot: Button? = null
    private var buttonSquare: Button? = null
    private var buttonClearAll: Button? = null
    private var buttonDelete: Button? = null
    private var buttonEqual: Button? = null
    private var buttonAddition: Button? = null
    private var buttonSubtraction: Button? = null
    private var buttonMultiplication: Button? = null
    private var buttonDivision: Button? = null
    private var buttonSin: Button? = null
    private var buttonCos: Button? = null
    private var buttonTangent: Button? = null
    private var buttonFactorial: Button? = null
    private var buttonLog: Button? = null
    private var buttonLn: Button? = null
    private var buttonDifPower: Button? = null
    private var buttonNRoot: Button? = null
    private var buttonPlusMinus: Button? = null
    var minus = false
    enum class Operations {
        NONE,
        SUM,
        SUBTRACT,
        MULT,
        DIV
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstInput = 0.0
        secondInput = 0.0
        equalIsClicked = false
        operations = Operations.NONE


        textView = findViewById(R.id.textView) as TextView
        buttonOne = findViewById(R.id.one) as Button
        buttonTwo = findViewById(R.id.two) as Button
        buttonThree = findViewById(R.id.three) as Button
        buttonFour = findViewById(R.id.four) as Button
        buttonFive = findViewById(R.id.five) as Button
        buttonSix = findViewById(R.id.six) as Button
        buttonSeven = findViewById(R.id.seven) as Button
        buttonEight = findViewById(R.id.eight) as Button
        buttonNine = findViewById(R.id.nine) as Button
        buttonZero = findViewById(R.id.zero) as Button

        buttonAddition = findViewById(R.id.plus) as Button
        buttonSubtraction = findViewById(R.id.subtr) as Button
        buttonDivision = findViewById(R.id.division) as Button
        buttonMultiplication = findViewById(R.id.multiply) as Button
        buttonClearAll = findViewById(R.id.clear) as Button
        buttonDelete = findViewById(R.id.del) as Button
        buttonEqual = findViewById(R.id.equal) as Button
        buttonRoot = findViewById(R.id.sqrt) as Button
        buttonSquare = findViewById(R.id.power) as Button
        buttonDot = findViewById(R.id.dot) as Button
        //buttonPlusMinus = findViewById(R.id.plusMinus) as Button

        buttonOne!!.setOnClickListener {
            if (textView!!.text == "NaN" || textView!!.text == "error") {
                operations = Operations.NONE
                textView!!.text = ""
                firstInput = 0.0
                secondInput = 0.0
                minus = false
            }
            if (textView!!.text.equals("")) {
                if (equalIsClicked) {
                    textView!!.text = "1"
                    equalIsClicked = false
                } else {
                    textView!!.text = "1"
                }
            } else {
                if (equalIsClicked) {
                    textView!!.text = "1"
                    equalIsClicked = false
                } else {
                    res = textView!!.text.toString() + "1"
                    textView!!.text = res;
                }
            }
        }

        buttonTwo!!.setOnClickListener {
            if (textView!!.text == "NaN" || textView!!.text == "error") {
                operations = Operations.NONE
                textView!!.text = ""
                firstInput = 0.0
                secondInput = 0.0
                minus = false
            }
            if (textView!!.text.equals("")) {
                if (equalIsClicked) {
                    textView!!.text = "2"
                    equalIsClicked = false
                } else {
                    textView!!.text = "2"
                }
            } else {
                if (equalIsClicked) {
                    textView!!.text = "2"
                    equalIsClicked = false
                } else {
                    res = textView!!.text.toString() + "2"
                    textView!!.text = res;
                }
            }
        }

        buttonThree!!.setOnClickListener {
            if (textView!!.text == "NaN" || textView!!.text == "error") {
                operations = Operations.NONE
                textView!!.text = ""
                firstInput = 0.0
                secondInput = 0.0
                minus = false
            }
            if (textView!!.text.equals("")) {
                if (equalIsClicked) {
                    textView!!.text = "3"
                    equalIsClicked = false
                } else {
                    textView!!.text = "3"
                }
            } else {
                if (equalIsClicked) {
                    textView!!.text = "3"
                    equalIsClicked = false
                } else {
                    res = textView!!.text.toString() + "3"
                    textView!!.text = res;
                }
            }
        }

        buttonFour!!.setOnClickListener {
            if (textView!!.text == "NaN" || textView!!.text == "error") {
                operations = Operations.NONE
                textView!!.text = ""
                firstInput = 0.0
                secondInput = 0.0
                minus = false
            }
            if (textView!!.text.equals("")) {
                if (equalIsClicked) {
                    textView!!.text = "4"
                    equalIsClicked = false
                } else {
                    textView!!.text = "4"
                }
            } else {
                if (equalIsClicked) {
                    textView!!.text = "4"
                    equalIsClicked = false
                } else {
                    res = textView!!.text.toString() + "4"
                    textView!!.text = res;
                }
            }
        }

        buttonFive!!.setOnClickListener {
            if (textView!!.text == "NaN" || textView!!.text == "error") {
                operations = Operations.NONE
                textView!!.text = ""
                firstInput = 0.0
                secondInput = 0.0
                minus = false
            }
            if (textView!!.text.equals("")) {
                if (equalIsClicked) {
                    textView!!.text = "5"
                    equalIsClicked = false
                } else {
                    textView!!.text = "5"
                }
            } else {
                if (equalIsClicked) {
                    textView!!.text = "5"
                    equalIsClicked = false
                } else {
                    res = textView!!.text.toString() + "5"
                    textView!!.text = res;
                }
            }
        }

        buttonSix!!.setOnClickListener {
            if (textView!!.text == "NaN" || textView!!.text == "error") {
                operations = Operations.NONE
                textView!!.text = ""
                firstInput = 0.0
                secondInput = 0.0
                minus = false
            }
            if (textView!!.text.equals("")) {
                if (equalIsClicked) {
                    textView!!.text = "6"
                    equalIsClicked = false
                } else {
                    textView!!.text = "6"
                }
            } else {
                if (equalIsClicked) {
                    textView!!.text = "6"
                    equalIsClicked = false
                } else {
                    res = textView!!.text.toString() + "6"
                    textView!!.text = res;
                }
            }
        }

        buttonSeven!!.setOnClickListener {
            if (textView!!.text == "NaN" || textView!!.text == "error") {
                operations = Operations.NONE
                textView!!.text = ""
                firstInput = 0.0
                secondInput = 0.0
                minus = false
            }
            if (textView!!.text.equals("")) {
                if (equalIsClicked) {
                    textView!!.text = "7"
                    equalIsClicked = false
                } else {
                    textView!!.text = "7"
                }
            } else {
                if (equalIsClicked) {
                    textView!!.text = "7"
                    equalIsClicked = false
                } else {
                    res = textView!!.text.toString() + "7"
                    textView!!.text = res;
                }
            }
        }

        buttonEight!!.setOnClickListener {
            if (textView!!.text == "NaN" || textView!!.text == "error") {
                operations = Operations.NONE
                textView!!.text = ""
                firstInput = 0.0
                secondInput = 0.0
                minus = false
            }
            if (textView!!.text.equals("")) {
                if (equalIsClicked) {
                    textView!!.text = "8"
                    equalIsClicked = false
                } else {
                    textView!!.text = "8"
                }
            } else {
                if (equalIsClicked) {
                    textView!!.text = "8"
                    equalIsClicked = false
                } else {
                    res = textView!!.text.toString() + "8"
                    textView!!.text = res;
                }
            }
        }

        buttonNine!!.setOnClickListener {
            if (textView!!.text == "NaN" || textView!!.text == "error") {
                operations = Operations.NONE
                textView!!.text = ""
                firstInput = 0.0
                secondInput = 0.0
                minus = false
            }
            if (textView!!.text.equals("")) {
                if (equalIsClicked) {
                    textView!!.text = "9"
                    equalIsClicked = false
                } else {
                    textView!!.text = "9"
                }
            } else {
                if (equalIsClicked) {
                    textView!!.text = "9"
                    equalIsClicked = false
                } else {
                    res = textView!!.text.toString() + "9"
                    textView!!.text = res;
                }
            }
        }

        buttonZero!!.setOnClickListener {
            if (textView!!.text == "NaN" || textView!!.text == "error") {
                operations = Operations.NONE
                textView!!.text = ""
                firstInput = 0.0
                secondInput = 0.0
                minus = false
            }
            if (textView!!.text.equals("")) {
                if (equalIsClicked) {
                    textView!!.text = "0"
                    equalIsClicked = false
                } else {
                    textView!!.text = "0"
                }
            } else if (textView!!.text != "0" && textView!!.text != "") {
                if (equalIsClicked) {
                    textView!!.text = "0"
                    equalIsClicked = false
                } else {
                    res = textView!!.text.toString() + "0"
                    textView!!.text = res;
                }
            }
        }

        buttonAddition!!.setOnClickListener {
            if (operations == Operations.NONE) {
                if (textView!!.text == "" || textView!!.text.equals("error") ||
                    textView!!.text == "NaN"
                ) {
                    textView!!.text = ""
                }
                if (textView!!.text != "") {
                    firstInput = (textView!!.text.toString()).toDouble()
                    operations = Operations.SUM
                    textView!!.text = ""
                } else {
                    operations = Operations.SUM
                    textView!!.text = ""
                }
            }
        }

        buttonSubtraction!!.setOnClickListener {
            if (textView!!.text == "" || textView!!.text == "error" || textView!!.equals(
                    "NaN"
                )
            ) {
                textView!!.text = ""
            } else {
                firstInput = (textView!!.text.toString()).toDouble()
                operations = Operations.SUBTRACT
                textView!!.text = ""
            }
        }

        buttonMultiplication!!.setOnClickListener {
            if (operations == Operations.NONE) {
                if (textView!!.text == "" || textView!!.text == "error" || textView!!.text == "NaN") {
                    textView!!.text = ""
                }
                if (textView!!.text != "") {
                    firstInput = (textView!!.text.toString()).toDouble()
                    operations = Operations.MULT
                    textView!!.text = ""
                }
            } else {
                operations = Operations.MULT
                textView!!.text = ""
            }
        }

        buttonDivision!!.setOnClickListener {
            if (operations == Operations.NONE) {
                if (textView!!.text == "" || textView!!.text == "error" || textView!!.text == "NaN") {
                    textView!!.text = ""
                }
                if (textView!!.text != "") {
                    firstInput = (textView!!.text.toString()).toDouble()
                    operations = Operations.DIV
                    textView!!.text = ""
                }
            } else {
                operations = Operations.DIV
                textView!!.text = ""
            }
        }

        buttonDot!!.setOnClickListener {
            if( textView!!.text == "" && !textView!!.text.toString().contains(".")
                && textView!!.text != "error" && textView!!.text != "NaN"){
                res = textView!!.text.toString() + "."
                textView!!.text = res
            }
        }

        buttonDelete!!.setOnClickListener {
            if(textView!!.text != "" && textView!!.text != "error" &&
                textView!!.text != "NaN"){
                res = textView!!.text.toString().substring(0, textView!!.text.length - 1)
                textView!!.text = res
            }
        }

        buttonClearAll!!.setOnClickListener {
            textView!!.text = ""
            operations = Operations.NONE
            firstInput = 0.0
            secondInput =0.0
            minus = false
        }

        buttonSquare!!.setOnClickListener {
            if(textView!!.text != "" || textView!!.text == "error" &&
                textView!!.text == "NaN"){
                firstInput = Math.pow(textView!!.text.toString().toDouble(), 2.0)
                res = firstInput.toString()
                textView!!.text = res
            }
        }

        buttonRoot!!.setOnClickListener {
            if(textView!!.text != "" || textView!!.text == "error" ||
                textView!!.text == "NaN"){
                firstInput = Math.sqrt(textView!!.text.toString().toDouble())
                res = firstInput.toString()
                textView!!.text = res
            }
        }

//        buttonPlusMinus!!.setOnClickListener {
//            if (textView!!.text == "" || textView!!.text == "На 0 делить нельзя" || textView!!.text == "NaN") {
//                textView!!.text = ""
//            } else if (textView!!.text != "0") {
//                var a: Double = textView!!.text.toString().toDouble() * (-1)
//                textView!!.text = a.toString()
//            }
//        }

        buttonEqual!!.setOnClickListener {
            if(textView!!.text != ""){
                secondInput = textView!!.text.toString().toDouble()
                if(operations == Operations.SUM){
                    res = (firstInput + secondInput).toString()
                    if(res == "-0.0"){
                        res = "0.0"
                    }
                    textView!!.text = res
                }

                if(operations == Operations.SUBTRACT){
                    res = (firstInput - secondInput).toString()
                    if(res == "-0.0"){
                        res = "0.0"
                    }
                    textView!!.text = res
                }

                if(operations == Operations.DIV){
                    if(secondInput != 0.0){
                        res = (firstInput / secondInput).toString()
                        if(res == "-0.0"){
                            res = "0.0"
                        }
                        textView!!.text = res
                    }
                    else{
                        textView!!.text = "error 0 делить нельзя"
                    }
                }
                if(operations == Operations.MULT){
                    res = (firstInput * secondInput).toString()
                    if(res == "-0.0" || textView!!.text == "NaN"){
                        res = "0.0"
                        firstInput = 0.0
                        secondInput = 0.0
                    }
                    textView!!.text = res
                }
                operations = Operations.NONE
                equalIsClicked = true
            }
        }

    }
}