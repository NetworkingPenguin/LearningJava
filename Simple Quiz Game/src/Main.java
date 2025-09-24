import java.util.Scanner;

/*
Simple Quiz Game
We need to store at least 10 questions and their answers respectivly
after saving questions we loop throu them and compare answers with
player's answers if comparison is true we incement by 1 score if not
score stays the same at the end we give the score based on how much
score is incremented by 6 = 60%
*/
public class Main{
    public static void main(String[] args){
        int score = 0;
        Scanner myObj = new Scanner(System.in);
        String answer;
        String[][] questions = {
                {"What is closest planet to the Earth?", "Venus"},
                {"What curency is used in Germany?", "Euro"},
                {"From where does CR7 comes from?", "Portugal"},
                {"What flag has red, blue, white and two headed eagle on flag", "Serbia"},
                {"First dog sent to the Space is?", "Laika"},
                {"Which video game microsoft bought from Notch 2014", "Minecraft"},
                {"Which programing language is cosidered to be mother of all languages", "C"},
                {"Name and Surname of Russian president in 2025", "Vladimir Putin"},
                {"Name of main character from Gta San", "Carl"},
                {"Which game developer is most famous on yt space for his game Carlson?", "Dani"}
        };
        System.out.println("***********Welcome to the Simple Quiz Game**********");
        for(int i = 0; i < 10; i++){
            System.out.print(questions[i][0] + "\n");
            answer = myObj.nextLine();
            if(answer.equals(questions[i][1])){
                System.out.println("Question is answered correctly +1 score");
                score++;
            }else{
                System.out.println("Question is answered inccorectly");
            }
        }
        System.out.println("Your Score is: " + score);
    }
}