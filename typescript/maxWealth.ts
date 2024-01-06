function maximumWealth(accounts: number[][]): number { 
    let result:number[] = []; 

    for(let i = 0; i<accounts.length; i++){ 
    let sum: number = 0;
        for(let j = 0; j<accounts[i].length; j++){ 
            sum = sum + accounts[i][j]; 
        }  
    result.push(sum);
    }  
    return Math.max(...result);
};
