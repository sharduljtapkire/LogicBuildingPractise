class Demo:
    def __init__(self,iNo):
        self.No=iNo
        
    def Reverse(self):
        iRev=0
        iDigit=0
        while(self.No!=0):
            iDigit=self.No%10
            iRev=(iRev*10)+iDigit
            self.No=int(self.No/10)
        return iRev
       
def main():
    
    print("Enter the first Number:")
    iNo=int(input())
    
    dobj=Demo(iNo)
    iRes=dobj.Reverse()
    
    print("Reverse Number is :",iRes)
           
if __name__=="__main__":
    main()