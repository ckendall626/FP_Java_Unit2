import java.util.*;
class Player {
  int guess;
  String username;
  Scanner consoleInput = new Scanner(System.in);
  String [] nwjns = {"Minji", "Hanni", "Danielle", "Haerin", "Hyein"};

  void entername (){
    System.out.print("Enter your name: ");
    username = consoleInput.nextLine();
    for (int i = 0; i < nwjns.length; i++){
      if (username.equals(nwjns[i])){
        System.out.println("OH MY GOD IT IS A MEMBER OF WORLD FAMOUS KOREAN GIRL GROUP NEWJEANS KNOWN FOR THEIR INTERNATIONAL HITS OMG, HYPE BOY, DITTO, SUPER SHY, AND ETA!");
      }
    }
  }
  void enterguess () {
    System.out.print("Pick a number between 1 and 100, " + username + ": ");
    while (true) {
    if (!consoleInput.hasNextInt()){
      System.out.print("That is not a valid integer. please type a valid integer: ");
      consoleInput.nextLine();
      continue;
    }
      else {
        break;
      }
    }
      guess = consoleInput.nextInt();
  }
}