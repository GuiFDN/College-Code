import random
x = random.randint (1, 10)
chute = int (input('Chute um numero entre 1 e 10'))
while chute != x:
    print ('Tente novamente')
    chute = int (input())
print ('Acertou!!!') 