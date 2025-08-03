def SumDigits(iNo):
    
    iDigit=0
    iSum=0
    
    while(iNo != 0):
        iDigit=iNo%10
        iSum=iSum+iDigit
        iNo=int(iNo/10) 
    return iSum

def main():
     print("Enter the Number:")
     iValue=int(input())
     
     print("Sum of Digits are:",SumDigits(iValue))
     
if __name__=="__main__":
    main()
    