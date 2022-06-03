info_trabalhador = dict()

nome_trabalhador = input ("Digite seu nome: ")
data_nascimento = input ("Digite sua data de nascimento: ")
idade_trabalhador = int (input ("Digite sua idade atual: "))
numero_ctps = int (input ("Digite seu número da carteira de trabalho: "))

info_trabalhador ["Nome"] = nome_trabalhador
info_trabalhador ["Nascimento"] = data_nascimento
info_trabalhador ["Idade"] = idade_trabalhador
info_trabalhador ["CTPS"] = numero_ctps

# Considerando aposentadoria com 65 anos

if numero_ctps != 0:
    data_contratacao = input("Digite sua Data de Contratação: ")
    trabalhador_salario = float(input("Digite seu Salário: R$ "))
    
    info_trabalhador ["Data de Contratação"] = data_contratacao
    info_trabalhador ["Salário"] = trabalhador_salario
    ano_aposentadoria = float(65 - idade_trabalhador)
    info_trabalhador ["Anos até Aposentadoria"] = ano_aposentadoria

print(info_trabalhador)