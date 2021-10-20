class CourseSubject {
  private String name;
  private Teacher teacher;

  CourseSubject(String name, Teacher teacher) {
    this.name = name;
    this.teacher = teacher;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Teacher getTeacher() {
    return this.teacher;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }
}