package com.github.bbkpij201675.programminginjava.day01;

//Program which simulates a game of Rock, Paper, Scissors where there are two
//players, whose choices are entered until one wins by a lead of 3 points.

int p1Score = 0;
int p2Score = 0;
final int lead = 3;
boolean winner = false;

print("To play Rock, Paper, Scissors, please provide the choices (PP, PR, ");
println("PS, RP, RR, RS, SP, SR, or SS).");

while (!winner) {
  print("Please enter the players' choices: ");
  String choices = System.console().readLine();
  if (choices.substring(0) == "PP" || choices.substring(0) == "PR" ||
      choices.substring(0) == "PS" || choices.substring(0) == "RP" ||
      choices.substring(0) == "RR" || choices.substring(0) == "RS" ||
      choices.substring(0) == "SP" || choices.substring(0) == "SR" ||
      choices.substring(0) == "SS") {
    if (choices.charAt(0) == 'P') {
      if (choices.charAt(1) == 'R') {
        println("1 point to Player One.");
        p1Score++;
      } else if (choices.charAt(1) == 'S') {
        println("1 point to Player Two.");
        p2Score++;
      } else {
        println("A draw.");
      }
    } else if (choices.charAt(0) == 'R') {
      if (choices.charAt(1) == 'S') {
        println("1 point to Player One.");
        p1Score++;
      } else if (choices.charAt(1) == 'P') {
        println("1 point to Player Two.");
        p2Score++;
      } else {
        println("A draw.");
      }
    } else {
      if (choices.charAt(1) == 'P') {
        println("1 point to Player One.");
        p1Score++;
      } else if (choices.charAt(1) == 'R') {
        println("1 point to Player Two.");
        p2Score++;
      } else {
        println("A draw.");
      }
    }
    if ((p1Score == (p2Score + lead)) || (p2Score == (p1Score + lead))) {
      winner = true;
    }
  } else {
    println("Invalid choice, please try again.");
  }
}

if (p1Score > p2Score) {
  println("Player One won by " + p1Score + " points to " + p2Score + ".");
} else {
  println("Player Two won by " + p2Score + " points to " + p1Score + ".");
}
