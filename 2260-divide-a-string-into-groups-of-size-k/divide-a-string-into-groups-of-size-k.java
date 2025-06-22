class Solution {
    public String[] divideString(String s, int k, char fill) {
    ArrayList<String>arr=new ArrayList<>();
    String str=s+"";
    if(s.length()%k!=0){
            int rem=s.length()%k;
            str+=String.valueOf(fill).repeat(Math.abs(k-rem));
        }
    for(int i=0;i<str.length();i+=k){
        String a=str.substring(i,i+k);
        arr.add(a);
    } 
    return arr.toArray(new String[0]);
    }
}