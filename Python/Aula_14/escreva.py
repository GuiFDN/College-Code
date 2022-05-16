def escreva(msg):
    tamanho = len(msg) #+ 4
    print("-" * tamanho)    # VERIFICA TAMANHO DA MENSAGEM
    print(f"{msg}")         # APRESENTAR MENSAGEM
    print("-" * tamanho)    #


# Programa Principal

texto1 = str (input("Insira um texto 1: "))
texto2 = str (input("Insira um texto 2: "))
texto3 = str (input("Insira um texto 3: "))

escreva(texto1)
escreva(texto2)
escreva(texto3)