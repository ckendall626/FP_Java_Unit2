class Main {
  static void testdog () {
    dog d = new dog ();
    d.size = 40;
    d.name = "Haerin";
    d.bark ();
    System.out.println("The dog's size is " + d.size + " pounds");
    System.out.println ("Who is a good Roman Catholic " + d.name + "?");
    System.out.println ("You are such a good Buddhist " + d.name + "!");
  }
  static void playgame () {
    game g = new game ();
    g.answer = (int) (Math.random() * 10 + 1);
    System.out.println(g.answer);
    g.runGame();
  }
  public static void main(String[] args) {
    //Test code goes here
    testdog();
    playgame();
    

   
      
    
  }
}