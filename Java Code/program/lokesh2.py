class ParenthesesValidator:
    def is_valid(self, s: str) -> bool:
        stack = []
        # Dictionary to map closing brackets to their corresponding opening ones
        bracket_map = {')': '(', '}': '{', ']': '['}

        # Iterate over each character in the string
        for char in s:
            # If it's a closing bracket
            if char in bracket_map:
                # Pop the top of the stack or a dummy value if the stack is empty
                top_element = stack.pop() if stack else '#'
                
                # Check if the popped element is the corresponding opening bracket
                if bracket_map[char] != top_element:
                    return False
            else:
                # It's an opening bracket, push it onto the stack
                stack.append(char)

        # If the stack is empty, all brackets were matched correctly
        return not stack

# Test the class
validator = ParenthesesValidator()

# Examples
print(validator.is_valid("()"))         # Output: True
print(validator.is_valid("()[]{}"))     # Output: True
print(validator.is_valid("(]"))         # Output: False
print(validator.is_valid("({[)]}"))     # Output: False
print(validator.is_valid("{{{"))        # Output: False
