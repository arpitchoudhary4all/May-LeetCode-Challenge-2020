class Solution {
    public int findComplement(int num) {
        char[] binary = Integer.toBinaryString(num).toCharArray();
        StringBuffer compliment = new StringBuffer();
        for(int i=0;i<binary.length;i++){
            compliment.append(binary[i]=='0'?"1":"0");
        }
        return Integer.parseInt(compliment.toString(),2);
    }
}
