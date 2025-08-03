def CaculateTicket(Age):
    if(Age<=0):
        return -1   #chages
    if((Age>0) and (Age<=5)):
        return 0
    elif((Age>5) and (Age<=18)):
        return 700
    elif((Age>18) and (Age<=50)):
        return 999
    elif((Age>50)):
        return 500
    
Age=0
Res=0

Age=int(input("Entert Your Age:"))

Res=CaculateTicket(Age)

if(Res==-1):
    print("Unable to calculate the Ticket")
else:
    print("Your Ticket Price is:",Res)


    