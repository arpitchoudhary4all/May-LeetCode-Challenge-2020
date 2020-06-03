class Solution {
    public int firstUniqChar(String s) {
        int count[]=new int[128];
        for(int i=0;i<s.length();i++){
            count[(int)s.charAt(i)]++;   
        }
        for(int j=0;j<s.length();j++){
            if(count[(int)s.charAt(j)]==1){
                return j;
            }
        }
        return -1;
    }
}
