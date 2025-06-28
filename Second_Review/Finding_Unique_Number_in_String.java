package Second_Review;

public class Finding_Unique_Number_in_String {
    public static void main(String[] args) {
        String num = "223345577";  
        
        int temp=0;
        char Char =0;
        
        for (int i = 0; i < num.length(); i++) {
            temp = Character.getNumericValue(num.charAt(i));
//            System.out.println(num.charAt(i));
            int count = 0;
            
            for (int j = 0; j < num.length(); j++) {
                if (temp == Character.getNumericValue(num.charAt(j))) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(temp);
                return;
            }
        }}}    



