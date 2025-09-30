

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class PartC {

    public static void main(String[] args) {
        add();
    }

    static void add(){

        Scanner sc = new Scanner(System.in);

    
        int id  =sc.nextInt();
        sc.nextLine();
        String name  = sc.nextLine();
        
        try(  BufferedWriter obj = new BufferedWriter(new FileWriter("data.txt", true));) {
          
            obj.write("ID: "+ id+ ", "+ "Name: "+ name);
            System.out.println("Data addedd..su..");
            
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        // finally{

        //     try {
        //         obj.close();
        //     } catch (Exception e) {
        //         // TODO: handle exception
        //     }
          
        // }

    }
}