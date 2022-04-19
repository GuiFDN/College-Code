numero = int (input("Digite o número inteiro positivo"))
fatorial = 1
while numero > 0:
    fatorial = fatorial * numero
    numero = numero -1
print (f'O fatorial desse número é: {fatorial}')