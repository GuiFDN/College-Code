import turtle
import math

# Constantes
LADO = 400
ALTURA = math.sqrt(3)*LADO/2
VELOCIDADE = 0
ESPESSURA = 5
COR_JANELA = 'lightblue'
COR_TRIANG = 'white'
COR_LINHA = 'black'

# Criação da janela
janela = turtle.Screen()
janela.bgcolor(COR_JANELA)
janela.title('Triângulos')

# Criação do objeto tartaruga
don = turtle.Turtle()
don.hideturtle()
don.color(COR_LINHA)
don.speed(VELOCIDADE)
don.pensize(ESPESSURA)

# Movimentando para ponto de início
# O baricentro do triângulo equilátero está na origem da tela
don.penup()
don.goto(-LADO/2, -ALTURA/3)

# Desenhando o primeiro triângulo
don.pendown()
for lado in range(3):
    don.fd(LADO)
    don.lt(120)

# Desenhando o segundo triângulo
don.fillcolor(COR_TRIANG)
don.begin_fill()
don.fd(LADO)
don.goto(0, 0)
don.goto(-LADO/2, -ALTURA/3)
don.end_fill()

# Fechando a janela
janela.exitonclick()
turtle.TurtleScreen._RUNNING = True