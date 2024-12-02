/*Here is a clear explanation of the code snippet you’ve provided:

---

### **Purpose of the Code**
This program generates a specific sequence of numbers based on the inputs provided. It takes several test cases, and for each test case, it computes a sequence using the formula:

\[
\text{term}_{j} = a + b \cdot (2^0 + 2^1 + \dots + 2^j)
\]

For each test case:
1. \( a \) is the starting value.
2. \( b \) is the multiplier.
3. \( n \) is the number of terms to generate.

---

### **Code Walkthrough**

1. **Import Statements**:
   ```java
   import java.util.*;
   import java.io.*;
   ```
   - `java.util.*`: Includes the `Scanner` class for input handling.
   - `java.io.*`: May be intended for future file handling (unused here).

2. **Main Method**:
   ```java
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
   ```
   - `Scanner scanner = new Scanner(System.in);` creates a `Scanner` object to read input from the console.

3. **Number of Test Cases**:
   ```java
   int t = scanner.nextInt();
   ```
   - `t` represents the number of test cases the program will process.

4. **Processing Each Test Case**:
   ```java
   for (int i = 0; i < t; i++) {
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       int n = scanner.nextInt();
   ```
   - For each test case:
     - `a`: The starting value.
     - `b`: The multiplier for the series.
     - `n`: The number of terms to generate.

5. **Generating the Sequence**:
   ```java
   int term = a;  
   for (int j = 0; j < n; j++) {
       term += (int) (Math.pow(2, j) * b);   
       System.out.print(term + " ");  
   }
   ```
   - **Initialization**: Start with `term = a`.
   - **Inner Loop**:
     - For each term in the sequence, calculate \( b \cdot 2^j \), where \( j \) is the term index (starting from 0).
     - Add this value to `term` and print it.
   - `System.out.print(term + " ");` outputs each term in the sequence separated by spaces.

6. **After the Sequence**:
   ```java
   System.out.println();
   ```
   - Prints a newline after the sequence for the current test case.

7. **Closing the Scanner**:
   ```java
   scanner.close();
   ```
   - Ensures that the `Scanner` resource is properly released.

---

### **Example Input and Output**

#### **Input**:
```
2
5 3 5
0 2 3
```
- `2`: Number of test cases.
- Test Case 1: \( a = 5 \), \( b = 3 \), \( n = 5 \).
- Test Case 2: \( a = 0 \), \( b = 2 \), \( n = 3 \).

#### **Execution**:
**Test Case 1**:
- Sequence: \( 5 + 3 \cdot 2^0, 5 + 3 \cdot (2^0 + 2^1), 5 + 3 \cdot (2^0 + 2^1 + 2^2), \dots \)
- Result: \( 8, 14, 26, 50, 98 \).

**Test Case 2**:
- Sequence: \( 0 + 2 \cdot 2^0, 0 + 2 \cdot (2^0 + 2^1), 0 + 2 \cdot (2^0 + 2^1 + 2^2) \).
- Result: \( 2, 6, 14 \).

#### **Output**:
```
8 14 26 50 98
2 6 14
```

---

### **Key Points**
1. **Logic**:
   - \( \text{term}_{j} = a + b \cdot (2^0 + 2^1 + \dots + 2^j) \).
   - Efficiently generates each term using `Math.pow(2, j)`.

2. **Dynamic Input Handling**:
   - Reads multiple test cases and processes each independently.

3. **Output**:
   - Prints sequences inline for each test case, separated by newlines.

4. **Efficiency**:
   - Works efficiently for moderate values of \( n \), \( a \), \( b \), and \( t \). 

This program is a good exercise in nested loops, input handling, and basic mathematical computations in Java.import java.util.*;*/
import java.io.*;

import java.util.Scanner;

public class pow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int t = scanner.nextInt();

    
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            int term = a;  
            
            
            for (int j = 0; j < n; j++) {
                term += (int) (Math.pow(2, j) * b);   
                System.out.print(term + " ");  
            }
            
            System.out.println();  
        }
        
        scanner.close();
    }
}