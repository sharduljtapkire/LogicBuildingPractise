class Demo:
    def __init__(self,iNo):
        self.No=iNo
        
    def SumNonFactors(self):
        iSum=0
        for i in range(1,int(self.No)+1):
            if(((self.No)%i) != 0):
                iSum+=i
        return iSum
       
def main():
    
    print("Enter the first Number:")
    iNo=int(input())
    
    dobj=Demo(iNo)
    iRes=dobj.SumNonFactors()
    
    print("Summation of non factors is :",iRes)
           
if __name__=="__main__":
    main()