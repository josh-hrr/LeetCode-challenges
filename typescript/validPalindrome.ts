function isPalindrome(s: string): boolean { 
    let isPalindrome: boolean = false;
    let cleanedData: string = s.replace(/[^a-zA-Z0-9]/g, ''); 
    let result: string = cleanedData.toLowerCase();
    let reversedResult = result.split('').reverse().join(''); 

    if(reversedResult === result){
        isPalindrome = true;
    }else{
        isPalindrome = false;
    } 
    return isPalindrome;
};
