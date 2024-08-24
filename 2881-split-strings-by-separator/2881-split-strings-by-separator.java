class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list=new ArrayList<>();
        String str="["+separator+"]";
        for(int i=0;i<words.size();i++)
        {
        String dot[]=words.get(i).split(str);
    for(int j=0;j<dot.length;j++)
    {
        if(dot[j].length()==0)
        {
            continue;
        }
        list.add(dot[j]);
    }
}
    return list;
    }
}