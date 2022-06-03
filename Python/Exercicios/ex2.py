import random

jog1 = random.randint(0,6)
jog2 = random.randint(0,6)
jog3 = random.randint(0,6)
jog4 = random.randint(0,6)

lista = ["Jogador 1 tirou:", jog1, "Jogador 2 tirou:", jog2, "Jogador 3 tirou:" , jog3, "Jogador 4 tirou:", jog4]
dicionario = {jog1, jog2, jog3, jog4}

lista2 = [jog1, jog2, jog3, jog4]

print (lista)
print (sorted(dicionario, reverse = True))
    
largest_number = max(lista2)
print ("Ganha o jogador que tirou o número:", largest_number)