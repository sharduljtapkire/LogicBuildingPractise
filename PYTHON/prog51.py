class Demo:
    def __init__(self,iNo):
        self.No=iNo
        
    def DisplayNonFactors(self):
        iSum=0
        for i in range(1,(self.No)+1):
            if(((self.No)%i) != 0):
                print("Non factor are:",i)
       
def main():
    
    print("Enter the first Number:")
    iNo=int(input())
    
    dobj=Demo(iNo)
    dobj.DisplayNonFactors()
           
if __name__=="__main__":
    main()