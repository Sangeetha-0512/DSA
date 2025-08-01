class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> row=new ArrayList<>();
       for(int i=0;i<n;i++){
        List<Integer> tri=new ArrayList<>();
        int num=1;
        for(int k=0;k<=i;k++){
            tri.add(num);
            num=num*(i-k)/(k+1);
        }
        row.add(tri);
       }
        return row;
    }
}