def entrada ():
    lista = []
    n = int(input('digite uma sequência de números, 0 encerra: '))
    while n>0:
        lista.append(n)
        n = int(input('proximo, 0 encerra: '));
    return lista

def contagem (lista):
    dicionario = {}
    for n in lista:
        if str(n) in dicionario:
            dicionario[str(n)] = dicionario[str(n)] + 1
    else:
        dicionario[str(n)]=1
    return dicionario

def frequencias (dicionario):
    t_maior = dicionario.popitem()
    t_menor = t_maior
    print(t_maior)
    print(t_menor)
    for n, frequencia in dicionario.items():
        if frequencia > t_maior[1]:
            t_maior = (n, frequencia)
        elif frequencia < t_menor[1]:
            t_menor = (n, frequencia)
    return t_maior, t_menor

lista = entrada()
print(lista)
dicionario = contagem(lista)
print(dicionario)
maior, menor = frequencias(dicionario)
print(f'valor com maior frequencia: {int(maior[0])} com {int(maior[1])} vezes')
print(f'valor com menor frequencia: {int(menor[0])} com {int(menor[1])} vezes')