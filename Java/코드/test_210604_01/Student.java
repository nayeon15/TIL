package test_210604_01;

public class Student {

        public int id;
        public String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student student = (Student) obj;
            return student.name.equals(name) && student.id == id;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode()+id;
    }

}
