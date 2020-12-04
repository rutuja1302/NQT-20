'''There is a bunch of keys having key numbers stamped on each key. There may be few duplicate keys in the bunch, i.e., more than one key with same number.
Key numbers are associated with their locks. A lock can be opened with a key which must have the lock's key number, as every lock is designed to be opened with a unique key number.
There is a rare chance of blank keys which are keys without numbers, and no lock can be opened with those keys. Lock does not exists for blank keys.

For given input bunch of keys, find
1. the number of locks
2. the distinct key numbers
3. the number of copies of keys available in bunch for each key number
4. Total number of keys in bunch

Input should be entered as many key numbers as presents in bunch in format of String value and enter <space> to indicate blank keys.
Output should be in the format (for better results)
BLANK KEYS:<count>
TOTAL KEYS:<count>
NUMBER OF LOCKS:<count>

Example 1
Input Values
M012001
P312015
K210111
L0190013
M012002
-
q
Output Values
BLANK KEYS: 1
TOTAL KEYS: 6
NUMBER OF LOCKS:5

Example 2
Input Values
L0190013
Q
Output Values
BLANK KEYS:0
TOTAL KEYS:1
NUMBER OF LOCKS:1
'''

keys = []
#read input keys
while True:
    k = input()
    if k=='q' or k=='Q':
        break
    else:
        keys.append(k)

#count total keys
total = len(keys)
#count blank keys
b = 0
for i in keys:
    if i==" " or i=="-":
        b += 1
        keys.remove(i)

#count distinct keys in order to find number of locks
set_keys = set(keys)

print("BLACK KEYS: "+str(b))
print("TOTAL KEYS: "+str(total))
print("NUMBER OF LOCKS: "+str(len(set_keys)))
