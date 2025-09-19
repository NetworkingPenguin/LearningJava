import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        
        //deklerisanje potrebnih variabli za program
        int prviBroj;
        int drugiBroj;
        int rezultat;
        char odabir;
        Scanner myObj = new Scanner(System.in);

        System.out.println("*********Kalkulator********");
        System.out.println("Unesite Prvi broj:");
        prviBroj = myObj.nextInt();
        System.out.println("Ukucali ste broj: " + prviBroj);

        System.out.println("Unesite drugi broj: ");
        drugiBroj = myObj.nextInt();
        System.out.println("Ukucali ste broj: " + drugiBroj);
    
        System.out.println("Unesite znak operacije koju zelite obaviti: + - * /");
        odabir = myObj.next().charAt(0);
        System.out.println("Izabrali ste: " + odabir);
    
        switch(odabir){

            case '+':
            rezultat = prviBroj + drugiBroj;
            System.out.println("Rezultat od " + prviBroj + " + " + drugiBroj + " = " + rezultat);
            break;

            case '-':
            rezultat = prviBroj - drugiBroj;
            System.out.println("Rezultat od " + prviBroj + " - " + drugiBroj + " = " + rezultat);
            break;

            case '*':
            rezultat = prviBroj * drugiBroj;
            System.out.println("Rezultat od " + prviBroj + " * " + drugiBroj + " = " + rezultat);
            break;

            case '/':
            if(prviBroj == 0 || drugiBroj == 0){
                System.out.println("Nula se nemoze dijeliti");
                break;
            }else{
                rezultat = prviBroj / drugiBroj;
                System.out.println("Rezultat od " + prviBroj + " / " + drugiBroj + " = " + rezultat);
                break;
            }
            
        }
    }
}