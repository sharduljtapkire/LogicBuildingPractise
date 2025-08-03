class Demo:
    def __init__(self,iNo):
        self.No=iNo
        
    def CheckEven(self):
       if((self.No%2)==0):
           return True
       else:
           return False

def main():
    
    print("Enter the first Number:")
    iNo=int(input())
    
    dobj=Demo(iNo)
    iRet=dobj.CheckEven()
    
    if(iRet==True):
        print(f"{iNo} it is Even Number")
    else:
        print(f"{iNo} it is not Even Number")
           
if __name__=="__main__":
    main()