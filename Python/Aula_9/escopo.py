def soma (a, b):
    resultado = a + b
    return resultado

def subtracao (num1, num2):
    resultado = num1 - num2
    return resultado

# Programa principal

num1 = float (input('Digite o primeiro valor: '))
num2 = float (input('Digite o segundo valor: '))
resultado = soma (num1, num2)
print (f'A soma é {resultado}')
resultado = subtracao (num1, num2)
print (f'A subtração é {resultado}')

print ("soma = " + soma(34,56))

print ("soma = " + soma(soma (23, 45), soma (3, 4)))