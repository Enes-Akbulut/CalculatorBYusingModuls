import java.util.Scanner;
public class Main {
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static int sub(int a,int b){
        int result =a-b;
        return result;
    }
    static int multi(int a , int b){
        int result = a*b;
        return result;
    }

    static void div(int a , int b){
        System.out.println(a/b);
    }
    static void mood(int a , int b ){
        System.out.println(a%b);
    }
    static int exp(int number, int power ){
        int result=1;
        for (int i =1; i<=power;i++){

            result *=number;
        }
        return result;
    }
    static int fac(int a){
        int result =1 ;
        for( int i=1;i<=a;i++){
                       result *=i;
        }
        return result;
    }

    static void rect(int longEdge,int shortEdge) {
        System.out.println("Area of rectangle: "+ longEdge*shortEdge);
        System.out.println("Perimeter of rectangle"+(2*(longEdge+shortEdge)));

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = "1-Addition\n" +
                "2-Subtraction\n" +
                "3-Multiplication\n" +
                "4-Division\n" +
                "5-Mod\n" +
                "6-Exponential\n" +
                "7-Factorial\n" +
                "8-Perimeter and Area of Rectangle\n " +
                "9-QUIT.";
        System.out.println(menu);

         while (true){
             System.out.print("Select the mathematical operation you want : ");
              int select = input.nextInt();
              if (select==9){
                  break;
              }
             System.out.println("FIRST NUMBER :");
             int x=input.nextInt();
             System.out.println("SECOND NUMBER :");
             int y=input.nextInt();
             switch (select) {
                 case 1:
                     add(x, y);
                     break;
                 case 2:
                     System.out.println(sub(x,y));;
                     break;
                 case 3 :
                     System.out.println(multi(x,y));
                     break;
                 case 4 :
                    div(x,y);
                     break;
                 case 5:
                     mood(x,y);
                     break;
                 case 6:
                     System.out.println(exp(x,y));
                     break;
                 case 7:
                     System.out.println(fac(x));
                     break;
                 case 8 :
                     rect(x,y);
             }
         }



        System.out.println("See you later.");
    }
}