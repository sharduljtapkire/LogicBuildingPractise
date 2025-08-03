'''
*
*       *
*       *       *
*       *       *       *
 
 
Time complexity O(n/2)
'''

def Pattern(iRow,iCol):
    for i in range (1,iRow+1):
        for j in range(1,i+1):
          print("*\t",end="")
        print()
        
def main():
    
    print("Enter the Rows:")
    iRows=int(input())
    
    print("Enter the Rows:")
    iCols=int(input())
    
    Pattern(iRows,iCols)
    
if __name__=="__main__":
    main()
    