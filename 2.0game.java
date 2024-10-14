import java.util.*;
class game {
  String username;
  int answer;
  int guess;
  Scanner consoleInput = new Scanner(System.in);
  
  void entername() {
    System.out.print("Enter your name: ");
    username = consoleInput.nextLine();
  }
  void enterguess () {
    System.out.print("Enter your guess: ");
    guess = consoleInput.nextInt();
}
  void checkguess (int guess) {
    if (guess == answer) {
      System.out.println("hooray you guessed correctly!");
    }
    else {
      System.out.println ("you are wrong :(");
    }
  
  }
  void runGame () {
    entername();
    System.out.println("Hello " + username);
    enterguess();
    System.out.println("Your guess is: " + guess);
    checkguess(guess);
  }
  }
