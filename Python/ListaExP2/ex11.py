#para entender o problema:
def divisores_laco(n):
    lista = [1]

# note a otimização para busca
    for i in range(2, int(n/2)+1):
        if n % i == 0:
            lista.append(i)
    lista.append(n)
    return lista

#agora a recursao
def divisores_rec(n, i, lista):
    if n % i == 0:
        lista.append(i)
    if i < n:
        divisores_rec(n, i+1, lista)

#testes
print(divisores_laco(72))
lista=[]
divisores_rec(72, 1, lista)
print(lista)