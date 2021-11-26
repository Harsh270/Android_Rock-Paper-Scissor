package com.example.labpractical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val restart_btn: TextView = findViewById(R.id.restart_btn)
        val scissors_btn: TextView = findViewById(R.id.scissors_btn)
        val paper_btn: TextView = findViewById(R.id.paper_btn)
        val rock_btn: TextView = findViewById(R.id.rock_btn)
        val computer_score: TextView = findViewById(R.id.computer_score)
        val player_score: TextView = findViewById(R.id.player_score)
        val winner_tv: TextView = findViewById(R.id.winner_tv)
        val user_move_img: TextView = findViewById(R.id.user_move_img)
        val computer_move_img: TextView = findViewById(R.id.computer_move_img)

        restart_btn.setOnClickListener {
            computer_score.text = "0"
            player_score.text = "0"

            winner_tv.text = ""

            // set the images of computer move and user move to "Question mark image".
            user_move_img.setText("User Selection");
            computer_move_img.setText("Computer Move");
        }
        scissors_btn.setOnClickListener {

            // set the image of user move to scissors
            user_move_img.setText("Scissor Selected");

            // choose a random number between 1 to 3.
            val computer_move = (1..4).random() // 4 is not included.

            // 1 denotes "Rock"
            // if value of computer move is 1 it means computer has chosen Rock

            // 2 denotes "Paper"
            // if value of computer move is 2 it means computer has chosen paper

            // 3 denotes "Scissors"
            // if value of computer move is 1 it means computer has chosen Scissors

            if (computer_move == 1) {
                // set the image of computer move to rock
                computer_move_img.setText("Rock Selected");

                // rock beats scissors.
                winner_tv.text = "Computer has won"

                // increase the computer score
                val cscore: Int = computer_score.text.toString().toInt() + 1
                computer_score.text = cscore.toString()
            } else if (computer_move == 2) {

                // set the image of computer move to paper
                computer_move_img.setText("Paper Selected");

                // scissors beats paper
                winner_tv.text = "Player has won"

                // increase the player score
                val pscore: Int = player_score.text.toString().toInt() + 1
                player_score.text = pscore.toString()
            } else {

                // set the image of computer move to scissors
                computer_move_img.setText("Scissor Selected");

                // both user move and computer move are "scissors"
                winner_tv.text = "Draw"
            }

        }
        paper_btn.setOnClickListener {

            // set the image of player move to paper
            user_move_img.setText("Paper Selected");


            val computer_move = (1..4).random()

            // 1 denotes "Rock"
            // if value of computer move is 1 it means computer has chosen Rock

            // 2 denotes "Paper"
            // if value of computer move is 2 it means computer has chosen paper

            // 3 denotes "Scissors"
            // if value of computer move is 1 it means computer has chosen Scissors

            if (computer_move == 1) {

                // set the image of computer move to rock
                computer_move_img.setText("Rock selected");

                // paper beats rock
                winner_tv.text = "Player has won"

                // increase count of player score
                val pscore: Int = player_score.text.toString().toInt() + 1
                player_score.text = pscore.toString()
            }
            else if (computer_move == 2) {

                // set the image of computer move to paper
                computer_move_img.setText("Paper Selected");

                // both user move and computer move are "paper"
                winner_tv.text = "Draw"
            } else {

                // set the image of computer move to scissors

                computer_move_img.setText("Scissor selected");
                // scissors beats paper
                winner_tv.text = "Computer has won"

                // increase the computer score
                val cscore: Int = computer_score.text.toString().toInt() + 1
                computer_score.text = cscore.toString()
            }

        }
        rock_btn.setOnClickListener {

            // set the image of user move to rock
            user_move_img.setText("Rock Selected");


            val computer_move = (1..4).random()

            // 1 denotes "Rock"
            // if value of computer move is 1 it means computer has chosen Rock

            // 2 denotes "Paper"
            // if value of computer move is 2 it means computer has chosen paper

            // 3 denotes "Scissors"
            // if value of computer move is 1 it means computer has chosen Scissors

            if (computer_move == 1) {
                // set the image of computer move to rock
                computer_move_img.setText("Rock Selected");

                // both user  and computer moves are rock
                winner_tv.text = "Draw"

            } else if (computer_move == 2) {

                // set the image of computer move to paper
                computer_move_img.setText("Paper Selected");

                // paper beats rock
                winner_tv.text = "Computer has won"

                // increase the computer score
                val cscore: Int = computer_score.text.toString().toInt() + 1
                computer_score.text = cscore.toString()


            } else {
                // set the image of computer move to scissors
                computer_move_img.setText("Scissor Selected");

                // rock beats scissors
                winner_tv.text = "Player has won"

                // increase the count of plyer
                val pscore: Int = player_score.text.toString().toInt() + 1
                player_score.text = pscore.toString()
            }
        }
    }
   
}