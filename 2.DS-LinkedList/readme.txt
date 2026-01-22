Array is a contiguous block of memory, allowing us to store the values of same type next to each other. 
Suppose we define an array of size 4. the values are, 2,3,4,5. Now if you want to add the new value next to each other then it is not possible because you have already define the array of size 4 then how can you add one or more values to the same data.
In memor there is something called memory manager, when you told you need the array of 4 int data type, it has assign you some memory, if you request to expand then memory manager will be like there is some element next to the data soo we cannot, or some cases it might. The only possible solution is to copy the old data and paste it into the new size of 5 array which is costly and time consuming. 
Real like situations be like, ek serving tray hai toh usme 4 cup rakhne ki jagah hai, ab 2 aur cup rakh nahi sakte hai, hme nayi badi tray leni hogi, fir usme ke purane 4 cup uthar kar nayi tray mai rakhege aur 2, aur purani tray ko dhulna hoga vapas se

So array ki iss limitations ko overcome krne ke liye we have 2nd data structure called linked list - that stores the value and plus the pointer of the next value. 

Time complexity are:-
                                    Arrays          LL
Access                               O(1)           O(n)
Insertion at beginning               O(n)           O(1)
insertion in middle and end          O(n)           O(n)
deletion at beginning                O(n)           O(1)
deletion in middle                   O(n)           O(n)  
deletion at end                      O(1)           O(n)  
searching                            O(n)           O(n)

In short, array is fast for accessing and slow for insertion and deletion while linked list is slow for access and fast for insertion and deletion.


Arrays Vs linked lists
1- Cost of accessing an element - Arrays has 1 plus pt here. 
in arrays the values are stored in one contiguous block of memory that is next to each other, so suppose that we have a group of students in one class having 10 students and we want to see where the second child is sitting then it is easy, we just need to see where the first or base student is sitting and then after that the second child while be sitting. 
However in Linked List, the value is stored as one node. Suppose we got a list of toppers of a school and we need to find the 2nd topper, then we need to know the class of the second topper, and then we will be able to find the 2nd topper from a bunch of students. 


2- Memory requirements - Linked list has 1 plus pt here.
Array is of fixed size, so when we need to increase the size of the original array, we copy the og array into a new array that has some values of og array, and some new values plus some unused memory for storing some new values in future. 
While LL, is stored has one, so when we need to store the second, we can store it anywhere, only the address of this second element will be stored as a pointer in the first element. Though pointers take some memory. 

Arrays are stored in one contiguous block of memory, so maybe for adding the new element we may not find memory adjacent to the previous og array. while for LL, memory is available in multiple small blocks

3- cost of insertion elements

At beginning :- for arrays it is o(N) because we need to shift the other elements by one, where LL will take constant time, 
at middle :- for both it will be O(n)
at end :- for both it will O(n)

4- ease of use:- 
arrays are lot easier to manage and LL has segmentations, pointers management so a little less.