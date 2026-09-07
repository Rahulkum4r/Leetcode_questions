class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> cd = new HashSet<>();

        for(int num : nums){    // cd variable name ha 
            if(cd.contains(num)){
                return true;
            }

            cd.add(num);
        }
        return false;
    }
}