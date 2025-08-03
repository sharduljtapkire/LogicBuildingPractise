def Pattern(iRow,iCol):
    ch=97
    for i in range (1,iRow+1):
        for j in range(1,iCol+1):
                print(chr(ch),"\t",end="")
        print("")
        ch+=1
        
def main():
    
    print("Enter the Rows:")
    iRows=int(input())
    
    print("Enter the Rows:")
    iCols=int(input())
    
    Pattern(iRows,iCols)
    
if __name__=="__main__":
    main()