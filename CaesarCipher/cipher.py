'''The Caesar cipher is a type of substitution cipher in which each alphabet in the plaintext or messages is shifted by a number of places down the alphabet.

For example,with a shift of 1, P would be replaced by Q, Q would become R, and so on.
To pass an encrypted message from one person to another, it is first necessary that both parties have the ‘Key’ for the cipher, so that the sender may encrypt and the receiver may decrypt it.
Key is the number of OFFSET to shift the cipher alphabet. Key can have basic shifts from 1 to 25 positions as there are 26 total alphabets.

As we are designing custom Caesar Cipher, in addition to alphabets, we are considering numeric digits from 0 to 9. Digits can also be shifted by key places.
For Example, if a given plain text contains any digit with values 5 and keyy =2, then 5 will be replaced by 7, “-”(minus sign) will remain as it is.
Key value less than 0 should result into “INVALID INPUT”

Example 1:
Enter your PlainText: All the best
Enter the Key: 1
The encrypted Text is: Bmm uif Cftu

Write a function CustomCaesarCipher(int key, String message) which will accept plaintext and key as input parameters and returns its cipher text as output.'''

def CustomCaesarCipher(key, message):
    l = list(message)   #converted string to list for iteration
    result = ""  #string to store final encrypted message
    # Two lists created one for iterating numbers and second for alphabets
    numbers = [0,1,2,3,4,5,6,7,8,9]
    alphabets = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
    #Loop through each character
    for i in range(0,len(l)):
        #First case:If string contains numbers
        if l[i].isdigit():
            temp = int(l[i]) + key
            result += str(numbers[temp])
        #Second case:If string contains alphabets
        elif l[i].isalpha():
            #Two cases for alphabets: Capital letters and small letters
            if l[i].isupper():
                l[i] = l[i].lower() #because we only have lowercase alphabets in our list
                temp = int(alphabets.index(l[i])) + key
                result += alphabets[temp].upper()
            else:
                temp = int(alphabets.index(l[i])) + key
                result += alphabets[temp]
        #Third case:If string contains characters other than alphabets and numbers
        else:
            result += l[i]
    print(result)

#driver code
msg = input("Enter your Plain Text: ")
key = int(input("Enter the Key: "))

if key<0:
    print("INVALID INPUT")
else:
    CustomCaesarCipher(key,msg)
