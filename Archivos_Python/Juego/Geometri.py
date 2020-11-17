import pygame
from pygame.locals import *
import time

pygame.init()

SCREEN_WIDTH = 1500
SCREEN_HEIGHT = 800

screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT))
pygame.display.set_caption("Jueguito uwu")
pantalla = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT))

reloj = pygame.time.Clock()

x = 150
y = 700
width = 50
height = 50

marcaje = 0

tux_pos_x = 1500
tux_pos_y = 700

tux2_pos_x = 1950
tux2_pos_y = 700

tux3_pos_x = 1500
tux3_pos_y = 700

fondo = pygame.image.load(
    "/home/atzel/Documentos/Universidad_Proyectos_All/Archivos_Python/Juego/Img/fondo.jpg").convert()
screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT))

isJump = False
jumpCount = 11
inicio = False

fuente = pygame.font.Font(None, 50)

run = True

SONIDO_RECORRIDO = "/home/atzel/Documentos/Universidad_Proyectos_All/Archivos_Python/Juego/Songs/Nyan_Cat.ogg"
SONIDO_INICIO = "/home/atzel/Documentos/Universidad_Proyectos_All/Archivos_Python/Juego/Songs/inicio.ogg"
SONIDO_BRINCO = "/home/atzel/Documentos/Universidad_Proyectos_All/Archivos_Python/Juego/Songs/brinco.ogg"

def music_fondo():
    pygame.mixer.init()
    pygame.mixer.music.load(SONIDO_RECORRIDO)
    pygame.mixer.music.play(0)

def music_inicio():
    pygame.mixer.init()
    pygame.mixer.music.load(SONIDO_INICIO)
    pygame.mixer.music.play(0)

music_inicio()

while run:
    #pygame.time.delay(10)
    if inicio == True:
        reloj.tick(1000)
        tux_pos_x = tux_pos_x - 1
        if tux_pos_x < 1:
            tux_pos_x = 1500
            if tux_pos_x == 1500:
                marcaje += 1

        if marcaje >= 5:
            tux2_pos_x = tux2_pos_x - 1
            if tux2_pos_x < 1:
                tux2_pos_x = 2000
                if tux2_pos_x == 1500:
                    marcaje += 1

        if marcaje >= 15:
            tux3_pos_x = tux3_pos_x - 1
            if tux3_pos_x < 1:
                tux3_pos_x = 1500
                if tux3_pos_x == 1500:
                    marcaje += 1
    
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            run = False
    keys = pygame.key.get_pressed()
    
    if not(isJump):
        if keys[pygame.K_SPACE]:
            isJump = True
            if isJump == True:
                inicio = True
                if inicio == True:
                    music_fondo()
    else:
        if jumpCount >= -11:
            y -= (jumpCount * abs(jumpCount)) * 0.5
            jumpCount -= 1
        else:
            jumpCount = 11
            isJump = False

    if inicio == False:
        texto = fuente.render("Preciona espacio pata iniciar", True, (0, 0, 0))
        texto_rect = texto.get_rect()
        texto_x = pantalla.get_width() / 2 - texto_rect.width / 2
        texto_y = pantalla.get_height() / 2 - texto_rect.height / 2
        screen.blit(fondo, (0, 0))
        pantalla.blit(texto, [texto_x, texto_y])
    else:
        text = "Puntos: " + str(marcaje)
        mensaje = fuente.render(text, 1, (255, 255, 255))
        screen.blit(fondo, (0, 0))
        screen.blit(mensaje, (15, 5))

    pygame.draw.line(screen, (255, 255, 255), (0, 50), (1500, 50), 2)

    pygame.draw.rect(screen, (150, 0, 200), (x, y, width, height))

    pygame.draw.rect(screen, (255, 0, 0), (tux_pos_x, tux_pos_y, width, height))
    pygame.draw.rect(screen, (0, 255, 0), (tux2_pos_x, tux2_pos_y, width, height))
    pygame.draw.rect(screen, (0, 0, 255), (tux3_pos_x, tux3_pos_y, width, height))

    pygame.display.update()

pygame.quit()