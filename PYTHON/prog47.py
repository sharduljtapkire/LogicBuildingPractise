class Demo:
    def __init__(self,iNo1,iNo2):
        self.No1=iNo1
        self.No2=iNo2
        
    def Addition(self):
        iAns=0
        iAns=self.No1+self.No2
        return iAns

def main():
    
    print("Enter the first Number:")
    iNo1=int(input())
    
    print("Enter the Second Number:")
    iNo2=int(input())
    
    dobj=Demo(iNo1,iNo2)
    iRet=dobj.Addition()
    
    print("Summation is:",iRet)
    
if __name__=="__main__":
    main()