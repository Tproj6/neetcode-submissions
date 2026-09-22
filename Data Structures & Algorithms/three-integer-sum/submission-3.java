class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int a = nums[i];

            // Skip duplicate a
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {

                // Skip duplicate b
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int b = nums[j];

                for (int k = j + 1; k < n; k++) {

                    // Skip duplicate c
                    if (k > j + 1 && nums[k] == nums[k - 1]) {
                        continue;
                    }

                    int c = nums[k];

                    if (a + b + c == 0) {
                        res.add(Arrays.asList(a, b, c));
                    }
                }
            }
        }

        return res;
    }
}
