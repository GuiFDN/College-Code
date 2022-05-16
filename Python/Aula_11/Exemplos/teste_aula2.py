def existe_par_lista (lista_num):
    cont = 0
    for num in lista_num:
        cont = cont + 1
        if num % 2 == 0:
            return True, cont
        return False, cont

res1, res2 = existe_par_lista ([1, 21, 3, 41, 5, 61, 7, 81, 9 ,101])
print (f'iteracoes: {res2}')
print (f'existe: {res1}')