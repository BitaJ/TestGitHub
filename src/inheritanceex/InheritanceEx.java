package inheritanceex;

public class InheritanceEx {

    public static void main(String[] args) {

        Person student1 = new Student();
        student1.setName("Ida");
        student1.setAge(25);
        student1.setAdress("Göteborg, Linnvägen7");
        ((Student) student1).setProgram("Java utvecklare");
        ((Student) student1).addGrade(20);
        ((Student) student1).calculateAverageGrade();
        Student.setSchoolName("KTH");
    }
}
