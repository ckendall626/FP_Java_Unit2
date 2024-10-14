public class HighSchoolCourse {
  final String name;
  int numStudents;
  int yearsOffered;
  int coursenum;
  private static int numCourses;
  final static int Max_students = 20;
// start refers to just setting the variables for distinction
  public HighSchoolCourse(String startname, int startnumStudents)  {
    name = startname;
    yearsOffered = 0;
    coursenum = (int) (Math.random()* 9999);
    numCourses ++;
    if (startnumStudents > 0 && startnumStudents <= Max_students) {
      numStudents = startnumStudents;
    } 
    else {
      throw new RuntimeException("Too many students");
    }
    // to make sure we always generate a 4 digit number
    if (coursenum < 1000) {
      coursenum = coursenum + 1000;
    }
    System.out.println(name +  coursenum + ": " + numStudents + " students");
    
  } //the this () method invokes another constructor within a different constructor. However, I do not think it will work between these two just because of the arrangements
    public HighSchoolCourse (String startname) {
      name = startname;
      numStudents = 0;
      numCourses ++;
      System.out.println (numStudents);
      
    }
  // overloading methods
  public int checkSpace (){
    return numStudents;
  }
  public int checkSpace (int numSpots){
    int availability = numSpots - numStudents;
    if (availability < 0){
      System.out.println ("The number of Students has exceeded the maximum number of spots available");
    } 
    return availability;
  }
 public static int getnumCourses (int inputnumCourses) {
   numCourses = inputnumCourses;
   return numCourses;
 }
  }

