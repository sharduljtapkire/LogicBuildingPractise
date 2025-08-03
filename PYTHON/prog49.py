class Demo:
    def __init__(self,iNo):
        self.No=iNo
        
    def DisplayFactors(self):
        for i in range(1,int(self.No/2)+1):
            if((self.No)%i==0):
                print("Factors are:",i)
       

def main():
    
    print("Enter the first Number:")
    iNo=int(input())
    
    dobj=Demo(iNo)
    dobj.DisplayFactors()
    
           
if __name__=="__main__":
    main()