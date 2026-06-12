# 136. Single Number

## Approach

Use the XOR (`^`) operator.

Properties of XOR:

- `a ^ a = 0`
- `a ^ 0 = a`

Since every element appears twice except one, XORing all elements cancels out the duplicates and leaves the unique number.

## Complexity

- Time Complexity: O(N)
- Space Complexity: O(1)

## Code

```java
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            ans ^= num;
        }

        return ans;
    }
}
```
