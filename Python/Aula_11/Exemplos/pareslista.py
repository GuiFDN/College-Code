def pares_na_lista (lista_num):
    pares = [] # variável local
    for num in lista_num:   
        if num % 2 == 0:
            pares.append (num) # note que aqui temos um método
    return pares
print (pares_na_lista ([1 , 2 , 3 , 4 , 5 , 6]))

#ouuuu

lista_num = pares_na_lista([ 1, 3, 5, 7 ]) # note o escopo da variável

print(lista_num)