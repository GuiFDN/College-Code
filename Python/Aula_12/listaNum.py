lista1 =  []
maior = 0
menor = 0
for c in range (0,5):
    lista1.append (int(input(f"Digite o valor para o posição {c}: ")))
    if c == 0:
        maior = menor = lista1[c]
    else:
        if lista1[c] > maior:
            maior = lista1[c]
        if lista1 [c] < menor:
            menor = lista1[c]
print (f"Você digitou os valores {lista1}")
print (f"O maior valor digitado foi {maior} nas posições ")
for i, v in enumerate (lista1):
    if v == maior:
        print (f"{i}.....")

print (f"O menor valor digitado foi {menor} nas posições ")

for i, v in enumerate (lista1):
    if v == menor:
        print (f"{i}.....")