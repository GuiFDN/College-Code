lista = []
n = int(input('digite uma sequência de números, 0 encerra: '))
while n>0:
    lista.append(n)
    n = int(input('proximo, 0 encerra: '));
x = int(input('digite o valor da multiplicacao: '))
find=False

for i in range(len(lista)-1):
    for j in range(i+1,len(lista)):
        if lista[i] * lista[j] == x:
            achou = True
            print (f'{lista[i]} e {lista[j]}')
if not find:
    print ('a lista não contém tais números')