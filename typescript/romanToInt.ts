function romanToInt(s: string): number {
    const romanValues: { [key: string]: number } = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
    };

    let total: number = 0;
    let prevValue: number = 0;

    for (let i = 0; i < s.length; i++) {
        const char: string = s[i];
        const value: number = romanValues[char];
        
        // If current value is greater than previous value, it means subtraction is needed
        if (value > prevValue) {
            total += value - 2 * prevValue; // Subtracting twice the previous value
        } else {
            total += value;
        }
        
        prevValue = value;
    }

    return total;
}
