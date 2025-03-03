import java.util.*;

public class patterns{
    public static void starDiamond(int n){
        int spaceprint1 = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=spaceprint1; j++){ 
                System.out.print("  ");
            }
            spaceprint1 --;
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            for(int l=1; l<=i-1; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int spaceprint2 = 2;
        for(int i=n; i>1; i--){
            for(int j=1; j<=spaceprint2; j++){ 
                System.out.print("  ");
            }
            spaceprint2 ++;
            for(int k=1; k<=i-1; k++){
                System.out.print("* ");
            }
            for(int l=1; l<=i-2; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numDiamond(int n){
        int spaceprint1 = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=spaceprint1; j++){
                System.out.print("  ");
            }
            spaceprint1 --;
            int num = 1;
            for(int k=1; k<=i; k++){
                System.out.print(num + " ");
                num ++;
            }
            num -= 2;
            for(int l=1; l<i; l++){
                System.out.print(num + " ");
                num --;
            }
            System.out.println();
        }
        int spaceprint2 = 2;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=spaceprint2; j++){
                System.out.print("  ");
            }
            spaceprint2 ++;
            int num = 1;
            for(int k=1; k<i; k++){
                System.out.print(num + " ");
                num ++;
            }
            num -= 2;
            for(int l=1; l<i-1; l++){
                System.out.print(num + " ");
                num --;
            }
            System.out.println();
        }
    }

    public static void letterDiamond(int n) {
        int spaceprint1 = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=spaceprint1; j++){
                System.out.print("  ");
            }
            spaceprint1 --;
            char letter = 'A';
            for(int k=1; k<=i; k++){
                System.out.print(letter + " ");
                letter ++;
            }
            letter -= 2;
            for(int l=1; l<i; l++){
                System.out.print(letter + " ");
                letter --;
            }
            System.out.println();
        }
        int spaceprint2 = 2;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=spaceprint2; j++){
                System.out.print("  ");
            }
            spaceprint2 ++;
            char letter = 'A';
            for(int k=1; k<i; k++){
                System.out.print(letter + " ");
                letter ++;
            }
            letter -= 2;
            for(int l=1; l<i-1; l++){
                System.out.print(letter + " ");
                letter --;
            }
            System.out.println();
        }
    }
    public static void main(String  args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter '1' to print star diamond");
        System.out.println("Enter '2' to print num diamond");
        System.out.println(("Enter '3' to print letter diamond"));

        int pattern = sc.nextInt();
        if(pattern == 1) {
            starDiamond(n);
        } else if (pattern == 2){
            numDiamond(n);
        } else if(pattern == 3){
            letterDiamond(n);
        } else {
            System.out.println("invalid code");
        }
    }
}