# append () : adiciona um item ao final da lista

cubos = [1, 8 ,27 , 64, 125]

cubos.append (196)
print (cubos)

# pop () : remove o item do final da lista e o retorna

item_que_saiu = cubos.pop()
print (item_que_saiu)

print (cubos) # o número 196 foi tirado da lista

# pos(pos) : remove o item da posição pos da lista
# "pos" é posição, você define que dado de qual posição será tirado da lista

item_da_posicao_2 = cubos.pop(2)
print (item_da_posicao_2)

print (cubos)