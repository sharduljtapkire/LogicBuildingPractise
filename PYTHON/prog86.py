'''
*       *       *       *
*                       *
*                       *
*       *       *       *

'''
def Pattern(iRow,iCol):
    if(iRow!=iCol):
        print("Invalid input")
        return
    for i in range (1,iRow+1):
        for j in range(1,iCol+1):
           if(j==i):
               print("*\t",end="")
           else:
               print(i,"\t",end="")
        print()
        
def main():
    
    print("Enter the Rows:")
    iRows=int(input())
    
    print("Enter the Rows:")
    iCols=int(input())
    
    Pattern(iRows,iCols)
    
if __name__=="__main__":
    main()
    
