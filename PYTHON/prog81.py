def Pattern(iRow,iCol):
    cnt=1
    for i in range (1,iRow+1):
        for j in range(1,iCol+1):
            print(cnt,"\t",end="")
            cnt+=1
        print()
        
def main():
    
    print("Enter the Rows:")
    iRows=int(input())
    
    print("Enter the Rows:")
    iCols=int(input())
    
    Pattern(iRows,iCols)
    
if __name__=="__main__":
    main()