package interview_programs_utube_SpringHibernate_ch;

public class remove_dupliChar_from_string_13 {

    public static void main(String[] args) 
    {
        String s="liimonio";
        int n=s.length();
        char ch;
        String ans="";
        for(int i=0;i<n;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                ans=ans+ch;
                s=s.replace(ch,' ');
            }
        }
        System.out.println(ans);

    }
}
