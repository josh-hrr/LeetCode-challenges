function majorityElement(nums: number[]): number { 
    const result: Record<number, number> = {};

    for(const value of nums){
        result[value] =  (result[value] || 0) + 1;
            if(result[value] > nums.length / 2){
                return value;
            }
    }
    return -1; 
};
