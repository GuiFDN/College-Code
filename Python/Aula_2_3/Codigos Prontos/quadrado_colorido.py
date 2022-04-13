import turtle

# Constantes
LADO = 300
ESPESSURA = 5
VELOCIDADE = 3

# Criando uma janela
janela = turtle.Screen()
janela.title('Minha tartaruguinha')
janela.bgcolor('lightblue')

# Criando uma tartaruga
petruncio = turtle.Turtle()
petruncio.shape('turtle')
petruncio.pensize(ESPESSURA)
petruncio.speed(VELOCIDADE)

# Desenhando um quadrado colorido
cores = ['purple', 'pink', 'blue', 'red']
for cor in cores:
    petruncio.pencolor(cor)
    petruncio.fd(LADO)
    petruncio.lt(90)

# Fechando a janela
janela.exitonclick()
turtle.TurtleScreen._RUNNING = True