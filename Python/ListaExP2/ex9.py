#modo 1
def media_rec (lista, i):
    if i == 0:
        return lista[i]
    return (media_rec(lista, i-1) * i + lista[i]) / (i+1)
#modo 2
def media_rec_somando (lista, i):
    if i == 0:
        return lista[0]
    elif (i < len(lista)-1):
        return lista [i] + media_rec_somando(lista, i-1)
    else:
        return (lista[i] + media_rec_somando(lista, i-1)) / len(lista)
#testes
lista = [1, 2, 3, 4, 5]
print (media_rec(lista, len(lista)-1))
print (media_rec_somando(lista, len(lista)-1))