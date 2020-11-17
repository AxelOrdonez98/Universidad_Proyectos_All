import pygame
from pygame.locals import *
import sys
import os
#constantes
SCREEN_WIDTH = 640
SCREEN_HEIGHT = 480
#clases y funciones
#funcion principal del juego
def main():
    pygame.init()
    #crear ventana y titulo
    screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT))
    pygame.display.set_caption("Basico PyGame")
    #fondo de la ventana y la imagen principal (crea objetos de tipo Surface)
    fondo = pygame.image.load("/home/atzel/Documentos/Universidad_Proyectos_All/Archivos_Python/Game/fondo.jpeg").convert()
    tux = pygame.image.load("/home/atzel/Documentos/Universidad_Proyectos_All/Archivos_Python/Game/tux.png").convert_alpha()
    #posicion de tux (pinguino)
    tux_pos_x = 550
    tux_pos_y = 200
    #crea esa madre de fondo
    screen.blit(fondo, (0,0))
    screen.blit(tux, (tux_pos_x, tux_pos_y))
    #se muestra los cambios en la pantalla
    pygame.display.flip()
    #bucle principal del juego
    while True:
        #restaura el borde del pinguino para que no salga
        tux_pos_x = tux_pos_x - 1
        if tux_pos_x < 1:
            tux_pos_x = 550
        #crea esa madre de fondo
        screen.blit(fondo, (0,0))
        screen.blit(tux, (tux_pos_x, tux_pos_y))
        #se muestra los cambios en la pantalla
        pygame.display.flip()

if __name__ == "__main__":
    main()