
package StringProgramms;

import java.util.*;


public class StrFindDupliWordAndNumofOccurences 
{
   static void duplicateWords(String str)
    {
        String words[]=str.split(" ");
        HashMap<String,Integer> wordCount=new HashMap();
        for(String word:words)
        {
            if(wordCount.containsKey(word.toLowerCase()))
            {
                wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
            }
            else
            {
                wordCount.put(word.toLowerCase(), 1);
            }
        }
        
        Set<String> wordsInString=wordCount.keySet();
        for(String word:wordsInString)
        {
            if(wordCount.get(word)>1)
            {
                System.out.println(word+"\t"+wordCount.get(word));
            }
         /*   else
            {
                System.out.println(word+"\t"+wordCount.get(word));
            }*/
        }
    }
   
    
    public static void main(String[] args) 
    {
        duplicateWords("java is Java My java is favourite language");
        
    }
    
}
