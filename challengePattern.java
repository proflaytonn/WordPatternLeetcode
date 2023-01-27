package NewDumpFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class challengePattern {
    public boolean getResult(){
        //leetcode : https://leetcode.com/problems/word-pattern/description/

        //String pattern = "abba";
       // String pattern = "aaaa";
        String pattern = "abba";
        //String s = "dog cat cat dog";
        //String s = "dog cat cat fish";
        //String s = "dog cat cat dog";
        String s = "dog dog dog dog";

        char[] patternArray = pattern.toCharArray();
        String[] stringArray = s.split(" ");
        Map temp = new HashMap();
        List temp2 = new ArrayList<>();

        if(patternArray.length != stringArray.length)
        {
            return false;
        }

        for(int i = 0 ; i < patternArray.length ; i++)
        {
            //for(int j = i ; j<stringArray.length ; j++)
            //{
                if(!temp2.contains(stringArray[i]))
                {
                    temp2.add(stringArray[i]);
                }
                else if(temp2.contains(stringArray[i]) && !temp.containsKey(patternArray[i]))
                {
                    return false;
                }

                if(!temp.containsKey(patternArray[i]))
                {
                    temp.put(patternArray[i], stringArray[i]);
                    //break;
                }
                else {
                    if(!temp.get(patternArray[i]).equals(stringArray[i]))
                    {
                        return false;
                    }
                }
           // }
        }
        return true;
    }

    public static void main(String[] args) {
        challengePattern a = new challengePattern();
        System.out.println(a.getResult());
    }
}
