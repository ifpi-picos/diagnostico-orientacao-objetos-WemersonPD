public class Main {
  public static void main(String[] args) {
    Teacher jesiel = new Teacher("Jesiel");
    CourseSubject web1 = new CourseSubject("Web 1", jesiel);
    CourseSubject web2 = new CourseSubject("Web 2", jesiel);

    Course course = new Course("Web Moderno");

    course.addSubject(web1);
    course.addSubject(web2);
  }
}
