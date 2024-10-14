class Main {
  public static void main(String[] args) {
    //Code to test HighSchoolClass goes here
    HighSchoolCourse m = new HighSchoolCourse("Music", 5);
    HighSchoolCourse d = new HighSchoolCourse("Dance", 89);
    System.out.println(d.checkSpace());
    System.out.println(d.checkSpace(90));

  }
}