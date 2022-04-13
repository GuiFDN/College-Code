import random
num1 = random.randint (0,100)
num2 = random.randint (0,100)
user = str(input("Para multiplicar digite M, se quiser somar digite S: "))

if (user == "M"):
  mult = num1 * num2
  print ("A multiplicação de ",num1 ,'e', num2 ,"é", mult )
else:
  (user == "S")
  sum = num1 + num2
  print ("A soma de ",num1, "e", num2,"é", sum )