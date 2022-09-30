def insertionSort(lst):
     for i in range(1, len(lst)):
         x = lst[i]
  
        # Move elements of arr[0..i-1], that are
        # greater than key, to one position ahead
        # of their current position
         j = i-1
         while j >= 0 and x < lst[j] :
                lst[j + 1] = lst[j]
                j -= 1
                lst[j + 1] = x
     return lst
  
n=int(input("enter no of elements:"))
l=[]
for i in range(n):
     ele=int(input("enter element:"))
     l.append(ele)
print(insertionSort(l))
  
