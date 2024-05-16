import java.util.HashMap;
import java.util.Scanner;

public class son {

    public static  String get(){
        String hello = "hello";
        return "hello";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       HashMap<String,String> dic=new HashMap<String,String>();
        dic.put("user1","12345");
        dic.put("user2","12465");
        dic.put("user3","12123");
        dic.put("user4","12123");
        dic.put("user5","123212");
        dic.put("user6","123422");
        System.out.print("nhap vao user: ");
        String username=scanner.nextLine();
        System.out.print("nhap vao pass: ");
        String Password=scanner.nextLine();
        boolean check=true;
        for (String i: dic.keySet()){
            String checkuserpass=dic.get(i);
            if(username.equals(i) && Password.equals(checkuserpass)){
                System.out.print("mat khau dung");
                break;
            }else{
                check=false;
            }
        }
        if(!check){
            System.out.print("mat khau sai");
        }


    }
}
