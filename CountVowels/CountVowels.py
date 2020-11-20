'''Take a single line text message from user. Separate the vowels from the text. Find the repeating occurrences of vowels from the text message.
Display count of which vowels has repeated how many times.
Display a new text message by removing the vowels characters as output.

Display the output in the exact format shown below in example, after displaying count of characters on next lines display the new text message on next line.
“Hll wlcm” is the next text message.

If text message entered by user does not contain any vowels then display 0 as output.
If text message entered by user contain any numeric value then display 0 as output.
If user entered blank or empty text message display “INVALID INPUT” as output. Message “INVALID INPUT” is case sensitive. Display it in exact format given

Example 1:

Input:
Hello welcome

Output
a : 0
e : 3
i : 0
o : 2
u : 0
Hll wlcm

Example 2:

Input:
Hll wlcm

Output
0'''

#read input
message = input()
msg_list = list(message)
vowels = ['a','e','i','o','u']
result = ""
#If text message entered by user contain any numeric value then display 0 as output
for i in msg_list:
    if i.isdigit():
        print(0)
        exit()

#If user entered blank or empty text message display “INVALID INPUT” as output
if message == "" or message == " ":
    print("INVALID INPUT")
    exit()

#If text message entered by user does not contain any vowels then display 0 as output
if 'a' not in message.lower() and 'e' not in message.lower() and 'i' not in message.lower() and 'o' not in message.lower() and 'u' not in message.lower() :
    print(0)
    exit()
    
#count vowels
for i in vowels:
    count = 0
    for j in msg_list:
        if i == j.lower():
            count += 1
            #eliminate vowels
            msg_list.remove(j)
    print(i+" : "+str(count))  #print count of vowels

#print string message without vowels
for i in msg_list:
    result += i
print(result)
