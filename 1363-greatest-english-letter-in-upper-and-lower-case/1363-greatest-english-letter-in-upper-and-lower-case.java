class Solution {
    public String greatestLetter(String s) {
        int low[]=new int[26];
        int upp[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=97)
            {
                 low[s.charAt(i)-'a']++;
            }
            else{
                upp[s.charAt(i)-'A']++;
        }
        }
        for(int i=25;i>=0;i--)
        {
            if(low[i]>0 && upp[i]>0)
            {
                return Character.toString((char)(i+'A'));
            }
        }
        return "";
    }
}