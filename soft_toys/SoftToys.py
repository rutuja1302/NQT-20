'''There is a shop of Soft Toys. A shopkeeper arranges the Items on the shelf for display. Customer asks for any Item randomly, either by its name or by its position number.
When Customer places order, Shopkeeper removes those Items from Shelf to sale.
Shopkeeper then rearranges the remaining Items on the shelf such that there is no gap left between Items(and item numbers) on the shelf.
Items are kept in blocks on the shelf rows. Blocks are numbered from 1 to N.

Implement suitable Data Structure with Operations to display Items in order as arranged by shopkeeper.
When customer selects any Item from display, your code should remove it from list of Items and display rearranged Items

Consider the following list of Soft Toys and display is the format of shelf.
SoftToys = ["Giant-Teddy Bear", "Giraffe", "Cat", "Mega-Bear", "Dog", "Lion", "Billy-Bear", "Besty-Bear", "Monkey", "Bobby-Bear", "Bunny-Rabbit", "Benjamin-Bear", "Kung-Fu-Panda",
"Brown-Bear", "Pink-Bear", "Baby-Elephant", "Blue-Fish", "Hippo", "Cute-Pig", "Pikachu", "Doremon", "Tortoise", "Cater-Pillar", "Candy-Doll']
Input will be a string value which is any one of the Soft Toy name or position as displayed on the shelf at the point of time.
1.GIANT-TEDDY-BEAR 2.GIRAFFE 3.CAT 4.MEGA-BEAR 5.DOG 6.​LION 7.BILLY-BEAR 8.BESTY-BEAR 9.MONKEY 10.BOBBY-BEAR 11. BUNNY-RABBIT 12.BENJAMIN-BEAR 13.KUNG-FU-PANDA
14.BROWN-BEAR 15.PINK-BEAR 16.BABY-ELEPHANT 17.BLUE-FISH 18.HIPPO 19.CUTE-PIG 20.PIKACHU 21.DOREMON 22.TORTOISE 23.CATER-PILLAR 24.CANDY-DOLL

Example 1:
Input:
TORTOISE
Output:
1.GIANT-TEDDY-BEAR 2.GIRAFFE 3.CAT 4.MEGA-BEAR 5.DOG 6.​LION 7.BILLY-BEAR 8.BESTY-BEAR 9.MONKEY 10.BOBBY-BEAR 11. BUNNY-RABBIT 12.BENJAMIN-BEAR 13.KUNG-FU-PANDA
14.BROWN-BEAR 15.PINK-BEAR 16.BABY-ELEPHANT 17.BLUE-FISH 18.HIPPO 19.CUTE-PIG 20.PIKACHU 21.DOREMON 22.CATER-PILLAR 23.CANDY-DOLL

Note: The output should be a list printed in above format after removing the item which is sold out. If user give item or position which is not on shelf display "ITEM UNAVAILABLE"
for other wrong input display "INVALID INPUT" as output.
'''

#original list of items
st_og = ["GIANT-TEDDY-BEAR","GIRAFFE","CAT","MEGA-BEAR","DOG","​LION","BILLY-BEAR","BESTY-BEAR","MONKEY","BOBBY-BEAR","BUNNY-RABBIT","BENJAMIN-BEAR ","KUNG-FU-PANDA",
         "BROWN-BEAR","PINK-BEAR","BABY-ELEPHANT","BLUE-FISH","HIPPO","CUTE-PIG","PIKACHU","DOREMON","TORTOISE","CATER-PILLAR","CANDY-DOLL"]
#read input
toy = input()

if toy.isdigit(): #if item number given by customer
    if int(toy)>=1 and int(toy)<=24:
        st_og.pop(int(toy)-1)
        srNo = 1
        for i in st_og:
            print(str(srNo)+"."+i,end=" ")
            srNo += 1
    else:
        print("INVALID INPUT") #if input doesnot exists
elif toy.isupper():  #if we use isaplha() method in place of of isupper() then this elif case will get ignored because there are hyphens used in the names
    st_new = st_og.copy()
    if toy in st_new and toy in st_og:  #if item is present both in the original list and new list created that means the item is on shelf
        st_new.remove(toy)
        srNo = 1
        for i in st_new:
            print(str(srNo)+"."+i,end=" ")
            srNo += 1
    elif toy in st_og:  #if the item is not on shelf but was available earlier
        print("ITEM UNAVAILABLE")
    else:
        print("INVALID INPUT")  #if item doesnot exists
else:
    print("INVALID INPUT") #if input doesnot exists
