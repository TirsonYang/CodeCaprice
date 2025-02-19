package HashTable;

public class IsHappy202 {
    public static boolean isHappy(int n){
        int m=n;
        while(true){
            String str=String.valueOf(m);
            int sum=0;
            for (int i = 0; i < str.length(); i++) {
                sum=sum+(str.charAt(i)-'0')*(str.charAt(i)-'0');
            }
            m=sum;
            if (sum==1){
                return true;
            } else if (sum==n) {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
