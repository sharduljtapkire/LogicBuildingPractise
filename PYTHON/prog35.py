def CheckPrime(iNo):
    if(iNo<0):
        iNo=-iNo
    
    for i in range(2,int(iNo/2)+1):
        if((iNo%i)==0):
            break
 
    if i >= (int(iNo/2)):
        return True
    else:
        return False

def main():
    
    print("Enter number : ")
    iValue = int(input())

    iRes=CheckPrime(iValue)
    
    if(iRes==True):
        print(f"{iValue} is Prime Number")
    else:
        print(f"{iValue} is not Prime Number")

if __name__ == "__main__":
    main()    