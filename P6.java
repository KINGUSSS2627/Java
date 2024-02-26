import java.util.Date;

public class P6 {
    public static void main(String[] args) {

        Date s = new Date();
        String date = s.toString();
        String day = date.substring(0, 3);

        if (day != "Sat" && day != "Sun") {
            System.out.println("Work Hard");
        } else if (day == "Sat") {
            System.out.println("Take Some Rest");
        } else {
            System.out.println("Ready for war");
        }
    }
}
