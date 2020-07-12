class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null) {
            return null;
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> temp = new ArrayList<>();
            
            // fetch sets that are already present in the result
            for(List<Integer> a : result) {
                temp.add(new ArrayList<Integer>(a));
            }
            
            // add nums[i] to existing sets
            for (List<Integer> a : temp) {
                a.add(nums[i]);
            }
            
            // add nums[i] only as a set
            List<Integer> single = new ArrayList<>();
            single.add(nums[i]);
            temp.add(single);
            
            result.addAll(temp);
        }
        
        // add empty set
        result.add(new ArrayList<Integer>());
        
        return result;
    }
}
