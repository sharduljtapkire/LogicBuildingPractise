def CountEvenDigits(iNo):
    
    iDigit=0
    iCount=0
    
    while(iNo != 0):
        iDigit=iNo%10
        if((iDigit%2)==0):
            iCount+=1   
        iNo=int(iNo/10) 
    return iCount

def main():
     print("Enter the Number:")
     iValue=int(input())
     
     print("Number of even digits are",CountEvenDigits(iValue))
     
if __name__=="__main__":
    main()
    