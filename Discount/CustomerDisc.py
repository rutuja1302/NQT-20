'''A customer purchases one or more items and gives the respective quantity for each time to be purchased.
Based on the quantity and price of the items, display the final amount after discount. A customer is eligible for 10% discount on total purchase price above Rs. 1000. For total purchase price Rs. 1000, no discount is given.
Check is customer has a membership with the store.
If he is member, then he gets an extra 5% discount on every purchase, but if purchase amount of member is above Rs.1000 then he gets total discount of 15% on purchase price.
For example, if Rajesh does purchase of Rs.1800 which is above Rs.1000 and he is not member of store ge gets discount of 10%.
But, if Rajesh is member of store then he gets total 15% discount on Rs. 1800 since its above Rs.1000, but if he does purchase of Rs.800 which is below Rs.1000 then he gets only discount of 5%.
Given, items and price
Item No      Items         Price
1.           Yoghurt       50
2.           Cheese        100
3.           Mlik          40
4.           Fruit         200
5.           Oil           300
Calculate the actual price customer has to pay.

Example 1:
1 3 5
2 1 6
Y
1649.0INR

Note:
Order of input should be as given in above example
   <ItemNumber> space <ItemNumber> space……
    <Quantity> space <Quantity> space……
    (you can enter any item numbers from 1 to 5 only else display INVALID INPUT)
    {You must enter quantity as many times as to match with ItemNumber entered else
    display INVALID INPUT)
Output format should match with the format'''

price = [50,100,40,200,300]
#read item numbers
items = list(map(int,input().split()))
#read quantities
quant = list(map(int,input().split()))
#read if the customer is a member or not
member = input().upper()
#number of items should be equal to number of quantities
if len(items)!= len(quant):
    print("INVALID INPUT")
    exit()
#Item numbers should exists between 1 to 5 only
for i in items:
    if i<1 or i>5:
        print("INVALID INPUT")
        exit()
#calculate total billing amout
totalBill = 0
for i in range(0,len(items)):
    totalBill += price[items[i]-1]*quant[i]

if totalBill<=1000 and member=="N":
    print(str(float(totalBill))+" INR")
if totalBill<=1000 and member=="Y":
    totalBill = totalBill - totalBill*5/100
    print(str(float(totalBill))+" INR")

if totalBill>1000 and member=="N":
    totalBill = totalBill - totalBill*10/100
    print(str(float(totalBill))+" INR")
if totalBill>1000 and member=="Y":
    totalBill = totalBill - totalBill*15/100
    print(str(float(totalBill))+" INR")
