def Display(iNo,ch):
    if(iNo<0):
        iNo=-iNo
        
    for i in range(1,iNo+1):
        print(f"{i}\t{ch}\t",end="")
    
def main():
     print("Enter frequency:")
     iValue=int(input())
     
     print("Enter character :")
     cValue=(input())
     
     Display(iValue,cValue)
     
if __name__=="__main__":
    main()
    