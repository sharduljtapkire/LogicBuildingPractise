def Display(iRow,iCol):
    for i in range(1,iRow+1):
        for j in range(1,iCol+1):
            print("@\t",end="")
        print("")
    
    
    
def main():
    print("Enter number of Rows:")
    iRow=int(input())
    
    print("Enter number of Rows:")
    iCol=int(input())
    
    Display(iRow,iCol)
    
if __name__=="__main__":
    main()