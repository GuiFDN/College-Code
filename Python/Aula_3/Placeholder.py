# Utiliza o operador % para injetar strings em qualquer lugar do código
# % é o operador de formatação de strings nesse contexto

print ('Note a inserção de %s bem aqui' %'algo') # 'algo' foi injetado no codigo print

print ('Basta utilizar %s ou %s operadores, para inserir várias strings.' %('um', 'mais'))

x, y = 'variaveis', 'várias'
print ('Você também pode utilizar %s para inserir %s strings' %(x,y))

print ('Veja a %s para tab.' %'sequencia de scape \t')
print ('Agora veja a diferenca de representacao da %r, utilizando a outra representacao.' %'sequencia de scape \t')

# %s converte qualquer coisa em string pura
# %r entrega a representação textual de um objeto, incluindo aspas e as sequências scape

# %d converte números para inteiros, sem arrendondar

print ('Um valor convertido para string, sem formatação específica: %s,' %12.345)
print ('Agora sua parte inteira: %d' %12.345)

# %f é utilizado para float: %m.n --> m é o total de dígitos, n é o número de dígitos depois da vírgula

print ('numero de ponto flutuante: %5.2f' %12.345)
print ('numero de ponto flutuante: %1.0f ' %12.345)
print ('numero de ponto flutuante: %1.5f ' %12.345)
print ('numero de ponto flutuante: %10.2f ' %12.345)
print ('numero de ponto flutuante: %0.2f ' %12.345)