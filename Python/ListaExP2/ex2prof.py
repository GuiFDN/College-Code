n1 = input ("digite a quantidade de elementos do primeiro conjunto: ")
l1 = []
for i in range (int(n1)):
    l1.append(input(f'conjunto 1, valor {i+1}: '))

n2 = input ("digite a quantidade de elementos do segundo conjuto: ")
l2 = []
for i in range (int(n2)):
    l2.append (input(f'conjunto 2, valor {i+1}: '))

l3 = []
for i in l1:
    for j in l2:
        if i == j:
            l3.append(i)
print (l3)