public class Lab8 {
    public static void main(String[] args) {
        People people =  new People("Dulustan","Fedorov",22);
        people.walk();
        people.run();
        people.voice();
        Student student = new Student("Ayal","Popov",22);
        student.walk();
        student.learn();
        Teacher teacher = new Teacher("Grigoriy","Mikhaylov",22);
        teacher.voice();
        teacher.teach();
    }
}