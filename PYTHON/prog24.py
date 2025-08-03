def Summation(iNo):
    iFact=1
    if(iNo<0):
        return -1
    for i in range(1,(iNo+1)):
        iFact=iFact*i
    return iFact

def main():
    iValue=0
    iRes=0
    iValue=int(input("Enter Number:"))

    iRes=Summation(iValue)
    if(iRes==-1):
        print("Invalid input")
    else:
        print("Summation is:",iRes)
        
if __name__ == "__main__":
    main()