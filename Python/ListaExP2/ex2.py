def intersecao(conjunto1, conjunto2):
    inter = []
    for x in conjunto1:
        for y in conjunto2:
            if x == y:
                inter.append(x)
    return inter


conjunto1 = [1, 2, 3, 4, 5]
conjunto2 = [2, 5, 7, 1, 9, 1, 8]
print (intersecao(conjunto1, conjunto2))