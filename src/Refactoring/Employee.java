package Refactoring;

class Employee{
    String name;
    String id;
    int grade;
    String position;
    String certification;

    public Employee(String name, String id, int grade,String position, String certification) {
      this.name = name;
      this.id = id;
      this.grade = grade;
      this.position = position;
      this.certification = certification;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
