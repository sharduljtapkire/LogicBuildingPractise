'''
0       0       0       *
0       0       *       *
0       *       *       *
*       *       *       *

'''
def Pattern(iRow,iCol):
    for i in range(1,iRow+1):
        for j in range(iCol,1 -1,-1):
            if(i>=j):
                print("*\t",end="")
            else:
                print("0\t",end="")
        print("")
            
     
def main():
    print("Enter the Rows:")
    iRows=int(input())
    
    print("Enter the columns:")
    iCols=int(input())
    
    Pattern(iRows,iCols)
    
if __name__=="__main__":
    main()