def Pattern(iRow,iCol):
    ch=65
    ch1=97
    for i in range (1,iRow+1):
        for j in range(1,iCol+1):
            if ((i%2)==0):
                print(chr(ch),"\t",end="")
            else:
                print(chr(ch1),"\t",end="")
        print("")
        ch+=1
        ch1+=1
        
def main():
    
    print("Enter the Rows:")
    iRows=int(input())
    
    print("Enter the Rows:")
    iCols=int(input())
    
    Pattern(iRows,iCols)
    
if __name__=="__main__":
    main()