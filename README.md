# Test

## Task Requirements

1. Create an application which allows a 4-12 digit PIN to be entered on screen (System IME into a text box is fine)
2. Once PIN entry is complete, generate a [ISO-1 (Format 1)](https://www.eftlab.com/knowledge-base/261-complete-list-of-pin-blocks-in-payments/)
3. Once PIN Block computation is complete, display the PIN Block to screen
4. The application should support config-changes gracefully


5. Bonus points - generate a [ISO-3 (Format 3)](https://www.eftlab.com/knowledge-base/261-complete-list-of-pin-blocks-in-payments/) PIN Block (using a hardcoded PAN of `1111222233334444`) instead of ISO-1.
## Useful code (for ISO-3 PIN Block only)

 ```
 private fun setHiNibbleValue(value: Byte): Byte = (0xF0 and (value.toInt() shl 4)).toByte()
 private fun setLowNibbleValue(value: Byte): Byte = (0x0F and value.toInt()).toByte()
 ```

## What we are looking for

- Clean, readable code
- We are **not** looking at UI design
- Unit Tests are a plus
- Automated UI tests are a plus

## How to submit

Please provide a link to the private git repository on GitHub and send an invitation to the GitHub user `mpp-michalk` with admin access. 
