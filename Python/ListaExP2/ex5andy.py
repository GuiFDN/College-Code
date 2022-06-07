s1 = str(input("digite a primeira string: "))
s2 = str(input("digite a segunda string: "))

for x in range (len(s1)):
    s2 = s2.replace(s1[x],"")

print (f'resultado = {s2}, {len(s2)}')