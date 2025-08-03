def Display(iNo):
    for i in range(1,iNo+1):
        print("*\t",end="")
    
def main():
     print("Enter the Number:")
     iValue=int(input())
     
     Display(iValue)
     
if __name__=="__main__":
    main()
    