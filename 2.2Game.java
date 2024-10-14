import java.util.*;
class Game {
  void runGame() {
    Scanner consoleInput = new Scanner(System.in);
    int numplaya;
    int answer = (int) (Math.random()* 100) + 1;
   Player playalist [] = new Player [0];
    //System.out.println (answer);
    System.out.print ( "How many players are playing?: ");
        while (consoleInput.hasNext()){
        if (!consoleInput.hasNextInt()){
          System.out.print("That is not a valid integer. please type a valid integer: ");
          consoleInput.nextLine();
          continue;
        }
          else {
            numplaya = consoleInput.nextInt();
            playalist = new Player [numplaya];
            break;
          }
        }
      Player han = new Player ();
      for (int i = 0; i < playalist.length; i++) {
    playalist [i] = new Player();
    playalist [i].entername();
    playalist [i].enterguess();
      }
    
    for (int nw = 0; nw < playalist.length; nw++){
    if (playalist [nw].guess == answer) {
      System.out.println ("Congragulations " + playalist[nw].username + "! You got it correct!");
  }
    else {
      System.out.println ("Sorry " + playalist[nw].username + ". You are incorrect :(" );
    }
    
  }
}
}