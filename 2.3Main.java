class Main {
  public static void main(String[] args) {
    //test code for a horse class that is not encapsulated
    Horse myHorse = new Horse();
		myHorse.name = "Shadowfax";
		System.out.println(myHorse.name + " is awesome!");


    //Code for testing the planet class goes here
    Planet myWorld = new Planet ();
    myWorld.setmass(376);
    myWorld.setradius (3832);
    myWorld.getsurfgrav ();

    Planet Earth = new Planet ();
    Earth.setmass (60);
    Earth.setradius (3959);
    Earth.getsurfgrav ();
  }
}