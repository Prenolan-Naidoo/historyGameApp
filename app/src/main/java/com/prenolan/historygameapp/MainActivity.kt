package com.prenolan.historygameapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    //declare
    private lateinit var generatePerson: Button
    private lateinit var enterAge: EditText
    private lateinit var resultFromAge: TextView
    private lateinit var clearAge: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        //inialize
        generatePerson = findViewById(R.id.generatePerson)
        enterAge = findViewById(R.id.enterAge)
        resultFromAge = findViewById(R.id.resultFromAge)
        clearAge = findViewById(R.id.clearAge)

        generatePerson.setOnClickListener{

            //create a variable of age to get value from user

            val age = enterAge.text.toString().toIntOrNull()



            //if age is not null and is in the range between
            if (age != null && age in 10 .. 100 ){

                //when age is 27 display Amy else when is .. and so on

                val celebrityName = when (age) {

                    43 -> "Chadwick Boseman" +
                            " He gave hope to cancer patients" +
                            " He Spoke Up Against Stereotypical Roles"

                    83 -> "Henry Ford" +
                            " He built and early horseless carriage" +
                            " He revolutionized industry through his moving assembly line "

                    20 -> "Cameron Boyce" +
                            " He was a humanitarian" +
                            " He also voiced a ‘Spider-Man’ villain"

                    40 -> "Paul Walker" +
                            " He was known for performing his own stunts." +
                            " He owned a charity organization called Reach Out Worldwide"

                    52 -> "William Shakespeare" +
                            " Shakespeare was an actor, as well as a writer" +
                            " Shakespeare performed before both Queen Elizabeth I and King James I"

                    15 -> "Anne Frank" +
                            " Anne’s diary was a 13th birthday present" +
                            " Anne wrote two versions of her diary"

                    96 -> "Queen Elizabeth II" +
                            " The Queen is the only person in all of Britain who is legally allowed to drive without a driver’s license." +
                            " Queen Elizabeth’s coronation took place on June 2, 1953"

                    92 -> "Rosa Parks" +
                            " Parks was a civil rights activist before her arrest" +
                            " Weeks after her arrest, Parks was jailed a second time for her role in the boycott."

                    76 -> "Miriam Makeba" +
                            " Zenzile Miriam Makeba, nicknamed Mama Africa, was a South African singer, songwriter, actress, and civil rights activist" +
                            " Miriam Makeba died of a heart attack during a 2008 concert in Italy."

                    36 -> "Princess Diana" +
                            " Diana Wore a Family Heirloom Rather Than a Royal Tiara" +
                            " Diana Helped Change Attitudes Towards HIV and Aids"


                    else -> null
                }

                val message = if (celebrityName != null) " The celebrity name is $celebrityName"
                else "No celebrity found with age entered."

                resultFromAge.text = message

            } else{

                resultFromAge.text = "Invalid input . Please enter a valid age between 10 and 100"



            }
        }


        clearAge.setOnClickListener{
            enterAge.text.clear()
            resultFromAge.text = ""
        }
    }
}