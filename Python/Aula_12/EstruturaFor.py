from random import randint

a = int(input("Digite um numero: "))
soma = 0

# Criação do laço

for contador in range (a):
    numero_sorteado = randint(1, 10) # sera de 1 a 9
    print(numero_sorteado)
    soma = soma + numero_sorteado
    
print ("A soma é: ",soma)