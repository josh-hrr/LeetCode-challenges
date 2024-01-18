function isPalindrome(x: number): boolean { 
    let isValid = false;
    const testReversed = x.toString().split("").reverse().join(""); 

    if(x === (parseInt(testReversed))){
    isValid = true;
    }else{
    isValid = false;
    }

    return isValid;
};
