public class Teacher extends People{
    Teacher(String nameP, String lastnameP, int ageP){
        super(nameP,lastnameP,ageP);
    }
    void teach(){
        System.out.println(name + " ведёт урок!");
    }
}