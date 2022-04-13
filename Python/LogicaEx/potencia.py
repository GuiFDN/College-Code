print ("Digite o expoente")
n = int (input())
print ("Digite a base")
x = float (input())
pot = 1.0
if n != 0:
    if n < 0:
        n = -n
        x = 1/x
    for i in range (1,n+1): #Inferior, de 1 ate o limite n
        pot = pot * x
print (f"potencia = {pot}")