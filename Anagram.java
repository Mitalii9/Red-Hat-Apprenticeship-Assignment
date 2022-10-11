import java.util.*;

public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Input first string
        System.out.print("Enter 1st string:");
        String str1= sc.next();

        //Input second string
        System.out.println("Enter 2nd String:");
        String str2= sc.next();

        //function call to check anagram
        boolean ans= checkAnagram(str1,str2);
        System.out.println(ans);
    }

    //funtion to check anagram
    public static boolean checkAnagram(String str1,String str2){

        //if both string have different lengths,then they can't be anagrams
        if(str1.length()!=str2.length()){
            return false;
        }

        //Storing the character count of each string in hashmaps
        HashMap<Character,Integer> hm1 =new HashMap<>();
        HashMap<Character,Integer> hm2 =new HashMap<>();
        for(int i=0;i<str1.length();i++){
            hm1.put(str1.charAt(i),
                    hm1.getOrDefault(str1.charAt(i),0)+1);
            hm2.put(str2.charAt(i),
                    hm2.getOrDefault(str2.charAt(i),0)+1);
        }

        //if the character count of both string are equal then they are anagrams
        if(hm1.equals(hm2)){
            return true;
        }
        else{
            return false;
        }
    }
}

//Time Complexity:O(N)
//Space Complexity:O(N)
