//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        try {
            j = 20 / i;
        } catch(Exception e){
            j = 20/1;
            System.out.println(j);
            System.out.println("The error is : " + e.getStackTrace());
        }
        System.out.println("Hello");
        }
    }
