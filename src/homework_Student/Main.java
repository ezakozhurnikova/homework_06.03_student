package homework_Student;

public class Main {
    public static void main(String[] args) {
        Student first=new Student();
        first.name="Tomas";
        first.number=1;
        System.out.println("First student is "+first.name+" and his number is "+first.number);

        Student second=new Student();
        second.name="Mark";
        second.number=2;
        System.out.println("Second student is "+second.name+" and his number is "+second.number);

        Student third=new Student("Helene",3);
        System.out.print("Third student is " + third.name);
        System.out.println(" and her number is " + third.number);

        Student fourth=new Student("Maria",4);
        System.out.print("Fourth student is " + fourth.name);
        System.out.println(" and her number is " + fourth.number);


    }
}
