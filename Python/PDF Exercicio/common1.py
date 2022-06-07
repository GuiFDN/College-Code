def intersecao(conjuntoA, conjuntoB):
        inter = []
        for x in conjuntoA:
            for y in conjuntoB:
                if x == y:
                    inter.append(x)
        return inter

a = [2,4,6,7,10]
b = [3,4,6,8,10,11]
print(intersecao(a,b))