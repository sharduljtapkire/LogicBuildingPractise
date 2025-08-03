def Display(iNo):
    if(iNo<0):
        iNo=-iNo
        
    for i in range(-iNo,0+1):
        print(f"{i}\t",end="")
    for i in range(1,iNo+1):
        print(f"{i}\t",end="")
    
def main():
     print("Enter the Number:")
     iValue=int(input())
     
     Display(iValue)
     
if __name__=="__main__":
    main()
    