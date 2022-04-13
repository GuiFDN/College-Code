# Import the modules
import turtle
import random
# Create a screen
wn = turtle.Screen()       
wn.bgcolor('lightblue')
# Create four turtles
Michelangelo = turtle.Turtle()    
Rafael = turtle.Turtle()
Donatelo = turtle.Turtle()
Leonardo = turtle.Turtle()
# Turtle colors
Michelangelo.color('orange')
Rafael.color('red')
Donatelo.color('purple')
Leonardo.color('blue')
# Turtle shapes
Michelangelo.shape('turtle')
Rafael.shape('turtle')
Donatelo.shape('turtle')
Leonardo.shape('turtle')
# Move the turtles to their starting point
Michelangelo.up()
Michelangelo.goto(-250,80)
Rafael.up()  
Rafael.goto(-250,40)                
Donatelo.up()
Donatelo.goto(-250,-40)
Leonardo.up()
Leonardo.goto(-250,-80)
# Start your engines!
for step in range(100):
    Michelangelo.forward(random.randrange(1,10))
    Rafael.forward(random.randrange(1,10))
    Donatelo.forward(random.randrange(1,10))
    Leonardo.forward(random.randrange(1,10))
wn.exitonclick()

turtle.TurtleScreen._RUNNING = True