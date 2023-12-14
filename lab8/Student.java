public class Student extends People{
    Student(String nameP, String lastnameP, int ageP){
        super(nameP,lastnameP,ageP);
    }
    void learn(){
        System.out.println(name + " посещает занятия!");
    }
}