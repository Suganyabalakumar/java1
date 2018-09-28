import java.util.*;
public class ConsonantOrVowel{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        if(Character.isLetter(n)){
        if(n=='a' || n=='e'|| n=='i'||n=='o'||n=='u'||n=='A' || n=='E'|| n=='I'||n=='O'||n=='U')
      {
          System.out.println("Vowel");
          
      }
      else if((n!='a' || n!='e'|| n!='i'||n!='o'||n!='u'||n!='A' || n!='E'|| n!='I'||n!='O'||n!='U'))
      {
            System.out.println("Consonant");
      }
        }
     else
     {
            System.out.println("invalid");
      
     }
     }
     
}
