
let nums:number[] = [1, 2, 3, 4, 5];
let results: number[] = [];

results[0] = nums[0];

for(let i = 1; i<nums.length; i++){
  results[i] = nums[i] + results[i - 1]; 
}

console.log(results)
  
