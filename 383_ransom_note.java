class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    HashMap<Character,Integer> bucket = new HashMap<>();
    char[] a = ransomNote.toCharArray();
    char[] b= magazine.toCharArray();
    for(int i=0;i<b.length;i++){
        bucket.put(b[i],bucket.getOrDefault(b[i],0)+1);

    }
    for(int i=0;i<a.length;i++){
        if(!bucket.containsKey(a[i]) || bucket.get(a[i])==0)
        return false;
        bucket.put(a[i],bucket.get(a[i])-1);
    }
    return true;
    }
}