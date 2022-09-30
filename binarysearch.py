def binarysearch(l,low,high,key):
    if low<=high:
        mid=(low+high)//2
        if l[mid]==key:
            return mid
        elif l[mid]<key:
            return binarysearch(l,mid+1,high,key)
        else:
            return binarysearch(l,low,mid-1,key)
    return -1
lst=[]
num=int(input("enter no of elements:"))
for i in range(num):
    ele=int(input("enter element:"))
    lst.append(ele)
key=int(input("enter element to be found:"))
l=0
h=num-1
result=binarysearch(lst,l,h,key)
if result==-1:
    print("element not found:")
else:
    print("element found at  index:",result+1)
    
        