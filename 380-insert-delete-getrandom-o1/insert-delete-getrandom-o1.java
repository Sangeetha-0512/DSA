class RandomizedSet {
    private List<Integer> arr;
    private Map<Integer,Integer> map;
    private Random rand;
    public RandomizedSet() {
        arr=new ArrayList<>();
        map=new HashMap<>();
        rand=new Random();
    }
    
    public boolean insert(int val) {
       if(map.containsKey(val)){
        return false;
       } else{
        arr.add(val);
        map.put(val,arr.size()-1);
        return true;
       }
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
        return false;
        }else{
            int index=map.get(val);
            int last=arr.size()-1;
            int lastval=arr.get(last);
            arr.set(index,lastval);
            map.put(lastval,index);
            arr.remove(last);
            map.remove(val);
            return true;
            
        }
    }
    
    public int getRandom() {
        int index=rand.nextInt(arr.size());
        return arr.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */