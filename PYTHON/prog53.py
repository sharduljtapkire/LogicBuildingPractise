class Demo:
    def __init__(self,iNo):
        self.No=iNo
        
    def SumNonFactors(self):
        iSum1=0
        iSum2=0
        for i in range(1,int(self.No)+1):
            if(((self.No)%i) == 0):
                iSum1+=i
            else:
                iSum2+=i
                            
        return iSum1,iSum2
       
def main():
    
    print("Enter the first Number:")
    iNo=int(input())
    
    dobj=Demo(iNo)
    iRes1,iRes2=dobj.SumNonFactors()
    
    print("Summation of Even factors is :",iRes1)
    print("Summation of non factors is :",iRes2)
           
if __name__=="__main__":
    main()