class Solution {
    public int numJewelsInStones(String J, String S) {
        if(J.length() == 0 || S.length() == 0) return 0;
        HashMap<Character, Integer> freqStone = new HashMap<>();
        for( char s : S.toCharArray()) {
            freqStone.put(s, freqStone.getOrDefault(s, 0)+1);
        }
        int count = 0;
        for(char j : J.toCharArray()) {
        if(freqStone.containsKey(j)) {
            count += freqStone.get(j);
        }
        }
        return count;
    }
}
