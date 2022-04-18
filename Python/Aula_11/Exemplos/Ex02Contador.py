num = 100
contador_pares = 0
while num <= 200:
    if num % 2 == 0:  # % mostra resto da divisão, quando resto for 0 ele é par
        contador_pares = contador_pares + 1
    num = num + 1
print (contador_pares)