import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HashSet<Integer> numbers=new HashSet<Integer>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(10);
        numbers.add(2);
        System.out.println(numbers);
        for (int i=1; i<=10; i++){
            if (numbers.contains(i)){
                System.out.println(i  + "  was found in the set");}
                else{
                System.out.println(i +  "  was not found in the set");
            }
            }
        }
    }
