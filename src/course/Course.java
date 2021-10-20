import java.util.ArrayList;
import java.util.List;

class Course {
  private String name;
  private List<CourseSubject> subjects;

  Course(String name) {
    this.name = name;
    this.subjects = new ArrayList<>();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<CourseSubject> getSubjects() {
    return this.subjects;
  }

  public void addSubject(CourseSubject subject) {
    this.subjects.add(subject);
  }

  public void removeSubject(CourseSubject subject) {
    this.subjects.remove(subject);
  }

  public void getSubjectByIndex(int index) {
    this.subjects.get(index);
  }

}