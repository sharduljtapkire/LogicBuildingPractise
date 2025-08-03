def CaculateTicket(Age):
    iprice=0
    if(Age<=0):
        return -1   #chages
    if((Age>0) and (Age<=5)):
        iprice=0
    elif((Age>5) and (Age<=18)):
        iprice=700
    elif((Age>18) and (Age<=50)):
        iprice=999
    elif((Age>50)):
        iprice=500
        
    return iprice #good way to return the value
    
Age=0
Res=0

Age=int(input("Entert Your Age:"))

Res=CaculateTicket(Age)

if(Res==-1):
    print("Unable to calculate the Ticket")
else:
    print("Your Ticket Price is:",Res)


    