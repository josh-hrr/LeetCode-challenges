function removeDuplicates(nums: number[]): number  {
    if (nums.length === 0) {
        return 0;
    }
    
    let k: number = 1; // k represents the length of the unique elements so far

    for (let i: number = 1; i < nums.length; i++) {
        if (nums[i] !== nums[i - 1]) {
            nums[k++] = nums[i];
        }
    } 
    return k;
};
