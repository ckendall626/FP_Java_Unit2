class Planet {
  
  private int radius; // in meters
  private int mass; // in kilograms x 10^23
  public void setmass (int winter){
    if (3.3 < winter && winter < 24700) {
      mass = winter;
    }
    else {
      System.out.println ("Invalid measurmenets");
    }
  }
  public void setradius (int giselle){
    if (1250 < giselle && giselle < 5.69e+27) {
        radius = giselle;
    }
    else {
      System.out.println ("Invalid measurmenets");
    }
  }
  public double getsurfgrav (){
    double surfgrav = (mass * 6.67e-11)/(radius * radius);
    System.out.println (surfgrav);
    return surfgrav;
  }
}