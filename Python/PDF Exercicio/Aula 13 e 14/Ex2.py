#===============================
# Função para valiação da senha
#===============================

def valida_senha (senha):
    COMP_SENHA = 7
    if len (senha) >= 7:
        upper_ok = any(char.isupper() for char in senha)
        lower_ok = any(char.islower() for char in senha)
        dig_ok = any(char.isdigit() for char in senha)
    else:
        return False
    return upper_ok and lower_ok and dig_ok


#=========================
# Programa Principal
#=========================

senha = input ("Digite sua senha")
while not valida_senha(senha):
    print ("Erro: Senha Inválida")
    senha = input ("Digite sua senha")
print ("Senha Válida")