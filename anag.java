import java.util.Scanner;

public class anag {
    static boolean isAnagram(String a, String b) {   
        char aa[] = a.toLowerCase().toCharArray();
        char bb[] = b.toLowerCase().toCharArray();
        if(a.length() != b.length()){
            return false;
        }else{
            java.util.Arrays.sort(aa);
            java.util.Arrays.sort(bb);
            return java.util.Arrays.equals(aa, bb);
        }
    }
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER FIRST STRING:");
        String a = scan.next();
        System.out.println("ENTER SECOND STRING:");
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
