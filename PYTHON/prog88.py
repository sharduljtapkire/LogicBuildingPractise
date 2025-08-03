'''
1,4     1,3     1,2     1,1
2,4     2,3     2,2     2,1
3,4     3,3     3,2     3,1
4,4     4,3     4,2     4,1

'''

def Pattern(iRow,iCol):
    if(iRow != iCol):
        print("Invalid input")
        return
    for i in range(1,iRow+1):
        for j in range(iCol,0,-1):
            print(f"{i},{j}\t",end="")
        print("")
    
    
def main():
    print("Enter the Rows:")
    iRows=int(input())
    
    print("Enter the Rows:")
    iCols=int(input())
    
    Pattern(iRows,iCols)
    
if __name__=="__main__":
    main()