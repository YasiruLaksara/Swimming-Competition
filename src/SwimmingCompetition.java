import java.util.ArrayList;
import java.util.Scanner;
public class SwimmingCompetition {

     static int Id= 1;
     String name;
     int id_no;


    public void Scoreboard(String name, int id_no) {
        System.out.println("(ID NO : "+ id_no +") " + " " + name + "  is watching the scoreboard.");
    }


    public static void main(String[] args) {

        //Taking User Inputs

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter The Number Of Swimmers:- ");
        int no_swimmers = Scanner.nextInt();

        System.out.println("Enter The Number Of Spectators:- ");
        int no_spectators = Scanner.nextInt();

        System.out.println("Enter The Number Of Judges:- ");
        int no_judges = Scanner.nextInt();

        System.out.println("Enter The Number Of staff:- ");
        int no_staff  = Scanner.nextInt();



        // Creating array lists to store the objects

        ArrayList<Swimmer> swimmers = new ArrayList<>();
        ArrayList<Spectator> spectators = new ArrayList<>();
        ArrayList<Judge> judges = new ArrayList<>();
        ArrayList<Supporting_Staff> staff = new ArrayList<>();


        //Creating relavent  objects and add them to the relavent  array lists

        for (int i = 1; i <= no_swimmers; i++) {
            swimmers.add(new Swimmer("swimmer" + i));
        }

        for (int i = 1; i <= no_spectators; i++) {
            spectators.add(new Spectator("spectator" + i));
        }

        for (int i = 1; i <= no_judges; i++) {
            judges.add(new Judge("judger" + i));
        }

        for (int i = 1; i <= no_staff; i++) {
            staff.add(new Supporting_Staff("supporting staff" + i));
        }


        //Testing by calling relavent method whether programme is running or not

        for (Swimmer x : swimmers){
            x.swim(x.name);
        }
        for (Spectator y : spectators){
            y.Scoreboard(y.name,y.id_no);
        }

        for (Judge z : judges){
            z.blow(z.name);
        }

        for (Supporting_Staff p :  staff){
            p.Scoreboard(p.name,p.id_no);
        }


    }


    static class Swimmer extends SwimmingCompetition {
        public Swimmer(String name) {
            this.name = name;
            this.id_no = Id++;
        }

        public void swim(String name) {
            System.out.println("(ID NO : "+id_no+") " + " " + name + "  is swimming");
        }
    }

    static class Spectator extends SwimmingCompetition {
        public Spectator(String name) {
            this.name = name;
            this.id_no =Id++;
        }
    }

    static class Judge extends SwimmingCompetition {
        public Judge(String name) {
            this.name = name;
            this.id_no = Id++;
        }
        public void blow(String name) {
            System.out.println("(ID NO : "+ id_no +") " + " " + name + "  is blowing the whistle.");

        }
    }

    static class Supporting_Staff extends SwimmingCompetition {
        public Supporting_Staff(String name) {
            this.name = name;
            this.id_no = Id++;
        }
    }
}