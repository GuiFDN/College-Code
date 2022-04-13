n = input().split()
e = int(n[0])
f = int(n[1])
c = int(n[2])


valor = e + f
sai = True
refrigerante = 0
resto = 0
while sai == True:
    if valor >= c:
        refrigerante = refrigerante + valor/c
        resto = (valor % c) + resto
        valor = valor/c
        if resto >= valor:
            refrigerante = int (refrigerante + valor/resto)
    else:
        sai = False

print (int(refrigerante))