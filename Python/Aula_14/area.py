def área (larg, comp):
    a = larg * comp
    print (f'A área de um terreno é {larg} x {comp} = {a} m²')

# Programa Principal

print ('Controle de Terrenos')
print ('-' * 30)
larg = float (input('Largura (m²): '))
comp = float (input('Comprimento: '))
área (larg, comp)