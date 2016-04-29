import java.util.Scanner;

/**
 * Created by thejp on 4/28/2016.
 */
public class Main
{
    public static void main(String[] args) throws InterruptedException
    {


        // points 1 set
        int onex;
        int oney;
        int onez;
        //Points 2 set
        int twox;
        int twoy;
        int twoz;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first x");
        onex = s.nextInt();
        System.out.print("Enter the first y");
        oney = s.nextInt();
        System.out.print("Enter the first z");
        onez = s.nextInt();

        //Set one has been grabbed
        //Begin set 2

        System.out.print("Enter the second x");
        twox = s.nextInt();
        System.out.print("Enter the second y");
        twoy = s.nextInt();
        System.out.print("Enter the Second z");
        twoz = s.nextInt();
        System.out.print("Caluclating...");
        if(checkcoords(onex,oney,onez,twox,twoy,twoz)){
            System.out.print("These are within 10 (units) of each other!");
        }
        if(!checkcoords(onex,oney,onez,twox,twoy,twoz)){
            System.out.print("These are not within 10 (units) of each other!");
        }
    }

    public static Boolean checkcoords(int onex, int oney, int onez, int twox, int twoy, int twoz ){

        int checksone = 0; //To record wat matches

        if(onex - 10 == twox || onex + 10 == twox) {
            checksone++;
        }

        if(oney - 10 == twoy || oney + 10 == twoy) {
            checksone++;
        }
        if(onez - 10 == twoz || onez + 10 == twoz) {
            checksone++;
        }
        System.out.print(checksone);
        if(checksone == 3){
            return true;
        }
        return  false;
    }
}
