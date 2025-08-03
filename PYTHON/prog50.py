class Demo:
    def __init__(self,iNo):
        self.No=iNo
        
    def DisplayFactors(self):
        iSum=0
        for i in range(1,int(self.No/2)+1):
            if((self.No)%i==0):
                iSum+=i
        return iSum
       
def main():
    
    print("Enter the first Number:")
    iNo=int(input())
    
    dobj=Demo(iNo)
    iRes=dobj.DisplayFactors()
    
    print("Summation of factors is :",iRes)
           
if __name__=="__main__":
    main()