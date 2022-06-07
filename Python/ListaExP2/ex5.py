def limpa_s2 (s1, s2):
    i=0
    #varrer todas as posições da 1a string
    while i < len(s1):
        #para cada primeira ocorrência de s1[i] em s2
        #pos = posição
        pos = s2.find(s1[i])
        #se encontrou
        if pos > -1:
            # fatia s2, concatenando antes do caractere e depois dele
            s2 = s2[0:pos] + s2[pos+1:]
            #verifica o mesmo caractere de s1, dando um "soluço" no laço externo
            i = i - 1
        i = i + 1
    return s2

print (limpa_s2 ('amor', 'morango'))