import string

#==============================
# Função para geração de login
#==============================

def gera_login (nome, sobrenome, ID):
    if len (nome) > 3:
        inicio = nome [:3]
    else:
        inicio = nome

    if len (sobrenome) > 3:
        meio = sobrenome [:3]
    else:
        meio = sobrenome

    if len (ID) > 3:
            fim = ID [-3]
    else:
            fim = ID

    return inicio + meio + fim

#=========================
# Programa Principal
#=========================

nome, sobrenome = input ("Digite o nome e sobrenome: ").lower().split()
pontuacao = string.punctuation
ID = input ("Digite o ID: ")
ID = ID.translate(str.maketrans ('' , '', pontuacao))
login = gera_login (nome, sobrenome, ID)
print (f'\nSeu login na rede é {login}')