public class Student {
   private String name;
   private String surname;
    private int id;

    private Teacher teacher;

    public Student(String name, String surname, int id, Teacher teacher) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.teacher = teacher;
    }

    public String getName() {
        return name;

    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
