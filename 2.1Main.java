class Main {
  public static void main(String[] args) {

    String[] names = new String[4];
    names[0] = "Ruth";
    names[1] = "PB";
    names[2] = "Hank";
    names[3] = "Minji";
    System.out.println(names.length); //prints amount of elements in the array
    System.out.println(names); // reference value is 49476842. does not change when names are changed

    String[] newArray = new String[4];
    newArray = names;
    names [3] = "Fenway";
    for (String value : names){
      System.out.println(value); // prints each element in the array bc its in a for loop so it will go through the entire list and repeat the code array.length times
    }
    int y = 0;
    int[] numArr1 = {1,2,3,4,5,6};
    int[] numArr2 = {2,3,4,5,6,7};
    for (int i = 0; i < numArr1.length; i++){
      System.out.println(numArr1[i] + numArr2[i]);
      y += numArr1[i] + numArr2[i];
      
    }
    System.out.println (y);

    Dog [] doggies = new Dog [3];
    doggies[0] = new Dog ();
    Dog h = doggies[0];
    h.size = 7;
    h.breed = "golden retirver";
    h.name = "Hyein";
    doggies[1] = new Dog ();
    Dog m = doggies[1];
    m.size = 2;
    m.breed = "shiba inu";
    m.name = "Minnie"; 
    doggies[2] = new Dog ();
    Dog w = doggies [2];
    w.size = 19;
    w.breed = "doberman";
    w.name = "Wonyoung";
    for (int i = 0; i < doggies.length; i++){
      Dog answ = doggies[i];
      System.out.println (answ.breed);
      System.out.println (answ.name);
      System.out.println (answ.size);
      answ.bark();
    }
    
  }
}