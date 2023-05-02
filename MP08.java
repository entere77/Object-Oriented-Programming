class Student{
    String name;
    int number;
    double gpa;

    Student(String name, int number, double gpa){
        this.name = name;
        this.number = number;
        this.gpa = gpa;
    }

    String getName(){
        return name;
    }

    int getNumber() { return number; }

    double getGPA() { return gpa; }

    public String toString(){
        return "Name: " + getName() +", Number: " + getNumber() + ", GPA: " + getGPA();
    }
}

class StudentDB{
    int i=0;
    Student[] students = new Student[3];

    enum FindGPAParam { LOWER_THAN, HIGHER_THAN; }

    StudentDB(){
    }

    void add(Student student){
        students[i] = student;
        i++;
    }

    void add(String name, int number, double gpa){
        Student student = new Student(name,number,gpa);
        students[i] = student;
        i++;
    }

    Student findBy(String name){
        if(name == students[0].name) {return students[0]; }
        else if(name == students[1].name) { return students[1]; }
        else if(name == students[2].name) { return students[2]; }
        else { return null; }
    }

    Student findBy(int number){
        if(number == students[0].number) {return students[0]; }
        else if(number == students[1].number) { return students[1]; }
        else if(number == students[2].number) { return students[2]; }
        else { return null; }
    }

    Student findBy(double gpa){
        if(gpa == students[0].gpa) {return students[0]; }
        else if(gpa == students[1].gpa) { return students[1]; }
        else if(gpa == students[2].gpa) { return students[2]; }
        else { return null; }
    }

    Student findBy(FindGPAParam param, double gpa) {
        if (param == FindGPAParam.LOWER_THAN) {
            for (int i = 0; i < 3; i++) {
                if (students[i].gpa < gpa) {
                    return students[i];
                }
            }
        }

        else if(param == FindGPAParam.HIGHER_THAN) {
            for (int i = 0; i < 3; i++) {
                if (students[i].gpa > gpa) {
                    return students[i];
                }
            }
        }
        return students[i];
    }
}

public class MP08 {
    public static void main(String[] args){
        StudentDB DB = new StudentDB();
        Student student1 = new Student("김지우",201911111,4.01);
        DB.add(student1);
        DB.add("이민준",201922222,3.85);
        DB.add("박서윤",201933333,3.90);
        System.out.println(DB.findBy("김지우"));
        System.out.println(DB.findBy(201922222));
        System.out.println(DB.findBy(3.90));
        System.out.println(DB.findBy(StudentDB.FindGPAParam.LOWER_THAN,3.95));
        System.out.println(DB.findBy(StudentDB.FindGPAParam.HIGHER_THAN,3.95));
    }
}
