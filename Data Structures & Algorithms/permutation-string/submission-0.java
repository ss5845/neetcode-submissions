class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        nt[] target = new int[26];
        for(char c : s1.toCharArray()) {
            target[c - 'a']++;
        }
        for(int i = 0, j = i + s1.length(); j < s2.length(); i++,j++){
            int[] comp = new arr[26];
            for(int k = i; k < j; k++) {
                comp[s2.charAt(k) - 'a']++;
            }
            if(Arrays.equals(target, comp)) return true;
        }
    }
    return false;
}
