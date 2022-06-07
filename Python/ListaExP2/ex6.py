#modo 1
def media (lista):
    return sum(lista)/len(lista)
#modo 2
def media_laco (lista):
    soma = 0
    cont = 0
    for i in lista:
        soma = soma + i
        cont = cont + 1
    return soma/cont
#testes
lista = [1, 2, 3, 4, 5]
print (media(lista))
print (media_laco(lista))