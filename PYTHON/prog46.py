class Demo:
    def Addition(self,iNo1,iNo2):
        iAns=0
        iAns=iNo1+iNo2
        return iAns

def main():
    
    print("Enter the first Number:")
    iNo1=int(input())
    
    print("Enter the Second Number:")
    iNo2=int(input())
    
    dobj=Demo()
    iRet=dobj.Addition(iNo1,iNo2)
    
    print("Summation is:",iRet)
    
if __name__=="__main__":
    main()