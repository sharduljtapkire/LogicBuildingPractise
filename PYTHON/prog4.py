def CalculatePercentage(TotalM,ObtainedM):
    Percentage=0.0
    Percentage=(ObtainedM/TotalM)*100
    return Percentage
    
    
Total=0
Obtained=0
fPer=0

Total=int(input("Enter the Total Marks:\n"))
Obtained=int(input("Enter your Obtained Marks:\n"))

fPer=CalculatePercentage(Total,Obtained)

print(f"Your Percentag is:{fPer:.2f}")