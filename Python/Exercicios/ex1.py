nome = str(input("Insira o nome de um aluno: "))
media = float(input("Insira a media desse aluno: "))
dicionario = {nome, media}
print (dicionario)

if media >= 6.0:
    print ("Aprovado")
else:
    print ("Reprovado")