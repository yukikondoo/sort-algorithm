public class studentProfile {
    String name;
    String major;
    double gpa;
    int expectedGraduateYear;

    public void incrementGraduateYear(){
        if (expectedGraduateYear > 2026){
            System.out.println("He is not a university student" + expectedGraduateYear++);
        }
        this.expectedGraduateYear = this.expectedGraduateYear +1;
        
    }

    public studentProfile(String name, String major, double gpa, int expectedGraduateYear){
        this.name = name;
        this.major = major;
        this.gpa = gpa;
        this.expectedGraduateYear = expectedGraduateYear;
    } 

    public static void main (String[] args){
        studentProfile studentA = new studentProfile("Yuki", "Computer Science", 2.8, 2027);
        studentProfile studentB = new studentProfile("Hannah", "German Literature", 4.0, 2022);

        studentA.incrementGraduateYear();

        System.out.println(studentA.name);
        System.out.println(studentB.major);
        


    }
    
}
