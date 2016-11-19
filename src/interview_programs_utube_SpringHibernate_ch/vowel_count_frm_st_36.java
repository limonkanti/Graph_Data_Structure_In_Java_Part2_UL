
package interview_programs_utube_SpringHibernate_ch;


public class vowel_count_frm_st_36 
{
     public static void main(String[] args)
     {
         String str="aaalllmoei";
         int vowel=0;
         char ch[]=str.toCharArray();
         for(int i=0;i<str.length();i++)
         {
             if((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u'))
             {
                 vowel++;
             }
         }
         System.out.println("Total no of vowel:\t"+vowel);
     }
    
}
