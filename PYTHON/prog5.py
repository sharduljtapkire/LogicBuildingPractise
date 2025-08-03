def DisplayClass(Percentage):
    if (float(Percentage)<=0.0) or (float(Percentage)>100.0):
        print("Invalid input")
        return
    if(float(Percentage)>0.0) and (float(Percentage)<35.0):
        print("Your Fail")
    elif(float(Percentage)>=35.0) and (float(Percentage)<50.0):
        print("Your Pass")
    elif(float(Percentage)>=50.0) and (float(Percentage)<60.0):
        print("Second Class")
    elif(float(Percentage)>=60.0) and (float(Percentage)<=70.0):
        print("First Pass")
    elif(float(Percentage)>=70.0) and (float(Percentage)<100.0):
        print("First Class with distinction")
    
       
fValue=0.0
fValue=input("Enter your Percentage:\n")

DisplayClass(fValue)