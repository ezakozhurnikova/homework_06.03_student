package homework_Voter;

public class Main {
    public static void main(String[] args) {
        Voter voter=new Voter("Mark","Berlinerstr.12, 10115,Berlin",35);
        System.out.println("Name: "+voter.getName());
        System.out.println("Address: "+voter.getAddress());
        System.out.println("Age: "+voter.getAge());
        voter.setAge(13);

    }
}
