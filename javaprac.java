import java.util.Scanner;
class UserInp{
      public static void main(String[] args){
             Scanner scn = new Scanner(System.in);
             String name=scn.nextLine();
	     String dept =scn.nextLine();
	     int rol_no =scn.nextInt();
             System.out.println("My name is "+ name +", roll no: "+ rol_no+" and I'm from "+ dept +" department");
      }
}
,