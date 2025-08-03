def DisplayDigits(iNo):
    
    iDigit=0
    iCount=0
    
    while(iNo != 0):
       iNo=int(iNo/10)
       iCount+=1
    return iCount

def main():
     print("Enter the Number:")
     iValue=int(input())
     
     print(DisplayDigits(iValue))
     
if __name__=="__main__":
    main()
    