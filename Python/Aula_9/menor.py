# Ler 2 valores e exibi-los em ordem crescente
def crescente (x, y):
    if x <= y:
        return x, y
    else:
        return y, x

# Principal
a = int (input('Digite um inteiro: '))
b = int (input('Digite outro inteiro: '))
menor, maior = crescente (a,b)
print (f'valores em ordem crescente: {menor}, {maior}, ')