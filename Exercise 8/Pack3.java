import java.util.ArrayList;
import java.time.LocalDate;

public class Pack3{
    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);
        list.add("Apple");
        list.add("Banana");
        System.out.println(list);
	System.out.println(Math.sqrt(25));
	}
}