function longestCommonPrefix(strs: string[]): string {
    if (strs.length === 0) {
        return "";
    } 
     const referenceStr = strs[0];

     for (let i = 0; i < referenceStr.length; i++) {
         for (let j = 1; j < strs.length; j++) {
             if (referenceStr[i] !== strs[j][i]) {
                return referenceStr.substring(0, i);
            }
        }
    }
 
     return referenceStr;
};
