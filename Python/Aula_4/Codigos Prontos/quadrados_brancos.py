import turtle
import math

# Constantes
LADO = 200
VELOCIDADE = 0
ESPESSURA = 5
COR_JANELA = 'lightblue'
COR_QUAD = 'white'
COR_LINHA = 'black'

# Criação da janela
janela = turtle.Screen()
janela.bgcolor(COR_JANELA)
janela.title('Quadrados brancos')

# Criação do objeto tartaruga
don = turtle.Turtle()
don.hideturtle()
don.color(COR_LINHA)
don.speed(VELOCIDADE)
don.pensize(ESPESSURA)

# Movimentando para ponto de início
don.penup()
don.goto(-LADO*math.sqrt(2), 0)

# Desenhando o primeiro quadrado
don.pendown()
don.fillcolor(COR_QUAD)
don.rt(45)
don.begin_fill()
for lado in range(4):
    don.fd(LADO)
    don.lt(90)
don.end_fill()

# Desenhando o segundo quadrado
don.penup()
don.goto(0, 0)
don.pendown()
don.color(COR_LINHA)
don.fillcolor(COR_QUAD)
don.begin_fill()
for lado in range(4):
    don.fd(LADO)
    don.lt(90)
don.end_fill()

# Fechando a janela
janela.exitonclick()
turtle.TurtleScreen._RUNNING = True