num1 = int(input("Entre com o valor inicial: "))
num2 = int(input("Entre com o valor final: "))
soma = 0

# Laço de repetição

for montana in range (num1, num2 + 1):
    if montana %2 == 0:
        soma = soma + montana

print ("A soma é: " ,soma)