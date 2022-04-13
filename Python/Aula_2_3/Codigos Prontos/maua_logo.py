import turtle
import math

# Cosntantes
LADO = 600
VELOCIDADE = 0
ESPESSURA = 5
COR_JANELA = 'white'
COR_QUAD = 'blue'
COR_CIRC = 'white'

# Criação da janela
janela = turtle.Screen()
janela.bgcolor(COR_JANELA)
janela.title('Mauá Forever')

# Criação do objeto tartaruga
don = turtle.Turtle()
don.hideturtle()
don.color(COR_QUAD)
don.speed(VELOCIDADE)
don.pensize(ESPESSURA)

# Movimentando para ponto de início
don.penup()
don.goto(-LADO/2, -LADO/2)

# Desenhando o quadrado
don.pendown()
don.fillcolor(COR_QUAD)
don.begin_fill()
for lado in range(4):
    don.fd(LADO)
    don.lt(90)
don.end_fill()

# Desenhando o círculo
don.penup()
don.goto(0, -LADO/2)
don.pendown()
don.pencolor(COR_CIRC)
don.fillcolor(COR_CIRC)
don.begin_fill()
don.circle(LADO/2)
don.end_fill()

# Desenhando o quadradio interno
don.penup()
don.goto(0, 0)
don.color('blue')
don.rt(135)
don.fd(LADO/2)
don.pendown()
don.lt(135)
don.fillcolor(COR_QUAD)
don.begin_fill()
for lado in range(4):
    don.fd(LADO*math.sqrt(2)/2)
    don.lt(90)
don.end_fill()

# Desenhando o círculo interno
don.penup()
don.fd(LADO*math.sqrt(2)/4)
don.pendown()
don.pencolor(COR_CIRC)
don.fillcolor(COR_CIRC)
don.begin_fill()
don.circle(LADO*math.sqrt(2)/4)
don.end_fill()

# Fechando a janela
janela.exitonclick()
turtle.TurtleScreen._RUNNING = True