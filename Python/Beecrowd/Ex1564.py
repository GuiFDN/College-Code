x = int(input())

while True:
    try:
        if x <= 0:
            print ('vai ter copa!')
        else:
            print ('vai ter duas!')

    except EOFError:
        break