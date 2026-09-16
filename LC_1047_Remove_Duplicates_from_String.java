https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/solutions/8525045/stack-recursionsimple-stack-approachremo-0tj3

Intuition
Use a StringBuilder like a stack. If the current character matches the last character, remove it. Otherwise, append it.

Approach
Traverse the string recursively.
Compare the current character with the last character.
If equal, remove the last character.
Otherwise, append the character.
Complexity
Time complexity: O(n)
Space complexity: O(n)
Code
class Solution {

    public String removeDuplicates(String s) {

        StringBuilder newstr = new StringBuilder("");

        helper(s, 0, newstr);

        return newstr.toString();
    }

    private void helper(String s, int idx, StringBuilder newstr) {

        if (idx == s.length()) {
            return;
        }

        char currentChar = s.charAt(idx);

        if (newstr.length() > 0 &&
            newstr.charAt(newstr.length() - 1) == currentChar) {

            newstr.deleteCharAt(newstr.length() - 1);

        } else {
            newstr.append(currentChar);
        }

        helper(s, idx + 1, newstr);
    }
}
