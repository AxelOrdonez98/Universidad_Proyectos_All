TITLE Suma y resta
; Este programa suma y resta dos enteros de 32 bits.
INCLUDE Irvine32.inc
.code
main PROC
    mov eax,10000h	;EAX = 10000h
    add eax,40000h	;EAX = 40000h
    sub eax,20000h	;EAX = 30000h
    call DumpRegs	;muestra registros
    exit
main ENDP
END main