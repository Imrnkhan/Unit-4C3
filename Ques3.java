import java.util.*;
public class Ques3{
    
    for(String word: wordList)
    {
        String[] str;
        int count;
        for(String temp: str)
        {
            if(word.equals(temp))
            {
                ++count;
            }
        }
        Object longString;
        int longCount;
        if(!(word.equals(longString)))
        {
           System.out.println(word+":"+count); 
        }
        else
        longCount=count;
        count=0;
        boolean flag=false;
        for(String str2 : str)
        {
            if(str2.equals(longString))
            flag=true;
        }
        if(flag==true)
        System.out.println(longString+":"+longCount);
    }
}
}

