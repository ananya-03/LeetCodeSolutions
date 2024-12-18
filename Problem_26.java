class Solution {
    public int removeDuplicates(int[] nums) {    
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);
        //int expectedNums[] = new int[nums.length];
        Set<Integer> keys = map.keySet();
        System.out.println(keys);  
          // Convert Set to Integer[]
            Integer[] expectedNumsArray = keys.toArray(new Integer[0]);
            System.out.println("Integer Array: " + Arrays.toString(expectedNumsArray));
            // Convert Integer[] to int[]
            int[] expectedNums = Arrays.stream(expectedNumsArray).mapToInt(Integer::intValue).toArray();
            System.out.println("int Array: " + Arrays.toString(expectedNums)); 
            for(int i=0;i<expectedNums.length;i++)
            {
                nums[i]=expectedNums[i];
            }    
        return map.size();
    }
}
