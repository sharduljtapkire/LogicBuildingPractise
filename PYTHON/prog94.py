'''
 *       *       *       *
         *       *       *
                 *       *
                         *
 

Time complexity 
'''

def Pattern(iRow,iCol):
    for i in range (1,iRow+1):
        for j in range(1,i):
          print(" \t",end="")
        for j in range(1,(iCol+2)-i):
          print("*\t",end="")
        print()
        
def main():
    
    print("Enter the Rows:")
    iRows=int(input())
    
    print("Enter the columns:")
    iCols=int(input())
    
    Pattern(iRows,iCols)
    
if __name__=="__main__":
    main()
    