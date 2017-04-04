# LPOO1617_T2G11_PF

Game logic: 
No desktop (player 1) temos um endless runner com um bonequinho a correr para a esquerda sempre no mesmo x do ecrâ, este boneco tem determinados pontos
de cada vez que passa um obstaculo ganha um certo n de pontos, cada vez que sore dano perde pontos.
No telemovel temos um menu com uma lista de obstaculos cada um com determinado custo, o jogador tem determinado n de pontos e gasta-os 
a fazer spwan de obstaculos, cada vez que o jogador do desktop tocar num obstaculo o jogador do telemovel ganha pontos. Existe um
cooldown para evitar spwan seguido de obstaculos.

O jogo acaba quando os pontos de um dos 2 jogadores chegar ao 0.
À medida que o tempo passa o player 1 corre cada vez mais rapido e o cooldown de spwan de obstaculos do player 2 diminui.

Lista de obstaculos:
Firebool: ondas ao nivel do player 1 (tem que ser desviado atraves de um salto)
Bigorna: cai do top direito do ecrâ até perto do player 1, tem que ser saltado
Arrow: linha reta ao nivel da cabeça do player 1 ou mais alto ou ao nivel dos pes(saltar ou agachar)
Spikes: aparecem ao nivel do chão

BFLayza: linha azul fina aparece ao nivel do jogador usando o comprimento todo do ecrâ. ao fim de x tempo a linha fica mais grossa causando
dano imediato. tem que se saltar no momento certo

