function merge(nums1: number[], m: number, nums2: number[], n: number): void {
    nums1.splice(m, n, ...nums2);
    nums1.sort((a, b) => a - b); 
};

/*
testData:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

*/
